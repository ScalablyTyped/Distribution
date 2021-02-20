package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.allocTypes.mod.OneOrMore
import typings.fluids.mod.FluidValue
import typings.reactSpringShared.anon.FnCall
import typings.reactSpringShared.frameLoopMod.FrameLoop
import typings.reactSpringShared.frameLoopMod.OpaqueAnimation
import typings.reactSpringShared.typesMod.InterpolatorArgs
import typings.reactSpringShared.typesMod.InterpolatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("@react-spring/shared/cjs/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-spring/shared/cjs/globals", "assign")
  @js.native
  def assign(globals: AnimatedGlobals): AnimatedGlobals = js.native
  
  @JSImport("@react-spring/shared/cjs/globals", "batchedUpdates")
  @js.native
  def batchedUpdates: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  @scala.inline
  def batchedUpdates_=(x: js.Function1[/* callback */ js.Function0[Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batchedUpdates")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "colorNames")
  @js.native
  def colorNames: StringDictionary[Double] | Null = js.native
  @scala.inline
  def colorNames_=(x: StringDictionary[Double] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorNames")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "createStringInterpolator")
  @js.native
  def createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
  @scala.inline
  def createStringInterpolator_=(x: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStringInterpolator")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "frameLoop")
  @js.native
  def frameLoop: FrameLoop = js.native
  @scala.inline
  def frameLoop_=(x: FrameLoop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameLoop")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "now")
  @js.native
  def now: js.Function0[Double] = js.native
  @scala.inline
  def now_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("now")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "requestAnimationFrame")
  @js.native
  def requestAnimationFrame: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit] = js.native
  @scala.inline
  def requestAnimationFrame_=(x: js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "skipAnimation")
  @js.native
  def skipAnimation: Boolean = js.native
  @scala.inline
  def skipAnimation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAnimation")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "to")
  @js.native
  def to: js.Function2[
    /* source */ OneOrMore[FluidValue[js.Any, js.Any]], 
    /* args */ InterpolatorArgs[js.Any, js.Any], 
    FluidValue[js.Any, js.Any]
  ] = js.native
  @scala.inline
  def to_=(
    x: js.Function2[
      /* source */ OneOrMore[FluidValue[js.Any, js.Any]], 
      /* args */ InterpolatorArgs[js.Any, js.Any], 
      FluidValue[js.Any, js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/cjs/globals", "willAdvance")
  @js.native
  def willAdvance: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit] = js.native
  @scala.inline
  def willAdvance_=(x: js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willAdvance")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AnimatedGlobals extends StObject {
    
    /** Event props are called with `batchedUpdates` to reduce extraneous renders */
    var batchedUpdates: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
    
    /** Provide custom color names for interpolation */
    var colorNames: js.UndefOr[StringDictionary[Double] | Null] = js.native
    
    /** Provide custom logic for string interpolation */
    var createStringInterpolator: js.UndefOr[
        js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]
      ] = js.native
    
    /** Provide a custom `FrameLoop` instance */
    var frameLoop: js.UndefOr[FrameLoop] = js.native
    
    /** Used to measure frame length. Read more [here](https://developer.mozilla.org/en-US/docs/Web/API/Performance/now) */
    var now: js.UndefOr[js.Function0[Double]] = js.native
    
    /** Schedule a function to run on the next frame */
    var requestAnimationFrame: js.UndefOr[js.Function1[/* cb */ js.Function1[/* time */ Double, Unit], Unit]] = js.native
    
    /** Make all animations instant and skip the frameloop entirely */
    var skipAnimation: js.UndefOr[Boolean] = js.native
    
    /** Returns a new `Interpolation` object */
    var to: js.UndefOr[FnCall] = js.native
    
    /** @internal Exposed for testing purposes */
    var willAdvance: js.UndefOr[js.Function1[/* animations */ js.Array[OpaqueAnimation], Unit]] = js.native
  }
  object AnimatedGlobals {
    
    @scala.inline
    def apply(): AnimatedGlobals = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedGlobals]
    }
    
    @scala.inline
    implicit class AnimatedGlobalsMutableBuilder[Self <: AnimatedGlobals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchedUpdates(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "batchedUpdates", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBatchedUpdatesUndefined: Self = StObject.set(x, "batchedUpdates", js.undefined)
      
      @scala.inline
      def setColorNames(value: StringDictionary[Double]): Self = StObject.set(x, "colorNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNamesNull: Self = StObject.set(x, "colorNames", null)
      
      @scala.inline
      def setColorNamesUndefined: Self = StObject.set(x, "colorNames", js.undefined)
      
      @scala.inline
      def setCreateStringInterpolator(value: /* config */ InterpolatorConfig[String] => js.Function1[/* input */ Double, String]): Self = StObject.set(x, "createStringInterpolator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateStringInterpolatorUndefined: Self = StObject.set(x, "createStringInterpolator", js.undefined)
      
      @scala.inline
      def setFrameLoop(value: FrameLoop): Self = StObject.set(x, "frameLoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameLoopUndefined: Self = StObject.set(x, "frameLoop", js.undefined)
      
      @scala.inline
      def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setRequestAnimationFrame(value: /* cb */ js.Function1[/* time */ Double, Unit] => Unit): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      @scala.inline
      def setSkipAnimation(value: Boolean): Self = StObject.set(x, "skipAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipAnimationUndefined: Self = StObject.set(x, "skipAnimation", js.undefined)
      
      @scala.inline
      def setTo(value: FnCall): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setWillAdvance(value: /* animations */ js.Array[OpaqueAnimation] => Unit): Self = StObject.set(x, "willAdvance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWillAdvanceUndefined: Self = StObject.set(x, "willAdvance", js.undefined)
    }
  }
}
