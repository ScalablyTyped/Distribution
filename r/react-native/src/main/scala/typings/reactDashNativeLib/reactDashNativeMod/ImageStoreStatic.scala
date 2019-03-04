package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStoreStatic extends js.Object {
  /**
    * Stores a base64-encoded image in the ImageStore, and returns a URI that
    * can be used to access or display the image later. Images are stored in
    * memory only, and must be manually deleted when you are finished with
    * them by calling `removeImageForTag()`.
    *
    * Note that it is very inefficient to transfer large quantities of binary
    * data between JS and native code, so you should avoid calling this more
    * than necessary.
    * @platform ios
    */
  def addImageFromBase64(
    base64ImageData: java.lang.String,
    success: js.Function1[/* uri */ java.lang.String, scala.Unit],
    failure: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    * Retrieves the base64-encoded data for an image in the ImageStore. If the
    * specified URI does not match an image in the store, the failure callback
    * will be called.
    *
    * Note that it is very inefficient to transfer large quantities of binary
    * data between JS and native code, so you should avoid calling this more
    * than necessary. To display an image in the ImageStore, you can just pass
    * the URI to an `<Image/>` component; there is no need to retrieve the
    * base64 data.
    */
  def getBase64ForTag(
    uri: java.lang.String,
    success: js.Function1[/* base64ImageData */ java.lang.String, scala.Unit],
    failure: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit
  /**
    * Check if the ImageStore contains image data for the specified URI.
    * @platform ios
    */
  def hasImageForTag(uri: java.lang.String, callback: js.Function1[/* hasImage */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Delete an image from the ImageStore. Images are stored in memory and
    * must be manually removed when you are finished with them, otherwise they
    * will continue to use up RAM until the app is terminated. It is safe to
    * call `removeImageForTag()` without first calling `hasImageForTag()`, it
    * will simply fail silently.
    * @platform ios
    */
  def removeImageForTag(uri: java.lang.String): scala.Unit
}

object ImageStoreStatic {
  @scala.inline
  def apply(
    addImageFromBase64: js.Function3[
      java.lang.String, 
      js.Function1[/* uri */ java.lang.String, scala.Unit], 
      js.Function1[/* error */ js.Any, scala.Unit], 
      scala.Unit
    ],
    getBase64ForTag: js.Function3[
      java.lang.String, 
      js.Function1[/* base64ImageData */ java.lang.String, scala.Unit], 
      js.Function1[/* error */ js.Any, scala.Unit], 
      scala.Unit
    ],
    hasImageForTag: js.Function2[java.lang.String, js.Function1[/* hasImage */ scala.Boolean, scala.Unit], scala.Unit],
    removeImageForTag: js.Function1[java.lang.String, scala.Unit]
  ): ImageStoreStatic = {
    val __obj = js.Dynamic.literal(addImageFromBase64 = addImageFromBase64, getBase64ForTag = getBase64ForTag, hasImageForTag = hasImageForTag, removeImageForTag = removeImageForTag)
  
    __obj.asInstanceOf[ImageStoreStatic]
  }
}

