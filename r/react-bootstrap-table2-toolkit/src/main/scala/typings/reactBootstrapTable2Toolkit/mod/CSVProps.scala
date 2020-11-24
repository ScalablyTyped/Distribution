package typings.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVProps extends js.Object {
  
  /**
    * default is text/plain;charset=utf-8
    */
  var blobType: js.UndefOr[String] = js.native
  
  var exportAll: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var ignoreHeader: js.UndefOr[Boolean] = js.native
  
  var noAutoBOM: js.UndefOr[Boolean] = js.native
  
  var onlyExportFiltered: js.UndefOr[Boolean] = js.native
  
  var onlyExportSelection: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object CSVProps {
  
  @scala.inline
  def apply(): CSVProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVProps]
  }
  
  @scala.inline
  implicit class CSVPropsOps[Self <: CSVProps] (val x: Self) extends AnyVal {
    
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
    def setBlobType(value: String): Self = this.set("blobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobType: Self = this.set("blobType", js.undefined)
    
    @scala.inline
    def setExportAll(value: Boolean): Self = this.set("exportAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAll: Self = this.set("exportAll", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setIgnoreHeader(value: Boolean): Self = this.set("ignoreHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHeader: Self = this.set("ignoreHeader", js.undefined)
    
    @scala.inline
    def setNoAutoBOM(value: Boolean): Self = this.set("noAutoBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAutoBOM: Self = this.set("noAutoBOM", js.undefined)
    
    @scala.inline
    def setOnlyExportFiltered(value: Boolean): Self = this.set("onlyExportFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyExportFiltered: Self = this.set("onlyExportFiltered", js.undefined)
    
    @scala.inline
    def setOnlyExportSelection(value: Boolean): Self = this.set("onlyExportSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyExportSelection: Self = this.set("onlyExportSelection", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
