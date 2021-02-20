package typings.selectables

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selectables", JSImport.Namespace)
  @js.native
  class ^ () extends Selectables {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var elements: js.UndefOr[String] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String | Boolean] = js.native
    
    var moreUsing: js.UndefOr[String] = js.native
    
    var onDeselect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* el */ Element, Unit]] = js.native
    
    var selectedClass: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var stop: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var zone: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: String): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setKey(value: String | Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMoreUsing(value: String): Self = StObject.set(x, "moreUsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreUsingUndefined: Self = StObject.set(x, "moreUsing", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: /* el */ Element => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* el */ Element => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
      
      @scala.inline
      def setStart(value: /* e */ Event => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStop(value: /* e */ Event => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  @js.native
  trait Selectables extends StObject {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    var options: Options = js.native
  }
  object Selectables {
    
    @scala.inline
    def apply(disable: () => Unit, enable: () => Unit, options: Options): Selectables = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selectables]
    }
    
    @scala.inline
    implicit class SelectablesMutableBuilder[Self <: Selectables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
