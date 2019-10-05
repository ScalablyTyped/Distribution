package typings.qiniu.qiniuMod.rs

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
    callbackFetchKey: Int | Double = null,
    callbackHost: String = null,
    callbackUrl: String = null,
    deleteAfterDays: Int | Double = null,
    detectMime: Int | Double = null,
    endUser: String = null,
    expires: Int | Double = null,
    fileType: Int | Double = null,
    fsizeLimit: Int | Double = null,
    fsizeMin: Int | Double = null,
    insertOnly: Int | Double = null,
    isPrefixalScope: Int | Double = null,
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
    if (callbackBody != null) __obj.updateDynamic("callbackBody")(callbackBody)
    if (callbackBodyType != null) __obj.updateDynamic("callbackBodyType")(callbackBodyType)
    if (callbackFetchKey != null) __obj.updateDynamic("callbackFetchKey")(callbackFetchKey.asInstanceOf[js.Any])
    if (callbackHost != null) __obj.updateDynamic("callbackHost")(callbackHost)
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl)
    if (deleteAfterDays != null) __obj.updateDynamic("deleteAfterDays")(deleteAfterDays.asInstanceOf[js.Any])
    if (detectMime != null) __obj.updateDynamic("detectMime")(detectMime.asInstanceOf[js.Any])
    if (endUser != null) __obj.updateDynamic("endUser")(endUser)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (fsizeLimit != null) __obj.updateDynamic("fsizeLimit")(fsizeLimit.asInstanceOf[js.Any])
    if (fsizeMin != null) __obj.updateDynamic("fsizeMin")(fsizeMin.asInstanceOf[js.Any])
    if (insertOnly != null) __obj.updateDynamic("insertOnly")(insertOnly.asInstanceOf[js.Any])
    if (isPrefixalScope != null) __obj.updateDynamic("isPrefixalScope")(isPrefixalScope.asInstanceOf[js.Any])
    if (mimeLimit != null) __obj.updateDynamic("mimeLimit")(mimeLimit)
    if (persistentNotifyUrl != null) __obj.updateDynamic("persistentNotifyUrl")(persistentNotifyUrl)
    if (persistentOps != null) __obj.updateDynamic("persistentOps")(persistentOps)
    if (persistentPipeline != null) __obj.updateDynamic("persistentPipeline")(persistentPipeline)
    if (returnBody != null) __obj.updateDynamic("returnBody")(returnBody)
    if (returnUrl != null) __obj.updateDynamic("returnUrl")(returnUrl)
    if (saveKey != null) __obj.updateDynamic("saveKey")(saveKey)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[PutPolicyOptions]
  }
}

