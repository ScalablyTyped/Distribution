package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DndComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decorateHandlerMod {
  
  @JSImport("react-dnd/lib/decorators/decorateHandler", "decorateHandler")
  @js.native
  def decorateHandler[Props, CollectedProps, ItemIdType](
    hasDecoratedComponentCreateHandlerCreateMonitorCreateConnectorRegisterHandlerContainerDisplayNameGetTypeCollectOptions: DecorateHandlerArgs[Props, ItemIdType]
  ): DndComponent[Props] = js.native
  
  @js.native
  trait DecorateHandlerArgs[Props, ItemIdType] extends StObject {
    
    var DecoratedComponent: js.Any = js.native
    
    var collect: js.Any = js.native
    
    var containerDisplayName: String = js.native
    
    var createConnector: js.Any = js.native
    
    def createHandler(monitor: HandlerReceiver, ref: RefObject[_]): Handler[Props] = js.native
    
    def createMonitor(manager: DragDropManager): HandlerReceiver = js.native
    
    def getType(props: Props): ItemIdType = js.native
    
    var options: js.Any = js.native
    
    var registerHandler: js.Any = js.native
  }
  object DecorateHandlerArgs {
    
    @scala.inline
    def apply[Props, ItemIdType](
      DecoratedComponent: js.Any,
      collect: js.Any,
      containerDisplayName: String,
      createConnector: js.Any,
      createHandler: (HandlerReceiver, RefObject[_]) => Handler[Props],
      createMonitor: DragDropManager => HandlerReceiver,
      getType: Props => ItemIdType,
      options: js.Any,
      registerHandler: js.Any
    ): DecorateHandlerArgs[Props, ItemIdType] = {
      val __obj = js.Dynamic.literal(DecoratedComponent = DecoratedComponent.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], containerDisplayName = containerDisplayName.asInstanceOf[js.Any], createConnector = createConnector.asInstanceOf[js.Any], createHandler = js.Any.fromFunction2(createHandler), createMonitor = js.Any.fromFunction1(createMonitor), getType = js.Any.fromFunction1(getType), options = options.asInstanceOf[js.Any], registerHandler = registerHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecorateHandlerArgs[Props, ItemIdType]]
    }
    
    @scala.inline
    implicit class DecorateHandlerArgsMutableBuilder[Self <: DecorateHandlerArgs[_, _], Props, ItemIdType] (val x: Self with (DecorateHandlerArgs[Props, ItemIdType])) extends AnyVal {
      
      @scala.inline
      def setCollect(value: js.Any): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerDisplayName(value: String): Self = StObject.set(x, "containerDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateConnector(value: js.Any): Self = StObject.set(x, "createConnector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateHandler(value: (HandlerReceiver, RefObject[_]) => Handler[Props]): Self = StObject.set(x, "createHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateMonitor(value: DragDropManager => HandlerReceiver): Self = StObject.set(x, "createMonitor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecoratedComponent(value: js.Any): Self = StObject.set(x, "DecoratedComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetType(value: Props => ItemIdType): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterHandler(value: js.Any): Self = StObject.set(x, "registerHandler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Handler[Props] extends StObject {
    
    def receiveProps(props: Props): Unit = js.native
    
    var ref: RefObject[_] = js.native
  }
  object Handler {
    
    @scala.inline
    def apply[Props](receiveProps: Props => Unit, ref: RefObject[_]): Handler[Props] = {
      val __obj = js.Dynamic.literal(receiveProps = js.Any.fromFunction1(receiveProps), ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handler[Props]]
    }
    
    @scala.inline
    implicit class HandlerMutableBuilder[Self <: Handler[_], Props] (val x: Self with Handler[Props]) extends AnyVal {
      
      @scala.inline
      def setReceiveProps(value: Props => Unit): Self = StObject.set(x, "receiveProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HandlerReceiver extends StObject {
    
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
  }
}
