package typings.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentSetting extends js.Object {
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  var name: String = js.native
  var namespace: String = js.native
  var resource: js.UndefOr[String] = js.native
  var value: String = js.native
}

object EnvironmentSetting {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): EnvironmentSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentSetting]
  }
}

