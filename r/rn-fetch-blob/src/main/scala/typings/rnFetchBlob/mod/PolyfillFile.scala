package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rn-fetch-blob", "PolyfillFile")
@js.native
class PolyfillFile protected () extends PolyfillBlob {
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
  def this(data: js.Any, cType: js.Any, defer: Boolean) = this()
}
