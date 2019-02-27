package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionControlDetails extends js.Object {
  /**
    * A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of
    * the repository at that time.
    */
  var asOfTimeUtc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of a branch containing the revision.
    */
  var branch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The location in the local file system to which the root of the repository was mapped at the time of the
    * analysis.
    */
  var mappedTo: js.UndefOr[ArtifactLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the version control details.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The absolute URI of the repository.
    */
  var repositoryUri: java.lang.String
  /**
    * A string that uniquely and permanently identifies the revision within the repository.
    */
  var revisionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A tag that has been applied to the revision.
    */
  var revisionTag: js.UndefOr[java.lang.String] = js.undefined
}

