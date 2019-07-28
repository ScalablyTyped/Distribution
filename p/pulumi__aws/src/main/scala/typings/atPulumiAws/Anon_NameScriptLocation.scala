package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameScriptLocation extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var scriptLocation: String
}

object Anon_NameScriptLocation {
  @scala.inline
  def apply(scriptLocation: String, name: String = null): Anon_NameScriptLocation = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_NameScriptLocation]
  }
}

