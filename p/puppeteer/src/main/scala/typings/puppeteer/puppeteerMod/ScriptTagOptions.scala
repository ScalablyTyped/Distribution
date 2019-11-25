package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTagOptions extends js.Object {
  /** Raw JavaScript content to be injected into frame. */
  var content: js.UndefOr[String] = js.undefined
  /** Path to the JavaScript file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[String] = js.undefined
  /** Script type. Use 'module' in order to load a Javascript ES6 module. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Url of a script to be added. */
  var url: js.UndefOr[String] = js.undefined
}

object ScriptTagOptions {
  @scala.inline
  def apply(content: String = null, path: String = null, `type`: String = null, url: String = null): ScriptTagOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTagOptions]
  }
}

