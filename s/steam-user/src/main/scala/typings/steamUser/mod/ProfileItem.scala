package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileItem extends StObject {
  
  var appid: Double
  
  var communityitemid: Double
  
  var equipped_flags: Any
  
  var image_large: String | Null
  
  var image_small: String | Null
  
  // could be improved
  var item_class: Any
  
  var item_description: String
  
  var item_title: String
  
  var item_type: Any
  
  var movie_mp4: String
  
  // could be improved
  var movie_webm: String
  
  var name: String
}
object ProfileItem {
  
  inline def apply(
    appid: Double,
    communityitemid: Double,
    equipped_flags: Any,
    item_class: Any,
    item_description: String,
    item_title: String,
    item_type: Any,
    movie_mp4: String,
    movie_webm: String,
    name: String
  ): ProfileItem = {
    val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], communityitemid = communityitemid.asInstanceOf[js.Any], equipped_flags = equipped_flags.asInstanceOf[js.Any], item_class = item_class.asInstanceOf[js.Any], item_description = item_description.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], movie_mp4 = movie_mp4.asInstanceOf[js.Any], movie_webm = movie_webm.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], image_large = null, image_small = null)
    __obj.asInstanceOf[ProfileItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileItem] (val x: Self) extends AnyVal {
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setCommunityitemid(value: Double): Self = StObject.set(x, "communityitemid", value.asInstanceOf[js.Any])
    
    inline def setEquipped_flags(value: Any): Self = StObject.set(x, "equipped_flags", value.asInstanceOf[js.Any])
    
    inline def setImage_large(value: String): Self = StObject.set(x, "image_large", value.asInstanceOf[js.Any])
    
    inline def setImage_largeNull: Self = StObject.set(x, "image_large", null)
    
    inline def setImage_small(value: String): Self = StObject.set(x, "image_small", value.asInstanceOf[js.Any])
    
    inline def setImage_smallNull: Self = StObject.set(x, "image_small", null)
    
    inline def setItem_class(value: Any): Self = StObject.set(x, "item_class", value.asInstanceOf[js.Any])
    
    inline def setItem_description(value: String): Self = StObject.set(x, "item_description", value.asInstanceOf[js.Any])
    
    inline def setItem_title(value: String): Self = StObject.set(x, "item_title", value.asInstanceOf[js.Any])
    
    inline def setItem_type(value: Any): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
    
    inline def setMovie_mp4(value: String): Self = StObject.set(x, "movie_mp4", value.asInstanceOf[js.Any])
    
    inline def setMovie_webm(value: String): Self = StObject.set(x, "movie_webm", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
