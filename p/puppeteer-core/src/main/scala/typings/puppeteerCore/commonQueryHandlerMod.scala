package typings.puppeteerCore

import typings.puppeteerCore.anon.UpdatedSelector
import typings.puppeteerCore.commonDomworldMod.DOMWorld
import typings.puppeteerCore.commonDomworldMod.WaitForSelectorOptions
import typings.puppeteerCore.commonJshandleMod.ElementHandle
import typings.puppeteerCore.commonJshandleMod.JSHandle
import typings.std.Document
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonQueryHandlerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/QueryHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
  
  @scala.inline
  def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getQueryHandlerAndSelector(selector: String): UpdatedSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[UpdatedSelector]
  
  @scala.inline
  def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CustomQueryHandler extends StObject {
    
    var queryAll: js.UndefOr[
        js.Function2[
          /* element */ Element | Document, 
          /* selector */ String, 
          js.Array[Element] | NodeListOf[Element]
        ]
      ] = js.undefined
    
    var queryOne: js.UndefOr[
        js.Function2[/* element */ Element | Document, /* selector */ String, Element | Null]
      ] = js.undefined
  }
  object CustomQueryHandler {
    
    @scala.inline
    def apply(): CustomQueryHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomQueryHandler]
    }
    
    @scala.inline
    implicit class CustomQueryHandlerMutableBuilder[Self <: CustomQueryHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryAll(
        value: (/* element */ Element | Document, /* selector */ String) => js.Array[Element] | NodeListOf[Element]
      ): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
      
      @scala.inline
      def setQueryOne(value: (/* element */ Element | Document, /* selector */ String) => Element | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
    }
  }
  
  trait InternalQueryHandler extends StObject {
    
    var queryAll: js.UndefOr[
        js.Function2[
          /* element */ ElementHandle[Element], 
          /* selector */ String, 
          js.Promise[js.Array[ElementHandle[Element]]]
        ]
      ] = js.undefined
    
    var queryAllArray: js.UndefOr[
        js.Function2[/* element */ ElementHandle[Element], /* selector */ String, js.Promise[JSHandle]]
      ] = js.undefined
    
    var queryOne: js.UndefOr[
        js.Function2[
          /* element */ ElementHandle[Element], 
          /* selector */ String, 
          js.Promise[ElementHandle[Element] | Null]
        ]
      ] = js.undefined
    
    var waitFor: js.UndefOr[
        js.Function3[
          /* domWorld */ DOMWorld, 
          /* selector */ String, 
          /* options */ WaitForSelectorOptions, 
          js.Promise[ElementHandle[Element] | Null]
        ]
      ] = js.undefined
  }
  object InternalQueryHandler {
    
    @scala.inline
    def apply(): InternalQueryHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalQueryHandler]
    }
    
    @scala.inline
    implicit class InternalQueryHandlerMutableBuilder[Self <: InternalQueryHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryAll(
        value: (/* element */ ElementHandle[Element], /* selector */ String) => js.Promise[js.Array[ElementHandle[Element]]]
      ): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryAllArray(value: (/* element */ ElementHandle[Element], /* selector */ String) => js.Promise[JSHandle]): Self = StObject.set(x, "queryAllArray", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryAllArrayUndefined: Self = StObject.set(x, "queryAllArray", js.undefined)
      
      @scala.inline
      def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
      
      @scala.inline
      def setQueryOne(
        value: (/* element */ ElementHandle[Element], /* selector */ String) => js.Promise[ElementHandle[Element] | Null]
      ): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
      
      @scala.inline
      def setWaitFor(
        value: (/* domWorld */ DOMWorld, /* selector */ String, /* options */ WaitForSelectorOptions) => js.Promise[ElementHandle[Element] | Null]
      ): Self = StObject.set(x, "waitFor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    }
  }
}
