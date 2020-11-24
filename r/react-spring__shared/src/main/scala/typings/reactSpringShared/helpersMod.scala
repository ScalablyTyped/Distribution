package typings.reactSpringShared

import typings.reactSpringShared.anon.ForEach
import typings.std.Exclude
import typings.std.Extract
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/cjs/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  
  def defineHidden(obj: js.Any, key: js.Any, value: js.Any): js.Any = js.native
  
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit]
  ): Unit = js.native
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit],
    ctx: This
  ): Unit = js.native
  
  def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = js.native
  def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = js.native
  
  def isAnimatedString(value: js.Any): /* is string */ Boolean = js.native
  
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  def noop(): Unit = js.native
  
  def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[_] with (Exclude[T, Unit])) = js.native
  
  @js.native
  trait Eachable[Value, Key] extends js.Object {
    
    def forEach(cb: js.Function2[/* value */ Value, /* key */ Key, Unit]): Unit = js.native
    def forEach(cb: js.Function2[/* value */ Value, /* key */ Key, Unit], ctx: js.Any): Unit = js.native
  }
  
  @js.native
  object is extends js.Object {
    
    var arr: IsArray = js.native
    
    def fun(a: js.Any): /* is std.Function */ Boolean = js.native
    
    def num(a: js.Any): /* is number */ Boolean = js.native
    
    def obj[T /* <: js.Any */](a: T): /* is std.Exclude<T & @alloc/types.@alloc/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean = js.native
    
    def str(a: js.Any): /* is string */ Boolean = js.native
    
    def und(a: js.Any): /* is undefined */ Boolean = js.native
  }
  
  type InferKey[T /* <: js.Object */] = Extract[/* keyof T */ String, String]
  
  type InferValue[T /* <: js.Object */] = js.Any
  
  type IsArray = js.Function1[/* a */ js.Any, Boolean]
}
