package typings.scratchEnv

import typings.scratchEnv.Scratch.ArgumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an argument for an extension block. */
@js.native
trait ExtensionArgumentMetadata extends StObject {
  
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
  implicit class ExtensionArgumentMetadataMutableBuilder[Self <: ExtensionArgumentMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setType(value: ValueOf[ArgumentType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
