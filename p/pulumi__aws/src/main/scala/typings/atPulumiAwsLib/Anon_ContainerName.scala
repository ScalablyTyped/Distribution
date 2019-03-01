package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerName extends js.Object {
  var containerName: java.lang.String
  var containerPort: scala.Double
  var elbName: js.UndefOr[java.lang.String] = js.undefined
  var targetGroupArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContainerName {
  @scala.inline
  def apply(
    containerName: java.lang.String,
    containerPort: scala.Double,
    elbName: java.lang.String = null,
    targetGroupArn: java.lang.String = null
  ): Anon_ContainerName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerName")(containerName)
    __obj.updateDynamic("containerPort")(containerPort)
    if (elbName != null) __obj.updateDynamic("elbName")(elbName)
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn)
    __obj.asInstanceOf[Anon_ContainerName]
  }
}

