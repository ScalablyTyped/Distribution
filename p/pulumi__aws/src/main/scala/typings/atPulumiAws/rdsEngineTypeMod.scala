package typings.atPulumiAws

import typings.atPulumiAws.rdsEngineTypeMod.EngineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/engineType", JSImport.Namespace)
@js.native
object rdsEngineTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.aurora
    - typings.atPulumiAws.atPulumiAwsStrings.`aurora-mysql`
    - typings.atPulumiAws.atPulumiAwsStrings.`aurora-postgresql`
  */
  trait EngineType extends js.Object
  
  var AuroraEngine: EngineType = js.native
  var AuroraMysqlEngine: EngineType = js.native
  var AuroraPostgresqlEngine: EngineType = js.native
}

