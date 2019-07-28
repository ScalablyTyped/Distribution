package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameType extends js.Object {
  var name: String
  var `type`: js.UndefOr[String] = js.undefined
  var value: String
}

object Anon_NameType {
  @scala.inline
  def apply(name: String, value: String, `type`: String = null): Anon_NameType = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameType]
  }
}

