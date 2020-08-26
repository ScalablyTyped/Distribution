package typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String = js.native
  /**
    * @default 'dimmable'
    */
  var dimmable: String = js.native
  /**
    * @default 'dimmed'
    */
  var dimmed: String = js.native
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  /**
    * @default 'hide'
    */
  var hide: String = js.native
  /**
    * @default 'page'
    */
  var pageDimmer: String = js.native
  /**
    * @default 'show'
    */
  var show: String = js.native
  /**
    * @default 'transition'
    */
  var transition: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    active: String,
    dimmable: String,
    dimmed: String,
    disabled: String,
    hide: String,
    pageDimmer: String,
    show: String,
    transition: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], pageDimmer = pageDimmer.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimmable(value: String): Self = this.set("dimmable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimmed(value: String): Self = this.set("dimmed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: String): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDimmer(value: String): Self = this.set("pageDimmer", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
  }
  
}

