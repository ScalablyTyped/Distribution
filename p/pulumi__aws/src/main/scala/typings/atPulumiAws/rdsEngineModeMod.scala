package typings.atPulumiAws

import typings.atPulumiAws.rdsEngineModeMod.EngineMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/engineMode", JSImport.Namespace)
@js.native
object rdsEngineModeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.provisioned
    - typings.atPulumiAws.atPulumiAwsStrings.serverless
    - typings.atPulumiAws.atPulumiAwsStrings.parallelquery
    - typings.atPulumiAws.atPulumiAwsStrings.global
  */
  trait EngineMode extends js.Object
  
  var GlobalEngine: EngineMode = js.native
  var ParallelQueryEngine: EngineMode = js.native
  var ProvisionedEngine: EngineMode = js.native
  var ServerlessEngine: EngineMode = js.native
}

