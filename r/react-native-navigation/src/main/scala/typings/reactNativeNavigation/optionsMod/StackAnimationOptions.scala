package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackAnimationOptions extends js.Object {
  /**
    * Configure animations for the bottom tabs
    */
  var bottomTabs: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Configure animations for the content (Screen)
    */
  var content: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.native
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.native
  /**
    * Configure animations for the top bar
    */
  var topBar: js.UndefOr[ViewAnimationOptions] = js.native
  /**
    * Wait for the View to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.native
}

object StackAnimationOptions {
  @scala.inline
  def apply(): StackAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackAnimationOptions]
  }
  @scala.inline
  implicit class StackAnimationOptionsOps[Self <: StackAnimationOptions] (val x: Self) extends AnyVal {
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
    def setBottomTabs(value: ViewAnimationOptions): Self = this.set("bottomTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomTabs: Self = this.set("bottomTabs", js.undefined)
    @scala.inline
    def setContent(value: ViewAnimationOptions): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setElementTransitionsVarargs(value: ElementTransition*): Self = this.set("elementTransitions", js.Array(value :_*))
    @scala.inline
    def setElementTransitions(value: js.Array[ElementTransition]): Self = this.set("elementTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementTransitions: Self = this.set("elementTransitions", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setSharedElementTransitionsVarargs(value: SharedElementTransition*): Self = this.set("sharedElementTransitions", js.Array(value :_*))
    @scala.inline
    def setSharedElementTransitions(value: js.Array[SharedElementTransition]): Self = this.set("sharedElementTransitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedElementTransitions: Self = this.set("sharedElementTransitions", js.undefined)
    @scala.inline
    def setTopBar(value: ViewAnimationOptions): Self = this.set("topBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopBar: Self = this.set("topBar", js.undefined)
    @scala.inline
    def setWaitForRender(value: Boolean): Self = this.set("waitForRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForRender: Self = this.set("waitForRender", js.undefined)
  }
  
}

