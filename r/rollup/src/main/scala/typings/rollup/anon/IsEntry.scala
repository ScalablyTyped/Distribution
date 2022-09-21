package typings.rollup.anon

import typings.rollup.mod.CustomPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEntry extends StObject {
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  var isEntry: Boolean
}
object IsEntry {
  
  inline def apply(isEntry: Boolean): IsEntry = {
    val __obj = js.Dynamic.literal(isEntry = isEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEntry]
  }
  
  extension [Self <: IsEntry](x: Self) {
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
  }
}
