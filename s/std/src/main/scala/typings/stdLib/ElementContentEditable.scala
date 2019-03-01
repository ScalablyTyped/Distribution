package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementContentEditable extends js.Object {
  var contentEditable: java.lang.String
  var inputMode: java.lang.String
  val isContentEditable: scala.Boolean
}

object ElementContentEditable {
  @scala.inline
  def apply(contentEditable: java.lang.String, inputMode: java.lang.String, isContentEditable: scala.Boolean): ElementContentEditable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentEditable")(contentEditable)
    __obj.updateDynamic("inputMode")(inputMode)
    __obj.updateDynamic("isContentEditable")(isContentEditable)
    __obj.asInstanceOf[ElementContentEditable]
  }
}

