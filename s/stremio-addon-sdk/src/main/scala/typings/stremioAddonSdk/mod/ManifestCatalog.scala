package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestCatalog extends js.Object {
  
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
  implicit class ManifestCatalogOps[Self <: ManifestCatalog] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraVarargs(value: ManifestExtra*): Self = this.set("extra", js.Array(value :_*))
    
    @scala.inline
    def setExtra(value: js.Array[ManifestExtra]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: js.Array[String]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
  }
}
