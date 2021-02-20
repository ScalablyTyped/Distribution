package typings.quillDelta

import typings.quillDelta.opMod.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ops extends StObject {
    
    var ops: js.Array[Op] = js.native
  }
  object Ops {
    
    @scala.inline
    def apply(ops: js.Array[Op]): Ops = {
      val __obj = js.Dynamic.literal(ops = ops.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ops]
    }
    
    @scala.inline
    implicit class OpsMutableBuilder[Self <: Ops] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOps(value: js.Array[Op]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpsVarargs(value: Op*): Self = StObject.set(x, "ops", js.Array(value :_*))
    }
  }
}
