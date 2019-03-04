package typings
package semanticDashReleaseLib.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextRelease extends LastRelease {
  /** The release notes of the next release. */
  var notes: java.lang.String
}

object NextRelease {
  @scala.inline
  def apply(
    gitHead: java.lang.String,
    gitTag: java.lang.String,
    notes: java.lang.String,
    version: java.lang.String
  ): NextRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead, gitTag = gitTag, notes = notes, version = version)
  
    __obj.asInstanceOf[NextRelease]
  }
}

