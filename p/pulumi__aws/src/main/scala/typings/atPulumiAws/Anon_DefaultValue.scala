package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var name: String
  var namespace: String
  var value: String
}

object Anon_DefaultValue {
  @scala.inline
  def apply(name: String, namespace: String, value: String, defaultValue: String = null): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

