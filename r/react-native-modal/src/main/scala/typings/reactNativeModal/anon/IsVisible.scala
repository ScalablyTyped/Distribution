package typings.reactNativeModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsVisible extends js.Object {
  var isVisible: Boolean
  var showContent: Boolean
}

object IsVisible {
  @scala.inline
  def apply(isVisible: Boolean, showContent: Boolean): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVisible]
  }
}

