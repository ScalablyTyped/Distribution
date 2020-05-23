package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutOpenOptions extends js.Object {
  /** Callout will be closed on blur */
  var closeCalloutOnBlur: Boolean
  /** HTML event name, e.g. "click" */
  var event: String
  /** Close button will be shown within the callout window */
  var showCloseButton: Boolean
}

object CalloutOpenOptions {
  @scala.inline
  def apply(closeCalloutOnBlur: Boolean, event: String, showCloseButton: Boolean): CalloutOpenOptions = {
    val __obj = js.Dynamic.literal(closeCalloutOnBlur = closeCalloutOnBlur.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], showCloseButton = showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOpenOptions]
  }
}

