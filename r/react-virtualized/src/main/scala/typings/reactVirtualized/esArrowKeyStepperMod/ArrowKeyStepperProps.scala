package typings.reactVirtualized.esArrowKeyStepperMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactVirtualized.reactVirtualizedStrings.cells
import typings.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowKeyStepperProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  
  def children(props: ChildProps): ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnCount: Double = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var isControlled: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[edges | cells] = js.native
  
  var onScrollToChange: js.UndefOr[js.Function1[/* params */ ScrollIndices, Unit]] = js.native
  
  var rowCount: Double = js.native
  
  var scrollToColumn: js.UndefOr[Double] = js.native
  
  var scrollToRow: js.UndefOr[Double] = js.native
}
object ArrowKeyStepperProps {
  
  @scala.inline
  def apply(children: ChildProps => ReactNode, columnCount: Double, rowCount: Double): ArrowKeyStepperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowKeyStepperProps]
  }
  
  @scala.inline
  implicit class ArrowKeyStepperPropsOps[Self <: ArrowKeyStepperProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ChildProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIsControlled(value: Boolean): Self = this.set("isControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsControlled: Self = this.set("isControlled", js.undefined)
    
    @scala.inline
    def setMode(value: edges | cells): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnScrollToChange(value: /* params */ ScrollIndices => Unit): Self = this.set("onScrollToChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScrollToChange: Self = this.set("onScrollToChange", js.undefined)
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToColumn: Self = this.set("scrollToColumn", js.undefined)
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToRow: Self = this.set("scrollToRow", js.undefined)
  }
}
