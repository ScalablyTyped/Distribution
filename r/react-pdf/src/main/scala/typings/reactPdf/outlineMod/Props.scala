package typings.reactPdf.outlineMod

import typings.pdfjsDist.mod.PDFTreeNode
import typings.reactPdf.anon.PageNumber
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Outline'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ PageNumber, Unit]] = js.native
  
  /**
    * Function called in case of an error while retrieving the outline.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  /**
    * Function called when the outline is successfully retrieved.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* outline */ js.Array[PDFTreeNode], Unit]] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnItemClick(value: /* hasPageNumber */ PageNumber => Unit): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnLoadError(value: /* error */ Error => Unit): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    
    @scala.inline
    def setOnLoadSuccess(value: /* outline */ js.Array[PDFTreeNode] => Unit): Self = this.set("onLoadSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadSuccess: Self = this.set("onLoadSuccess", js.undefined)
  }
}
