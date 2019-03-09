package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var `fill-opacity`: js.UndefOr[scala.Double] = js.undefined
  var `text-anchor`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    `fill-opacity`: scala.Int | scala.Double = null,
    `text-anchor`: java.lang.String = null
  ): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`)
    __obj.asInstanceOf[Anon_Fill]
  }
}

