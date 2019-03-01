package typings
package raygunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: raygunLib.raygunLibStrings.`raygun-node`
  var version: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: raygunLib.raygunLibStrings.`raygun-node`, version: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Name]
  }
}

