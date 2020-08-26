package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareContentCommonParameters extends js.Object {
  /**
    * A hashtag to be added to the share interface. The hashtag must be 32 characters or less.
    */
  var hashtag: js.UndefOr[String] = js.native
  /**
    * List of IDs for taggable people to tag with this content.
    */
  var peopleIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID for a place to tag with this content.
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * A value to be added to the referrer URL when a person follows a link from
    * this shared content on feed.
    */
  var ref: js.UndefOr[String] = js.native
}

object ShareContentCommonParameters {
  @scala.inline
  def apply(): ShareContentCommonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareContentCommonParameters]
  }
  @scala.inline
  implicit class ShareContentCommonParametersOps[Self <: ShareContentCommonParameters] (val x: Self) extends AnyVal {
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
    def setHashtag(value: String): Self = this.set("hashtag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashtag: Self = this.set("hashtag", js.undefined)
    @scala.inline
    def setPeopleIdsVarargs(value: String*): Self = this.set("peopleIds", js.Array(value :_*))
    @scala.inline
    def setPeopleIds(value: js.Array[String]): Self = this.set("peopleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeopleIds: Self = this.set("peopleIds", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

