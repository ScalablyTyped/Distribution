package typings.semanticDashRelease.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextRelease extends LastRelease {
  /** The release notes of the next release. */
  var notes: String
}

object NextRelease {
  @scala.inline
  def apply(gitHead: String, gitTag: String, notes: String, version: String): NextRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead, gitTag = gitTag, notes = notes, version = version)
  
    __obj.asInstanceOf[NextRelease]
  }
}

