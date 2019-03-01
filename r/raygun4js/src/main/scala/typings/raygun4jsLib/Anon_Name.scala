package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var Name: java.lang.String
  var Version: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(Name: java.lang.String, Version: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[Anon_Name]
  }
}

