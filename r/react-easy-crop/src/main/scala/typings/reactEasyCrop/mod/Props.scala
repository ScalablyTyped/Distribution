package typings.reactEasyCrop.mod

import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.VideoHTMLAttributes
import typings.reactEasyCrop.anon.ContainerClassName
import typings.reactEasyCrop.anon.ContainerStyle
import typings.reactEasyCrop.reactEasyCropStrings.rect
import typings.reactEasyCrop.reactEasyCropStrings.round
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.reactEasyCrop.typesMod.Size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var aspect: Double = js.native
  var classes: ContainerClassName = js.native
  var crop: Point = js.native
  var cropShape: rect | round = js.native
  var cropSize: js.UndefOr[Size] = js.native
  var disableAutomaticStylesInjection: js.UndefOr[Boolean] = js.native
  var image: js.UndefOr[String] = js.native
  var initialCroppedAreaPixels: js.UndefOr[Area] = js.native
  var maxZoom: Double = js.native
  var mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement] = js.native
  var minZoom: Double = js.native
  var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.native
  var onInteractionEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onInteractionStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onMediaLoaded: js.UndefOr[js.Function1[/* mediaSize */ MediaSize, Unit]] = js.native
  var onRotationChange: js.UndefOr[js.Function1[/* rotation */ Double, Unit]] = js.native
  var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.native
  var restrictPosition: Boolean = js.native
  var rotation: Double = js.native
  var showGrid: js.UndefOr[Boolean] = js.native
  var style: ContainerStyle = js.native
  var transform: js.UndefOr[String] = js.native
  var video: js.UndefOr[String] = js.native
  var zoom: Double = js.native
  var zoomSpeed: Double = js.native
  var zoomWithScroll: js.UndefOr[Boolean] = js.native
  def onCropChange(location: Point): Unit = js.native
}

object Props {
  @scala.inline
  def apply(
    aspect: Double,
    classes: ContainerClassName,
    crop: Point,
    cropShape: rect | round,
    maxZoom: Double,
    mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement],
    minZoom: Double,
    onCropChange: Point => Unit,
    restrictPosition: Boolean,
    rotation: Double,
    style: ContainerStyle,
    zoom: Double,
    zoomSpeed: Double
  ): Props = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], mediaProps = mediaProps.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange), restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAspect(value: Double): Self = this.set("aspect", value.asInstanceOf[js.Any])
    @scala.inline
    def setClasses(value: ContainerClassName): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrop(value: Point): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropShape(value: rect | round): Self = this.set("cropShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaProps(value: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement]): Self = this.set("mediaProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCropChange(value: Point => Unit): Self = this.set("onCropChange", js.Any.fromFunction1(value))
    @scala.inline
    def setRestrictPosition(value: Boolean): Self = this.set("restrictPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: ContainerStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomSpeed(value: Double): Self = this.set("zoomSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCropSize(value: Size): Self = this.set("cropSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropSize: Self = this.set("cropSize", js.undefined)
    @scala.inline
    def setDisableAutomaticStylesInjection(value: Boolean): Self = this.set("disableAutomaticStylesInjection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutomaticStylesInjection: Self = this.set("disableAutomaticStylesInjection", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInitialCroppedAreaPixels(value: Area): Self = this.set("initialCroppedAreaPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCroppedAreaPixels: Self = this.set("initialCroppedAreaPixels", js.undefined)
    @scala.inline
    def setOnCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = this.set("onCropComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCropComplete: Self = this.set("onCropComplete", js.undefined)
    @scala.inline
    def setOnInteractionEnd(value: () => Unit): Self = this.set("onInteractionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInteractionEnd: Self = this.set("onInteractionEnd", js.undefined)
    @scala.inline
    def setOnInteractionStart(value: () => Unit): Self = this.set("onInteractionStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInteractionStart: Self = this.set("onInteractionStart", js.undefined)
    @scala.inline
    def setOnMediaLoaded(value: /* mediaSize */ MediaSize => Unit): Self = this.set("onMediaLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMediaLoaded: Self = this.set("onMediaLoaded", js.undefined)
    @scala.inline
    def setOnRotationChange(value: /* rotation */ Double => Unit): Self = this.set("onRotationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRotationChange: Self = this.set("onRotationChange", js.undefined)
    @scala.inline
    def setOnZoomChange(value: /* zoom */ Double => Unit): Self = this.set("onZoomChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnZoomChange: Self = this.set("onZoomChange", js.undefined)
    @scala.inline
    def setShowGrid(value: Boolean): Self = this.set("showGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGrid: Self = this.set("showGrid", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVideo(value: String): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setZoomWithScroll(value: Boolean): Self = this.set("zoomWithScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomWithScroll: Self = this.set("zoomWithScroll", js.undefined)
  }
  
}

