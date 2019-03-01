package typings
package recaseLib.recaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recase extends js.Object {
  def camelCopy(orig: js.Any): js.Any
  def snakeCopy(orig: js.Any): js.Any
}

object Recase {
  @scala.inline
  def apply(camelCopy: js.Function1[js.Any, js.Any], snakeCopy: js.Function1[js.Any, js.Any]): Recase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camelCopy")(camelCopy)
    __obj.updateDynamic("snakeCopy")(snakeCopy)
    __obj.asInstanceOf[Recase]
  }
}

