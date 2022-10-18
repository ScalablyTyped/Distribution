package typings.reactSpringCore

import typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.InferTo
import typings.reactSpringCore.reactSpringCoreStrings.config
import typings.reactSpringCore.reactSpringCoreStrings.onChange
import typings.reactSpringCore.reactSpringCoreStrings.onPause
import typings.reactSpringCore.reactSpringCoreStrings.onProps
import typings.reactSpringCore.reactSpringCoreStrings.onRest
import typings.reactSpringCore.reactSpringCoreStrings.onResume
import typings.reactSpringCore.reactSpringCoreStrings.onStart
import typings.reactSpringTypes.utilMod.AnyFn
import typings.reactSpringTypes.utilMod.Lookup
import typings.reactSpringTypes.utilMod.OneOrMore
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcHelpersMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/core/dist/declarations/src/helpers", "DEFAULT_PROPS")
  @js.native
  val DEFAULT_PROPS: js.Tuple7[config, onProps, onStart, onChange, onPause, onResume, onRest] = js.native
  
  inline def callProp[T](
    value: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T extends AnyFn ? Parameters<T> : Array<unknown> is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/types.@react-spring/types/util.AnyFn<std.Array<any>, any> ? std.Parameters<T> : std.Array<unknown> */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/types.@react-spring/types/util.AnyFn<any, infer U> ? U : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("callProp")(value.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @react-spring/types.@react-spring/types/util.AnyFn<any, infer U> ? U : T */ js.Any]
  
  inline def computeGoal[T](
    value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FluidValue<T> */ Any) | T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("computeGoal")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def concatFn[T /* <: AnyFn[js.Array[Any], Any] */](first: T, last: T): js.Function1[/* args */ Parameters[T], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatFn")(first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], Any]]
  inline def concatFn[T /* <: AnyFn[js.Array[Any], Any] */](first: Unit, last: T): js.Function1[/* args */ Parameters[T], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatFn")(first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], Any]]
  
  inline def detachRefs(ctrl: Controller[Lookup[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachRefs")(ctrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def detachRefs(ctrl: Controller[Lookup[Any]], ref: SpringRef[Lookup[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachRefs")(ctrl.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefaultProp[T /* <: Lookup[Any] */, P /* <: /* keyof T */ String */](props: T, key: P): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProp")(props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any]
  
  inline def getDefaultProps[T /* <: Lookup[Any] */](props: Lookup[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")(props.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def getDefaultProps[T /* <: Lookup[Any] */](props: Lookup[Any], transform: js.Function2[/* value */ Any, /* key */ String, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProps")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def hasDefaultProp[T /* <: Lookup[Any] */](props: T, key: /* keyof T */ String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDefaultProp")(props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasProps(props: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def inferTo[T /* <: js.Object */](props: T): InferTo[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferTo")(props.asInstanceOf[js.Any]).asInstanceOf[InferTo[T]]
  
  inline def isAsyncTo(to: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncTo")(to.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchProp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")().asInstanceOf[Boolean]
  inline def matchProp(value: js.Function1[/* key */ Any, Boolean]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchProp(value: js.Function1[/* key */ Any, Boolean], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchProp(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchProp(value: Boolean, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchProp(value: Unit, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchProp(value: OneOrMore[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def matchProp(value: OneOrMore[String], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchProp")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def replaceRef(ctrl: Controller[Lookup[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceRef")(ctrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def replaceRef(ctrl: Controller[Lookup[Any]], ref: SpringRef[Lookup[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRef")(ctrl.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveProp[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")().asInstanceOf[Any]
  inline def resolveProp[T](prop: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolveProp[T](prop: T, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(prop.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolveProp[T](prop: Unit, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(prop.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolveProp[T](prop: Lookup[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def resolveProp[T](prop: Lookup[T], key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(prop.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
}
