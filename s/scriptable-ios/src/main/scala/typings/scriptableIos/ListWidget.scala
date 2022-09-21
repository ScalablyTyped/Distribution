package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Widget showing a list of elements._
  *
  * A widget showing a list of elements. Pass the widget to Script.setWidget() to display it on your Home screen.
  * @see https://docs.scriptable.app/listwidget/#-new-listwidget
  */
@js.native
trait ListWidget extends StObject {
  
  /**
    * _Add date to the widget._
    *
    * Adds a date element to the widget. Use the properties on the returned element to style the date.
    * @see https://docs.scriptable.app/listwidget/#-adddate
    */
  def addDate(date: js.Date): WidgetDate = js.native
  
  /**
    * _Add image to the widget._
    *
    * Adds an image element to the widget. Use the properties on the returned element to style the image.
    * @see https://docs.scriptable.app/listwidget/#-addimage
    */
  def addImage(image: Image): WidgetImage = js.native
  
  /**
    * _Add spacer._
    *
    * Adds a spacer to the widget. This can be used to offset the content vertically in the widget.
    * @param length - Length of the spacer. Pass null to create a spacer with a flexible length.
    * @see https://docs.scriptable.app/listwidget/#-addspacer
    */
  def addSpacer(): WidgetSpacer = js.native
  def addSpacer(length: Double): WidgetSpacer = js.native
  
  /**
    * _Add stack._
    *
    * Adds a stack to the widget. Stacks layout elements horizontally by default.
    * @see https://docs.scriptable.app/listwidget/#-addstack
    */
  def addStack(): WidgetStack = js.native
  
  /**
    * _Add text to the widget._
    *
    * Adds a text element to the widget. Use the properties on the returned element to style the text.
    * @see https://docs.scriptable.app/listwidget/#-addtext
    */
  def addText(text: String): WidgetText = js.native
  
  /**
    * _Background color of the widget._
    * @see https://docs.scriptable.app/listwidget/#backgroundcolor
    */
  var backgroundColor: Color = js.native
  
  /**
    * _Background gradient._
    * @see https://docs.scriptable.app/listwidget/#backgroundgradient
    */
  var backgroundGradient: LinearGradient = js.native
  
  /**
    * _Background image._
    * @see https://docs.scriptable.app/listwidget/#backgroundimage
    */
  var backgroundImage: Image = js.native
  
  /**
    * _Presents a preview of the widget._
    *
    * The widget is presented in its extra large size.
    *
    * Widgets on the Home screen are updated periodically so while working on your widget you may want to preview it in the app.
    *
    * Please be aware that extra large widgets are only available on iPads running iOS 15 and newer.
    * @see https://docs.scriptable.app/listwidget/#-presentextralarge
    */
  def presentExtraLarge(): js.Promise[Unit] = js.native
  
  /**
    * _Presents a preview of the widget._
    *
    * The widget is presented in its large size.
    *
    * Widgets on the Home screen are updated periodically so while working on your widget you may want to preview it in the app.
    * @see https://docs.scriptable.app/listwidget/#-presentlarge
    */
  def presentLarge(): js.Promise[Unit] = js.native
  
  /**
    * _Presents a preview of the widget._
    *
    * The widget is presented in its medium size.
    *
    * Widgets on the Home screen are updated periodically so while working on your widget you may want to preview it in the app.
    * @see https://docs.scriptable.app/listwidget/#-presentmedium
    */
  def presentMedium(): js.Promise[Unit] = js.native
  
  /**
    * _Presents a preview of the widget._
    *
    * The widget is presented in its small size.
    *
    * Widgets on the Home screen are updated periodically so while working on your widget you may want to preview it in the app.
    * @see https://docs.scriptable.app/listwidget/#-presentsmall
    */
  def presentSmall(): js.Promise[Unit] = js.native
  
  /**
    * _Earliest date to refresh the widget._
    *
    * The property indicates when the widget can be refreshed again. The widget will not be refreshed before the date has been reached. It is not guaranteed that the widget will refresh
    * at exactly the specified date.
    *
    * The refresh rate of a widget is partly up to iOS/iPadOS. For example, a widget may not refresh if the device is low on battery or the user is rarely looking at the widget.
    *
    * When the property is `null` the default refresh interval is used. Defaults to `null`.
    * @see https://docs.scriptable.app/listwidget/#refreshafterdate
    */
  var refreshAfterDate: js.Date = js.native
  
  /**
    * _Set padding._
    *
    * Sets the padding on each side of the widget.
    * @param top - Padding on the top edge.
    * @param leading - Padding on the leading edge.
    * @param bottom - Padding on the bottom edge.
    * @param trailing - Padding on the trailing edge.
    * @see https://docs.scriptable.app/listwidget/#-setpadding
    */
  def setPadding(top: Double, leading: Double, bottom: Double, trailing: Double): Unit = js.native
  
  /**
    * _Spacing between elements._
    *
    * Specifies the spacing between elements in the widget. You can also use the `addSpacer()` function on the widget to add spacing between elements. Defaults to 0.
    * @see https://docs.scriptable.app/listwidget/#spacing
    */
  var spacing: Double = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the widget is tapped. This will override any behavior defined in the configuration of the widget. E.g. if the widget is configured to run the script
    * when interacting with the widget but a URL is set the URL will take precedence.
    * @see https://docs.scriptable.app/listwidget/#url
    */
  var url: String = js.native
  
  /**
    * _Use the default padding._
    *
    * Configure the widget to use the default padding. Any padding previously defined with `setPadding()` will be discarded.
    * @see https://docs.scriptable.app/listwidget/#-usedefaultpadding
    */
  def useDefaultPadding(): Unit = js.native
}
