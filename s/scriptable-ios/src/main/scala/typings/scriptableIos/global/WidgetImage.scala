package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Image element shown in widget._
  * @see https://docs.scriptable.app/widgetimage
  */
@JSGlobal("WidgetImage")
@js.native
class WidgetImage ()
  extends StObject
     with typings.scriptableIos.WidgetImage {
  
  /**
    * _Uses filling content mode._
    *
    * The image will fill the available space.
    * @see https://docs.scriptable.app/widgetimage/#-applyfillingcontentmode
    */
  /* CompleteClass */
  override def applyFillingContentMode(): Unit = js.native
  
  /**
    * _Uses fitting content mode._
    *
    * The image will fit the available space. This content mode is the default.
    * @see https://docs.scriptable.app/widgetimage/#-applyfittingcontentmode
    */
  /* CompleteClass */
  override def applyFittingContentMode(): Unit = js.native
  
  /**
    * _Border color._
    *
    * Color of the border around the image. Defaults to black.
    * @see https://docs.scriptable.app/widgetimage/#bordercolor
    */
  /* CompleteClass */
  var borderColor: typings.scriptableIos.Color = js.native
  
  /**
    * _Border width._
    *
    * Width of the border around the image. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#borderwidth
    */
  /* CompleteClass */
  var borderWidth: Double = js.native
  
  /**
    * _Center aligns the image._
    *
    * Specifies that image should be center aligned.
    * @see https://docs.scriptable.app/widgetimage/#-centeralignimage
    */
  /* CompleteClass */
  override def centerAlignImage(): Unit = js.native
  
  /**
    * _Shape the image relative to its container._
    *
    * When true the corners of the image will be rounded relative to the containing widget. The value of `cornerRadius` is ignored when this is true. Defaults to false.
    * @see https://docs.scriptable.app/widgetimage/#containerrelativeshape
    */
  /* CompleteClass */
  var containerRelativeShape: Boolean = js.native
  
  /**
    * _Radius of the corners._
    *
    * Radius of the rounded corners. This property is ignored when `containerRelativeShape` is set to true. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#cornerradius
    */
  /* CompleteClass */
  var cornerRadius: Double = js.native
  
  /**
    * _Image to show in widget._
    * @see https://docs.scriptable.app/widgetimage/#image
    */
  /* CompleteClass */
  var image: typings.scriptableIos.Image = js.native
  
  /**
    * _Opacity when shown in widget._
    *
    * Opacity of the image. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgetimage/#imageopacity
    */
  /* CompleteClass */
  var imageOpacity: Double = js.native
  
  /**
    * _Size of the image in the widget._
    *
    * Size of the image. When set to null, the image will be shwon at its full size. Defaults to null.
    * @see https://docs.scriptable.app/widgetimage/#imagesize
    */
  /* CompleteClass */
  var imageSize: typings.scriptableIos.Size = js.native
  
  /**
    * _Left aligns the image._
    *
    * Specifies that image should be left aligned. This is the default.
    * @see https://docs.scriptable.app/widgetimage/#-leftalignimage
    */
  /* CompleteClass */
  override def leftAlignImage(): Unit = js.native
  
  /**
    * _Whether the image is resizable._
    *
    * When set to true, the image can be resized. Defaults to true.
    * @see https://docs.scriptable.app/widgetimage/#resizable
    */
  /* CompleteClass */
  var resizable: Boolean = js.native
  
  /**
    * _Right aligns the image._
    *
    * Specifies that image should be right aligned.
    * @see https://docs.scriptable.app/widgetimage/#-rightalignimage
    */
  /* CompleteClass */
  override def rightAlignImage(): Unit = js.native
  
  /**
    * _Tint color of the image._
    *
    * Changes the color of the image. Set to `null` to show the original image. Defaults to `null`.
    * @see https://docs.scriptable.app/widgetimage/#tintcolor
    */
  /* CompleteClass */
  var tintColor: typings.scriptableIos.Color = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the image is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * on the widget.
    * @see https://docs.scriptable.app/widgetimage/#url
    */
  /* CompleteClass */
  var url: String = js.native
}
