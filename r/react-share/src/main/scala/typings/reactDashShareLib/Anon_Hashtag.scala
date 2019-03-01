package typings
package reactDashShareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hashtag extends js.Object {
  /**
    * A hashtag specified by the developer to be added to the shared
    * content. People will still have the opportunity to remove this
    * hashtag in the dialog. The hashtag should include the hash symbol.
    */
  var hashtag: js.UndefOr[java.lang.String] = js.undefined
  /** A quote to be shared along with the link. */
  var quote: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hashtag {
  @scala.inline
  def apply(hashtag: java.lang.String = null, quote: java.lang.String = null): Anon_Hashtag = {
    val __obj = js.Dynamic.literal()
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    __obj.asInstanceOf[Anon_Hashtag]
  }
}

