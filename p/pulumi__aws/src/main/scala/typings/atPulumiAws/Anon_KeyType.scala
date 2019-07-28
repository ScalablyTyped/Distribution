package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyType extends js.Object {
  var key: String
  var `type`: String
  var value: String
}

object Anon_KeyType {
  @scala.inline
  def apply(key: String, `type`: String, value: String): Anon_KeyType = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_KeyType]
  }
}

