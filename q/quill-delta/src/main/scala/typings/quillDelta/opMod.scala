package typings.quillDelta

import typings.quillDelta.mod.AttributeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opMod {
  
  object default {
    
    @JSImport("quill-delta/dist/Op", "default.iterator")
    @js.native
    def iterator(ops: js.Array[Op]): typings.quillDelta.iteratorMod.default = js.native
    
    @JSImport("quill-delta/dist/Op", "default.length")
    @js.native
    def length(op: Op): Double = js.native
  }
  
  @js.native
  trait Op extends StObject {
    
    var attributes: js.UndefOr[AttributeMap] = js.native
    
    var delete: js.UndefOr[Double] = js.native
    
    var insert: js.UndefOr[String | js.Object] = js.native
    
    var retain: js.UndefOr[Double] = js.native
  }
  object Op {
    
    @scala.inline
    def apply(): Op = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Op]
    }
    
    @scala.inline
    implicit class OpMutableBuilder[Self <: Op] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: AttributeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setInsert(value: String | js.Object): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
}
