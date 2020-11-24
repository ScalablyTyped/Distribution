package typings.reactNotificationsComponent.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`bottom-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-center`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-left`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.`top-right`
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.bottom
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.center
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.danger
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.info
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.success
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.top
import typings.reactNotificationsComponent.reactNotificationsComponentStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactNotificationOptions extends js.Object {
  
  var animationIn: js.UndefOr[js.Array[String]] = js.native
  
  var animationOut: js.UndefOr[js.Array[String]] = js.native
  
  var container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center` = js.native
  
  var content: js.UndefOr[
    (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode
  ] = js.native
  
  var dismiss: js.UndefOr[DismissOptions] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var insert: js.UndefOr[top | bottom] = js.native
  
  var message: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.native
  
  var onRemoval: js.UndefOr[js.Function2[/* id */ String, /* removedBy */ js.Any, Unit]] = js.native
  
  var slidingEnter: js.UndefOr[TransitionOptions] = js.native
  
  var slidingExit: js.UndefOr[TransitionOptions] = js.native
  
  var title: js.UndefOr[String | ReactNode | FunctionComponent[js.Object]] = js.native
  
  var touchRevert: js.UndefOr[TransitionOptions] = js.native
  
  var touchSlidingExit: js.UndefOr[TransitionOptions] = js.native
  
  var `type`: js.UndefOr[
    success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
  ] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ReactNotificationOptions {
  
  @scala.inline
  def apply(
    container: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`
  ): ReactNotificationOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNotificationOptions]
  }
  
  @scala.inline
  implicit class ReactNotificationOptionsOps[Self <: ReactNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setContainer(
      value: `top-left` | `top-right` | `top-center` | center | `bottom-left` | `bottom-right` | `bottom-center`
    ): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationInVarargs(value: String*): Self = this.set("animationIn", js.Array(value :_*))
    
    @scala.inline
    def setAnimationIn(value: js.Array[String]): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationIn: Self = this.set("animationIn", js.undefined)
    
    @scala.inline
    def setAnimationOutVarargs(value: String*): Self = this.set("animationOut", js.Array(value :_*))
    
    @scala.inline
    def setAnimationOut(value: js.Array[String]): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOut: Self = this.set("animationOut", js.undefined)
    
    @scala.inline
    def setContent(value: (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object] | ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDismiss(value: DismissOptions): Self = this.set("dismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismiss: Self = this.set("dismiss", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInsert(value: top | bottom): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setMessage(value: String | ReactNode | FunctionComponent[js.Object]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnRemoval(value: (/* id */ String, /* removedBy */ js.Any) => Unit): Self = this.set("onRemoval", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemoval: Self = this.set("onRemoval", js.undefined)
    
    @scala.inline
    def setSlidingEnter(value: TransitionOptions): Self = this.set("slidingEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidingEnter: Self = this.set("slidingEnter", js.undefined)
    
    @scala.inline
    def setSlidingExit(value: TransitionOptions): Self = this.set("slidingExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidingExit: Self = this.set("slidingExit", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactNode | FunctionComponent[js.Object]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTouchRevert(value: TransitionOptions): Self = this.set("touchRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRevert: Self = this.set("touchRevert", js.undefined)
    
    @scala.inline
    def setTouchSlidingExit(value: TransitionOptions): Self = this.set("touchSlidingExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSlidingExit: Self = this.set("touchSlidingExit", js.undefined)
    
    @scala.inline
    def setType(
      value: success | danger | info | typings.reactNotificationsComponent.reactNotificationsComponentStrings.default | warning
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
