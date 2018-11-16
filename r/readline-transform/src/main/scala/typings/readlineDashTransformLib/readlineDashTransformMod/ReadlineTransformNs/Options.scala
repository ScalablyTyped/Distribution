package typings
package readlineDashTransformLib.readlineDashTransformMod.ReadlineTransformNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends nodeLib.streamMod.internalNs.TransformOptions {
  /** line break matcher for str.split() (default: /\r?\n/) */
  var breakMatcher: js.UndefOr[stdLib.RegExp] = js.undefined
  /** if content ends with line break, ignore last empty line (default: true) */
  var ignoreEndOfBreak: js.UndefOr[scala.Boolean] = js.undefined
  /** if line is empty string, skip it (default: false) */
  var skipEmpty: js.UndefOr[scala.Boolean] = js.undefined
}

