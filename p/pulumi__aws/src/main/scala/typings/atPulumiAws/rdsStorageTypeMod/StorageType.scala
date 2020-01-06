package typings.atPulumiAws.rdsStorageTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.standard
  - typings.atPulumiAws.atPulumiAwsStrings.gp2
  - typings.atPulumiAws.atPulumiAwsStrings.io1
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gp2: typings.atPulumiAws.atPulumiAwsStrings.gp2 = this.cast("gp2")
  @scala.inline
  def io1: typings.atPulumiAws.atPulumiAwsStrings.io1 = this.cast("io1")
  @scala.inline
  def standard: typings.atPulumiAws.atPulumiAwsStrings.standard = this.cast("standard")
}

