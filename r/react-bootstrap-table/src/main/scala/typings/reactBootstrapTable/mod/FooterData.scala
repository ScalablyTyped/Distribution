package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterData extends StObject {
  
  /**
    * Text alignment for the data in this footer.
    */
  var align: js.UndefOr[DataAlignType] = js.undefined
  
  /**
    * Index for the column that this footer belongs to
    */
  var columnIndex: Double
  
  /**
    * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
    * column in the table so that the footer can be used for totals, etc.
    *
    * The output value from the formatter function will be used instead of the label if the formatter function is
    * defined.
    */
  var formatter: js.UndefOr[js.Function1[/* tableData */ js.Array[js.Any], String | Double | ReactElement]] = js.undefined
  
  /**
    * Title to display for the column footer
    */
  var label: String
}
object FooterData {
  
  @scala.inline
  def apply(columnIndex: Double, label: String): FooterData = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterData]
  }
  
  @scala.inline
  implicit class FooterDataMutableBuilder[Self <: FooterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: DataAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatter(value: /* tableData */ js.Array[js.Any] => String | Double | ReactElement): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
