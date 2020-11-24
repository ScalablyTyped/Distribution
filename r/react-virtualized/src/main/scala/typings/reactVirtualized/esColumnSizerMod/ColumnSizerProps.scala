package typings.reactVirtualized.esColumnSizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSizerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * Function responsible for rendering a virtualized Grid.
    * This function should implement the following signature:
    * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
    *
    * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
    * The :registerChild should be passed to the Grid's :ref property.
    * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
    */
  def children(props: SizedColumnProps): ReactNode = js.native
  
  /** Number of columns in Grid or Table child */
  var columnCount: js.UndefOr[Double] = js.native
  
  /** Optional maximum allowed column width */
  var columnMaxWidth: js.UndefOr[Double] = js.native
  
  /** Optional minimum allowed column width */
  var columnMinWidth: js.UndefOr[Double] = js.native
  
  /** Width of Grid or Table child */
  var width: Double = js.native
}
object ColumnSizerProps {
  
  @scala.inline
  def apply(children: SizedColumnProps => ReactNode, width: Double): ColumnSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSizerProps]
  }
  
  @scala.inline
  implicit class ColumnSizerPropsOps[Self <: ColumnSizerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: SizedColumnProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setColumnMaxWidth(value: Double): Self = this.set("columnMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMaxWidth: Self = this.set("columnMaxWidth", js.undefined)
    
    @scala.inline
    def setColumnMinWidth(value: Double): Self = this.set("columnMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMinWidth: Self = this.set("columnMinWidth", js.undefined)
  }
}
