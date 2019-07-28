package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  /** The cookie name. */
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DeleteCookie {
  @scala.inline
  def apply(name: String, domain: String = null, path: String = null, url: String = null): DeleteCookie = {
    val __obj = js.Dynamic.literal(name = name)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (path != null) __obj.updateDynamic("path")(path)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DeleteCookie]
  }
}

