package typings.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullManifestResource extends js.Object {
  
  /**
    * Use this if you want your addon to be called only for specific content IDs
    *
    * For example, if you set this to ["yt_id:", "tt"], your addon will only be called for id values that start with 'yt_id:' or 'tt'.
    */
  var idPrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resource name.
    */
  var name: ShortManifestResource = js.native
  
  /**
    * Supported types.
    */
  var types: js.Array[ContentType] = js.native
}
object FullManifestResource {
  
  @scala.inline
  def apply(name: ShortManifestResource, types: js.Array[ContentType]): FullManifestResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullManifestResource]
  }
  
  @scala.inline
  implicit class FullManifestResourceOps[Self <: FullManifestResource] (val x: Self) extends AnyVal {
    
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
    def setName(value: ShortManifestResource): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: ContentType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[ContentType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixesVarargs(value: String*): Self = this.set("idPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setIdPrefixes(value: js.Array[String]): Self = this.set("idPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefixes: Self = this.set("idPrefixes", js.undefined)
  }
}
