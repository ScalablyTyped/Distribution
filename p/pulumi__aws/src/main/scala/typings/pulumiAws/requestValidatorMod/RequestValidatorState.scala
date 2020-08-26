package typings.pulumiAws.requestValidatorMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidatorState extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.native
}

object RequestValidatorState {
  @scala.inline
  def apply(): RequestValidatorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidatorState]
  }
  @scala.inline
  implicit class RequestValidatorStateOps[Self <: RequestValidatorState] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    @scala.inline
    def setValidateRequestBody(value: Input[Boolean]): Self = this.set("validateRequestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateRequestBody: Self = this.set("validateRequestBody", js.undefined)
    @scala.inline
    def setValidateRequestParameters(value: Input[Boolean]): Self = this.set("validateRequestParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateRequestParameters: Self = this.set("validateRequestParameters", js.undefined)
  }
  
}

