package typings
package atPulumiAwsLib.ec2GetInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[java.lang.String]
  val instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[java.lang.String]
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[java.lang.String]
}

