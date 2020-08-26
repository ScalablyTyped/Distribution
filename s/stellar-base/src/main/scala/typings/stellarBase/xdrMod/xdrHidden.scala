package typings.stellarBase.xdrMod

import typings.node.Buffer
import typings.stellarBase.mod.Operation
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import typings.stellarBase.xdrMod.xdr.OperationBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Hidden namespace as hack to work around name collision.
@JSImport("stellar-base/types/xdr", "xdrHidden")
@js.native
object xdrHidden extends js.Object {
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  trait Operation2[T /* <: Operation */] extends js.Object {
    def body(): OperationBody = js.native
    def body(value: OperationBody): OperationBody = js.native
    def sourceAccount(): Null | MuxedAccount = js.native
    def sourceAccount(value: MuxedAccount): Null | MuxedAccount = js.native
    def toXDR(): Buffer = js.native
    @JSName("toXDR")
    def toXDR_base64(format: base64): String = js.native
    @JSName("toXDR")
    def toXDR_hex(format: hex): String = js.native
    @JSName("toXDR")
    def toXDR_raw(format: raw): Buffer = js.native
  }
  
}

