package typings.reactMdMenu.useContextMenuMod

import typings.react.mod.Ref
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The anchor to use for context menus.
    *
    * Defaults to `inner-left` and `top` to mimic native context menus.
    */
  var anchor: js.UndefOr[PositionAnchor] = js.native
  /**
    * The CSS classNames to use for the context menu animation. This defaults to
    * a vertical scaling transition instead of the default "from-point-scaling"
    * transition.
    */
  var classNames: js.UndefOr[CSSTransitionClassNames] = js.native
  /**
    * When a context menu becomes visible, the native functionality is to also
    * highlight any text below the cursor when possible. Since this is a custom
    * context menu, this is normally not desired behavior so this hook will
    * automatically deselect this text. If the text selection behavior is
    * desired, this property can be enabled to keep text selected.
    */
  var disableDeselect: js.UndefOr[Boolean] = js.native
  /**
    * The id to use for the context menu. This defaults to `context-menu` since
    * there can usually only be one context menu visible at a time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * An optional ref that should be merged with the returned ref.
    */
  var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAnchor(value: PositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setClassNames(value: CSSTransitionClassNames): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setDisableDeselect(value: Boolean): Self = this.set("disableDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDeselect: Self = this.set("disableDeselect", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLDivElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

