package typings.reactSpringShared

import typings.reactSpringShared.anon.ForEach
import typings.std.Exclude
import typings.std.Extract
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@react-spring/shared/cjs/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineHidden(obj: js.Any, key: js.Any, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def each[T /* <: js.Object */, This](
    obj: T & ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T /* <: js.Object */, This](
    obj: T & ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit],
    ctx: This
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object is {
    
    @JSImport("@react-spring/shared/cjs/helpers", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/cjs/helpers", "is.arr")
    @js.native
    def arr: IsArray = js.native
    inline def arr_=(x: IsArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arr")(x.asInstanceOf[js.Any])
    
    inline def fun(a: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fun")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def num(a: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj[T /* <: js.Any */](a: T): /* is std.Exclude<T & @alloc/types.@alloc/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Exclude<T & @alloc/types.@alloc/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean]
    
    inline def str(a: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  }
  
  inline def isAnimatedString(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimatedString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[js.Any] & (Exclude[T, Unit])) = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Exclude[T, Unit]]) | (js.Array[js.Any] & (Exclude[T, Unit]))]
  
  @js.native
  trait Eachable[Value, Key] extends StObject {
    
    def forEach(cb: js.Function2[/* value */ Value, /* key */ Key, Unit]): Unit = js.native
    def forEach(cb: js.Function2[/* value */ Value, /* key */ Key, Unit], ctx: js.Any): Unit = js.native
  }
  
  type InferKey[T /* <: js.Object */] = Extract[/* keyof T */ String, String]
  
  type InferValue[T /* <: js.Object */] = js.Any
  
  type IsArray = js.Function1[/* a */ js.Any, Boolean]
}
