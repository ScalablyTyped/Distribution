package typings.reactBootstrap.collapseMod

import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import typings.reactBootstrap.mod.TransitionCallbacks
import typings.reactBootstrap.reactBootstrapStrings.height
import typings.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseProps
  extends ClassAttributes[Collapse]
     with TransitionCallbacks {
  
  var dimension: js.UndefOr[height | width | js.Function0[String]] = js.native
  
  var getDimensionValue: js.UndefOr[js.Function2[/* dimension */ Double, /* element */ ReactElement, Double]] = js.native
  
  var in: js.UndefOr[Boolean] = js.native
  
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transitionAppear: js.UndefOr[Boolean] = js.native
  
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
object CollapseProps {
  
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    
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
    def setDimensionFunction0(value: () => String): Self = this.set("dimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDimension(value: height | width | js.Function0[String]): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setGetDimensionValue(value: (/* dimension */ Double, /* element */ ReactElement) => Double): Self = this.set("getDimensionValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetDimensionValue: Self = this.set("getDimensionValue", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setMountOnEnter(value: Boolean): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTransitionAppear(value: Boolean): Self = this.set("transitionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAppear: Self = this.set("transitionAppear", js.undefined)
    
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
}
