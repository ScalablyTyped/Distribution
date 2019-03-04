package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameType extends js.Object {
  var name: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Anon_NameType {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, `type`: java.lang.String = null): Anon_NameType = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameType]
  }
}

