package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyOptions extends js.Object {
  /** The number of columns (default: `80`). */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /** The height in pixels (default: `480`). */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The number of rows (default: `24`). */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /** The value to use for $TERM (default: `'vt100'`) */
  var term: js.UndefOr[java.lang.String] = js.undefined
  /** The width in pixels (default: `640`). */
  var width: js.UndefOr[scala.Double] = js.undefined
}

