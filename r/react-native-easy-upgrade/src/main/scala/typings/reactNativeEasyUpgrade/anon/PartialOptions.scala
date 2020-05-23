package typings.reactNativeEasyUpgrade.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-easy-upgrade.react-native-easy-upgrade.Options> */
trait PartialOptions extends js.Object {
  var downloadApkEnd: js.UndefOr[js.Function1[/* path */ String, _]] = js.undefined
  var downloadApkName: js.UndefOr[String] = js.undefined
  var downloadDescription: js.UndefOr[String] = js.undefined
  var downloadDestDirectory: js.UndefOr[String] = js.undefined
  var downloadTitle: js.UndefOr[String] = js.undefined
  var iOSAppId: js.UndefOr[String] = js.undefined
  var iOSAppLookupUrl: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ Error, _]] = js.undefined
  var shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    downloadApkEnd: /* path */ String => _ = null,
    downloadApkName: String = null,
    downloadDescription: String = null,
    downloadDestDirectory: String = null,
    downloadTitle: String = null,
    iOSAppId: String = null,
    iOSAppLookupUrl: String = null,
    onError: /* err */ Error => _ = null,
    shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (downloadApkEnd != null) __obj.updateDynamic("downloadApkEnd")(js.Any.fromFunction1(downloadApkEnd))
    if (downloadApkName != null) __obj.updateDynamic("downloadApkName")(downloadApkName.asInstanceOf[js.Any])
    if (downloadDescription != null) __obj.updateDynamic("downloadDescription")(downloadDescription.asInstanceOf[js.Any])
    if (downloadDestDirectory != null) __obj.updateDynamic("downloadDestDirectory")(downloadDestDirectory.asInstanceOf[js.Any])
    if (downloadTitle != null) __obj.updateDynamic("downloadTitle")(downloadTitle.asInstanceOf[js.Any])
    if (iOSAppId != null) __obj.updateDynamic("iOSAppId")(iOSAppId.asInstanceOf[js.Any])
    if (iOSAppLookupUrl != null) __obj.updateDynamic("iOSAppLookupUrl")(iOSAppLookupUrl.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(shouldCheckApkHasDownloaded)) __obj.updateDynamic("shouldCheckApkHasDownloaded")(shouldCheckApkHasDownloaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

