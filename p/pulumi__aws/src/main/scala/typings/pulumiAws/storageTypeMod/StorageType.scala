package typings.pulumiAws.storageTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.standard
  - typings.pulumiAws.pulumiAwsStrings.gp2
  - typings.pulumiAws.pulumiAwsStrings.io1
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gp2: typings.pulumiAws.pulumiAwsStrings.gp2 = this.cast("gp2")
  @scala.inline
  def io1: typings.pulumiAws.pulumiAwsStrings.io1 = this.cast("io1")
  @scala.inline
  def standard: typings.pulumiAws.pulumiAwsStrings.standard = this.cast("standard")
}

