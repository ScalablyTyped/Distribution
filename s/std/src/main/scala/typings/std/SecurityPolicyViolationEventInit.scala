package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityPolicyViolationEventInit extends EventInit {
  var blockedURI: js.UndefOr[java.lang.String] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var documentURI: js.UndefOr[java.lang.String] = js.undefined
  var effectiveDirective: js.UndefOr[java.lang.String] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var originalPolicy: js.UndefOr[java.lang.String] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var violatedDirective: js.UndefOr[java.lang.String] = js.undefined
}

object SecurityPolicyViolationEventInit {
  @scala.inline
  def apply(
    blockedURI: java.lang.String = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    columnNumber: Int | Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    documentURI: java.lang.String = null,
    effectiveDirective: java.lang.String = null,
    lineNumber: Int | Double = null,
    originalPolicy: java.lang.String = null,
    referrer: java.lang.String = null,
    sourceFile: java.lang.String = null,
    statusCode: Int | Double = null,
    violatedDirective: java.lang.String = null
  ): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal()
    if (blockedURI != null) __obj.updateDynamic("blockedURI")(blockedURI)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (documentURI != null) __obj.updateDynamic("documentURI")(documentURI)
    if (effectiveDirective != null) __obj.updateDynamic("effectiveDirective")(effectiveDirective)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (originalPolicy != null) __obj.updateDynamic("originalPolicy")(originalPolicy)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (violatedDirective != null) __obj.updateDynamic("violatedDirective")(violatedDirective)
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
}

