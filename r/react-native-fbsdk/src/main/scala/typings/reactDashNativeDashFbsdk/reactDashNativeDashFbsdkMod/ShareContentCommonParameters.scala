package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareContentCommonParameters extends js.Object {
  /**
    * A hashtag to be added to the share interface. The hashtag must be 32 characters or less.
    */
  var hashtag: js.UndefOr[String] = js.undefined
  /**
    * List of IDs for taggable people to tag with this content.
    */
  var peopleIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The ID for a place to tag with this content.
    */
  var placeId: js.UndefOr[String] = js.undefined
  /**
    * A value to be added to the referrer URL when a person follows a link from
    * this shared content on feed.
    */
  var ref: js.UndefOr[String] = js.undefined
}

object ShareContentCommonParameters {
  @scala.inline
  def apply(
    hashtag: String = null,
    peopleIds: js.Array[String] = null,
    placeId: String = null,
    ref: String = null
  ): ShareContentCommonParameters = {
    val __obj = js.Dynamic.literal()
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (peopleIds != null) __obj.updateDynamic("peopleIds")(peopleIds)
    if (placeId != null) __obj.updateDynamic("placeId")(placeId)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ShareContentCommonParameters]
  }
}

