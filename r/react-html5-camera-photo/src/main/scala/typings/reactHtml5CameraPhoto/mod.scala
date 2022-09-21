package typings.reactHtml5CameraPhoto

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.reactHtml5CameraPhoto.anon.Height
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.environment
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.jpg
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.png
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-html5-camera-photo", JSImport.Default)
  @js.native
  val default: FC[CameraProps] = js.native
  
  @JSImport("react-html5-camera-photo", "Camera")
  @js.native
  val Camera: FC[CameraProps] = js.native
  
  @JSImport("react-html5-camera-photo", "FACING_MODES")
  @js.native
  val FACING_MODES: FacingMode = js.native
  
  @JSImport("react-html5-camera-photo", "IMAGE_TYPES")
  @js.native
  val IMAGE_TYPES: ImageTypes = js.native
  
  trait CameraProps extends StObject {
    
    /**
      * The ideal facing mode of the camera, environment or user.
      * @example <caption>To request a camera facing the environment.</caption>
      * // FACING_MODES.ENVIRONMENT
      * @example <caption>To request a camera facing the user.</caption>
      * // FACING_MODES.USER
      */
    var idealFacingMode: js.UndefOr[environment | user] = js.undefined
    
    /**
      * Object of the ideal resolution of the camera.
      */
    var idealResolution: js.UndefOr[Height] = js.undefined
    
    /**
      * Number used to get the desired compression when jpg is selected.
      * Choose a compression between [0, 1], 1 is maximum, 0 is minimum.
      */
    var imageCompression: js.UndefOr[Double] = js.undefined
    
    /**
      * String used to get the desired image type between jpg or png.
      * @example <caption>To specify jpg format</caption>
      * // IMAGE_TYPES.JPG
      * @example <caption>To specify png format</caption>
      * // IMAGE_TYPES.PNG
      */
    var imageType: js.UndefOr[png | jpg] = js.undefined
    
    /**
      * If is true, if the camera start with error, it will show the error between h1 tag on the top of the component.
      * Useful to notify the user about permission error.
      */
    var isDisplayStartCameraError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If is true, the camera image will be set fullscreen to force the maximum width and height of the viewport.
      */
    var isFullscreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If is true, the camera image will be mirror.
      */
    var isImageMirror: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If is true, the camera will start with his own maximum resolution.
      */
    var isMaxResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If is true, the camera do not play click sound when the photo was taken.
      */
    var isSilentMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback called with the error object as parameter when error occur while opening the camera. Often the permission.
      * @param error The error information.
      */
    var onCameraError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Callback called when the camera is started.
      */
    var onCameraStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback called when the camera is stopped.
      */
    var onCameraStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * The function called when a photo is taken. the dataUri is passed as a parameter.
      * @param dataUri The Data URI of the captured photo.
      */
    var onTakePhoto: js.UndefOr[js.Function1[/* dataUri */ String, Unit]] = js.undefined
    
    /**
      * The function called when a photo is taken and the animation is done. the dataUri is passed as a parameter.
      * @param dataUri The Data URI of the captured photo.
      */
    var onTakePhotoAnimationDone: js.UndefOr[js.Function1[/* dataUri */ String, Unit]] = js.undefined
    
    /**
      * Number of the factor resolution.
      * The sizeFactor can be between range of ]0, 1].
      * @example <caption>A sizeFactor of 1 get the same resolution of the camera</caption>
      * // 1
      * @example <caption>A sizeFactor of 0.5 get the half resolution of the camera.</caption>
      * // 0.5
      */
    var sizeFactor: js.UndefOr[Double] = js.undefined
  }
  object CameraProps {
    
    inline def apply(): CameraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CameraProps]
    }
    
    extension [Self <: CameraProps](x: Self) {
      
      inline def setIdealFacingMode(value: environment | user): Self = StObject.set(x, "idealFacingMode", value.asInstanceOf[js.Any])
      
      inline def setIdealFacingModeUndefined: Self = StObject.set(x, "idealFacingMode", js.undefined)
      
      inline def setIdealResolution(value: Height): Self = StObject.set(x, "idealResolution", value.asInstanceOf[js.Any])
      
      inline def setIdealResolutionUndefined: Self = StObject.set(x, "idealResolution", js.undefined)
      
      inline def setImageCompression(value: Double): Self = StObject.set(x, "imageCompression", value.asInstanceOf[js.Any])
      
      inline def setImageCompressionUndefined: Self = StObject.set(x, "imageCompression", js.undefined)
      
      inline def setImageType(value: png | jpg): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
      
      inline def setIsDisplayStartCameraError(value: Boolean): Self = StObject.set(x, "isDisplayStartCameraError", value.asInstanceOf[js.Any])
      
      inline def setIsDisplayStartCameraErrorUndefined: Self = StObject.set(x, "isDisplayStartCameraError", js.undefined)
      
      inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
      
      inline def setIsImageMirror(value: Boolean): Self = StObject.set(x, "isImageMirror", value.asInstanceOf[js.Any])
      
      inline def setIsImageMirrorUndefined: Self = StObject.set(x, "isImageMirror", js.undefined)
      
      inline def setIsMaxResolution(value: Boolean): Self = StObject.set(x, "isMaxResolution", value.asInstanceOf[js.Any])
      
      inline def setIsMaxResolutionUndefined: Self = StObject.set(x, "isMaxResolution", js.undefined)
      
      inline def setIsSilentMode(value: Boolean): Self = StObject.set(x, "isSilentMode", value.asInstanceOf[js.Any])
      
      inline def setIsSilentModeUndefined: Self = StObject.set(x, "isSilentMode", js.undefined)
      
      inline def setOnCameraError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onCameraError", js.Any.fromFunction1(value))
      
      inline def setOnCameraErrorUndefined: Self = StObject.set(x, "onCameraError", js.undefined)
      
      inline def setOnCameraStart(value: () => Unit): Self = StObject.set(x, "onCameraStart", js.Any.fromFunction0(value))
      
      inline def setOnCameraStartUndefined: Self = StObject.set(x, "onCameraStart", js.undefined)
      
      inline def setOnCameraStop(value: () => Unit): Self = StObject.set(x, "onCameraStop", js.Any.fromFunction0(value))
      
      inline def setOnCameraStopUndefined: Self = StObject.set(x, "onCameraStop", js.undefined)
      
      inline def setOnTakePhoto(value: /* dataUri */ String => Unit): Self = StObject.set(x, "onTakePhoto", js.Any.fromFunction1(value))
      
      inline def setOnTakePhotoAnimationDone(value: /* dataUri */ String => Unit): Self = StObject.set(x, "onTakePhotoAnimationDone", js.Any.fromFunction1(value))
      
      inline def setOnTakePhotoAnimationDoneUndefined: Self = StObject.set(x, "onTakePhotoAnimationDone", js.undefined)
      
      inline def setOnTakePhotoUndefined: Self = StObject.set(x, "onTakePhoto", js.undefined)
      
      inline def setSizeFactor(value: Double): Self = StObject.set(x, "sizeFactor", value.asInstanceOf[js.Any])
      
      inline def setSizeFactorUndefined: Self = StObject.set(x, "sizeFactor", js.undefined)
    }
  }
  
  trait FacingMode extends StObject {
    
    var ENVIRONMENT: environment
    
    var USER: user
  }
  object FacingMode {
    
    inline def apply(): FacingMode = {
      val __obj = js.Dynamic.literal(ENVIRONMENT = "environment", USER = "user")
      __obj.asInstanceOf[FacingMode]
    }
    
    extension [Self <: FacingMode](x: Self) {
      
      inline def setENVIRONMENT(value: environment): Self = StObject.set(x, "ENVIRONMENT", value.asInstanceOf[js.Any])
      
      inline def setUSER(value: user): Self = StObject.set(x, "USER", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageTypes extends StObject {
    
    var JPG: jpg
    
    var PNG: png
  }
  object ImageTypes {
    
    inline def apply(): ImageTypes = {
      val __obj = js.Dynamic.literal(JPG = "jpg", PNG = "png")
      __obj.asInstanceOf[ImageTypes]
    }
    
    extension [Self <: ImageTypes](x: Self) {
      
      inline def setJPG(value: jpg): Self = StObject.set(x, "JPG", value.asInstanceOf[js.Any])
      
      inline def setPNG(value: png): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[CameraProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[CameraProps] = default
}
