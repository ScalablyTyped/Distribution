package typings.pulumiAws.documentsMod

import typings.pulumiAws.pulumiAwsStrings.`2008-10-17`
import typings.pulumiAws.pulumiAwsStrings.`2012-10-17`
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDocument extends js.Object {
  /**
    * An optional document ID.
    */
  var Id: js.UndefOr[Input[String]] = js.native
  /**
    * One or more policy statements, describing the effect, principal, action, resource, and condition.
    */
  var Statement: Input[js.Array[Input[PolicyStatement]]] = js.native
  /**
    * The version of the policy language that you want to use. As a best practice, use the latest `2012-10-17` version.
    */
  var Version: Input[`2008-10-17` | `2012-10-17`] = js.native
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: Input[js.Array[Input[PolicyStatement]]], Version: Input[`2008-10-17` | `2012-10-17`]): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  @scala.inline
  implicit class PolicyDocumentOps[Self <: PolicyDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatementVarargs(value: Input[PolicyStatement]*): Self = this.set("Statement", js.Array(value :_*))
    @scala.inline
    def setStatement(value: Input[js.Array[Input[PolicyStatement]]]): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Input[`2008-10-17` | `2012-10-17`]): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Input[String]): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

