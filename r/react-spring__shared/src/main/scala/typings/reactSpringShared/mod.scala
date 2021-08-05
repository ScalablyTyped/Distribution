package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.allocTypes.mod.OneOrMore
import typings.fluids.mod.FluidConfig
import typings.fluids.mod.FluidEvent
import typings.fluids.mod.FluidObserver
import typings.fluids.mod.GetFluidConfig_
import typings.reactSpringShared.anon.ForEach
import typings.reactSpringShared.frameLoopMod.OpaqueAnimation
import typings.reactSpringShared.frameLoopMod.RequestFrameFn
import typings.reactSpringShared.globalsMod.AnimatedGlobals
import typings.reactSpringShared.helpersMod.InferKey
import typings.reactSpringShared.helpersMod.InferValue
import typings.reactSpringShared.helpersMod.IsArray
import typings.reactSpringShared.hooksMod.UseOnce_
import typings.reactSpringShared.typesMod.InterpolatorArgs
import typings.reactSpringShared.typesMod.InterpolatorConfig
import typings.reactSpringShared.typesMod.InterpolatorFactory
import typings.std.Exclude
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-spring/shared/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/shared/cjs", "Any")
  @js.native
  class Any ()
    extends typings.reactSpringShared.typesUtilMod.Any
  
  @JSImport("@react-spring/shared/cjs", "FluidValue")
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] ()
    extends typings.fluids.mod.FluidValue[T, Event]
  
  @JSImport("@react-spring/shared/cjs", "FrameLoop")
  @js.native
  class FrameLoop ()
    extends typings.reactSpringShared.frameLoopMod.FrameLoop {
    def this(raf: RequestFrameFn) = this()
  }
  
  object Globals {
    
    @JSImport("@react-spring/shared/cjs", "Globals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assign(globals: AnimatedGlobals): AnimatedGlobals = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(globals.asInstanceOf[js.Any]).asInstanceOf[AnimatedGlobals]
    
    @JSImport("@react-spring/shared/cjs", "Globals.batchedUpdates")
    @js.native
    def batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    inline def batchedUpdates_=(x: js.Function1[/* callback */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batchedUpdates")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.colorNames")
    @js.native
    def colorNames: StringDictionary[Double] | Null = js.native
    inline def colorNames_=(x: StringDictionary[Double] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorNames")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.createStringInterpolator")
    @js.native
    def createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
    inline def createStringInterpolator_=(x: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStringInterpolator")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.frameLoop")
    @js.native
    def frameLoop: typings.reactSpringShared.frameLoopMod.FrameLoop = js.native
    inline def frameLoop_=(x: typings.reactSpringShared.frameLoopMod.FrameLoop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameLoop")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.now")
    @js.native
    def now: js.Function0[Double] = js.native
    inline def now_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.requestAnimationFrame")
    @js.native
    def requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
    inline def requestAnimationFrame_=(x: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.skipAnimation")
    @js.native
    def skipAnimation: Boolean = js.native
    inline def skipAnimation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.to")
    @js.native
    def to: js.Function2[
        /* source */ OneOrMore[typings.fluids.mod.FluidValue[js.Any, js.Any]], 
        /* args */ InterpolatorArgs[js.Any, js.Any], 
        typings.fluids.mod.FluidValue[js.Any, js.Any]
      ] = js.native
    inline def to_=(
      x: js.Function2[
          /* source */ OneOrMore[typings.fluids.mod.FluidValue[js.Any, js.Any]], 
          /* args */ InterpolatorArgs[js.Any, js.Any], 
          typings.fluids.mod.FluidValue[js.Any, js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/cjs", "Globals.willAdvance")
    @js.native
    def willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
    inline def willAdvance_=(x: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willAdvance")(x.asInstanceOf[js.Any])
  }
  
  inline def addFluidObserver(target: js.Object, observer: FluidObserver[js.Any]): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  inline def addFluidObserver[E /* <: FluidEvent[js.Any] */](target: typings.fluids.mod.FluidValue[js.Any, E], observer: FluidObserver[E]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFluidObserver")(target.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@react-spring/shared/cjs", "createInterpolator")
  @js.native
  val createInterpolator: InterpolatorFactory = js.native
  
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
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  inline def getFluidConfig[T](arg: T): GetFluidConfig_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidConfig")(arg.asInstanceOf[js.Any]).asInstanceOf[GetFluidConfig_[T]]
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  inline def getFluidValue[T, U](target: T): (Exclude[T, typings.fluids.mod.FluidValue[js.Any, js.Any]]) | U = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidValue")(target.asInstanceOf[js.Any]).asInstanceOf[(Exclude[T, typings.fluids.mod.FluidValue[js.Any, js.Any]]) | U]
  inline def getFluidValue[T, U](target: typings.fluids.mod.FluidValue[U, js.Any]): (Exclude[T, typings.fluids.mod.FluidValue[js.Any, js.Any]]) | U = ^.asInstanceOf[js.Dynamic].applyDynamic("getFluidValue")(target.asInstanceOf[js.Any]).asInstanceOf[(Exclude[T, typings.fluids.mod.FluidValue[js.Any, js.Any]]) | U]
  
  /** Does the given value have a `FluidConfig` object? */
  inline def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFluidValue")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is fluids.fluids.FluidValue<any, any> */ Boolean]
  
  object is {
    
    @JSImport("@react-spring/shared/cjs", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/cjs", "is.arr")
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
  
  /** Set the methods for observing the given object. */
  inline def setFluidConfig(target: js.Object, config: FluidConfig[js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFluidConfig")(target.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[js.Any] & (Exclude[T, Unit])) = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(a.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Exclude[T, Unit]]) | (js.Array[js.Any] & (Exclude[T, Unit]))]
  
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@react-spring/shared/cjs", "useOnce")
  @js.native
  val useOnce: UseOnce_ = js.native
  
  inline def usePrev[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrev")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
