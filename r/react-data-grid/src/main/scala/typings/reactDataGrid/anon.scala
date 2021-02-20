package typings.reactDataGrid

import typings.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Callback extends StObject {
    
    def callback(): Unit = js.native
    
    var icon: String = js.native
    
    var text: String = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(callback: () => Unit, icon: String, text: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Caption extends StObject {
    
    var caption: String = js.native
    
    var id: Double = js.native
  }
  object Caption {
    
    @scala.inline
    def apply(caption: String, id: Double): Caption = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Caption]
    }
    
    @scala.inline
    implicit class CaptionMutableBuilder[Self <: Caption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any = js.native
    
    var DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any = js.native
    
    var Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any = js.native
    
    var Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any = js.native
    
    var Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any = js.native
    
    var Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any = js.native
    
    var Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any = js.native
  }
  object Data {
    
    @scala.inline
    def apply(
      Data: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any,
      DraggableHeader: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any,
      Editors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any,
      Filters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any,
      Formatters: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any,
      Menu: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any,
      Toolbar: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any
    ): Data = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], DraggableHeader = DraggableHeader.asInstanceOf[js.Any], Editors = Editors.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Formatters = Formatters.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Data */ js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableHeader(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraggableHeader */ js.Any
      ): Self = StObject.set(x, "DraggableHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditors(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Editors */ js.Any): Self = StObject.set(x, "Editors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Filters */ js.Any): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatters(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Formatters */ js.Any): Self = StObject.set(x, "Formatters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenu(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Menu */ js.Any): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbar(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Toolbar */ js.Any): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnableShiftSelect[T] extends StObject {
    
    var enableShiftSelect: js.UndefOr[Boolean] = js.native
    
    var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
    
    var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
    
    var selectBy: js.UndefOr[Indexes] = js.native
    
    var showCheckbox: js.UndefOr[Boolean] = js.native
  }
  object EnableShiftSelect {
    
    @scala.inline
    def apply[T](): EnableShiftSelect[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableShiftSelect[T]]
    }
    
    @scala.inline
    implicit class EnableShiftSelectMutableBuilder[Self <: EnableShiftSelect[_], T] (val x: Self with EnableShiftSelect[T]) extends AnyVal {
      
      @scala.inline
      def setEnableShiftSelect(value: Boolean): Self = StObject.set(x, "enableShiftSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableShiftSelectUndefined: Self = StObject.set(x, "enableShiftSelect", js.undefined)
      
      @scala.inline
      def setOnRowsDeselected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = StObject.set(x, "onRowsDeselected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowsDeselectedUndefined: Self = StObject.set(x, "onRowsDeselected", js.undefined)
      
      @scala.inline
      def setOnRowsSelected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = StObject.set(x, "onRowsSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRowsSelectedUndefined: Self = StObject.set(x, "onRowsSelected", js.undefined)
      
      @scala.inline
      def setSelectBy(value: Indexes): Self = StObject.set(x, "selectBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectByUndefined: Self = StObject.set(x, "selectBy", js.undefined)
      
      @scala.inline
      def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: js.Any = js.native
    
    var title: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: js.Any, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Idx extends StObject {
    
    var idx: Double = js.native
    
    var rowIdx: Double = js.native
  }
  object Idx {
    
    @scala.inline
    def apply(idx: Double, rowIdx: Double): Idx = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    @scala.inline
    implicit class IdxMutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Indexes extends StObject {
    
    var indexes: js.UndefOr[js.Array[Double]] = js.native
    
    var isSelectedKey: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[RowKey] = js.native
  }
  object Indexes {
    
    @scala.inline
    def apply(): Indexes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indexes]
    }
    
    @scala.inline
    implicit class IndexesMutableBuilder[Self <: Indexes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
      
      @scala.inline
      def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value :_*))
      
      @scala.inline
      def setIsSelectedKey(value: String): Self = StObject.set(x, "isSelectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedKeyUndefined: Self = StObject.set(x, "isSelectedKey", js.undefined)
      
      @scala.inline
      def setKeys(value: RowKey): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var idx: Double = js.native
    
    var name: String = js.native
    
    var rowIdx: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(idx: Double, name: String, rowIdx: Double): Name = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdx(value: Double): Self = StObject.set(x, "rowIdx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RowKey extends StObject {
    
    var rowKey: String = js.native
    
    var values: js.Array[_] = js.native
  }
  object RowKey {
    
    @scala.inline
    def apply(rowKey: String, values: js.Array[_]): RowKey = {
      val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowKey]
    }
    
    @scala.inline
    implicit class RowKeyMutableBuilder[Self <: RowKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var id: String = js.native
    
    var text: String = js.native
    
    var title: String = js.native
    
    var value: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(id: String, text: String, title: String, value: String): Text = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var width: String = js.native
  }
  object Width {
    
    @scala.inline
    def apply(width: String): Width = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
