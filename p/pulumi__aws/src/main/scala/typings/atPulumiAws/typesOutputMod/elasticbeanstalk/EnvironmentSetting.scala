package typings.atPulumiAws.typesOutputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentSetting extends js.Object {
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  var name: String
  var namespace: String
  var resource: js.UndefOr[String] = js.undefined
  var value: String
}

object EnvironmentSetting {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): EnvironmentSetting = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[EnvironmentSetting]
  }
}

