package typings.atPulumiAws.rdsEngineModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.provisioned
  - typings.atPulumiAws.atPulumiAwsStrings.serverless
  - typings.atPulumiAws.atPulumiAwsStrings.parallelquery
  - typings.atPulumiAws.atPulumiAwsStrings.global
*/
trait EngineMode extends js.Object

object EngineMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def global: typings.atPulumiAws.atPulumiAwsStrings.global = this.cast("global")
  @scala.inline
  def parallelquery: typings.atPulumiAws.atPulumiAwsStrings.parallelquery = this.cast("parallelquery")
  @scala.inline
  def provisioned: typings.atPulumiAws.atPulumiAwsStrings.provisioned = this.cast("provisioned")
  @scala.inline
  def serverless: typings.atPulumiAws.atPulumiAwsStrings.serverless = this.cast("serverless")
}

