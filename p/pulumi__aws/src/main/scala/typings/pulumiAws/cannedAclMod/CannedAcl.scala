package typings.pulumiAws.cannedAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.`private`
  - typings.pulumiAws.pulumiAwsStrings.`public-read`
  - typings.pulumiAws.pulumiAwsStrings.`public-read-write`
  - typings.pulumiAws.pulumiAwsStrings.`aws-exec-read`
  - typings.pulumiAws.pulumiAwsStrings.`authenticated-read`
  - typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
  - typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
  - typings.pulumiAws.pulumiAwsStrings.`log-delivery-write`
*/
trait CannedAcl extends js.Object

object CannedAcl {
  @scala.inline
  def `authenticated-read`: typings.pulumiAws.pulumiAwsStrings.`authenticated-read` = this.cast("authenticated-read")
  @scala.inline
  def `aws-exec-read`: typings.pulumiAws.pulumiAwsStrings.`aws-exec-read` = this.cast("aws-exec-read")
  @scala.inline
  def `bucket-owner-full-control`: typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control` = this.cast("bucket-owner-full-control")
  @scala.inline
  def `bucket-owner-read`: typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read` = this.cast("bucket-owner-read")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `log-delivery-write`: typings.pulumiAws.pulumiAwsStrings.`log-delivery-write` = this.cast("log-delivery-write")
  @scala.inline
  def `private`: typings.pulumiAws.pulumiAwsStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typings.pulumiAws.pulumiAwsStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typings.pulumiAws.pulumiAwsStrings.`public-read-write` = this.cast("public-read-write")
}

