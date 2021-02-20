package typings.pulumiAws

import typings.pulumiAws.enumsRdsMod.EngineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineTypeMod {
  
  @JSImport("@pulumi/aws/rds/engineType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/rds/engineType", "AuroraEngine")
  @js.native
  def AuroraEngine: EngineType = js.native
  @scala.inline
  def AuroraEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds/engineType", "AuroraMysqlEngine")
  @js.native
  def AuroraMysqlEngine: EngineType = js.native
  @scala.inline
  def AuroraMysqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraMysqlEngine")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/rds/engineType", "AuroraPostgresqlEngine")
  @js.native
  def AuroraPostgresqlEngine: EngineType = js.native
  @scala.inline
  def AuroraPostgresqlEngine_=(x: EngineType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuroraPostgresqlEngine")(x.asInstanceOf[js.Any])
}
