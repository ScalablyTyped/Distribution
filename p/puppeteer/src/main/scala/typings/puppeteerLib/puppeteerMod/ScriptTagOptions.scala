package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTagOptions extends js.Object {
  /** Raw JavaScript content to be injected into frame. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** Path to the JavaScript file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Script type. Use 'module' in order to load a Javascript ES6 module. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Url of a script to be added. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

