package typings.scratchEnv

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an extension. */
trait ExtensionMetadata extends StObject {
  
  /** URI for an image to be placed on each block in this extension. Data URI ok. */
  var blockIconURI: js.UndefOr[String] = js.undefined
  
  /** The blocks provided by this extension and the separators. */
  var blocks: js.Array[ExtensionBlockMetadata | String]
  
  /** Link to documentation content for this extension. */
  var docsURI: js.UndefOr[String] = js.undefined
  
  /** A unique alphanumeric identifier for this extension. No special characters allowed. */
  var id: String
  
  /** URI for an image to be placed on this extension's category menu item. Data URI ok. */
  var menuIconURI: js.UndefOr[String] = js.undefined
  
  /** Map of menu name to metadata for each of this extension's menus. */
  var menus: js.UndefOr[Record[String, ExtensionMenuMetadata]] = js.undefined
  
  /** The human-readable name of this extension. */
  var name: js.UndefOr[String] = js.undefined
}
object ExtensionMetadata {
  
  inline def apply(blocks: js.Array[ExtensionBlockMetadata | String], id: String): ExtensionMetadata = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionMetadata]
  }
  
  extension [Self <: ExtensionMetadata](x: Self) {
    
    inline def setBlockIconURI(value: String): Self = StObject.set(x, "blockIconURI", value.asInstanceOf[js.Any])
    
    inline def setBlockIconURIUndefined: Self = StObject.set(x, "blockIconURI", js.undefined)
    
    inline def setBlocks(value: js.Array[ExtensionBlockMetadata | String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: (ExtensionBlockMetadata | String)*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    inline def setDocsURI(value: String): Self = StObject.set(x, "docsURI", value.asInstanceOf[js.Any])
    
    inline def setDocsURIUndefined: Self = StObject.set(x, "docsURI", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMenuIconURI(value: String): Self = StObject.set(x, "menuIconURI", value.asInstanceOf[js.Any])
    
    inline def setMenuIconURIUndefined: Self = StObject.set(x, "menuIconURI", js.undefined)
    
    inline def setMenus(value: Record[String, ExtensionMenuMetadata]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setMenusUndefined: Self = StObject.set(x, "menus", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
