package typings
package signaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: java.lang.String
  var span: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: java.lang.String, span: scala.Int | scala.Double = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

