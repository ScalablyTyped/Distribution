package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainData extends StObject {
  
  var categories: js.Object
  
  var categories_removed: js.Array[String]
  
  var full_update: Boolean
  
  var rid: Double
  
  var server_state: js.Object
  
  var tags: js.Array[String]
  
  var tags_removed: js.Array[String]
  
  var torrents: js.Object
  
  var torrents_removed: js.Array[String]
}
object MainData {
  
  inline def apply(
    categories: js.Object,
    categories_removed: js.Array[String],
    full_update: Boolean,
    rid: Double,
    server_state: js.Object,
    tags: js.Array[String],
    tags_removed: js.Array[String],
    torrents: js.Object,
    torrents_removed: js.Array[String]
  ): MainData = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], categories_removed = categories_removed.asInstanceOf[js.Any], full_update = full_update.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], server_state = server_state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tags_removed = tags_removed.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any], torrents_removed = torrents_removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MainData] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Object): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategories_removed(value: js.Array[String]): Self = StObject.set(x, "categories_removed", value.asInstanceOf[js.Any])
    
    inline def setCategories_removedVarargs(value: String*): Self = StObject.set(x, "categories_removed", js.Array(value*))
    
    inline def setFull_update(value: Boolean): Self = StObject.set(x, "full_update", value.asInstanceOf[js.Any])
    
    inline def setRid(value: Double): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    inline def setServer_state(value: js.Object): Self = StObject.set(x, "server_state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTags_removed(value: js.Array[String]): Self = StObject.set(x, "tags_removed", value.asInstanceOf[js.Any])
    
    inline def setTags_removedVarargs(value: String*): Self = StObject.set(x, "tags_removed", js.Array(value*))
    
    inline def setTorrents(value: js.Object): Self = StObject.set(x, "torrents", value.asInstanceOf[js.Any])
    
    inline def setTorrents_removed(value: js.Array[String]): Self = StObject.set(x, "torrents_removed", value.asInstanceOf[js.Any])
    
    inline def setTorrents_removedVarargs(value: String*): Self = StObject.set(x, "torrents_removed", js.Array(value*))
  }
}
