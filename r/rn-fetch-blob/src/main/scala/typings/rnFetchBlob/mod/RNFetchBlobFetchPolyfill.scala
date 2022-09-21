package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rn-fetch-blob", "RNFetchBlobFetchPolyfill")
@js.native
open class RNFetchBlobFetchPolyfill protected () extends StObject {
  def this(config: RNFetchBlobConfig) = this()
  
  def build(): js.Function2[
    /* url */ String, 
    /* options */ RNFetchBlobConfig, 
    StatefulPromise[RNFetchBlobFetchRepsonse]
  ] = js.native
}
