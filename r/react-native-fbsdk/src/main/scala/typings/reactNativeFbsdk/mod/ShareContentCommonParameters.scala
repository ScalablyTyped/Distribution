package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareContentCommonParameters extends StObject {
  
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
  
  inline def apply(): ShareContentCommonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareContentCommonParameters]
  }
  
  extension [Self <: ShareContentCommonParameters](x: Self) {
    
    inline def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
    
    inline def setPeopleIds(value: js.Array[String]): Self = StObject.set(x, "peopleIds", value.asInstanceOf[js.Any])
    
    inline def setPeopleIdsUndefined: Self = StObject.set(x, "peopleIds", js.undefined)
    
    inline def setPeopleIdsVarargs(value: String*): Self = StObject.set(x, "peopleIds", js.Array(value :_*))
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
