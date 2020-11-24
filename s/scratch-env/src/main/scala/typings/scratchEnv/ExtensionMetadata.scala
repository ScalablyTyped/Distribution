package typings.scratchEnv

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an extension. */
@js.native
trait ExtensionMetadata extends js.Object {
  
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
  implicit class ExtensionMetadataOps[Self <: ExtensionMetadata] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: (ExtensionBlockMetadata | String)*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[ExtensionBlockMetadata | String]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIconURI(value: String): Self = this.set("blockIconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIconURI: Self = this.set("blockIconURI", js.undefined)
    
    @scala.inline
    def setDocsURI(value: String): Self = this.set("docsURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocsURI: Self = this.set("docsURI", js.undefined)
    
    @scala.inline
    def setMenuIconURI(value: String): Self = this.set("menuIconURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuIconURI: Self = this.set("menuIconURI", js.undefined)
    
    @scala.inline
    def setMenus(value: Record[String, ExtensionMenuMetadata]): Self = this.set("menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenus: Self = this.set("menus", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
