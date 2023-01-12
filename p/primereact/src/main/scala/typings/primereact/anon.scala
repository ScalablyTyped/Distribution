package typings.primereact

import typings.primereact.columnColumnMod.ColumnProps
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BindEvents extends StObject {
    
    def bindEvents(): Unit
    
    def getValue(): String
    
    def init(): Unit
    
    def unbindEvents(): Unit
    
    def updateModel(e: SyntheticEvent[Element, Event]): Unit
  }
  object BindEvents {
    
    inline def apply(
      bindEvents: () => Unit,
      getValue: () => String,
      init: () => Unit,
      unbindEvents: () => Unit,
      updateModel: SyntheticEvent[Element, Event] => Unit
    ): BindEvents = {
      val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), getValue = js.Any.fromFunction0(getValue), init = js.Any.fromFunction0(init), unbindEvents = js.Any.fromFunction0(unbindEvents), updateModel = js.Any.fromFunction1(updateModel))
      __obj.asInstanceOf[BindEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BindEvents] (val x: Self) extends AnyVal {
      
      inline def setBindEvents(value: () => Unit): Self = StObject.set(x, "bindEvents", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setUnbindEvents(value: () => Unit): Self = StObject.set(x, "unbindEvents", js.Any.fromFunction0(value))
      
      inline def setUpdateModel(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "updateModel", js.Any.fromFunction1(value))
    }
  }
  
  trait Browser extends StObject {
    
    var browser: String
    
    var version: String
  }
  object Browser {
    
    inline def apply(browser: String, version: String): Browser = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Disabled extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object Disabled {
    
    inline def apply(): Disabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  @js.native
  trait Emit extends StObject {
    
    def emit(`type`: String): Unit = js.native
    def emit(`type`: String, evt: Any): Unit = js.native
    
    def off(`type`: String, fn: Any): Unit = js.native
    
    def on(`type`: String, fn: Any): Unit = js.native
  }
  
  trait FilterField extends StObject {
    
    var filterField: String
    
    var filterMeta: js.UndefOr[js.Object | Null] = js.undefined
    
    var props: ColumnProps
  }
  object FilterField {
    
    inline def apply(filterField: String, props: ColumnProps): FilterField = {
      val __obj = js.Dynamic.literal(filterField = filterField.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterField] (val x: Self) extends AnyVal {
      
      inline def setFilterField(value: String): Self = StObject.set(x, "filterField", value.asInstanceOf[js.Any])
      
      inline def setFilterMeta(value: js.Object): Self = StObject.set(x, "filterMeta", value.asInstanceOf[js.Any])
      
      inline def setFilterMetaNull: Self = StObject.set(x, "filterMeta", null)
      
      inline def setFilterMetaUndefined: Self = StObject.set(x, "filterMeta", js.undefined)
      
      inline def setProps(value: ColumnProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Any
    
    var top: Any
  }
  object Left {
    
    inline def apply(left: Any, top: Any): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locale extends StObject {
    
    var locale: String
    
    var options: js.Object
  }
  object Locale {
    
    inline def apply(locale: String, options: js.Object): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var url: Any
  }
  object Name {
    
    inline def apply(name: String, url: Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionOnly extends StObject {
    
    var selectionOnly: Boolean
  }
  object SelectionOnly {
    
    inline def apply(selectionOnly: Boolean): SelectionOnly = {
      val __obj = js.Dynamic.literal(selectionOnly = selectionOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionOnly] (val x: Self) extends AnyVal {
      
      inline def setSelectionOnly(value: Boolean): Self = StObject.set(x, "selectionOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait Width extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Width {
    
    inline def apply(): Width = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
