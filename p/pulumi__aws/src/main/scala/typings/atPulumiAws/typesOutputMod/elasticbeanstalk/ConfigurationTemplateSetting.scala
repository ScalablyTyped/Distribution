package typings.atPulumiAws.typesOutputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTemplateSetting extends js.Object {
  /**
    * A unique name for this Template.
    */
  var name: String
  var namespace: String
  var resource: js.UndefOr[String] = js.undefined
  var value: String
}

object ConfigurationTemplateSetting {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): ConfigurationTemplateSetting = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ConfigurationTemplateSetting]
  }
}

