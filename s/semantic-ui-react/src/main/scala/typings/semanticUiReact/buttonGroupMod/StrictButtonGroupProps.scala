package typings.semanticUiReact.buttonGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.buttonButtonMod.ButtonProps
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticFLOATS
import typings.semanticUiReact.genericMod.SemanticSIZES
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictButtonGroupProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Groups can be attached to other content. */
  var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.native
  
  /** Groups can be less pronounced. */
  var basic: js.UndefOr[Boolean] = js.native
  
  /** Array of shorthand Button values. */
  var buttons: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Groups can have a shared color. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  
  /** Groups can reduce their padding to fit into tighter spaces. */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** Groups can be aligned to the left or right of its container. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  
  /** Groups can take the width of their container. */
  var fluid: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted as icons. */
  var icon: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted as labeled icon buttons. */
  var labeled: js.UndefOr[Boolean] = js.native
  
  /** Groups can hint towards a negative consequence. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /** Groups can hint towards a positive consequence. */
  var positive: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[Boolean] = js.native
  
  /** Groups can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.native
  
  /** Groups can be formatted to toggle on and off. */
  var toggle: js.UndefOr[Boolean] = js.native
  
  /** Groups can be formatted to appear vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /** Groups can have their widths divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.native
}
object StrictButtonGroupProps {
  
  @scala.inline
  def apply(): StrictButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictButtonGroupProps]
  }
  
  @scala.inline
  implicit class StrictButtonGroupPropsOps[Self <: StrictButtonGroupProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAttached(value: Boolean | left | right | top | bottom): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: SemanticShorthandItem[ButtonProps]*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: SemanticShorthandCollection[ButtonProps]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setLabeled(value: Boolean): Self = this.set("labeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabeled: Self = this.set("labeled", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    
    @scala.inline
    def setSize(value: SemanticSIZES): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWidths(value: SemanticWIDTHS): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
}
