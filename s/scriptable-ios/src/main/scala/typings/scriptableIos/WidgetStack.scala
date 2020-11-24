package typings.scriptableIos

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Stack element shown in widget._
  * @see https://docs.scriptable.app/widgetstack
  */
@js.native
trait WidgetStack extends js.Object {
  
  /**
    * _Add date to the widget._
    *
    * Adds a date element to the widget. Use the properties on the returned element to style the date.
    * @see https://docs.scriptable.app/widgetstack/#-adddate
    */
  def addDate(date: Date): WidgetDate = js.native
  
  /**
    * _Add image to the stack._
    *
    * Adds an image element to the stack. Use the properties on the returned element to style the image.
    * @see https://docs.scriptable.app/widgetstack/#-addimage
    */
  def addImage(image: Image): WidgetImage = js.native
  
  /**
    * _Add spacer._
    *
    * Adds a spacer to the stack. This can be used to offset the content horizontally in the stack.
    * @param length - Length of the spacer. Pass null to create a spacer with a flexible length.
    * @see https://docs.scriptable.app/widgetstack/#-addspacer
    */
  def addSpacer(): WidgetSpacer = js.native
  def addSpacer(length: Double): WidgetSpacer = js.native
  
  /**
    * _Add stack._
    *
    * Adds a stack to the widget. Stacks layout elements horizontally by default.
    * @see https://docs.scriptable.app/widgetstack/#-addstack
    */
  def addStack(): WidgetStack = js.native
  
  /**
    * _Add text to the stack._
    *
    * Adds a text element to the stack. Use the properties on the returned element to style the text.
    * @see https://docs.scriptable.app/widgetstack/#-addtext
    */
  def addText(text: String): WidgetText = js.native
  
  /**
    * _Background color of the stack._
    * @see https://docs.scriptable.app/widgetstack/#backgroundcolor
    */
  var backgroundColor: Color = js.native
  
  /**
    * _Background gradient._
    * @see https://docs.scriptable.app/widgetstack/#backgroundgradient
    */
  var backgroundGradient: LinearGradient = js.native
  
  /**
    * _Background image._
    * @see https://docs.scriptable.app/widgetstack/#backgroundimage
    */
  var backgroundImage: Image = js.native
  
  /**
    * _Border color._
    *
    * Color of the border around the stack. Defaults to black.
    * @see https://docs.scriptable.app/widgetstack/#bordercolor
    */
  var borderColor: Color = js.native
  
  /**
    * _Border width._
    *
    * Width of the border around the stack. Defaults to 0.
    * @see https://docs.scriptable.app/widgetstack/#borderwidth
    */
  var borderWidth: Double = js.native
  
  /**
    * _Bottom aligns the content._
    *
    * Specifies that the content should be bottom aligned.
    * @see https://docs.scriptable.app/widgetstack/#-bottomaligncontent
    */
  def bottomAlignContent(): Unit = js.native
  
  /**
    * _Center aligns the content._
    *
    * Specifies that the content should be center aligned.
    * @see https://docs.scriptable.app/widgetstack/#-centeraligncontent
    */
  def centerAlignContent(): Unit = js.native
  
  /**
    * _Radius of the corners._
    *
    * Radius of the rounded corners. Defaults to 0.
    * @see https://docs.scriptable.app/widgetstack/#cornerradius
    */
  var cornerRadius: Double = js.native
  
  /**
    * _Layout elements horizontally._
    *
    * Specifies that the stack should layout elements horizontally. This is the default.
    * @see https://docs.scriptable.app/widgetstack/#-layouthorizontally
    */
  def layoutHorizontally(): Unit = js.native
  
  /**
    * _Layout elements vertically._
    *
    * Specifies that the stack should layout elements vertically.
    * @see https://docs.scriptable.app/widgetstack/#-layoutvertically
    */
  def layoutVertically(): Unit = js.native
  
  /**
    * _Set padding._
    *
    * Sets the padding on each side of the stack.
    * @param top - Padding on the top edge.
    * @param leading - Padding on the leading edge.
    * @param bottom - Padding on the bottom edge.
    * @param trailing - Padding on the trailing edge.
    * @see https://docs.scriptable.app/widgetstack/#-setpadding
    */
  def setPadding(top: Double, leading: Double, bottom: Double, trailing: Double): Unit = js.native
  
  /**
    * _Size of the stack._
    *
    * Specifies the size of the stack when shown in a widget. When a dimension is set to zero or less, the widget will automatically decide a length for that dimension. Both dimensions
    * default to 0.
    * @see https://docs.scriptable.app/widgetstack/#size
    */
  var size: Size = js.native
  
  /**
    * _Spacing between elements._
    *
    * Specifies the spacing between elements in the stack. You can also use the `addSpacer()` function on the widget to add spacing between elements. Defaults to 0.
    * @see https://docs.scriptable.app/widgetstack/#spacing
    */
  var spacing: Double = js.native
  
  /**
    * _Top aligns the content._
    *
    * Specifies that the content should be top aligned. This is the default.
    * @see https://docs.scriptable.app/widgetstack/#-topaligncontent
    */
  def topAlignContent(): Unit = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the stack is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * on the widget.
    * @see https://docs.scriptable.app/widgetstack/#url
    */
  var url: String = js.native
  
  /**
    * _Use the default padding._
    *
    * Configure the stack to use the default padding. Any padding previously defined with `setPadding()` will be discarded.
    * @see https://docs.scriptable.app/widgetstack/#-usedefaultpadding
    */
  def useDefaultPadding(): Unit = js.native
}
