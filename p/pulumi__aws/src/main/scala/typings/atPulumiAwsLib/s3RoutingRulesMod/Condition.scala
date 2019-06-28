package typings
package atPulumiAwsLib.s3RoutingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * The HTTP error code that must match for the redirect to apply. If an error occurs, and if the error code meets
    * this value, then the specified redirect applies.
    *
    * `HttpErrorCodeReturnedEquals` is required if `KeyPrefixEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix of the object key name from which requests are redirected.
    *
    * `KeyPrefixEquals` is required if `HttpErrorCodeReturnedEquals` is not specified. If both `KeyPrefixEquals` and
    * `HttpErrorCodeReturnedEquals` are specified, both must be true for the condition to be met.
    */
  var KeyPrefixEquals: js.UndefOr[java.lang.String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(HttpErrorCodeReturnedEquals: java.lang.String = null, KeyPrefixEquals: java.lang.String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (HttpErrorCodeReturnedEquals != null) __obj.updateDynamic("HttpErrorCodeReturnedEquals")(HttpErrorCodeReturnedEquals)
    if (KeyPrefixEquals != null) __obj.updateDynamic("KeyPrefixEquals")(KeyPrefixEquals)
    __obj.asInstanceOf[Condition]
  }
}

