package typings.pulumiAws.routingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The HTTP error code that must match for the redirect to apply. If an error occurs, and if the error code meets
    * this value, then the specified redirect applies.
    *
    * `HttpErrorCodeReturnedEquals` is required if `KeyPrefixEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.native
  /**
    * The prefix of the object key name from which requests are redirected.
    *
    * `KeyPrefixEquals` is required if `HttpErrorCodeReturnedEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var KeyPrefixEquals: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setHttpErrorCodeReturnedEquals(value: String): Self = this.set("HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpErrorCodeReturnedEquals: Self = this.set("HttpErrorCodeReturnedEquals", js.undefined)
    @scala.inline
    def setKeyPrefixEquals(value: String): Self = this.set("KeyPrefixEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPrefixEquals: Self = this.set("KeyPrefixEquals", js.undefined)
  }
  
}

