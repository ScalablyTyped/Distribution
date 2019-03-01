package typings
package stamplayDashJsDashSdkLib.StamplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StamplayObject extends js.Object {
  var Collection: js.Any
  var Model: Model
}

object StamplayObject {
  @scala.inline
  def apply(Collection: js.Any, Model: Model): StamplayObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Collection")(Collection)
    __obj.updateDynamic("Model")(Model)
    __obj.asInstanceOf[StamplayObject]
  }
}

