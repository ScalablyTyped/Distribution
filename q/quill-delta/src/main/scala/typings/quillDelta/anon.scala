package typings.quillDelta

import typings.quillDelta.distOpMod.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ops extends StObject {
    
    var ops: js.Array[Op]
  }
  object Ops {
    
    inline def apply(ops: js.Array[Op]): Ops = {
      val __obj = js.Dynamic.literal(ops = ops.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ops]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ops] (val x: Self) extends AnyVal {
      
      inline def setOps(value: js.Array[Op]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
      
      inline def setOpsVarargs(value: Op*): Self = StObject.set(x, "ops", js.Array(value*))
    }
  }
}
