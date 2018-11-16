package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSharedbMod {
  type Callback = js.Function1[/* err */ Error, js.Any]
  type DocEvent = sharedbLib.sharedbLibStrings.load | sharedbLib.sharedbLibStrings.create | (sharedbLib.sharedbLibStrings.`before op`) | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.del | sharedbLib.sharedbLibStrings.error | (sharedbLib.sharedbLibStrings.`no write pending`) | (sharedbLib.sharedbLibStrings.`nothing pending`)
  type OTType = sharedbLib.sharedbLibStrings.`ot-text` | sharedbLib.sharedbLibStrings.`ot-json0` | sharedbLib.sharedbLibStrings.`ot-text-tp2` | sharedbLib.sharedbLibStrings.`rich-text`
  type Op = AddNumOp | ListInsertOp | ListDeleteOp | ListReplaceOp | ListMoveOp | ObjectInsertOp | ObjectDeleteOp | ObjectReplaceOp | StringInsertOp | StringDeleteOp | SubtypeOp
  type Path = js.Array[java.lang.String | scala.Double]
  type QueryEvent = sharedbLib.sharedbLibStrings.ready | sharedbLib.sharedbLibStrings.error | sharedbLib.sharedbLibStrings.changed | sharedbLib.sharedbLibStrings.insert | sharedbLib.sharedbLibStrings.move | sharedbLib.sharedbLibStrings.remove | sharedbLib.sharedbLibStrings.extra
  type Snapshot = scala.Double
}
