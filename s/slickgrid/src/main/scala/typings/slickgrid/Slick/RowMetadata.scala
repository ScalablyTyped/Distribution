package typings.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowMetadata[T] extends StObject {
  
  /**
    * Metadata related to individual columns
    */
  var columns: js.UndefOr[
    (/**
    * Metadata indexed by column id
    */
  StringDictionary[ColumnMetadata[T]]) & (/**
    * Metadata indexed by column index
    */
  NumberDictionary[ColumnMetadata[T]])
  ] = js.undefined
  
  /**
    * One or more (space-separated) CSS classes to be added to the entire row.
    */
  var cssClasses: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not any cells in the row can be set as "active".
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not a row or any cells in it can be selected.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
}
object RowMetadata {
  
  @scala.inline
  def apply[T](): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowMetadata[T]]
  }
  
  @scala.inline
  implicit class RowMetadataMutableBuilder[Self <: RowMetadata[?], T] (val x: Self & RowMetadata[T]) extends AnyVal {
    
    @scala.inline
    def setColumns(
      value: (/**
      * Metadata indexed by column id
      */
    StringDictionary[ColumnMetadata[T]]) & (/**
      * Metadata indexed by column index
      */
    NumberDictionary[ColumnMetadata[T]])
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setCssClasses(value: String): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
