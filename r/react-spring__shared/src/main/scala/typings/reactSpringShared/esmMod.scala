package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.allocTypes.mod.OneOrMore
import typings.fluids.mod.FluidConfig
import typings.fluids.mod.FluidEvent
import typings.fluids.mod.FluidObserver
import typings.fluids.mod.GetFluidConfig_
import typings.reactSpringShared.anon.ForEach
import typings.reactSpringShared.esmFrameLoopMod.OpaqueAnimation
import typings.reactSpringShared.esmFrameLoopMod.RequestFrameFn
import typings.reactSpringShared.esmGlobalsMod.AnimatedGlobals
import typings.reactSpringShared.esmHelpersMod.InferKey
import typings.reactSpringShared.esmHelpersMod.InferValue
import typings.reactSpringShared.esmHelpersMod.IsArray
import typings.reactSpringShared.esmHooksMod.UseOnce_
import typings.reactSpringShared.esmTypesMod.InterpolatorArgs
import typings.reactSpringShared.esmTypesMod.InterpolatorConfig
import typings.reactSpringShared.esmTypesMod.InterpolatorFactory
import typings.std.Exclude
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("@react-spring/shared/esm", "Any")
  @js.native
  class Any ()
    extends typings.reactSpringShared.typesDotutilMod.Any
  
  @JSImport("@react-spring/shared/esm", "FluidValue")
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] ()
    extends typings.fluids.mod.FluidValue[T, Event]
  
  @JSImport("@react-spring/shared/esm", "FrameLoop")
  @js.native
  class FrameLoop ()
    extends typings.reactSpringShared.esmFrameLoopMod.FrameLoop {
    def this(raf: RequestFrameFn) = this()
  }
  
  object Globals {
    
    @JSImport("@react-spring/shared/esm", "Globals")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/esm", "Globals.assign")
    @js.native
    def assign(globals: AnimatedGlobals): AnimatedGlobals = js.native
    
    @JSImport("@react-spring/shared/esm", "Globals.batchedUpdates")
    @js.native
    def batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    @scala.inline
    def batchedUpdates_=(x: js.Function1[/* callback */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batchedUpdates")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.colorNames")
    @js.native
    def colorNames: StringDictionary[Double] | Null = js.native
    @scala.inline
    def colorNames_=(x: StringDictionary[Double] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorNames")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.createStringInterpolator")
    @js.native
    def createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
    @scala.inline
    def createStringInterpolator_=(x: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStringInterpolator")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.frameLoop")
    @js.native
    def frameLoop: typings.reactSpringShared.esmFrameLoopMod.FrameLoop = js.native
    @scala.inline
    def frameLoop_=(x: typings.reactSpringShared.esmFrameLoopMod.FrameLoop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameLoop")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.now")
    @js.native
    def now: js.Function0[Double] = js.native
    @scala.inline
    def now_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.requestAnimationFrame")
    @js.native
    def requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
    @scala.inline
    def requestAnimationFrame_=(x: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.skipAnimation")
    @js.native
    def skipAnimation: Boolean = js.native
    @scala.inline
    def skipAnimation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.to")
    @js.native
    def to: js.Function2[
        /* source */ OneOrMore[typings.fluids.mod.FluidValue[js.Any, js.Any]], 
        /* args */ InterpolatorArgs[js.Any, js.Any], 
        typings.fluids.mod.FluidValue[js.Any, js.Any]
      ] = js.native
    @scala.inline
    def to_=(
      x: js.Function2[
          /* source */ OneOrMore[typings.fluids.mod.FluidValue[js.Any, js.Any]], 
          /* args */ InterpolatorArgs[js.Any, js.Any], 
          typings.fluids.mod.FluidValue[js.Any, js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "Globals.willAdvance")
    @js.native
    def willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
    @scala.inline
    def willAdvance_=(x: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willAdvance")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@react-spring/shared/esm", "addFluidObserver")
  @js.native
  def addFluidObserver(target: js.Object, observer: FluidObserver[_]): js.UndefOr[js.Function0[Unit]] = js.native
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  @JSImport("@react-spring/shared/esm", "addFluidObserver")
  @js.native
  def addFluidObserver[E /* <: FluidEvent[_] */](target: typings.fluids.mod.FluidValue[_, E], observer: FluidObserver[E]): js.Function0[Unit] = js.native
  
  @JSImport("@react-spring/shared/esm", "createInterpolator")
  @js.native
  val createInterpolator: InterpolatorFactory = js.native
  
  @JSImport("@react-spring/shared/esm", "defineHidden")
  @js.native
  def defineHidden(obj: js.Any, key: js.Any, value: js.Any): js.Any = js.native
  
  @JSImport("@react-spring/shared/esm", "each")
  @js.native
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit]
  ): Unit = js.native
  @JSImport("@react-spring/shared/esm", "each")
  @js.native
  def each[T /* <: js.Object */, This](
    obj: T with ForEach,
    cb: js.ThisFunction2[/* this */ This, /* value */ InferValue[T], /* key */ InferKey[T], Unit],
    ctx: This
  ): Unit = js.native
  
  @JSImport("@react-spring/shared/esm", "flush")
  @js.native
  def flush[T](queue: Set[T], iterator: js.Function1[/* value */ T, Unit]): Unit = js.native
  @JSImport("@react-spring/shared/esm", "flush")
  @js.native
  def flush[P, T](queue: Map[P, T], iterator: js.Function1[/* entry */ js.Tuple2[P, T], Unit]): Unit = js.native
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  @JSImport("@react-spring/shared/esm", "getFluidConfig")
  @js.native
  def getFluidConfig[T](arg: T): GetFluidConfig_[T] = js.native
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  @JSImport("@react-spring/shared/esm", "getFluidValue")
  @js.native
  def getFluidValue[T, U](target: T): (Exclude[T, typings.fluids.mod.FluidValue[_, _]]) | U = js.native
  @JSImport("@react-spring/shared/esm", "getFluidValue")
  @js.native
  def getFluidValue[T, U](target: typings.fluids.mod.FluidValue[U, _]): (Exclude[T, typings.fluids.mod.FluidValue[_, _]]) | U = js.native
  
  /** Does the given value have a `FluidConfig` object? */
  @JSImport("@react-spring/shared/esm", "hasFluidValue")
  @js.native
  def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = js.native
  
  object is {
    
    @JSImport("@react-spring/shared/esm", "is")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-spring/shared/esm", "is.arr")
    @js.native
    def arr: IsArray = js.native
    @scala.inline
    def arr_=(x: IsArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arr")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-spring/shared/esm", "is.fun")
    @js.native
    def fun(a: js.Any): /* is std.Function */ Boolean = js.native
    
    @JSImport("@react-spring/shared/esm", "is.num")
    @js.native
    def num(a: js.Any): /* is number */ Boolean = js.native
    
    @JSImport("@react-spring/shared/esm", "is.obj")
    @js.native
    def obj[T /* <: js.Any */](a: T): /* is std.Exclude<T & @alloc/types.@alloc/types.Lookup<any>, std.Function | std.Array<any>> */ Boolean = js.native
    
    @JSImport("@react-spring/shared/esm", "is.str")
    @js.native
    def str(a: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("@react-spring/shared/esm", "is.und")
    @js.native
    def und(a: js.Any): /* is undefined */ Boolean = js.native
  }
  
  @JSImport("@react-spring/shared/esm", "isAnimatedString")
  @js.native
  def isAnimatedString(value: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("@react-spring/shared/esm", "isEqual")
  @js.native
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("@react-spring/shared/esm", "noop")
  @js.native
  def noop(): Unit = js.native
  
  /** Set the methods for observing the given object. */
  @JSImport("@react-spring/shared/esm", "setFluidConfig")
  @js.native
  def setFluidConfig(target: js.Object, config: FluidConfig[_, _]): Unit = js.native
  
  @JSImport("@react-spring/shared/esm", "toArray")
  @js.native
  def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[_] with (Exclude[T, Unit])) = js.native
  
  @JSImport("@react-spring/shared/esm", "useForceUpdate")
  @js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  @JSImport("@react-spring/shared/esm", "useOnce")
  @js.native
  val useOnce: UseOnce_ = js.native
  
  @JSImport("@react-spring/shared/esm", "usePrev")
  @js.native
  def usePrev[T](value: T): js.UndefOr[T] = js.native
}
