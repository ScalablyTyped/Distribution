package typings.stablelibChacha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/chacha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stream(key: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, dst: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def stream(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    dst: js.typedarray.Uint8Array,
    nonceInplaceCounterLength: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], nonceInplaceCounterLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def streamXOR(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    src: js.typedarray.Uint8Array,
    dst: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("streamXOR")(key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def streamXOR(
    key: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    src: js.typedarray.Uint8Array,
    dst: js.typedarray.Uint8Array,
    nonceInplaceCounterLength: Double
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("streamXOR")(key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], nonceInplaceCounterLength.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
