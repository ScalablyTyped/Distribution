package typings.smoothScrollbar

import typings.smoothScrollbar.data2dMod.Data2d
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  trait ScrollbarPlugin extends StObject {
    
    val name: String
    
    def onDestroy(): Unit
    
    def onInit(): Unit
    
    def onRender(remainMomentum: Data2d): Unit
    
    def onUpdate(): Unit
    
    val options: js.Any
    
    val scrollbar: Scrollbar
    
    def transformDelta(delta: Data2d, fromEvent: js.Any): Data2d
  }
  object ScrollbarPlugin {
    
    @scala.inline
    def apply(
      name: String,
      onDestroy: () => Unit,
      onInit: () => Unit,
      onRender: Data2d => Unit,
      onUpdate: () => Unit,
      options: js.Any,
      scrollbar: Scrollbar,
      transformDelta: (Data2d, js.Any) => Data2d
    ): ScrollbarPlugin = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDestroy = js.Any.fromFunction0(onDestroy), onInit = js.Any.fromFunction0(onInit), onRender = js.Any.fromFunction1(onRender), onUpdate = js.Any.fromFunction0(onUpdate), options = options.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], transformDelta = js.Any.fromFunction2(transformDelta))
      __obj.asInstanceOf[ScrollbarPlugin]
    }
    
    @scala.inline
    implicit class ScrollbarPluginMutableBuilder[Self <: ScrollbarPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDestroy(value: () => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRender(value: Data2d => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbar(value: Scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformDelta(value: (Data2d, js.Any) => Data2d): Self = StObject.set(x, "transformDelta", js.Any.fromFunction2(value))
    }
  }
}
