package typings.reactDatagrid.mod.ReactDataGrid

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /**
    * String - a className to be applied to all cells in this column
    */
  var className: js.UndefOr[String] = js.native
  
  var defaultHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a column as visible/hidden.
    */
  var defaultVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Columns are flexible via flexbox. Specify a flex property for this.
    * Unless a column specifies a flex or a width property, it is assumed
    * to have flex: 1.
    */
  var flex: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * String - each column should have a name property.
    */
  var name: String = js.native
  
  /**
    * Function - if you want custom rendering, specify this property.
    *
    * The column.render function is called with 3 args:
    *   value - the default value to be rendered (equals to data[column.name])
    *   data - the corresponding data object for the current row
    cellProps - an object with props for the current cell
    */
  var render: js.UndefOr[
    js.Function3[/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps, _]
  ] = js.native
  
  /**
    * Object - if you want cells in this column to be have a custom
    * style.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * String - one of 'left', 'right', 'center'.
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /**
    * String/ReactElement - a title to show in the header. If not
    * specified, a humanized version of name will be used. Can be a string
    * or anything that React can render, so you can customize it as you
    * please.
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  
  /**
    * Boolean - controlled (which means you have to manually set column
    * visibility when it changes, by using onColumnVisibilityChange).
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Column {
  
  @scala.inline
  def apply(name: String): Column = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultHidden(value: Boolean): Self = this.set("defaultHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHidden: Self = this.set("defaultHidden", js.undefined)
    
    @scala.inline
    def setDefaultVisible(value: Boolean): Self = this.set("defaultVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVisible: Self = this.set("defaultVisible", js.undefined)
    
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setRender(value: (/* value */ js.Any, /* data */ js.Any, /* cellProps */ CellProps) => _): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
