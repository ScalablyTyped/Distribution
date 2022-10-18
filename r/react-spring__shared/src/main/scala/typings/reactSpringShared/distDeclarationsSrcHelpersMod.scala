package typings.reactSpringShared

import typings.reactSpringTypes.utilMod.AnyFn
import typings.std.Map
import typings.std.Parameters
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcHelpersMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineHidden(obj: Any, key: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineHidden")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def each[Value, Key, This](obj: Eachable[Value, Key, This], fn: EachFn[Value, Key, This]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def eachProp[T /* <: js.Object */, This](
    obj: T,
    fn: js.ThisFunction2[
      /* this */ This, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[number] : T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachProp")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachProp[T /* <: js.Object */, This](
    obj: T,
    fn: js.ThisFunction2[
      /* this */ This, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[number] : T[keyof T] */ /* value */ js.Any, 
      /* key */ String, 
      Unit
    ],
    ctx: This
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachProp")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(queue.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flushCalls[T /* <: AnyFn[js.Array[Any], Any] */](
    queue: Set[T],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T> is not an array type */ args: Parameters[T]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushCalls")(queue.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object is {
    
    @JSImport("@react-spring/shared/dist/declarations/src/helpers", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/dist/declarations/src/helpers", "is.arr")
    @js.native
    def arr: IsType[js.Array[Any]] = js.native
    inline def arr_=(x: IsType[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arr")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/dist/declarations/src/helpers", "is.fun")
    @js.native
    def fun: IsType[js.Function] = js.native
    inline def fun_=(x: IsType[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fun")(x.asInstanceOf[js.Any])
    
    inline def num(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj[T /* <: Any */](a: Any): /* is std.Exclude<T & @react-spring/types.@react-spring/types/util.Lookup<any>, std.Function | std.Array<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Exclude<T & @react-spring/types.@react-spring/types/util.Lookup<any>, std.Function | std.Array<any>> */ Boolean]
    
    inline def str(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  }
  
  inline def isEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSSR(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSR")().asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def toArray[T](a: T): /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<T, void> extends infer T_1 ? T_1 extends std.Exclude<T, void> ? T_1 extends std.Array<any> ? std.Array<T_1[number]> extends T_1 ? std.Array<std.Exclude<T, void> extends infer T_2 ? T_2 extends std.Exclude<T, void> ? T_2 extends std.Array<infer U> ? U : T_2 : never : never> : T_1 : std.Array<std.Exclude<T, void> extends infer T_3 ? T_3 extends std.Exclude<T, void> ? T_3 extends std.Array<infer U_1> ? U_1 : T_3 : never : never> : never : never */ js.Any]
  
  type EachFn[Value, Key, This] = js.ThisFunction2[/* this */ This, /* value */ Value, /* key */ Key, Unit]
  
  @js.native
  trait Eachable[Value, Key, This] extends StObject {
    
    def forEach(cb: EachFn[Value, Key, This]): Unit = js.native
    def forEach(cb: EachFn[Value, Key, This], ctx: This): Unit = js.native
  }
  
  type IsType[U] = js.Function1[
    /* arg */ Any, 
    /* is @react-spring/shared.@react-spring/shared/dist/declarations/src/helpers.Narrow<any, U> */ Boolean
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [@react-spring/types.@react-spring/types.Any] ? U : [T] extends [U] ? std.Extract<T, U> : U
    }}}
    */
  @js.native
  trait Narrow[T, U] extends StObject
}
