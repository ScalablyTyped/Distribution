package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterNameServiceName extends js.Object {
  var clusterName: Input[String]
  var serviceName: Input[String]
}

object Anon_ClusterNameServiceName {
  @scala.inline
  def apply(clusterName: Input[String], serviceName: Input[String]): Anon_ClusterNameServiceName = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClusterNameServiceName]
  }
}

