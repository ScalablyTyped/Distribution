package typings.queryString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUrl extends js.Object {
  /**
  	The fragment identifier of the URL.
  	Present when the `parseFragmentIdentifier` option is `true`.
  	*/
  val fragmentIdentifier: js.UndefOr[String] = js.undefined
  val query: ParsedQuery[String]
  val url: String
}

object ParsedUrl {
  @scala.inline
  def apply(query: ParsedQuery[String], url: String, fragmentIdentifier: String = null): ParsedUrl = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (fragmentIdentifier != null) __obj.updateDynamic("fragmentIdentifier")(fragmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUrl]
  }
}

