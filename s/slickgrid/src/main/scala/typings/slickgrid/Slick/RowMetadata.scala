package typings.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowMetadata[T /* <: SlickData */] extends StObject {
  
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
  
  inline def apply[T /* <: SlickData */](): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowMetadata[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowMetadata[?], T /* <: SlickData */] (val x: Self & RowMetadata[T]) extends AnyVal {
    
    inline def setColumns(
      value: (/**
      * Metadata indexed by column id
      */
    StringDictionary[ColumnMetadata[T]]) & (/**
      * Metadata indexed by column index
      */
    NumberDictionary[ColumnMetadata[T]])
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCssClasses(value: String): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
    
    inline def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
