package typings.scratchEnv

import typings.scratchEnv.Scratch.ArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an argument for an extension block. */
@js.native
trait ExtensionArgumentMetadata extends js.Object {
  
  /** The default value of this argument. */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /** The name of the menu to use for this argument, if any. */
  var menu: js.UndefOr[String] = js.native
  
  /** The type of the argument (number, string, etc.) */
  var `type`: ValueOf[ArgumentType] = js.native
}
object ExtensionArgumentMetadata {
  
  @scala.inline
  def apply(`type`: ValueOf[ArgumentType]): ExtensionArgumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionArgumentMetadata]
  }
  
  @scala.inline
  implicit class ExtensionArgumentMetadataOps[Self <: ExtensionArgumentMetadata] (val x: Self) extends AnyVal {
    
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
    def setType(value: ValueOf[ArgumentType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
  }
}
