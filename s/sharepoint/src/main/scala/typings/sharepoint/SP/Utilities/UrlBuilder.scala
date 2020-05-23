package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlBuilder extends js.Object {
  def addKeyValueQueryString(key: String, value: String): Unit
  def combinePath(path: String): Unit
  /** Returns the resulting url */
  def get_url(): String
}

object UrlBuilder {
  @scala.inline
  def apply(
    addKeyValueQueryString: (String, String) => Unit,
    combinePath: String => Unit,
    get_url: () => String
  ): UrlBuilder = {
    val __obj = js.Dynamic.literal(addKeyValueQueryString = js.Any.fromFunction2(addKeyValueQueryString), combinePath = js.Any.fromFunction1(combinePath), get_url = js.Any.fromFunction0(get_url))
    __obj.asInstanceOf[UrlBuilder]
  }
}

