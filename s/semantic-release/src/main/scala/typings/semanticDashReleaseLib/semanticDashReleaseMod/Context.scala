package typings
package semanticDashReleaseLib.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The previous release details. */
  var lastRelease: js.UndefOr[LastRelease] = js.undefined
  /** The shared logger instance of semantic release. */
  var logger: semanticDashReleaseLib.Anon_Error
  /** The next release details. */
  var nextRelease: js.UndefOr[NextRelease] = js.undefined
  /** The semantic release configuration itself. */
  var options: js.UndefOr[GlobalConfig] = js.undefined
}

