package typings.reactGateway

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayRegistryMod {
  
  @JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GatewayRegistry {
    
    /* CompleteClass */
    var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]] = js.native
    
    /* CompleteClass */
    var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, Any]) | Null]] = js.native
    
    /* CompleteClass */
    var _currentId: Double = js.native
    
    /* CompleteClass */
    override def _renderContainer(name: String): Unit = js.native
    
    /* CompleteClass */
    override def addChild(name: String, gatewayId: String, child: ReactNode): Unit = js.native
    
    /* CompleteClass */
    override def addContainer(name: String, container: Component[js.Object, js.Object, Any]): Unit = js.native
    
    /* CompleteClass */
    override def clearChild(name: String, gatewayId: String): Unit = js.native
    
    /* CompleteClass */
    override def register(name: String, child: ReactNode): String = js.native
    
    /* CompleteClass */
    override def removeContainer(name: String): Unit = js.native
    
    /* CompleteClass */
    override def unregister(name: String, gatewayId: String): Unit = js.native
  }
  
  trait GatewayRegistry extends StObject {
    
    var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]]
    
    var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, Any]) | Null]]
    
    var _currentId: Double
    
    def _renderContainer(name: String): Unit
    
    def addChild(name: String, gatewayId: String, child: ReactNode): Unit
    
    def addContainer(name: String, container: Component[js.Object, js.Object, Any]): Unit
    
    def clearChild(name: String, gatewayId: String): Unit
    
    def register(name: String, child: ReactNode): String
    
    def removeContainer(name: String): Unit
    
    def unregister(name: String, gatewayId: String): Unit
  }
  object GatewayRegistry {
    
    inline def apply(
      _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]],
      _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, Any]) | Null]],
      _currentId: Double,
      _renderContainer: String => Unit,
      addChild: (String, String, ReactNode) => Unit,
      addContainer: (String, Component[js.Object, js.Object, Any]) => Unit,
      clearChild: (String, String) => Unit,
      register: (String, ReactNode) => String,
      removeContainer: String => Unit,
      unregister: (String, String) => Unit
    ): GatewayRegistry = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any], _renderContainer = js.Any.fromFunction1(_renderContainer), addChild = js.Any.fromFunction3(addChild), addContainer = js.Any.fromFunction2(addContainer), clearChild = js.Any.fromFunction2(clearChild), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1(removeContainer), unregister = js.Any.fromFunction2(unregister))
      __obj.asInstanceOf[GatewayRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GatewayRegistry] (val x: Self) extends AnyVal {
      
      inline def setAddChild(value: (String, String, ReactNode) => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction3(value))
      
      inline def setAddContainer(value: (String, Component[js.Object, js.Object, Any]) => Unit): Self = StObject.set(x, "addContainer", js.Any.fromFunction2(value))
      
      inline def setClearChild(value: (String, String) => Unit): Self = StObject.set(x, "clearChild", js.Any.fromFunction2(value))
      
      inline def setRegister(value: (String, ReactNode) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setRemoveContainer(value: String => Unit): Self = StObject.set(x, "removeContainer", js.Any.fromFunction1(value))
      
      inline def setUnregister(value: (String, String) => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction2(value))
      
      inline def set_children(value: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
      
      inline def set_containers(value: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, Any]) | Null]]): Self = StObject.set(x, "_containers", value.asInstanceOf[js.Any])
      
      inline def set_currentId(value: Double): Self = StObject.set(x, "_currentId", value.asInstanceOf[js.Any])
      
      inline def set_renderContainer(value: String => Unit): Self = StObject.set(x, "_renderContainer", js.Any.fromFunction1(value))
    }
  }
}
