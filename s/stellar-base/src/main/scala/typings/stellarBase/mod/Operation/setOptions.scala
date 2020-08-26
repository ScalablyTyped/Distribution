package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationOptions.SetOptions
import typings.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Operation.setOptions")
@js.native
object setOptions extends js.Object {
  def apply[T /* <: SignerOptions */](options: SetOptions[T]): typings.stellarBase.xdrMod.default.Operation[SetOptions_[T]] = js.native
}

