package typings.quillDelta

import typings.quillDelta.mod.AttributeMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opMod {
  
  object default {
    
    @JSImport("quill-delta/dist/Op", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def length(op: Op): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(op.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  trait Op extends StObject {
    
    var attributes: js.UndefOr[AttributeMap] = js.undefined
    
    var delete: js.UndefOr[Double] = js.undefined
    
    var insert: js.UndefOr[String | (Record[String, Any])] = js.undefined
    
    var retain: js.UndefOr[Double | (Record[String, Any])] = js.undefined
  }
  object Op {
    
    inline def apply(): Op = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Op]
    }
    
    extension [Self <: Op](x: Self) {
      
      inline def setAttributes(value: AttributeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setInsert(value: String | (Record[String, Any])): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRetain(value: Double | (Record[String, Any])): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
}
