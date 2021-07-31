package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Provides access to your photo library._
  * @see https://docs.scriptable.app/photos
  */
object Photos {
  
  @JSGlobal("Photos")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Opens the camera for taking an image._
    *
    * Use this for taking a new image using the camera.
    * @see https://docs.scriptable.app/photos/#fromcamera
    */
  @scala.inline
  def fromCamera(): js.Promise[typings.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCamera")().asInstanceOf[js.Promise[typings.scriptableIos.Image]]
  
  /**
    * _Presents the photo library for picking an image._
    *
    * Use this for picking an image from the photo library.
    * @see https://docs.scriptable.app/photos/#fromlibrary
    */
  @scala.inline
  def fromLibrary(): js.Promise[typings.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLibrary")().asInstanceOf[js.Promise[typings.scriptableIos.Image]]
  
  /**
    * _Get latest photo._
    *
    * Reads the latest photo from your photo library. If no photo is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestphoto
    */
  @scala.inline
  def latestPhoto(): js.Promise[typings.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestPhoto")().asInstanceOf[js.Promise[typings.scriptableIos.Image]]
  
  /**
    * _Get latest photos._
    *
    * Reads the latests photos from your photo library. If no photo is available, the promise will be rejected.
    * @param count - Number of photos to fetch.
    * @see https://docs.scriptable.app/photos/#latestphotos
    */
  @scala.inline
  def latestPhotos(count: Double): js.Promise[js.Array[typings.scriptableIos.Image]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestPhotos")(count.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Image]]]
  
  /**
    * _Get latest screenshot._
    *
    * Reads the latest screenshot from your photo library. If no screenshot is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestscreenshot
    */
  @scala.inline
  def latestScreenshot(): js.Promise[typings.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestScreenshot")().asInstanceOf[js.Promise[typings.scriptableIos.Image]]
  
  /**
    * _Get latest screenshots._
    *
    * Reads the latests screenshots from your photo library. If no screenshot is available, the promise will be rejected.
    * @param count - Number of screenshots to fetch.
    * @see https://docs.scriptable.app/photos/#latestscreenshots
    */
  @scala.inline
  def latestScreenshots(count: Double): js.Promise[js.Array[typings.scriptableIos.Image]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestScreenshots")(count.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.scriptableIos.Image]]]
  
  /**
    * _Removes latest photo._
    *
    * Before removing the photo, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestphoto
    */
  @scala.inline
  def removeLatestPhoto(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestPhoto")().asInstanceOf[Unit]
  
  /**
    * _Removes latest photos._
    *
    * Before removing the photos, an alert is shown prompting you to confirm the removal.
    * @param count - Number of photos to remove.
    * @see https://docs.scriptable.app/photos/#removelatestphotos
    */
  @scala.inline
  def removeLatestPhotos(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestPhotos")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Removes latest screenshot._
    *
    * Before removing the screenshot, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshot
    */
  @scala.inline
  def removeLatestScreenshot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestScreenshot")().asInstanceOf[Unit]
  
  /**
    * _Removes latest screenshots._
    *
    * Before removing the screenshots, an alert is shown prompting you to confirm the removal.
    * @param count - Number of screenshots to remove.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshots
    */
  @scala.inline
  def removeLatestScreenshots(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestScreenshots")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Save an image._
    *
    * Saves the image to the photo library.
    * @param image - The image to save.
    * @see https://docs.scriptable.app/photos/#save
    */
  @scala.inline
  def save(image: typings.scriptableIos.Image): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(image.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
