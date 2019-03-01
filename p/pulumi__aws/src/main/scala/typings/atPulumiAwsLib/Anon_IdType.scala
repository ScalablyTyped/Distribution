package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdType extends js.Object {
  var id: java.lang.String
  var `type`: java.lang.String
}

object Anon_IdType {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): Anon_IdType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_IdType]
  }
}

