package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportData extends StObject {
  
  var encapsulation: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ImportData {
  
  inline def apply(): ImportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportData]
  }
  
  extension [Self <: ImportData](x: Self) {
    
    inline def setEncapsulation(value: String): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
