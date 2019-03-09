package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stroke extends js.Object {
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var `stroke-width`: js.UndefOr[scala.Double] = js.undefined
  var `text-anchor`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Stroke {
  @scala.inline
  def apply(
    stroke: java.lang.String = null,
    `stroke-width`: scala.Int | scala.Double = null,
    `text-anchor`: java.lang.String = null
  ): Anon_Stroke = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`)
    __obj.asInstanceOf[Anon_Stroke]
  }
}

