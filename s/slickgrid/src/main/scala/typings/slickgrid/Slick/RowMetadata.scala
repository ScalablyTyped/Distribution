package typings.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowMetadata[T] extends js.Object {
  
  /**
    * Metadata related to individual columns
    */
  var columns: js.UndefOr[
    (/**
    * Metadata indexed by column id
    */
  StringDictionary[ColumnMetadata[T]]) with (/**
    * Metadata indexed by column index
    */
  NumberDictionary[ColumnMetadata[T]])
  ] = js.native
  
  /**
    * One or more (space-separated) CSS classes to be added to the entire row.
    */
  var cssClasses: js.UndefOr[String] = js.native
  
  /**
    * Whether or not any cells in the row can be set as "active".
    */
  var focusable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not a row or any cells in it can be selected.
    */
  var selectable: js.UndefOr[Boolean] = js.native
}
object RowMetadata {
  
  @scala.inline
  def apply[T](): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowMetadata[T]]
  }
  
  @scala.inline
  implicit class RowMetadataOps[Self <: RowMetadata[_], T] (val x: Self with RowMetadata[T]) extends AnyVal {
    
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
    def setColumns(
      value: (/**
      * Metadata indexed by column id
      */
    StringDictionary[ColumnMetadata[T]]) with (/**
      * Metadata indexed by column index
      */
    NumberDictionary[ColumnMetadata[T]])
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCssClasses(value: String): Self = this.set("cssClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClasses: Self = this.set("cssClasses", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
  }
}
