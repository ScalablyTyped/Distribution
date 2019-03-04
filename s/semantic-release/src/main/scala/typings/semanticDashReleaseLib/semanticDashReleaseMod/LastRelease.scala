package typings
package semanticDashReleaseLib.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastRelease extends js.Object {
  /** The Git checksum of the last commit of the release. */
  var gitHead: java.lang.String
  /** The Git tag of the release. */
  var gitTag: java.lang.String
  /** The version name of the release */
  var version: java.lang.String
}

object LastRelease {
  @scala.inline
  def apply(gitHead: java.lang.String, gitTag: java.lang.String, version: java.lang.String): LastRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead, gitTag = gitTag, version = version)
  
    __obj.asInstanceOf[LastRelease]
  }
}

