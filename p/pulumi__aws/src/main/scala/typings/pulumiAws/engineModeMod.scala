package typings.pulumiAws

import typings.pulumiAws.enumsRdsMod.EngineMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineModeMod {
  
  @JSImport("@pulumi/aws/rds/engineMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/rds/engineMode", "GlobalEngine")
  @js.native
  def GlobalEngine: EngineMode = js.native
  inline def GlobalEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds/engineMode", "ParallelQueryEngine")
  @js.native
  def ParallelQueryEngine: EngineMode = js.native
  inline def ParallelQueryEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParallelQueryEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds/engineMode", "ProvisionedEngine")
  @js.native
  def ProvisionedEngine: EngineMode = js.native
  inline def ProvisionedEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds/engineMode", "ServerlessEngine")
  @js.native
  def ServerlessEngine: EngineMode = js.native
  inline def ServerlessEngine_=(x: EngineMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerlessEngine")(x.asInstanceOf[js.Any])
}
