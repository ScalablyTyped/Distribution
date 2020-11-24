package typings.semanticUiReact.transitionTransitionMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTRANSITIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictTransitionProps extends js.Object {
  
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Whether it is directional animation event or not. Use it only for custom transitions. */
  var directional: js.UndefOr[Boolean] = js.native
  
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.native
  
  /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
  var mountOnShow: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onComplete: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  
  /**
    * Callback on each transition that changes visibility to hidden.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onHide: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  
  /**
    * Callback on each transition that changes visibility to shown.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onShow: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  
  /**
    * Callback on animation start.
    *
    * @param {null}
    * @param {object} data - All props with status.
    */
  var onStart: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
  
  /** React's key of the element. */
  var reactKey: js.UndefOr[String] = js.native
  
  /** Run the enter animation when the component mounts, if it is initially shown. */
  var transitionOnMount: js.UndefOr[Boolean] = js.native
  
  /** Unmount the component (remove it from the DOM) when it is not shown. */
  var unmountOnHide: js.UndefOr[Boolean] = js.native
  
  /** Show the component; triggers the enter or exit animation. */
  var visible: js.UndefOr[Boolean] = js.native
}
object StrictTransitionProps {
  
  @scala.inline
  def apply(): StrictTransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictTransitionProps]
  }
  
  @scala.inline
  implicit class StrictTransitionPropsOps[Self <: StrictTransitionProps] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: SemanticTRANSITIONS | String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDirectional(value: Boolean): Self = this.set("directional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectional: Self = this.set("directional", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | String | TransitionPropDuration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setMountOnShow(value: Boolean): Self = this.set("mountOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOnShow: Self = this.set("mountOnShow", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = this.set("onComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = this.set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = this.set("onShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setReactKey(value: String): Self = this.set("reactKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReactKey: Self = this.set("reactKey", js.undefined)
    
    @scala.inline
    def setTransitionOnMount(value: Boolean): Self = this.set("transitionOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionOnMount: Self = this.set("transitionOnMount", js.undefined)
    
    @scala.inline
    def setUnmountOnHide(value: Boolean): Self = this.set("unmountOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountOnHide: Self = this.set("unmountOnHide", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
