package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hashtag extends js.Object {
  /**
    * A hashtag specified by the developer to be added to the shared
    * content. People will still have the opportunity to remove this
    * hashtag in the dialog. The hashtag should include the hash symbol.
    */
  var hashtag: js.UndefOr[String] = js.undefined
  /** A quote to be shared along with the link. */
  var quote: js.UndefOr[String] = js.undefined
}

object Anon_Hashtag {
  @scala.inline
  def apply(hashtag: String = null, quote: String = null): Anon_Hashtag = {
    val __obj = js.Dynamic.literal()
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Hashtag]
  }
}

