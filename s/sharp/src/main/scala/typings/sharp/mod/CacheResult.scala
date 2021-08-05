package typings.sharp.mod

import typings.sharp.anon.Current
import typings.sharp.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheResult extends StObject {
  
  var files: Max
  
  var items: Max
  
  var memory: Current
}
object CacheResult {
  
  inline def apply(files: Max, items: Max, memory: Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResult]
  }
  
  extension [Self <: CacheResult](x: Self) {
    
    inline def setFiles(value: Max): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Max): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: Current): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
