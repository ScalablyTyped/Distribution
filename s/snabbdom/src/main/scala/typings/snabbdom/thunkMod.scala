package typings.snabbdom

import typings.snabbdom.vnodeMod.VNodeData
import typings.snabbdom.vnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thunkMod {
  
  @JSImport("snabbdom/build/package/thunk", "thunk")
  @js.native
  val thunk: ThunkFn = js.native
  
  @js.native
  trait ThunkData extends VNodeData {
    
    @JSName("args")
    var args_ThunkData: js.Array[_] = js.native
    
    @JSName("fn")
    def fn_MThunkData(): VNode_ = js.native
  }
  object ThunkData {
    
    @scala.inline
    def apply(args: js.Array[_], fn: () => VNode_): ThunkData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
      __obj.asInstanceOf[ThunkData]
    }
    
    @scala.inline
    implicit class ThunkDataMutableBuilder[Self <: ThunkData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setFn(value: () => VNode_): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ThunkFn extends StObject {
    
    def apply(sel: String, fn: js.Function, args: js.Array[_]): Thunk_ = js.native
    def apply(sel: String, key: js.Any, fn: js.Function, args: js.Array[_]): Thunk_ = js.native
  }
  
  @js.native
  trait Thunk_ extends VNode_ {
    
    @JSName("data")
    var data_Thunk_ : ThunkData = js.native
  }
  object Thunk_ {
    
    @scala.inline
    def apply(data: ThunkData): Thunk_ = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thunk_]
    }
    
    @scala.inline
    implicit class Thunk_MutableBuilder[Self <: Thunk_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ThunkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
