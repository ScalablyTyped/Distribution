package typings.sentryReplay

import typings.sentryReplay.anon.Target
import typings.sentryReplay.anon.`0`
import typings.std.MouseEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilDomUtilsMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClickTargetNode(event: Node | Target): Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getClickTargetNode")(event.asInstanceOf[js.Any]).asInstanceOf[Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null]
  inline def getClickTargetNode(event: MouseEvent): Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getClickTargetNode")(event.asInstanceOf[js.Any]).asInstanceOf[Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null]
  
  inline def getTargetNode(event: `0`): Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetNode")(event.asInstanceOf[js.Any]).asInstanceOf[Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null]
  inline def getTargetNode(event: Node): Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetNode")(event.asInstanceOf[js.Any]).asInstanceOf[Node | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify INode */ Any) | Null]
  
  trait DomHandlerData extends StObject {
    
    var event: Node | Target
    
    var name: String
  }
  object DomHandlerData {
    
    inline def apply(event: Node | Target, name: String): DomHandlerData = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomHandlerData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomHandlerData] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Node | Target): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
