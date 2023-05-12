package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.anon.JsHeapSizeLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryData
  extends StObject
     with _AllEntryData {
  
  var memory: JsHeapSizeLimit
}
object MemoryData {
  
  inline def apply(memory: JsHeapSizeLimit): MemoryData = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryData] (val x: Self) extends AnyVal {
    
    inline def setMemory(value: JsHeapSizeLimit): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
  }
}
