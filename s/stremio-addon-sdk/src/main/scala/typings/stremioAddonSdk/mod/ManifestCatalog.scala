package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestCatalog extends StObject {
  
  /**
    * All extra properties related to this catalog.
    */
  var extra: js.UndefOr[js.Array[ManifestExtra]] = js.native
  
  /**
    * Use the 'options' property of 'extra' instead.
    * @deprecated
    */
  var genres: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The id of the catalog, can be any unique string describing the catalog (unique per addon, as an addon can have many catalogs).
    *
    * For example: if the catalog name is "Favourite Youtube Videos", the id can be "fav_youtube_videos".
    */
  var id: String = js.native
  
  /**
    * Human readable name of the catalog.
    */
  var name: String = js.native
  
  /**
    *  This is the content type of the catalog.
    */
  var `type`: ContentType = js.native
}
object ManifestCatalog {
  
  @scala.inline
  def apply(id: String, name: String, `type`: ContentType): ManifestCatalog = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestCatalog]
  }
  
  @scala.inline
  implicit class ManifestCatalogMutableBuilder[Self <: ManifestCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: js.Array[ManifestExtra]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setExtraVarargs(value: ManifestExtra*): Self = StObject.set(x, "extra", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
