package typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'animating'
    */
  var animating: String = js.native
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  /**
    * @default 'hidden'
    */
  var hidden: String = js.native
  /**
    * @default 'in'
    */
  var inward: String = js.native
  /**
    * @default 'loading'
    */
  var loading: String = js.native
  /**
    * @default 'looping'
    */
  var looping: String = js.native
  /**
    * @default 'out'
    */
  var outward: String = js.native
  /**
    * @default 'transition'
    */
  var transition: String = js.native
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    animating: String,
    disabled: String,
    hidden: String,
    inward: String,
    loading: String,
    looping: String,
    outward: String,
    transition: String,
    visible: String
  ): Impl = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inward = inward.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], outward = outward.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setAnimating(value: String): Self = this.set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setInward(value: String): Self = this.set("inward", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLooping(value: String): Self = this.set("looping", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutward(value: String): Self = this.set("outward", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

