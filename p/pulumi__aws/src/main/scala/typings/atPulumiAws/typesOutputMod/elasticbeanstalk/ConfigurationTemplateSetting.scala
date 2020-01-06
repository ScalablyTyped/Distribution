package typings.atPulumiAws.typesOutputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTemplateSetting extends js.Object {
  /**
    * A unique name for this Template.
    */
  var name: String = js.native
  var namespace: String = js.native
  var resource: js.UndefOr[String] = js.native
  var value: String = js.native
}

object ConfigurationTemplateSetting {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): ConfigurationTemplateSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateSetting]
  }
}

