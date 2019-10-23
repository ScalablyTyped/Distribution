package typings.semanticDashRelease.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastRelease extends js.Object {
  /**
  		 * The Git checksum of the last commit of the release.
  		 */
  var gitHead: String
  /**
  		 * The Git tag of the release.
  		 */
  var gitTag: String
  /**
  		 * The version name of the release.
  		 */
  var version: String
}

object LastRelease {
  @scala.inline
  def apply(gitHead: String, gitTag: String, version: String): LastRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead, gitTag = gitTag, version = version)
  
    __obj.asInstanceOf[LastRelease]
  }
}

