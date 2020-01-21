package typings.stellarBase.mod

import typings.stellarBase.mod.xdr.XDRStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Hidden namespace as hack to work around name collision.
@JSImport("stellar-base", "xdrHidden")
@js.native
object xdrHidden extends js.Object {
  // tslint:disable-line:strict-export-declare-modifiers
  type Operation2[T /* <: Operation */] = XDRStruct
}

