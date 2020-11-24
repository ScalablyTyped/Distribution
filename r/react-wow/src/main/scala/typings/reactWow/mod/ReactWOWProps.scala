package typings.reactWow.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactWOWProps extends js.Object {
  
  /**
    * Animation css class.
    * @default animated
    */
  var animateClass: js.UndefOr[String] = js.native
  
  /**
    * Animation name.
    * @see https://daneden.github.io/animate.css/
    */
  var animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any = js.native
  
  /**
    * The callback is fired every time an animation is stoped.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Content you want to apply the animation to.
    */
  var children: Element = js.native
  
  /**
    * Animation delay.
    */
  var delay: js.UndefOr[String] = js.native
  
  /**
    * Disable the animation.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Animation duration.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Animation iteration count.
    */
  var iteration: js.UndefOr[String] = js.native
  
  /**
    * Distance to the element when triggering the animation.
    * @default 0
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * If your components inside a overflow container, set this to true.
    * @default false
    */
  var overflow: js.UndefOr[Boolean] = js.native
  
  /**
    * Listen and react to resize event.
    * @default true
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * Listen and react to scroll event.
    * @default true
    */
  var scroll: js.UndefOr[Boolean] = js.native
}
object ReactWOWProps {
  
  @scala.inline
  def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
    children: Element
  ): ReactWOWProps = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWOWProps]
  }
  
  @scala.inline
  implicit class ReactWOWPropsOps[Self <: ReactWOWProps] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateClass(value: String): Self = this.set("animateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateClass: Self = this.set("animateClass", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setIteration(value: String): Self = this.set("iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIteration: Self = this.set("iteration", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double | js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
}
