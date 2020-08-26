package typings.pulumiAws.secretsmanagerGetSecretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret to retrieve.
    */
  val arn: js.UndefOr[String] = js.native
  /**
    * The name of the secret to retrieve.
    */
  val name: js.UndefOr[String] = js.native
}

object GetSecretArgs {
  @scala.inline
  def apply(): GetSecretArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecretArgs]
  }
  @scala.inline
  implicit class GetSecretArgsOps[Self <: GetSecretArgs] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

