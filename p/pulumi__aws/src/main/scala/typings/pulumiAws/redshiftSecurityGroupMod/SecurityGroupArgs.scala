package typings.pulumiAws.redshiftSecurityGroupMod

import typings.pulumiAws.inputMod.redshift.SecurityGroupIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupArgs extends js.Object {
  /**
    * The description of the Redshift security group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of ingress rules.
    */
  val ingress: Input[js.Array[Input[SecurityGroupIngress]]] = js.native
  /**
    * The name of the Redshift security group.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupArgs {
  @scala.inline
  def apply(ingress: Input[js.Array[Input[SecurityGroupIngress]]]): SecurityGroupArgs = {
    val __obj = js.Dynamic.literal(ingress = ingress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupArgs]
  }
  @scala.inline
  implicit class SecurityGroupArgsOps[Self <: SecurityGroupArgs] (val x: Self) extends AnyVal {
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
    def setIngressVarargs(value: Input[SecurityGroupIngress]*): Self = this.set("ingress", js.Array(value :_*))
    @scala.inline
    def setIngress(value: Input[js.Array[Input[SecurityGroupIngress]]]): Self = this.set("ingress", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

