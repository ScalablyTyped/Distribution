package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareContentCommonParameters extends StObject {
  
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
  implicit class ShareContentCommonParametersMutableBuilder[Self <: ShareContentCommonParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    @scala.inline
    def setPeopleIds(value: js.Array[String]): Self = StObject.set(x, "peopleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleIdsUndefined: Self = StObject.set(x, "peopleIds", js.undefined)
    
    @scala.inline
    def setPeopleIdsVarargs(value: String*): Self = StObject.set(x, "peopleIds", js.Array(value :_*))
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
