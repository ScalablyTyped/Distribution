package typings
package selectizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var selectize: selectizeLib.SelectizeNs.IApi[_, _]
}

object HTMLElement {
  @scala.inline
  def apply(selectize: selectizeLib.SelectizeNs.IApi[_, _]): HTMLElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectize")(selectize)
    __obj.asInstanceOf[HTMLElement]
  }
}

