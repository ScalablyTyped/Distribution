package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Image element shown in widget._
  * @see https://docs.scriptable.app/widgetimage
  */
@js.native
trait WidgetImage extends js.Object {
  
  /**
    * _Uses filling content mode._
    *
    * The image will fill the available space.
    * @see https://docs.scriptable.app/widgetimage/#-applyfillingcontentmode
    */
  def applyFillingContentMode(): Unit = js.native
  
  /**
    * _Uses fitting content mode._
    *
    * The image will fit the available space. This content mode is the default.
    * @see https://docs.scriptable.app/widgetimage/#-applyfittingcontentmode
    */
  def applyFittingContentMode(): Unit = js.native
  
  /**
    * _Border color._
    *
    * Color of the border around the image. Defaults to black.
    * @see https://docs.scriptable.app/widgetimage/#bordercolor
    */
  var borderColor: Color = js.native
  
  /**
    * _Border width._
    *
    * Width of the border around the image. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#borderwidth
    */
  var borderWidth: Double = js.native
  
  /**
    * _Center aligns the image._
    *
    * Specifies that image should be center aligned.
    * @see https://docs.scriptable.app/widgetimage/#-centeralignimage
    */
  def centerAlignImage(): Unit = js.native
  
  /**
    * _Shape the image relative to its container._
    *
    * When true the corners of the image will be rounded relative to the containing widget. The value of `cornerRadius` is ignored when this is true. Defaults to false.
    * @see https://docs.scriptable.app/widgetimage/#containerrelativeshape
    */
  var containerRelativeShape: Boolean = js.native
  
  /**
    * _Radius of the corners._
    *
    * Radius of the rounded corners. This property is ignored when `containerRelativeShape` is set to true. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#cornerradius
    */
  var cornerRadius: Double = js.native
  
  /**
    * _Image to show in widget._
    * @see https://docs.scriptable.app/widgetimage/#image
    */
  var image: Image = js.native
  
  /**
    * _Opacity when shown in widget._
    *
    * Opacity of the image. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgetimage/#imageopacity
    */
  var imageOpacity: Double = js.native
  
  /**
    * _Size of the image in the widget._
    *
    * Size of the image. When set to null, the image will be shwon at its full size. Defaults to null.
    * @see https://docs.scriptable.app/widgetimage/#imagesize
    */
  var imageSize: Size = js.native
  
  /**
    * _Left aligns the image._
    *
    * Specifies that image should be left aligned. This is the default.
    * @see https://docs.scriptable.app/widgetimage/#-leftalignimage
    */
  def leftAlignImage(): Unit = js.native
  
  /**
    * _Whether the image is resizable._
    *
    * When set to true, the image can be resized. Defaults to true.
    * @see https://docs.scriptable.app/widgetimage/#resizable
    */
  var resizable: Boolean = js.native
  
  /**
    * _Right aligns the image._
    *
    * Specifies that image should be right aligned.
    * @see https://docs.scriptable.app/widgetimage/#-rightalignimage
    */
  def rightAlignImage(): Unit = js.native
  
  /**
    * _Tint color of the image._
    *
    * Changes the color of the image. Set to `null` to show the original image. Defaults to `null`.
    * @see https://docs.scriptable.app/widgetimage/#tintcolor
    */
  var tintColor: Color = js.native
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the image is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * on the widget.
    * @see https://docs.scriptable.app/widgetimage/#url
    */
  var url: String = js.native
}
object WidgetImage {
  
  @scala.inline
  def apply(
    applyFillingContentMode: () => Unit,
    applyFittingContentMode: () => Unit,
    borderColor: Color,
    borderWidth: Double,
    centerAlignImage: () => Unit,
    containerRelativeShape: Boolean,
    cornerRadius: Double,
    image: Image,
    imageOpacity: Double,
    imageSize: Size,
    leftAlignImage: () => Unit,
    resizable: Boolean,
    rightAlignImage: () => Unit,
    tintColor: Color,
    url: String
  ): WidgetImage = {
    val __obj = js.Dynamic.literal(applyFillingContentMode = js.Any.fromFunction0(applyFillingContentMode), applyFittingContentMode = js.Any.fromFunction0(applyFittingContentMode), borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], centerAlignImage = js.Any.fromFunction0(centerAlignImage), containerRelativeShape = containerRelativeShape.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageOpacity = imageOpacity.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], leftAlignImage = js.Any.fromFunction0(leftAlignImage), resizable = resizable.asInstanceOf[js.Any], rightAlignImage = js.Any.fromFunction0(rightAlignImage), tintColor = tintColor.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetImage]
  }
  
  @scala.inline
  implicit class WidgetImageOps[Self <: WidgetImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyFillingContentMode(value: () => Unit): Self = this.set("applyFillingContentMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyFittingContentMode(value: () => Unit): Self = this.set("applyFittingContentMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBorderColor(value: Color): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterAlignImage(value: () => Unit): Self = this.set("centerAlignImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainerRelativeShape(value: Boolean): Self = this.set("containerRelativeShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOpacity(value: Double): Self = this.set("imageOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSize(value: Size): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAlignImage(value: () => Unit): Self = this.set("leftAlignImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAlignImage(value: () => Unit): Self = this.set("rightAlignImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTintColor(value: Color): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
