package typings.reactSpringShared.globalsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringShared.anon.FnCall
import typings.reactSpringShared.frameLoopMod.FrameLoop
import typings.reactSpringShared.frameLoopMod.OpaqueAnimation
import typings.reactSpringShared.typesMod.InterpolatorConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedGlobals extends js.Object {
  
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
  implicit class AnimatedGlobalsOps[Self <: AnimatedGlobals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchedUpdates(value: /* callback */ js.Function0[Unit] => Unit): Self = this.set("batchedUpdates", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBatchedUpdates: Self = this.set("batchedUpdates", js.undefined)
    
    @scala.inline
    def setColorNames(value: StringDictionary[Double]): Self = this.set("colorNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorNames: Self = this.set("colorNames", js.undefined)
    
    @scala.inline
    def setColorNamesNull: Self = this.set("colorNames", null)
    
    @scala.inline
    def setCreateStringInterpolator(value: /* config */ InterpolatorConfig[String] => js.Function1[/* input */ Double, String]): Self = this.set("createStringInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateStringInterpolator: Self = this.set("createStringInterpolator", js.undefined)
    
    @scala.inline
    def setFrameLoop(value: FrameLoop): Self = this.set("frameLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameLoop: Self = this.set("frameLoop", js.undefined)
    
    @scala.inline
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: /* cb */ js.Function1[/* time */ Double, Unit] => Unit): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestAnimationFrame: Self = this.set("requestAnimationFrame", js.undefined)
    
    @scala.inline
    def setSkipAnimation(value: Boolean): Self = this.set("skipAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAnimation: Self = this.set("skipAnimation", js.undefined)
    
    @scala.inline
    def setTo(value: FnCall): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setWillAdvance(value: /* animations */ js.Array[OpaqueAnimation] => Unit): Self = this.set("willAdvance", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWillAdvance: Self = this.set("willAdvance", js.undefined)
  }
}
