package typings.regexpDashTree.astMod

import typings.regexpDashTree.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base[T] extends js.Object {
  var loc: js.UndefOr[Anon_End] = js.undefined
  var `type`: T
}

object Base {
  @scala.inline
  def apply[T](`type`: T, loc: Anon_End = null): Base[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Base[T]]
  }
}

