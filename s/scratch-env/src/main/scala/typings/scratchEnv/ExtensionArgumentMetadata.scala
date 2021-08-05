package typings.scratchEnv

import typings.scratchEnv.Scratch.ArgumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** All the metadata needed to register an argument for an extension block. */
trait ExtensionArgumentMetadata extends StObject {
  
  /** The default value of this argument. */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  /** The name of the menu to use for this argument, if any. */
  var menu: js.UndefOr[String] = js.undefined
  
  /** The type of the argument (number, string, etc.) */
  var `type`: ValueOf[ArgumentType]
}
object ExtensionArgumentMetadata {
  
  inline def apply(`type`: ValueOf[ArgumentType]): ExtensionArgumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionArgumentMetadata]
  }
  
  extension [Self <: ExtensionArgumentMetadata](x: Self) {
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setType(value: ValueOf[ArgumentType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
