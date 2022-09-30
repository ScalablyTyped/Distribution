package typings.reactNativeReanimated

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MutableRefObject
import typings.reactNativeReanimated.hookCommonTypesMod.Context
import typings.reactNativeReanimated.hookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.reanimated2CommonTypesMod.NativeEvent
import typings.reactNativeReanimated.reanimated2CommonTypesMod.NestedObjectValues
import typings.reactNativeReanimated.reanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.reanimated2CommonTypesMod.WorkletFunction
import typings.reactNativeReanimated.workletEventHandlerMod.default
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areDependenciesEqual(nextDeps: DependencyList, prevDeps: DependencyList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areDependenciesEqual")(nextDeps.asInstanceOf[js.Any], prevDeps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def buildDependencies(dependencies: DependencyList, handlers: Record[String, js.UndefOr[WorkletFunction]]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDependencies")(dependencies.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def buildWorkletsHash(handlers: js.Array[WorkletFunction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWorkletsHash")(handlers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildWorkletsHash(handlers: Record[String, WorkletFunction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWorkletsHash")(handlers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def canApplyOptimalisation(upadterFn: WorkletFunction): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("canApplyOptimalisation")(upadterFn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getStyleWithoutAnimations(newStyle: AnimatedStyle): StyleProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleWithoutAnimations")(newStyle.asInstanceOf[js.Any]).asInstanceOf[StyleProps]
  
  inline def hasColorProps(updates: AnimatedStyle): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasColorProps")(updates.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnimated(prop: NestedObjectValues[AnimationObject]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnimated")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseColors(updates: AnimatedStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseColors")(updates.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def styleDiff[T /* <: AnimatedStyle */](oldStyle: AnimatedStyle, newStyle: AnimatedStyle): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleDiff")(oldStyle.asInstanceOf[js.Any], newStyle.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit]): MutableRefObject[default[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: Unit, rebuild: Boolean): MutableRefObject[default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[default[T] | Null]]
  
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext]): UseHandlerContext[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[UseHandlerContext[TContext]]
  inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext], dependencies: DependencyList): UseHandlerContext[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseHandlerContext[TContext]]
  
  inline def validateAnimatedStyles(styles: AnimatedStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAnimatedStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Handler[T, TContext /* <: Context */]
    extends StObject
       with WorkletFunction {
    
    def apply(event: T, context: TContext): Unit = js.native
  }
  
  type Handlers[T, TContext /* <: Context */] = StringDictionary[js.UndefOr[Handler[T, TContext]]]
  
  trait UseHandlerContext[TContext /* <: Context */] extends StObject {
    
    var context: TContext
    
    var doDependenciesDiffer: Boolean
    
    var useWeb: Boolean
  }
  object UseHandlerContext {
    
    inline def apply[TContext /* <: Context */](context: TContext, doDependenciesDiffer: Boolean, useWeb: Boolean): UseHandlerContext[TContext] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], doDependenciesDiffer = doDependenciesDiffer.asInstanceOf[js.Any], useWeb = useWeb.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseHandlerContext[TContext]]
    }
    
    extension [Self <: UseHandlerContext[?], TContext /* <: Context */](x: Self & UseHandlerContext[TContext]) {
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDoDependenciesDiffer(value: Boolean): Self = StObject.set(x, "doDependenciesDiffer", value.asInstanceOf[js.Any])
      
      inline def setUseWeb(value: Boolean): Self = StObject.set(x, "useWeb", value.asInstanceOf[js.Any])
    }
  }
}
