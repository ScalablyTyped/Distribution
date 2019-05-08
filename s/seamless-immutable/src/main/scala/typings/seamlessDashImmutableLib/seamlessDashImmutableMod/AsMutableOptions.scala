package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsMutableOptions[TDeep /* <: scala.Boolean */] extends js.Object {
  var deep: TDeep
}

object AsMutableOptions {
  @scala.inline
  def apply[TDeep /* <: scala.Boolean */](deep: TDeep): AsMutableOptions[TDeep] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsMutableOptions[TDeep]]
  }
}

