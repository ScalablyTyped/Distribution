package typings.reactShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashtag extends js.Object {
  /**
    * A hashtag specified by the developer to be added to the shared
    * content. People will still have the opportunity to remove this
    * hashtag in the dialog. The hashtag should include the hash symbol.
    */
  var hashtag: js.UndefOr[String] = js.undefined
  /** A quote to be shared along with the link. */
  var quote: js.UndefOr[String] = js.undefined
}

object AnonHashtag {
  @scala.inline
  def apply(hashtag: String = null, quote: String = null): AnonHashtag = {
    val __obj = js.Dynamic.literal()
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHashtag]
  }
}

