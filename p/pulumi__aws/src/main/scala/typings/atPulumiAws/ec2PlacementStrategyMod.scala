package typings.atPulumiAws

import typings.atPulumiAws.ec2PlacementStrategyMod.PlacementStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/placementStrategy", JSImport.Namespace)
@js.native
object ec2PlacementStrategyMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.spread
    - typings.atPulumiAws.atPulumiAwsStrings.cluster
  */
  trait PlacementStrategy extends js.Object
  
  var ClusterStrategy: PlacementStrategy = js.native
  var SpreadStrategy: PlacementStrategy = js.native
}

