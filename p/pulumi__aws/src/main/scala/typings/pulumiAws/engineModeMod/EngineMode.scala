package typings.pulumiAws.engineModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.provisioned
  - typings.pulumiAws.pulumiAwsStrings.serverless
  - typings.pulumiAws.pulumiAwsStrings.parallelquery
  - typings.pulumiAws.pulumiAwsStrings.global
*/
trait EngineMode extends js.Object

object EngineMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def global: typings.pulumiAws.pulumiAwsStrings.global = this.cast("global")
  @scala.inline
  def parallelquery: typings.pulumiAws.pulumiAwsStrings.parallelquery = this.cast("parallelquery")
  @scala.inline
  def provisioned: typings.pulumiAws.pulumiAwsStrings.provisioned = this.cast("provisioned")
  @scala.inline
  def serverless: typings.pulumiAws.pulumiAwsStrings.serverless = this.cast("serverless")
}

