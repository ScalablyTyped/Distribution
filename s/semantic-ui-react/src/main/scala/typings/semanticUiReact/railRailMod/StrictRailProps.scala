package typings.semanticUiReact.railRailMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictRailProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A rail can appear attached to the main viewport. */
  var attached: js.UndefOr[Boolean] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A rail can appear closer to the main viewport. */
  var close: js.UndefOr[Boolean | very] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A rail can create a division between itself and a container. */
  var dividing: js.UndefOr[Boolean] = js.native
  /** A rail can attach itself to the inside of a container. */
  var internal: js.UndefOr[Boolean] = js.native
  /** A rail can be presented on the left or right side of a container. */
  var position: SemanticFLOATS = js.native
  /** A rail can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
}

object StrictRailProps {
  @scala.inline
  def apply(position: SemanticFLOATS): StrictRailProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRailProps]
  }
  @scala.inline
  implicit class StrictRailPropsOps[Self <: StrictRailProps] (val x: Self) extends AnyVal {
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
    def setPosition(value: SemanticFLOATS): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAttached(value: Boolean): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClose(value: Boolean | very): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDividing(value: Boolean): Self = this.set("dividing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividing: Self = this.set("dividing", js.undefined)
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setSize(value: mini | tiny | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

