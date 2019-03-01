package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScriptLocation extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var scriptLocation: java.lang.String
}

object Anon_NameScriptLocation {
  @scala.inline
  def apply(scriptLocation: java.lang.String, name: java.lang.String = null): Anon_NameScriptLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scriptLocation")(scriptLocation)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_NameScriptLocation]
  }
}

