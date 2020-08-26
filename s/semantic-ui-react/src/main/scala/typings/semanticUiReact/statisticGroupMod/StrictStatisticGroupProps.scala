package typings.semanticUiReact.statisticGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.statisticStatisticMod.StatisticProps
import typings.semanticUiReact.statisticStatisticMod.StatisticSizeProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictStatisticGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A statistic group can be formatted to be different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A statistic group can present its measurement horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.native
  /** A statistic group can present its measurement horizontally. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Array of props for Statistic. */
  var items: js.UndefOr[SemanticShorthandCollection[StatisticProps]] = js.native
  /** A statistic group can vary in size. */
  var size: js.UndefOr[StatisticSizeProp] = js.native
  /** A statistic group can have its items divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictStatisticGroupProps {
  @scala.inline
  def apply(): StrictStatisticGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStatisticGroupProps]
  }
  @scala.inline
  implicit class StrictStatisticGroupPropsOps[Self <: StrictStatisticGroupProps] (val x: Self) extends AnyVal {
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SemanticShorthandItem[StatisticProps]*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: SemanticShorthandCollection[StatisticProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSize(value: StatisticSizeProp): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWidths(value: SemanticWIDTHS): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
  
}

