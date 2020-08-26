package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionControlDetails extends js.Object {
  /**
    * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of
    * the repository at that time.
    */
  var asOfTimeUtc: js.UndefOr[String] = js.native
  /**
    * The name of a branch containing the revision.
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * The location in the local file system to which the root of the repository was mapped at the time of the
    * analysis.
    */
  var mappedTo: js.UndefOr[ArtifactLocation] = js.native
  /**
    * Key/value pairs that provide additional information about the version control details.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The absolute URI of the repository.
    */
  var repositoryUri: String = js.native
  /**
    * A string that uniquely and permanently identifies the revision within the repository.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * A tag that has been applied to the revision.
    */
  var revisionTag: js.UndefOr[String] = js.native
}

object VersionControlDetails {
  @scala.inline
  def apply(repositoryUri: String): VersionControlDetails = {
    val __obj = js.Dynamic.literal(repositoryUri = repositoryUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionControlDetails]
  }
  @scala.inline
  implicit class VersionControlDetailsOps[Self <: VersionControlDetails] (val x: Self) extends AnyVal {
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
    def setRepositoryUri(value: String): Self = this.set("repositoryUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsOfTimeUtc(value: String): Self = this.set("asOfTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsOfTimeUtc: Self = this.set("asOfTimeUtc", js.undefined)
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    @scala.inline
    def setMappedTo(value: ArtifactLocation): Self = this.set("mappedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMappedTo: Self = this.set("mappedTo", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setRevisionTag(value: String): Self = this.set("revisionTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionTag: Self = this.set("revisionTag", js.undefined)
  }
  
}

