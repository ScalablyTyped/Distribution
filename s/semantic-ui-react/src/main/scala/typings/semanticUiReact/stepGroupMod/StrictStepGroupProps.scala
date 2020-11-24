package typings.semanticUiReact.stepGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactNumbers.`1`
import typings.semanticUiReact.semanticUiReactNumbers.`2`
import typings.semanticUiReact.semanticUiReactNumbers.`3`
import typings.semanticUiReact.semanticUiReactNumbers.`4`
import typings.semanticUiReact.semanticUiReactNumbers.`5`
import typings.semanticUiReact.semanticUiReactNumbers.`6`
import typings.semanticUiReact.semanticUiReactNumbers.`7`
import typings.semanticUiReact.semanticUiReactNumbers.`8`
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.eight
import typings.semanticUiReact.semanticUiReactStrings.five
import typings.semanticUiReact.semanticUiReactStrings.four
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.one
import typings.semanticUiReact.semanticUiReactStrings.seven
import typings.semanticUiReact.semanticUiReactStrings.six
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tablet
import typings.semanticUiReact.semanticUiReactStrings.three
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.two
import typings.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictStepGroupProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Steps can be attached to other elements. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A fluid step takes up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  
  /** Shorthand array of props for Step. */
  var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.native
  
  /** A step can show a ordered sequence of steps. */
  var ordered: js.UndefOr[Boolean] = js.native
  
  /** Steps can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  
  /** A step can stack vertically only on smaller screens. */
  var stackable: js.UndefOr[tablet] = js.native
  
  /** A step can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.native
  
  /** A step can be displayed stacked vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /** Steps can be divided evenly inside their parent. */
  var widths: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typings.semanticUiReact.semanticUiReactStrings.`1` | typings.semanticUiReact.semanticUiReactStrings.`2` | typings.semanticUiReact.semanticUiReactStrings.`3` | typings.semanticUiReact.semanticUiReactStrings.`4` | typings.semanticUiReact.semanticUiReactStrings.`5` | typings.semanticUiReact.semanticUiReactStrings.`6` | typings.semanticUiReact.semanticUiReactStrings.`7` | typings.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
  ] = js.native
}
object StrictStepGroupProps {
  
  @scala.inline
  def apply(): StrictStepGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStepGroupProps]
  }
  
  @scala.inline
  implicit class StrictStepGroupPropsOps[Self <: StrictStepGroupProps] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: Boolean | bottom | top): Self = this.set("attached", value.asInstanceOf[js.Any])
    
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SemanticShorthandItem[StepProps]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: SemanticShorthandCollection[StepProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStackable(value: tablet): Self = this.set("stackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    
    @scala.inline
    def setUnstackable(value: Boolean): Self = this.set("unstackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstackable: Self = this.set("unstackable", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWidths(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typings.semanticUiReact.semanticUiReactStrings.`1` | typings.semanticUiReact.semanticUiReactStrings.`2` | typings.semanticUiReact.semanticUiReactStrings.`3` | typings.semanticUiReact.semanticUiReactStrings.`4` | typings.semanticUiReact.semanticUiReactStrings.`5` | typings.semanticUiReact.semanticUiReactStrings.`6` | typings.semanticUiReact.semanticUiReactStrings.`7` | typings.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
    ): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
}
