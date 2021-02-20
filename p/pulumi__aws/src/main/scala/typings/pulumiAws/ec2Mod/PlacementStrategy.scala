package typings.pulumiAws.ec2Mod

import typings.pulumiAws.pulumiAwsStrings.cluster
import typings.pulumiAws.pulumiAwsStrings.spread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlacementStrategy {
  
  /**
    * A `cluster` placement group is a logical grouping of instances within a single
    * Availability Zone that benefit from low network latency, high network throughput.
    */
  @JSImport("@pulumi/aws/ec2", "PlacementStrategy.Cluster")
  @js.native
  val Cluster: cluster = js.native
  
  /**
    * A `spread` placement group places instances on distinct hardware.
    */
  @JSImport("@pulumi/aws/ec2", "PlacementStrategy.Spread")
  @js.native
  val Spread: spread = js.native
}
