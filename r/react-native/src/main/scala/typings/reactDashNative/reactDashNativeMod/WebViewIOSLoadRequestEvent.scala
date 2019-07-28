package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.backforward
import typings.reactDashNative.reactDashNativeStrings.click
import typings.reactDashNative.reactDashNativeStrings.formresubmit
import typings.reactDashNative.reactDashNativeStrings.formsubmit
import typings.reactDashNative.reactDashNativeStrings.other
import typings.reactDashNative.reactDashNativeStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewIOSLoadRequestEvent extends TargetedEvent {
  var canGoBack: Boolean
  var canGoForward: Boolean
  var loading: Boolean
  var lockIdentifier: Double
  var navigationType: click | formsubmit | backforward | reload | formresubmit | other
  var title: String
  var url: String
}

object WebViewIOSLoadRequestEvent {
  @scala.inline
  def apply(
    canGoBack: Boolean,
    canGoForward: Boolean,
    loading: Boolean,
    lockIdentifier: Double,
    navigationType: click | formsubmit | backforward | reload | formresubmit | other,
    target: Double,
    title: String,
    url: String
  ): WebViewIOSLoadRequestEvent = {
    val __obj = js.Dynamic.literal(canGoBack = canGoBack, canGoForward = canGoForward, loading = loading, lockIdentifier = lockIdentifier, navigationType = navigationType.asInstanceOf[js.Any], target = target, title = title, url = url)
  
    __obj.asInstanceOf[WebViewIOSLoadRequestEvent]
  }
}

