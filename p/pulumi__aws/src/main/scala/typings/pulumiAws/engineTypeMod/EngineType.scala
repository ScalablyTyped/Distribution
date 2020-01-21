package typings.pulumiAws.engineTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.aurora
  - typings.pulumiAws.pulumiAwsStrings.`aurora-mysql`
  - typings.pulumiAws.pulumiAwsStrings.`aurora-postgresql`
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  def aurora: typings.pulumiAws.pulumiAwsStrings.aurora = this.cast("aurora")
  @scala.inline
  def `aurora-mysql`: typings.pulumiAws.pulumiAwsStrings.`aurora-mysql` = this.cast("aurora-mysql")
  @scala.inline
  def `aurora-postgresql`: typings.pulumiAws.pulumiAwsStrings.`aurora-postgresql` = this.cast("aurora-postgresql")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

