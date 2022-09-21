package typings.rlp

import typings.rlp.mod.Decoded
import typings.rlp.mod.Input
import typings.rlp.mod.NestedUint8Array
import typings.rlp.rlpBooleans.`false`
import typings.rlp.rlpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: Input): Decoded = js.native
    def apply(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `true`): Decoded = js.native
  }
}
