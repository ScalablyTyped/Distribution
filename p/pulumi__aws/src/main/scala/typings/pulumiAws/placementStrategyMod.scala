package typings.pulumiAws

import typings.pulumiAws.enumsEc2Mod.PlacementStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placementStrategyMod {
  
  @JSImport("@pulumi/aws/ec2/placementStrategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/ec2/placementStrategy", "ClusterStrategy")
  @js.native
  def ClusterStrategy: PlacementStrategy = js.native
  @scala.inline
  def ClusterStrategy_=(x: PlacementStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClusterStrategy")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/ec2/placementStrategy", "SpreadStrategy")
  @js.native
  def SpreadStrategy: PlacementStrategy = js.native
  @scala.inline
  def SpreadStrategy_=(x: PlacementStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadStrategy")(x.asInstanceOf[js.Any])
}
