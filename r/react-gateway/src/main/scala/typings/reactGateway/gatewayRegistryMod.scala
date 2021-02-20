package typings.reactGateway

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayRegistryMod {
  
  @JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
  @js.native
  class ^ () extends GatewayRegistry
  
  @js.native
  trait GatewayRegistry extends StObject {
    
    var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]] = js.native
    
    var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]] = js.native
    
    var _currentId: Double = js.native
    
    def _renderContainer(name: String): Unit = js.native
    
    def addChild(name: String, gatewayId: String, child: ReactNode): Unit = js.native
    
    def addContainer(name: String, container: Component[js.Object, js.Object, _]): Unit = js.native
    
    def clearChild(name: String, gatewayId: String): Unit = js.native
    
    def register(name: String, child: ReactNode): String = js.native
    
    def removeContainer(name: String): Unit = js.native
    
    def unregister(name: String, gatewayId: String): Unit = js.native
  }
  object GatewayRegistry {
    
    @scala.inline
    def apply(
      _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]],
      _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]],
      _currentId: Double,
      _renderContainer: String => Unit,
      addChild: (String, String, ReactNode) => Unit,
      addContainer: (String, Component[js.Object, js.Object, _]) => Unit,
      clearChild: (String, String) => Unit,
      register: (String, ReactNode) => String,
      removeContainer: String => Unit,
      unregister: (String, String) => Unit
    ): GatewayRegistry = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any], _renderContainer = js.Any.fromFunction1(_renderContainer), addChild = js.Any.fromFunction3(addChild), addContainer = js.Any.fromFunction2(addContainer), clearChild = js.Any.fromFunction2(clearChild), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1(removeContainer), unregister = js.Any.fromFunction2(unregister))
      __obj.asInstanceOf[GatewayRegistry]
    }
    
    @scala.inline
    implicit class GatewayRegistryMutableBuilder[Self <: GatewayRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: (String, String, ReactNode) => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddContainer(value: (String, Component[js.Object, js.Object, _]) => Unit): Self = StObject.set(x, "addContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClearChild(value: (String, String) => Unit): Self = StObject.set(x, "clearChild", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegister(value: (String, ReactNode) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveContainer(value: String => Unit): Self = StObject.set(x, "removeContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregister(value: (String, String) => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_children(value: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_containers(value: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]]): Self = StObject.set(x, "_containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentId(value: Double): Self = StObject.set(x, "_currentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_renderContainer(value: String => Unit): Self = StObject.set(x, "_renderContainer", js.Any.fromFunction1(value))
    }
  }
}
