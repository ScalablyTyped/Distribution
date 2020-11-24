package typings.pulumiAws.mod.ec2

import typings.pulumiAws.pulumiAwsStrings.cluster
import typings.pulumiAws.pulumiAwsStrings.spread
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.PlacementStrategy")
@js.native
object PlacementStrategy extends js.Object {
  
  /**
    * A `cluster` placement group is a logical grouping of instances within a single
    * Availability Zone that benefit from low network latency, high network throughput.
    */
  val Cluster: cluster = js.native
  
  /**
    * A `spread` placement group places instances on distinct hardware.
    */
  val Spread: spread = js.native
}
