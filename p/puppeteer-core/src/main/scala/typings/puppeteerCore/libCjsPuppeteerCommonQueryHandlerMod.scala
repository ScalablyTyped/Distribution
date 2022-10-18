package typings.puppeteerCore

import typings.puppeteerCore.anon.QueryHandler
import typings.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle
import typings.puppeteerCore.libCjsPuppeteerCommonFrameMod.Frame
import typings.puppeteerCore.libCjsPuppeteerCommonIsolatedWorldMod.WaitForSelectorOptions
import typings.puppeteerCore.libCjsPuppeteerInjectedInjectedMod.PuppeteerUtil
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonQueryHandlerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/QueryHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
  
  inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
  
  inline def getQueryHandlerAndSelector(selector: String): QueryHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[QueryHandler]
  
  inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CustomQueryHandler extends StObject {
    
    /**
      * @returns Some {@link Node}s matching the given `selector` from {@link node}.
      */
    var queryAll: js.UndefOr[js.Function2[/* node */ Node, /* selector */ String, js.Array[Node]]] = js.undefined
    
    /**
      * @returns A {@link Node} matching the given `selector` from {@link node}.
      */
    var queryOne: js.UndefOr[js.Function2[/* node */ Node, /* selector */ String, Node | Null]] = js.undefined
  }
  object CustomQueryHandler {
    
    inline def apply(): CustomQueryHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomQueryHandler]
    }
    
    extension [Self <: CustomQueryHandler](x: Self) {
      
      inline def setQueryAll(value: (/* node */ Node, /* selector */ String) => js.Array[Node]): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
      
      inline def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
      
      inline def setQueryOne(value: (/* node */ Node, /* selector */ String) => Node | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
      
      inline def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
    }
  }
  
  trait InternalQueryHandler extends StObject {
    
    /**
      * @returns Some {@link Node}s matching the given `selector` from {@link node}.
      */
    var queryAll: js.UndefOr[
        js.Function3[
          /* node */ Node, 
          /* selector */ String, 
          /* PuppeteerUtil */ PuppeteerUtil, 
          js.Array[Node]
        ]
      ] = js.undefined
    
    /**
      * @returns A {@link Node} matching the given `selector` from {@link node}.
      */
    var queryOne: js.UndefOr[
        js.Function3[/* node */ Node, /* selector */ String, /* PuppeteerUtil */ PuppeteerUtil, Node | Null]
      ] = js.undefined
  }
  object InternalQueryHandler {
    
    inline def apply(): InternalQueryHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalQueryHandler]
    }
    
    extension [Self <: InternalQueryHandler](x: Self) {
      
      inline def setQueryAll(
        value: (/* node */ Node, /* selector */ String, /* PuppeteerUtil */ PuppeteerUtil) => js.Array[Node]
      ): Self = StObject.set(x, "queryAll", js.Any.fromFunction3(value))
      
      inline def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
      
      inline def setQueryOne(value: (/* node */ Node, /* selector */ String, /* PuppeteerUtil */ PuppeteerUtil) => Node | Null): Self = StObject.set(x, "queryOne", js.Any.fromFunction3(value))
      
      inline def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
    }
  }
  
  trait PuppeteerQueryHandler extends StObject {
    
    /**
      * Queries for multiple nodes given a selector and {@link ElementHandle}.
      *
      * Akin to {@link Window.prototype.querySelectorAll}.
      */
    var queryAll: js.UndefOr[
        js.Function2[
          /* element */ ElementHandle[Node], 
          /* selector */ String, 
          js.Promise[js.Array[ElementHandle[Node]]]
        ]
      ] = js.undefined
    
    /**
      * Queries for a single node given a selector and {@link ElementHandle}.
      *
      * Akin to {@link Window.prototype.querySelector}.
      */
    var queryOne: js.UndefOr[
        js.Function2[
          /* element */ ElementHandle[Node], 
          /* selector */ String, 
          js.Promise[ElementHandle[Node] | Null]
        ]
      ] = js.undefined
    
    /**
      * Waits until a single node appears for a given selector and
      * {@link ElementHandle}.
      */
    var waitFor: js.UndefOr[
        js.Function3[
          /* elementOrFrame */ ElementHandle[Node] | Frame, 
          /* selector */ String, 
          /* options */ WaitForSelectorOptions, 
          js.Promise[ElementHandle[Node] | Null]
        ]
      ] = js.undefined
  }
  object PuppeteerQueryHandler {
    
    inline def apply(): PuppeteerQueryHandler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PuppeteerQueryHandler]
    }
    
    extension [Self <: PuppeteerQueryHandler](x: Self) {
      
      inline def setQueryAll(
        value: (/* element */ ElementHandle[Node], /* selector */ String) => js.Promise[js.Array[ElementHandle[Node]]]
      ): Self = StObject.set(x, "queryAll", js.Any.fromFunction2(value))
      
      inline def setQueryAllUndefined: Self = StObject.set(x, "queryAll", js.undefined)
      
      inline def setQueryOne(
        value: (/* element */ ElementHandle[Node], /* selector */ String) => js.Promise[ElementHandle[Node] | Null]
      ): Self = StObject.set(x, "queryOne", js.Any.fromFunction2(value))
      
      inline def setQueryOneUndefined: Self = StObject.set(x, "queryOne", js.undefined)
      
      inline def setWaitFor(
        value: (/* elementOrFrame */ ElementHandle[Node] | Frame, /* selector */ String, /* options */ WaitForSelectorOptions) => js.Promise[ElementHandle[Node] | Null]
      ): Self = StObject.set(x, "waitFor", js.Any.fromFunction3(value))
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    }
  }
}
