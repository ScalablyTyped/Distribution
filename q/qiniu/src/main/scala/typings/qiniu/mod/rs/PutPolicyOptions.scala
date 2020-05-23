package typings.qiniu.mod.rs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPolicyOptions extends js.Object {
  var callbackBody: js.UndefOr[String] = js.undefined
  var callbackBodyType: js.UndefOr[String] = js.undefined
  var callbackFetchKey: js.UndefOr[Double] = js.undefined
  var callbackHost: js.UndefOr[String] = js.undefined
  var callbackUrl: js.UndefOr[String] = js.undefined
  var deleteAfterDays: js.UndefOr[Double] = js.undefined
  var detectMime: js.UndefOr[Double] = js.undefined
  var endUser: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var fileType: js.UndefOr[Double] = js.undefined
  var fsizeLimit: js.UndefOr[Double] = js.undefined
  var fsizeMin: js.UndefOr[Double] = js.undefined
  var insertOnly: js.UndefOr[Double] = js.undefined
  var isPrefixalScope: js.UndefOr[Double] = js.undefined
  var mimeLimit: js.UndefOr[String] = js.undefined
  var persistentNotifyUrl: js.UndefOr[String] = js.undefined
  var persistentOps: js.UndefOr[String] = js.undefined
  var persistentPipeline: js.UndefOr[String] = js.undefined
  var returnBody: js.UndefOr[String] = js.undefined
  var returnUrl: js.UndefOr[String] = js.undefined
  var saveKey: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object PutPolicyOptions {
  @scala.inline
  def apply(
    callbackBody: String = null,
    callbackBodyType: String = null,
    callbackFetchKey: js.UndefOr[Double] = js.undefined,
    callbackHost: String = null,
    callbackUrl: String = null,
    deleteAfterDays: js.UndefOr[Double] = js.undefined,
    detectMime: js.UndefOr[Double] = js.undefined,
    endUser: String = null,
    expires: js.UndefOr[Double] = js.undefined,
    fileType: js.UndefOr[Double] = js.undefined,
    fsizeLimit: js.UndefOr[Double] = js.undefined,
    fsizeMin: js.UndefOr[Double] = js.undefined,
    insertOnly: js.UndefOr[Double] = js.undefined,
    isPrefixalScope: js.UndefOr[Double] = js.undefined,
    mimeLimit: String = null,
    persistentNotifyUrl: String = null,
    persistentOps: String = null,
    persistentPipeline: String = null,
    returnBody: String = null,
    returnUrl: String = null,
    saveKey: String = null,
    scope: String = null
  ): PutPolicyOptions = {
    val __obj = js.Dynamic.literal()
    if (callbackBody != null) __obj.updateDynamic("callbackBody")(callbackBody.asInstanceOf[js.Any])
    if (callbackBodyType != null) __obj.updateDynamic("callbackBodyType")(callbackBodyType.asInstanceOf[js.Any])
    if (!js.isUndefined(callbackFetchKey)) __obj.updateDynamic("callbackFetchKey")(callbackFetchKey.get.asInstanceOf[js.Any])
    if (callbackHost != null) __obj.updateDynamic("callbackHost")(callbackHost.asInstanceOf[js.Any])
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAfterDays)) __obj.updateDynamic("deleteAfterDays")(deleteAfterDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detectMime)) __obj.updateDynamic("detectMime")(detectMime.get.asInstanceOf[js.Any])
    if (endUser != null) __obj.updateDynamic("endUser")(endUser.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileType)) __obj.updateDynamic("fileType")(fileType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fsizeLimit)) __obj.updateDynamic("fsizeLimit")(fsizeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fsizeMin)) __obj.updateDynamic("fsizeMin")(fsizeMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertOnly)) __obj.updateDynamic("insertOnly")(insertOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrefixalScope)) __obj.updateDynamic("isPrefixalScope")(isPrefixalScope.get.asInstanceOf[js.Any])
    if (mimeLimit != null) __obj.updateDynamic("mimeLimit")(mimeLimit.asInstanceOf[js.Any])
    if (persistentNotifyUrl != null) __obj.updateDynamic("persistentNotifyUrl")(persistentNotifyUrl.asInstanceOf[js.Any])
    if (persistentOps != null) __obj.updateDynamic("persistentOps")(persistentOps.asInstanceOf[js.Any])
    if (persistentPipeline != null) __obj.updateDynamic("persistentPipeline")(persistentPipeline.asInstanceOf[js.Any])
    if (returnBody != null) __obj.updateDynamic("returnBody")(returnBody.asInstanceOf[js.Any])
    if (returnUrl != null) __obj.updateDynamic("returnUrl")(returnUrl.asInstanceOf[js.Any])
    if (saveKey != null) __obj.updateDynamic("saveKey")(saveKey.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPolicyOptions]
  }
}

