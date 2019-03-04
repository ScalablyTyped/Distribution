package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** The cookie name. */
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteCookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    domain: java.lang.String = null,
    path: java.lang.String = null,
    url: java.lang.String = null
  ): DeleteCookie = {
    val __obj = js.Dynamic.literal(name = name)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (path != null) __obj.updateDynamic("path")(path)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DeleteCookie]
  }
}

