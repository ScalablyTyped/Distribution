package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewIOSLoadRequestEvent extends TargetedEvent {
  var canGoBack: scala.Boolean
  var canGoForward: scala.Boolean
  var loading: scala.Boolean
  var lockIdentifier: scala.Double
  var navigationType: reactDashNativeLib.reactDashNativeLibStrings.click | reactDashNativeLib.reactDashNativeLibStrings.formsubmit | reactDashNativeLib.reactDashNativeLibStrings.backforward | reactDashNativeLib.reactDashNativeLibStrings.reload | reactDashNativeLib.reactDashNativeLibStrings.formresubmit | reactDashNativeLib.reactDashNativeLibStrings.other
  var title: java.lang.String
  var url: java.lang.String
}

object WebViewIOSLoadRequestEvent {
  @scala.inline
  def apply(
    canGoBack: scala.Boolean,
    canGoForward: scala.Boolean,
    loading: scala.Boolean,
    lockIdentifier: scala.Double,
    navigationType: reactDashNativeLib.reactDashNativeLibStrings.click | reactDashNativeLib.reactDashNativeLibStrings.formsubmit | reactDashNativeLib.reactDashNativeLibStrings.backforward | reactDashNativeLib.reactDashNativeLibStrings.reload | reactDashNativeLib.reactDashNativeLibStrings.formresubmit | reactDashNativeLib.reactDashNativeLibStrings.other,
    target: scala.Double,
    title: java.lang.String,
    url: java.lang.String
  ): WebViewIOSLoadRequestEvent = {
    val __obj = js.Dynamic.literal(canGoBack = canGoBack, canGoForward = canGoForward, loading = loading, lockIdentifier = lockIdentifier, navigationType = navigationType.asInstanceOf[js.Any], target = target, title = title, url = url)
  
    __obj.asInstanceOf[WebViewIOSLoadRequestEvent]
  }
}

