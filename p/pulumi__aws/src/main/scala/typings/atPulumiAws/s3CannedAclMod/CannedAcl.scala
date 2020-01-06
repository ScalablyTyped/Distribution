package typings.atPulumiAws.s3CannedAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.`private`
  - typings.atPulumiAws.atPulumiAwsStrings.`public-read`
  - typings.atPulumiAws.atPulumiAwsStrings.`public-read-write`
  - typings.atPulumiAws.atPulumiAwsStrings.`aws-exec-read`
  - typings.atPulumiAws.atPulumiAwsStrings.`authenticated-read`
  - typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-read`
  - typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-full-control`
  - typings.atPulumiAws.atPulumiAwsStrings.`log-delivery-write`
*/
trait CannedAcl extends js.Object

object CannedAcl {
  @scala.inline
  def `authenticated-read`: typings.atPulumiAws.atPulumiAwsStrings.`authenticated-read` = this.cast("authenticated-read")
  @scala.inline
  def `aws-exec-read`: typings.atPulumiAws.atPulumiAwsStrings.`aws-exec-read` = this.cast("aws-exec-read")
  @scala.inline
  def `bucket-owner-full-control`: typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-full-control` = this.cast("bucket-owner-full-control")
  @scala.inline
  def `bucket-owner-read`: typings.atPulumiAws.atPulumiAwsStrings.`bucket-owner-read` = this.cast("bucket-owner-read")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `log-delivery-write`: typings.atPulumiAws.atPulumiAwsStrings.`log-delivery-write` = this.cast("log-delivery-write")
  @scala.inline
  def `private`: typings.atPulumiAws.atPulumiAwsStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typings.atPulumiAws.atPulumiAwsStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typings.atPulumiAws.atPulumiAwsStrings.`public-read-write` = this.cast("public-read-write")
}

