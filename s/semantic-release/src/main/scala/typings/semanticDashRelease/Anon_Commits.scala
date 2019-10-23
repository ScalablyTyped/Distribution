package typings.semanticDashRelease

import typings.semanticDashRelease.semanticDashReleaseMod.Commit
import typings.semanticDashRelease.semanticDashReleaseMod.LastRelease
import typings.semanticDashRelease.semanticDashReleaseMod.NextRelease
import typings.semanticDashRelease.semanticDashReleaseMod.Release
import typings.semanticDashRelease.semanticDashReleaseMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commits extends Result {
  /**
  		 * The list of commits included in the new release.
  		 */
  var commits: js.Array[Commit]
  /**
  		 * Information related to the last release found.
  		 */
  var lastRelease: LastRelease
  /**
  		 * Information related to the newly published release.
  		 */
  var nextRelease: NextRelease
  /**
  		 * The list of releases published, one release per publish plugin.
  		 */
  var releases: js.Array[Release]
}

object Anon_Commits {
  @scala.inline
  def apply(
    commits: js.Array[Commit],
    lastRelease: LastRelease,
    nextRelease: NextRelease,
    releases: js.Array[Release]
  ): Anon_Commits = {
    val __obj = js.Dynamic.literal(commits = commits, lastRelease = lastRelease, nextRelease = nextRelease, releases = releases)
  
    __obj.asInstanceOf[Anon_Commits]
  }
}

