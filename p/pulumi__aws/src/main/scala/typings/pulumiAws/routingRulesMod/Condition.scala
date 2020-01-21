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
  def apply(HttpErrorCodeReturnedEquals: String = null, KeyPrefixEquals: String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (HttpErrorCodeReturnedEquals != null) __obj.updateDynamic("HttpErrorCodeReturnedEquals")(HttpErrorCodeReturnedEquals.asInstanceOf[js.Any])
    if (KeyPrefixEquals != null) __obj.updateDynamic("KeyPrefixEquals")(KeyPrefixEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

