package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
  var id: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(description: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_], id: java.lang.String): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Description]
  }
}

