package typings.puppeteerCore.anon

import typings.puppeteerCore.libEsmPuppeteerCommonElementHandleMod.ElementHandle
import typings.puppeteerCore.puppeteerCoreStrings.mutation
import typings.puppeteerCore.puppeteerCoreStrings.raf
import typings.std.Map
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polling extends StObject {
  
  var bindings: js.UndefOr[Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]] = js.undefined
  
  var polling: js.UndefOr[raf | mutation | Double] = js.undefined
  
  var root: js.UndefOr[ElementHandle[Node]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Polling {
  
  inline def apply(): Polling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Polling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Polling] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setRoot(value: ElementHandle[Node]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
