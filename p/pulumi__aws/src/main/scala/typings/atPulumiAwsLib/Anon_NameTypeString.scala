package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeString extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object Anon_NameTypeString {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): Anon_NameTypeString = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_NameTypeString]
  }
}

