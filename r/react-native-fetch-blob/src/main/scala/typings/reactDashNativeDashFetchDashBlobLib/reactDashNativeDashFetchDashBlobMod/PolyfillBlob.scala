package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fetch-blob", "PolyfillBlob")
@js.native
class PolyfillBlob protected ()
  extends stdLib.EventTarget {
  /**
    * RNFetchBlob Blob polyfill, create a Blob directly from file path, BASE64
    * encoded data, and string. The conversion is done implicitly according to
    * given `mime`. However, the blob creation is asynchronously, to register
    * event `onCreated` is need to ensure the Blob is creadted.
    *
    * @param data Content of Blob object
    * @param cType Content type settings of Blob object, `text/plain` by default
    * @param defer When this argument set to `true`, blob constructor will not invoke blob created event automatically.
    */
  def this(data: js.Any, cType: js.Any, defer: scala.Boolean) = this()
  /**
    * Release the resource of the Blob object.
    * @nonstandard
    */
  def close(): js.Promise[scala.Unit] = js.native
  /**
    * Get file reference of the Blob object.
    * @return Blob file reference which can be consumed by RNFetchBlob fs
    */
  def getRNFetchBlobRef(): java.lang.String = js.native
  def markAsDerived(): scala.Unit = js.native
  /**
    * Since Blob content will asynchronously write to a file during creation,
    * use this method to register an event handler for Blob initialized event.
    * @param  fn An event handler invoked when Blob created
    * @return The Blob object instance itself
    */
  def onCreated(fn: js.Function0[scala.Unit]): PolyfillBlob = js.native
  /**
    * Read data of the Blob object, this is not standard method.
    * @param  encoding Read data with encoding
    */
  def readBlob(encoding: java.lang.String): js.Promise[_] = js.native
  /**
    * Create a Blob object which is sliced from current object
    * @param  start    Start byte number
    * @param  end      End byte number
    * @param  contentType Optional, content type of new Blob object
    */
  def slice(): PolyfillBlob = js.native
  def slice(start: scala.Double): PolyfillBlob = js.native
  def slice(start: scala.Double, end: scala.Double): PolyfillBlob = js.native
  def slice(start: scala.Double, end: scala.Double, contentType: java.lang.String): PolyfillBlob = js.native
}

