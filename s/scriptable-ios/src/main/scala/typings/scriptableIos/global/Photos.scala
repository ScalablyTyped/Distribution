package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Provides access to your photo library._
  * @see https://docs.scriptable.app/photos
  */
object Photos {
  
  /**
    * _Opens the camera for taking an image._
    *
    * Use this for taking a new image using the camera.
    * @see https://docs.scriptable.app/photos/#fromcamera
    */
  @JSGlobal("Photos.fromCamera")
  @js.native
  def fromCamera(): js.Promise[typings.scriptableIos.Image] = js.native
  
  /**
    * _Presents the photo library for picking an image._
    *
    * Use this for picking an image from the photo library.
    * @see https://docs.scriptable.app/photos/#fromlibrary
    */
  @JSGlobal("Photos.fromLibrary")
  @js.native
  def fromLibrary(): js.Promise[typings.scriptableIos.Image] = js.native
  
  /**
    * _Get latest photo._
    *
    * Reads the latest photo from your photo library. If no photo is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestphoto
    */
  @JSGlobal("Photos.latestPhoto")
  @js.native
  def latestPhoto(): js.Promise[typings.scriptableIos.Image] = js.native
  
  /**
    * _Get latest photos._
    *
    * Reads the latests photos from your photo library. If no photo is available, the promise will be rejected.
    * @param count - Number of photos to fetch.
    * @see https://docs.scriptable.app/photos/#latestphotos
    */
  @JSGlobal("Photos.latestPhotos")
  @js.native
  def latestPhotos(count: Double): js.Promise[js.Array[typings.scriptableIos.Image]] = js.native
  
  /**
    * _Get latest screenshot._
    *
    * Reads the latest screenshot from your photo library. If no screenshot is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestscreenshot
    */
  @JSGlobal("Photos.latestScreenshot")
  @js.native
  def latestScreenshot(): js.Promise[typings.scriptableIos.Image] = js.native
  
  /**
    * _Get latest screenshots._
    *
    * Reads the latests screenshots from your photo library. If no screenshot is available, the promise will be rejected.
    * @param count - Number of screenshots to fetch.
    * @see https://docs.scriptable.app/photos/#latestscreenshots
    */
  @JSGlobal("Photos.latestScreenshots")
  @js.native
  def latestScreenshots(count: Double): js.Promise[js.Array[typings.scriptableIos.Image]] = js.native
  
  /**
    * _Removes latest photo._
    *
    * Before removing the photo, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestphoto
    */
  @JSGlobal("Photos.removeLatestPhoto")
  @js.native
  def removeLatestPhoto(): Unit = js.native
  
  /**
    * _Removes latest photos._
    *
    * Before removing the photos, an alert is shown prompting you to confirm the removal.
    * @param count - Number of photos to remove.
    * @see https://docs.scriptable.app/photos/#removelatestphotos
    */
  @JSGlobal("Photos.removeLatestPhotos")
  @js.native
  def removeLatestPhotos(count: Double): Unit = js.native
  
  /**
    * _Removes latest screenshot._
    *
    * Before removing the screenshot, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshot
    */
  @JSGlobal("Photos.removeLatestScreenshot")
  @js.native
  def removeLatestScreenshot(): Unit = js.native
  
  /**
    * _Removes latest screenshots._
    *
    * Before removing the screenshots, an alert is shown prompting you to confirm the removal.
    * @param count - Number of screenshots to remove.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshots
    */
  @JSGlobal("Photos.removeLatestScreenshots")
  @js.native
  def removeLatestScreenshots(count: Double): Unit = js.native
  
  /**
    * _Save an image._
    *
    * Saves the image to the photo library.
    * @param image - The image to save.
    * @see https://docs.scriptable.app/photos/#save
    */
  @JSGlobal("Photos.save")
  @js.native
  def save(image: typings.scriptableIos.Image): Unit = js.native
}
