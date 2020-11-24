package typings.semanticRelease.anon

import typings.semanticRelease.mod.Commit
import typings.semanticRelease.mod.LastRelease
import typings.semanticRelease.mod.NextRelease
import typings.semanticRelease.mod.Release
import typings.semanticRelease.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commits extends Result {
  
  /**
    * The list of commits included in the new release.
    */
  var commits: js.Array[Commit] = js.native
  
  /**
    * Information related to the last release found.
    */
  var lastRelease: LastRelease = js.native
  
  /**
    * Information related to the newly published release.
    */
  var nextRelease: NextRelease = js.native
  
  /**
    * The list of releases published, one release per publish plugin.
    */
  var releases: js.Array[Release] = js.native
}
object Commits {
  
  @scala.inline
  def apply(
    commits: js.Array[Commit],
    lastRelease: LastRelease,
    nextRelease: NextRelease,
    releases: js.Array[Release]
  ): Commits = {
    val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], nextRelease = nextRelease.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  @scala.inline
  implicit class CommitsOps[Self <: Commits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitsVarargs(value: Commit*): Self = this.set("commits", js.Array(value :_*))
    
    @scala.inline
    def setCommits(value: js.Array[Commit]): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRelease(value: LastRelease): Self = this.set("lastRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRelease(value: NextRelease): Self = this.set("nextRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesVarargs(value: Release*): Self = this.set("releases", js.Array(value :_*))
    
    @scala.inline
    def setReleases(value: js.Array[Release]): Self = this.set("releases", value.asInstanceOf[js.Any])
  }
}
