package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fetch-blob", "RNFetchBlobFetchPolyfill")
@js.native
class RNFetchBlobFetchPolyfill protected () extends js.Object {
  def this(config: RNFetchBlobConfig) = this()
  def build(): js.Function2[
    /* url */ java.lang.String, 
    /* options */ RNFetchBlobConfig, 
    StatefulPromise[RNFetchBlobFetchRepsonse]
  ] = js.native
}

