package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algo extends js.Object {
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var parts: js.Array[java.lang.String]
  var sizePart: js.UndefOr[java.lang.String] = js.undefined
}

object Algo {
  @scala.inline
  def apply(
    parts: js.Array[java.lang.String],
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    sizePart: java.lang.String = null
  ): Algo = {
    val __obj = js.Dynamic.literal(parts = parts)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (sizePart != null) __obj.updateDynamic("sizePart")(sizePart)
    __obj.asInstanceOf[Algo]
  }
}

