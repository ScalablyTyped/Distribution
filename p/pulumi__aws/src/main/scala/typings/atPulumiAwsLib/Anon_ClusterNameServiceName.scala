package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterNameServiceName extends js.Object {
  var clusterName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ClusterNameServiceName {
  @scala.inline
  def apply(
    clusterName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ClusterNameServiceName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClusterNameServiceName]
  }
}

