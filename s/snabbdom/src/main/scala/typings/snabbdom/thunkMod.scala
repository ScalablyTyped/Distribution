package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thunkMod {
  
  @JSImport("snabbdom/build/package/thunk", "thunk")
  @js.native
  val thunk: ThunkFn = js.native
  
  trait ThunkData
    extends StObject
       with VNodeData {
    
    @JSName("args")
    var args_ThunkData: js.Array[js.Any]
    
    @JSName("fn")
    def fn_MThunkData(): VNode_
  }
  object ThunkData {
    
    inline def apply(args: js.Array[js.Any], fn: () => VNode_): ThunkData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
      __obj.asInstanceOf[ThunkData]
    }
    
    extension [Self <: ThunkData](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setFn(value: () => VNode_): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ThunkFn extends StObject {
    
    def apply(sel: String, fn: js.Function, args: js.Array[js.Any]): Thunk_ = js.native
    def apply(sel: String, key: js.Any, fn: js.Function, args: js.Array[js.Any]): Thunk_ = js.native
  }
  
  trait Thunk_
    extends StObject
       with VNode_ {
    
    @JSName("data")
    var data_Thunk_ : ThunkData
  }
  object Thunk_ {
    
    inline def apply(data: ThunkData): Thunk_ = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thunk_]
    }
    
    extension [Self <: Thunk_](x: Self) {
      
      inline def setData(value: ThunkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
