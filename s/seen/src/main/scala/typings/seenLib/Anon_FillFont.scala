package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillFont extends js.Object {
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var font: java.lang.String
  var `text-anchor`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FillFont {
  @scala.inline
  def apply(font: java.lang.String, fill: java.lang.String = null, `text-anchor`: java.lang.String = null): Anon_FillFont = {
    val __obj = js.Dynamic.literal(font = font)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`)
    __obj.asInstanceOf[Anon_FillFont]
  }
}

