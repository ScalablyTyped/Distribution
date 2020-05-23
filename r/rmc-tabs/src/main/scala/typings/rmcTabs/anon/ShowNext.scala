package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowNext extends js.Object {
  var showNext: Boolean
  var showPrev: Boolean
  var transform: String
}

object ShowNext {
  @scala.inline
  def apply(showNext: Boolean, showPrev: Boolean, transform: String): ShowNext = {
    val __obj = js.Dynamic.literal(showNext = showNext.asInstanceOf[js.Any], showPrev = showPrev.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowNext]
  }
}

