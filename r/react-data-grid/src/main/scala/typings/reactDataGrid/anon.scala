package typings.reactDataGrid

import typings.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    def callback(): Unit
    
    var icon: String
    
    var text: String
  }
  object Callback {
    
    inline def apply(callback: () => Unit, icon: String, text: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Caption extends StObject {
    
    var caption: String
    
    var id: Double
  }
  object Caption {
    
    inline def apply(caption: String, id: Double): Caption = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Caption]
    }
    
    extension [Self <: Caption](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ Any
    
    var DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ Any
    
    var Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ Any
    
    var Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ Any
    
    var Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ Any
    
    var Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ Any
    
    var Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ Any
  }
  object Data {
    
    inline def apply(
      Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ Any,
      DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ Any,
      Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ Any,
      Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ Any,
      Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ Any,
      Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ Any,
      Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ Any
    ): Data = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DraggableHeader = DraggableHeader.asInstanceOf[js.Any], Editors = Editors.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Formatters = Formatters.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDraggableHeader(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ Any
      ): Self = StObject.set(x, "DraggableHeader", value.asInstanceOf[js.Any])
      
      inline def setEditors(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ Any): Self = StObject.set(x, "Editors", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ Any): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      inline def setFormatters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ Any): Self = StObject.set(x, "Formatters", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ Any): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ Any): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableShiftSelect[T] extends StObject {
    
    var enableShiftSelect: js.UndefOr[Boolean] = js.undefined
    
    var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
    
    var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.undefined
    
    var selectBy: js.UndefOr[Indexes] = js.undefined
    
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
  }
  object EnableShiftSelect {
    
    inline def apply[T](): EnableShiftSelect[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableShiftSelect[T]]
    }
    
    extension [Self <: EnableShiftSelect[?], T](x: Self & EnableShiftSelect[T]) {
      
      inline def setEnableShiftSelect(value: Boolean): Self = StObject.set(x, "enableShiftSelect", value.asInstanceOf[js.Any])
      
      inline def setEnableShiftSelectUndefined: Self = StObject.set(x, "enableShiftSelect", js.undefined)
      
      inline def setOnRowsDeselected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = StObject.set(x, "onRowsDeselected", js.Any.fromFunction1(value))
      
      inline def setOnRowsDeselectedUndefined: Self = StObject.set(x, "onRowsDeselected", js.undefined)
      
      inline def setOnRowsSelected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = StObject.set(x, "onRowsSelected", js.Any.fromFunction1(value))
      
      inline def setOnRowsSelectedUndefined: Self = StObject.set(x, "onRowsSelected", js.undefined)
      
      inline def setSelectBy(value: Indexes): Self = StObject.set(x, "selectBy", value.asInstanceOf[js.Any])
      
      inline def setSelectByUndefined: Self = StObject.set(x, "selectBy", js.undefined)
      
      inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: Any
    
    var title: String
  }
  object Id {
    
    inline def apply(id: Any, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Idx extends StObject {
    
    var idx: Double
    
    var rowIdx: Double
  }
  object Idx {
    
    inline def apply(idx: Double, rowIdx: Double): Idx = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    extension [Self <: Idx](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Indexes extends StObject {
    
    var indexes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var isSelectedKey: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[RowKey] = js.undefined
  }
  object Indexes {
    
    inline def apply(): Indexes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indexes]
    }
    
    extension [Self <: Indexes](x: Self) {
      
      inline def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      inline def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value*))
      
      inline def setIsSelectedKey(value: String): Self = StObject.set(x, "isSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedKeyUndefined: Self = StObject.set(x, "isSelectedKey", js.undefined)
      
      inline def setKeys(value: RowKey): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var idx: Double
    
    var name: String
    
    var rowIdx: Double
  }
  object Name {
    
    inline def apply(idx: Double, name: String, rowIdx: Double): Name = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowKey extends StObject {
    
    var rowKey: String
    
    var values: js.Array[Any]
  }
  object RowKey {
    
    inline def apply(rowKey: String, values: js.Array[Any]): RowKey = {
      val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowKey]
    }
    
    extension [Self <: RowKey](x: Self) {
      
      inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait Text extends StObject {
    
    var id: String
    
    var text: String
    
    var title: String
    
    var value: String
  }
  object Text {
    
    inline def apply(id: String, text: String, title: String, value: String): Text = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Width extends StObject {
    
    var width: String
  }
  object Width {
    
    inline def apply(width: String): Width = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
