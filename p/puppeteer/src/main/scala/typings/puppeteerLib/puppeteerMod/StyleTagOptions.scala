package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleTagOptions extends js.Object {
  /** Raw CSS content to be injected into frame. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Path to the CSS file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Url of the <link> tag. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

