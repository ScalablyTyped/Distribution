package typings.reactHtml5CameraPhoto.mod

import typings.reactHtml5CameraPhoto.anon.Height
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.environment
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.jpg
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.png
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.user
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraProps extends js.Object {
  
  /**
    * The ideal facing mode of the camera, environment or user.
    * @example <caption>To request a camera facing the environment.</caption>
    * // FACING_MODES.ENVIRONMENT
    * @example <caption>To request a camera facing the user.</caption>
    * // FACING_MODES.USER
    */
  var idealFacingMode: js.UndefOr[environment | user] = js.native
  
  /**
    * Object of the ideal resolution of the camera.
    */
  var idealResolution: js.UndefOr[Height] = js.native
  
  /**
    * Number used to get the desired compression when jpg is selected.
    * Choose a compression between [0, 1], 1 is maximum, 0 is minimum.
    */
  var imageCompression: js.UndefOr[Double] = js.native
  
  /**
    * String used to get the desired image type between jpg or png.
    * @example <caption>To specify jpg format</caption>
    * // IMAGE_TYPES.JPG
    * @example <caption>To specify png format</caption>
    * // IMAGE_TYPES.PNG
    */
  var imageType: js.UndefOr[png | jpg] = js.native
  
  /**
    * If is true, if the camera start with error, it will show the error between h1 tag on the top of the component.
    * Useful to notify the user about permission error.
    */
  var isDisplayStartCameraError: js.UndefOr[Boolean] = js.native
  
  /**
    * If is true, the camera image will be set fullscreen to force the maximum width and height of the viewport.
    */
  var isFullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * If is true, the camera image will be mirror.
    */
  var isImageMirror: js.UndefOr[Boolean] = js.native
  
  /**
    * If is true, the camera will start with his own maximum resolution.
    */
  var isMaxResolution: js.UndefOr[Boolean] = js.native
  
  /**
    * If is true, the camera do not play click sound when the photo was taken.
    */
  var isSilentMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback called with the error object as parameter when error occur while opening the camera. Often the permission.
    * @param error The error information.
    */
  var onCameraError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  /**
    * Callback called when the camera is started.
    */
  var onCameraStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback called when the camera is stopped.
    */
  var onCameraStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The function called when a photo is taken. the dataUri is passed as a parameter.
    * @param dataUri The Data URI of the captured photo.
    */
  var onTakePhoto: js.UndefOr[js.Function1[/* dataUri */ String, Unit]] = js.native
  
  /**
    * The function called when a photo is taken and the animation is done. the dataUri is passed as a parameter.
    * @param dataUri The Data URI of the captured photo.
    */
  var onTakePhotoAnimationDone: js.UndefOr[js.Function1[/* dataUri */ String, Unit]] = js.native
  
  /**
    * Number of the factor resolution.
    * The sizeFactor can be between range of ]0, 1].
    * @example <caption>A sizeFactor of 1 get the same resolution of the camera</caption>
    * // 1
    * @example <caption>A sizeFactor of 0.5 get the half resolution of the camera.</caption>
    * // 0.5
    */
  var sizeFactor: js.UndefOr[Double] = js.native
}
object CameraProps {
  
  @scala.inline
  def apply(): CameraProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraProps]
  }
  
  @scala.inline
  implicit class CameraPropsOps[Self <: CameraProps] (val x: Self) extends AnyVal {
    
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
    def setIdealFacingMode(value: environment | user): Self = this.set("idealFacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdealFacingMode: Self = this.set("idealFacingMode", js.undefined)
    
    @scala.inline
    def setIdealResolution(value: Height): Self = this.set("idealResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdealResolution: Self = this.set("idealResolution", js.undefined)
    
    @scala.inline
    def setImageCompression(value: Double): Self = this.set("imageCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageCompression: Self = this.set("imageCompression", js.undefined)
    
    @scala.inline
    def setImageType(value: png | jpg): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    
    @scala.inline
    def setIsDisplayStartCameraError(value: Boolean): Self = this.set("isDisplayStartCameraError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisplayStartCameraError: Self = this.set("isDisplayStartCameraError", js.undefined)
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = this.set("isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullscreen: Self = this.set("isFullscreen", js.undefined)
    
    @scala.inline
    def setIsImageMirror(value: Boolean): Self = this.set("isImageMirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImageMirror: Self = this.set("isImageMirror", js.undefined)
    
    @scala.inline
    def setIsMaxResolution(value: Boolean): Self = this.set("isMaxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMaxResolution: Self = this.set("isMaxResolution", js.undefined)
    
    @scala.inline
    def setIsSilentMode(value: Boolean): Self = this.set("isSilentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSilentMode: Self = this.set("isSilentMode", js.undefined)
    
    @scala.inline
    def setOnCameraError(value: /* error */ Error => Unit): Self = this.set("onCameraError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCameraError: Self = this.set("onCameraError", js.undefined)
    
    @scala.inline
    def setOnCameraStart(value: () => Unit): Self = this.set("onCameraStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCameraStart: Self = this.set("onCameraStart", js.undefined)
    
    @scala.inline
    def setOnCameraStop(value: () => Unit): Self = this.set("onCameraStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCameraStop: Self = this.set("onCameraStop", js.undefined)
    
    @scala.inline
    def setOnTakePhoto(value: /* dataUri */ String => Unit): Self = this.set("onTakePhoto", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTakePhoto: Self = this.set("onTakePhoto", js.undefined)
    
    @scala.inline
    def setOnTakePhotoAnimationDone(value: /* dataUri */ String => Unit): Self = this.set("onTakePhotoAnimationDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTakePhotoAnimationDone: Self = this.set("onTakePhotoAnimationDone", js.undefined)
    
    @scala.inline
    def setSizeFactor(value: Double): Self = this.set("sizeFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeFactor: Self = this.set("sizeFactor", js.undefined)
  }
}
