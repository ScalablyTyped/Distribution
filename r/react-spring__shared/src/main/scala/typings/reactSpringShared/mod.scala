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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-spring/shared/cjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addFluidObserver(target: js.Object, observer: FluidObserver[_]): js.UndefOr[js.Function0[Unit]] = js.native
  /** Add an observer to a fluid object. Returns an unsubscribe function if the target is a fluid object, otherwise undefined. */
  def addFluidObserver[E /* <: FluidEvent[_] */](target: typings.fluids.mod.FluidValue[_, E], observer: FluidObserver[E]): js.Function0[Unit] = js.native
  
  val createInterpolator: InterpolatorFactory = js.native
  
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
  
  /** Get the methods for observing the given object. Returns undefined if not a fluid object. */
  def getFluidConfig[T](arg: T): GetFluidConfig_[T] = js.native
  
  /** Get the current value of a fluid object. Returns the first argument when it's not a fluid object. */
  def getFluidValue[T, U](target: T): (Exclude[T, typings.fluids.mod.FluidValue[_, _]]) | U = js.native
  def getFluidValue[T, U](target: typings.fluids.mod.FluidValue[U, _]): (Exclude[T, typings.fluids.mod.FluidValue[_, _]]) | U = js.native
  
  /** Does the given value have a `FluidConfig` object? */
  def hasFluidValue(arg: js.Any): /* is fluids.fluids.FluidValue<any, any> */ Boolean = js.native
  
  def isAnimatedString(value: js.Any): /* is string */ Boolean = js.native
  
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  def noop(): Unit = js.native
  
  /** Set the methods for observing the given object. */
  def setFluidConfig(target: js.Object, config: FluidConfig[_, _]): Unit = js.native
  
  def toArray[T](a: T): (js.Array[Exclude[T, Unit]]) | (js.Array[_] with (Exclude[T, Unit])) = js.native
  
  def useForceUpdate(): js.Function0[Unit] = js.native
  
  val useOnce: UseOnce_ = js.native
  
  def usePrev[T](value: T): js.UndefOr[T] = js.native
  
  @js.native
  class Any ()
    extends typings.allocTypes.mod.Any
  
  @js.native
  abstract class FluidValue[T, Event /* <: FluidEvent[T] */] ()
    extends typings.fluids.mod.FluidValue[T, Event]
  
  @js.native
  class FrameLoop ()
    extends typings.reactSpringShared.frameLoopMod.FrameLoop {
    def this(raf: RequestFrameFn) = this()
  }
  
  @js.native
  object Globals extends js.Object {
    
    def assign(globals: AnimatedGlobals): AnimatedGlobals = js.native
    
    var batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
    
    var colorNames: StringDictionary[Double] | Null = js.native
    
    var createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
    
    var frameLoop: typings.reactSpringShared.frameLoopMod.FrameLoop = js.native
    
    var now: js.Function0[Double] = js.native
    
    var requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
    
    var skipAnimation: Boolean = js.native
    
    var to: js.Function2[
        /* source */ OneOrMore[typings.fluids.mod.FluidValue[js.Any, js.Any]], 
        /* args */ InterpolatorArgs[js.Any, js.Any], 
        typings.fluids.mod.FluidValue[js.Any, js.Any]
      ] = js.native
    
    var willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
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
}
