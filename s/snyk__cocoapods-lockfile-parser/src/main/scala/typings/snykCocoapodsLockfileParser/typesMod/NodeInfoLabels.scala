package typings.snykCocoapodsLockfileParser.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfoLabels
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  var checkoutOptionsBranch: js.UndefOr[String] = js.undefined
  var checkoutOptionsCommit: js.UndefOr[String] = js.undefined
  var checkoutOptionsGit: js.UndefOr[String] = js.undefined
  var checkoutOptionsPath: js.UndefOr[String] = js.undefined
  var checkoutOptionsPodspec: js.UndefOr[String] = js.undefined
  var checkoutOptionsTag: js.UndefOr[String] = js.undefined
  var checksum: String
  var externalSourceBranch: js.UndefOr[String] = js.undefined
  var externalSourceCommit: js.UndefOr[String] = js.undefined
  var externalSourceGit: js.UndefOr[String] = js.undefined
  var externalSourcePath: js.UndefOr[String] = js.undefined
  var externalSourcePodspec: js.UndefOr[String] = js.undefined
  var externalSourceTag: js.UndefOr[String] = js.undefined
  var repository: js.UndefOr[String] = js.undefined
}

object NodeInfoLabels {
  @scala.inline
  def apply(
    checksum: String,
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
    checkoutOptionsBranch: String = null,
    checkoutOptionsCommit: String = null,
    checkoutOptionsGit: String = null,
    checkoutOptionsPath: String = null,
    checkoutOptionsPodspec: String = null,
    checkoutOptionsTag: String = null,
    externalSourceBranch: String = null,
    externalSourceCommit: String = null,
    externalSourceGit: String = null,
    externalSourcePath: String = null,
    externalSourcePodspec: String = null,
    externalSourceTag: String = null,
    repository: String = null
  ): NodeInfoLabels = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOptionsBranch != null) __obj.updateDynamic("checkoutOptionsBranch")(checkoutOptionsBranch.asInstanceOf[js.Any])
    if (checkoutOptionsCommit != null) __obj.updateDynamic("checkoutOptionsCommit")(checkoutOptionsCommit.asInstanceOf[js.Any])
    if (checkoutOptionsGit != null) __obj.updateDynamic("checkoutOptionsGit")(checkoutOptionsGit.asInstanceOf[js.Any])
    if (checkoutOptionsPath != null) __obj.updateDynamic("checkoutOptionsPath")(checkoutOptionsPath.asInstanceOf[js.Any])
    if (checkoutOptionsPodspec != null) __obj.updateDynamic("checkoutOptionsPodspec")(checkoutOptionsPodspec.asInstanceOf[js.Any])
    if (checkoutOptionsTag != null) __obj.updateDynamic("checkoutOptionsTag")(checkoutOptionsTag.asInstanceOf[js.Any])
    if (externalSourceBranch != null) __obj.updateDynamic("externalSourceBranch")(externalSourceBranch.asInstanceOf[js.Any])
    if (externalSourceCommit != null) __obj.updateDynamic("externalSourceCommit")(externalSourceCommit.asInstanceOf[js.Any])
    if (externalSourceGit != null) __obj.updateDynamic("externalSourceGit")(externalSourceGit.asInstanceOf[js.Any])
    if (externalSourcePath != null) __obj.updateDynamic("externalSourcePath")(externalSourcePath.asInstanceOf[js.Any])
    if (externalSourcePodspec != null) __obj.updateDynamic("externalSourcePodspec")(externalSourcePodspec.asInstanceOf[js.Any])
    if (externalSourceTag != null) __obj.updateDynamic("externalSourceTag")(externalSourceTag.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoLabels]
  }
}

