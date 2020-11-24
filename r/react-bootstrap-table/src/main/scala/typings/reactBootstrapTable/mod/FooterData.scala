package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterData extends js.Object {
  
  /**
    * Text alignment for the data in this footer.
    */
  var align: js.UndefOr[DataAlignType] = js.native
  
  /**
    * Index for the column that this footer belongs to
    */
  var columnIndex: Double = js.native
  
  /**
    * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
    * column in the table so that the footer can be used for totals, etc.
    *
    * The output value from the formatter function will be used instead of the label if the formatter function is
    * defined.
    */
  var formatter: js.UndefOr[js.Function1[/* tableData */ js.Array[_], String | Double | ReactElement]] = js.native
  
  /**
    * Title to display for the column footer
    */
  var label: String = js.native
}
object FooterData {
  
  @scala.inline
  def apply(columnIndex: Double, label: String): FooterData = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterData]
  }
  
  @scala.inline
  implicit class FooterDataOps[Self <: FooterData] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: DataAlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* tableData */ js.Array[_] => String | Double | ReactElement): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
}
