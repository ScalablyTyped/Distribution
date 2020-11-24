package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvParams extends js.Object {
  
  // names of columns
  var columnNames: js.UndefOr[js.Array[String]] = js.native
  
  // names of columns
  var columnTypes: js.UndefOr[js.Array[String]] = js.native
  
  // can be one of: UTF-8, ISO_8859_1, UTF-16
  var encoding: js.UndefOr[String] = js.native
  
  // If the first line in every object specifies the column names
  var firstLineAsColumnNames: js.UndefOr[Boolean] = js.native
  
  // character within which a cell value is enclosed,null character if no such character, default is '"'
  var quoteChar: js.UndefOr[String] = js.native
  
  // a single character that is the column seperator
  var separator: js.UndefOr[String] = js.native
}
object CsvParams {
  
  @scala.inline
  def apply(): CsvParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvParams]
  }
  
  @scala.inline
  implicit class CsvParamsOps[Self <: CsvParams] (val x: Self) extends AnyVal {
    
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
    def setColumnNamesVarargs(value: String*): Self = this.set("columnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnNames(value: js.Array[String]): Self = this.set("columnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNames: Self = this.set("columnNames", js.undefined)
    
    @scala.inline
    def setColumnTypesVarargs(value: String*): Self = this.set("columnTypes", js.Array(value :_*))
    
    @scala.inline
    def setColumnTypes(value: js.Array[String]): Self = this.set("columnTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnTypes: Self = this.set("columnTypes", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFirstLineAsColumnNames(value: Boolean): Self = this.set("firstLineAsColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineAsColumnNames: Self = this.set("firstLineAsColumnNames", js.undefined)
    
    @scala.inline
    def setQuoteChar(value: String): Self = this.set("quoteChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteChar: Self = this.set("quoteChar", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
