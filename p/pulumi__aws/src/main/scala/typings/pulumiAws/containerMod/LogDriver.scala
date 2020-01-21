package typings.pulumiAws.containerMod

import typings.pulumiAws.pulumiAwsStrings.syslog_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.`json-file`
  - typings.pulumiAws.pulumiAwsStrings.syslog_
  - typings.pulumiAws.pulumiAwsStrings.journald
  - typings.pulumiAws.pulumiAwsStrings.gelf
  - typings.pulumiAws.pulumiAwsStrings.fluentd
  - typings.pulumiAws.pulumiAwsStrings.awslogs
  - typings.pulumiAws.pulumiAwsStrings.splunk
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def awslogs: typings.pulumiAws.pulumiAwsStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fluentd: typings.pulumiAws.pulumiAwsStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typings.pulumiAws.pulumiAwsStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typings.pulumiAws.pulumiAwsStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typings.pulumiAws.pulumiAwsStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def splunk: typings.pulumiAws.pulumiAwsStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: syslog_ = this.cast("syslog")
}

