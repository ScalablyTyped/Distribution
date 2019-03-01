package typings
package restangularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: js.Any
  var headers: js.Any
  var params: js.Any
}

object Anon_Element {
  @scala.inline
  def apply(element: js.Any, headers: js.Any, params: js.Any): Anon_Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Element]
  }
}

