package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.reactNativeFirebase.mod.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Firebase Storage service interface.
  *
  * An instance can be accessed using `firebase.storage()`.
  */
@JSImport("react-native-firebase", "RNFirebase.storage.Storage")
@js.native
class Storage () extends js.Object {
  
  /**
    * The app associated with the Storage service instance.
    */
  var app: App = js.native
  
  /**
    * Returns a reference for the given path in the default bucket.
    *
    * @param path A relative path to initialize the reference with, for
    *        example path/to/image.jpg. If not passed, the returned
    *        reference points to the bucket root.
    */
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  
  /**
    * Returns a reference for the given absolute URL.
    *
    * @param url URL must be in the form of either
    *        -   a Cloud Storage URL, for example gs://bucket/files/image.png; or
    *        -   download URL taken from object metadata.
    */
  def refFromURL(url: String): Reference = js.native
  
  /**
    * @param time The new maximum download retry time in milliseconds.
    */
  def setMaxDownloadRetryTime(time: Double): Unit = js.native
  
  /**
    * @param time The new maximum operation retry time in milliseconds.
    */
  def setMaxOperationRetryTime(time: Double): Unit = js.native
  
  /**
    * @param time The new maximum upload retry time in milliseconds.
    */
  def setMaxUploadRetryTime(time: Double): Unit = js.native
}
