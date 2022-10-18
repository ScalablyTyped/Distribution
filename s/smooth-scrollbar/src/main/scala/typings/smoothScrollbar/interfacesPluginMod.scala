package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesData2dMod.Data2d
import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPluginMod {
  
  trait ScrollbarPlugin extends StObject {
    
    val name: String
    
    def onDestroy(): Unit
    
    def onInit(): Unit
    
    def onRender(remainMomentum: Data2d): Unit
    
    def onUpdate(): Unit
    
    val options: Any
    
    val scrollbar: Scrollbar
    
    def transformDelta(delta: Data2d, fromEvent: Any): Data2d
  }
  object ScrollbarPlugin {
    
    inline def apply(
      name: String,
      onDestroy: () => Unit,
      onInit: () => Unit,
      onRender: Data2d => Unit,
      onUpdate: () => Unit,
      options: Any,
      scrollbar: Scrollbar,
      transformDelta: (Data2d, Any) => Data2d
    ): ScrollbarPlugin = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDestroy = js.Any.fromFunction0(onDestroy), onInit = js.Any.fromFunction0(onInit), onRender = js.Any.fromFunction1(onRender), onUpdate = js.Any.fromFunction0(onUpdate), options = options.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], transformDelta = js.Any.fromFunction2(transformDelta))
      __obj.asInstanceOf[ScrollbarPlugin]
    }
    
    extension [Self <: ScrollbarPlugin](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDestroy(value: () => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnRender(value: Data2d => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
      
      inline def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setTransformDelta(value: (Data2d, Any) => Data2d): Self = StObject.set(x, "transformDelta", js.Any.fromFunction2(value))
    }
  }
}
