package typings.scratchEnv

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an extension. */
@js.native
trait ExtensionMetadata extends StObject {
  
  /** URI for an image to be placed on each block in this extension. Data URI ok. */
  var blockIconURI: js.UndefOr[String] = js.native
  
  /** The blocks provided by this extension and the separators. */
  var blocks: js.Array[ExtensionBlockMetadata | String] = js.native
  
  /** Link to documentation content for this extension. */
  var docsURI: js.UndefOr[String] = js.native
  
  /** A unique alphanumeric identifier for this extension. No special characters allowed. */
  var id: String = js.native
  
  /** URI for an image to be placed on this extension's category menu item. Data URI ok. */
  var menuIconURI: js.UndefOr[String] = js.native
  
  /** Map of menu name to metadata for each of this extension's menus. */
  var menus: js.UndefOr[Record[String, ExtensionMenuMetadata]] = js.native
  
  /** The human-readable name of this extension. */
  var name: js.UndefOr[String] = js.native
}
object ExtensionMetadata {
  
  @scala.inline
  def apply(blocks: js.Array[ExtensionBlockMetadata | String], id: String): ExtensionMetadata = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionMetadata]
  }
  
  @scala.inline
  implicit class ExtensionMetadataMutableBuilder[Self <: ExtensionMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIconURI(value: String): Self = StObject.set(x, "blockIconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIconURIUndefined: Self = StObject.set(x, "blockIconURI", js.undefined)
    
    @scala.inline
    def setBlocks(value: js.Array[ExtensionBlockMetadata | String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: (ExtensionBlockMetadata | String)*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setDocsURI(value: String): Self = StObject.set(x, "docsURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsURIUndefined: Self = StObject.set(x, "docsURI", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIconURI(value: String): Self = StObject.set(x, "menuIconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuIconURIUndefined: Self = StObject.set(x, "menuIconURI", js.undefined)
    
    @scala.inline
    def setMenus(value: Record[String, ExtensionMenuMetadata]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
