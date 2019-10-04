package typings.atPulumiAws.typesOutputMod.elasticbeanstalkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentAllSetting extends js.Object {
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  var name: String
  var namespace: String
  var resource: js.UndefOr[String] = js.undefined
  var value: String
}

object EnvironmentAllSetting {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): EnvironmentAllSetting = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[EnvironmentAllSetting]
  }
}

