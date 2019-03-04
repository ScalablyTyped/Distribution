package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyType extends js.Object {
  var key: java.lang.String
  var `type`: java.lang.String
  var value: java.lang.String
}

object Anon_KeyType {
  @scala.inline
  def apply(key: java.lang.String, `type`: java.lang.String, value: java.lang.String): Anon_KeyType = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_KeyType]
  }
}

