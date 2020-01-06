package typings.atPulumiAws.rdsEngineTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.aurora
  - typings.atPulumiAws.atPulumiAwsStrings.`aurora-mysql`
  - typings.atPulumiAws.atPulumiAwsStrings.`aurora-postgresql`
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  def aurora: typings.atPulumiAws.atPulumiAwsStrings.aurora = this.cast("aurora")
  @scala.inline
  def `aurora-mysql`: typings.atPulumiAws.atPulumiAwsStrings.`aurora-mysql` = this.cast("aurora-mysql")
  @scala.inline
  def `aurora-postgresql`: typings.atPulumiAws.atPulumiAwsStrings.`aurora-postgresql` = this.cast("aurora-postgresql")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

