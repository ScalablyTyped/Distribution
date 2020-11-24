package typings.reactstrap.fadeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FadeProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  
  var baseClass: js.UndefOr[String] = js.native
  
  var baseClassIn: js.UndefOr[String] = js.native
  
  var cssModule: js.UndefOr[CSSModule] = js.native
  
  var in: js.UndefOr[Boolean] = js.native
  
  var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
  
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onLeave: js.UndefOr[js.Function0[Unit]] = js.native
  
  var tag: js.UndefOr[ElementType[_]] = js.native
  
  var transitionAppear: js.UndefOr[Boolean] = js.native
  
  var transitionAppearTimeout: js.UndefOr[Double] = js.native
  
  var transitionEnter: js.UndefOr[Boolean] = js.native
  
  var transitionEnterTimeout: js.UndefOr[Double] = js.native
  
  var transitionLeave: js.UndefOr[Boolean] = js.native
  
  var transitionLeaveTimeout: js.UndefOr[Double] = js.native
}
object FadeProps {
  
  @scala.inline
  def apply(): FadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeProps]
  }
  
  @scala.inline
  implicit class FadePropsOps[Self <: FadeProps] (val x: Self) extends AnyVal {
    
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
    def setBaseClass(value: String): Self = this.set("baseClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClass: Self = this.set("baseClass", js.undefined)
    
    @scala.inline
    def setBaseClassIn(value: String): Self = this.set("baseClassIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClassIn: Self = this.set("baseClassIn", js.undefined)
    
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setOnEnter(value: () => Unit): Self = this.set("onEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnLeave(value: () => Unit): Self = this.set("onLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    
    @scala.inline
    def setTag(value: ElementType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTransitionAppear(value: Boolean): Self = this.set("transitionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAppear: Self = this.set("transitionAppear", js.undefined)
    
    @scala.inline
    def setTransitionAppearTimeout(value: Double): Self = this.set("transitionAppearTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionAppearTimeout: Self = this.set("transitionAppearTimeout", js.undefined)
    
    @scala.inline
    def setTransitionEnter(value: Boolean): Self = this.set("transitionEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEnter: Self = this.set("transitionEnter", js.undefined)
    
    @scala.inline
    def setTransitionEnterTimeout(value: Double): Self = this.set("transitionEnterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEnterTimeout: Self = this.set("transitionEnterTimeout", js.undefined)
    
    @scala.inline
    def setTransitionLeave(value: Boolean): Self = this.set("transitionLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionLeave: Self = this.set("transitionLeave", js.undefined)
    
    @scala.inline
    def setTransitionLeaveTimeout(value: Double): Self = this.set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionLeaveTimeout: Self = this.set("transitionLeaveTimeout", js.undefined)
  }
}
