package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClusterName extends js.Object {
  var clusterName: java.lang.String
  var serviceName: java.lang.String
}

object Anon_ClusterName {
  @scala.inline
  def apply(clusterName: java.lang.String, serviceName: java.lang.String): Anon_ClusterName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusterName")(clusterName)
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[Anon_ClusterName]
  }
}

