package typings.sauronjs

import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreComponentMod {
  
  @JSImport("sauronjs/src/core/component", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Component {
    def this(params: ComponentParameters) = this()
  }
  @JSImport("sauronjs/src/core/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("sauronjs/src/core/component", "_index")
  @js.native
  def index: Double = js.native
  
  inline def index_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_index")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Component extends StObject {
    
    def attr(key: String): String = js.native
    def attr(key: String, value: String): Unit = js.native
    
    def broadcast(event: String): Unit = js.native
    def broadcast(event: String, data: Any): Unit = js.native
    
    var broadcastSubject: Any = js.native
    
    def destroy(): Unit = js.native
    
    var element: HTMLElement = js.native
    
    def find(selector: String): HTMLElement = js.native
    
    def findAll(selector: String): NodeListOf[HTMLElement] = js.native
    
    def registerSubscription(
      subscriptions: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subscription */ Any
        ]
    ): Unit = js.native
    
    var state: js.UndefOr[Any] = js.native
    
    def subscribe(
      observables: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
        ]
    ): Unit = js.native
  }
  
  trait ComponentParameters extends StObject {
    
    var element: HTMLElement
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object ComponentParameters {
    
    inline def apply(element: HTMLElement): ComponentParameters = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentParameters]
    }
    
    extension [Self <: ComponentParameters](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
