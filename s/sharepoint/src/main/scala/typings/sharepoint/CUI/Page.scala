package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @js.native
  trait CommandDispatcher extends StObject {
    
    def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
  }
  object CommandDispatcher {
    
    @scala.inline
    def apply(executeCommand: (String, js.Any) => js.Any): CommandDispatcher = {
      val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
      __obj.asInstanceOf[CommandDispatcher]
    }
    
    @scala.inline
    implicit class CommandDispatcherMutableBuilder[Self <: CommandDispatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuteCommand(value: (String, js.Any) => js.Any): Self = StObject.set(x, "executeCommand", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FocusManager
    extends CommandDispatcher
       with ICommandHandler {
    
    def getFocusedComponents(): js.Array[Component] = js.native
    
    def releaseAllFoci(): Boolean = js.native
    
    def releaseFocusFromComponent(component: Component): js.Any = js.native
    
    def requestFocusForComponent(component: Component): js.Any = js.native
  }
  object FocusManager {
    
    @scala.inline
    def apply(
      canHandleCommand: String => Boolean,
      executeCommand: (String, js.Any) => js.Any,
      getFocusedComponents: () => js.Array[Component],
      handleCommand: (String, js.Any, Double) => Boolean,
      releaseAllFoci: () => Boolean,
      releaseFocusFromComponent: Component => js.Any,
      requestFocusForComponent: Component => js.Any
    ): FocusManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = js.Any.fromFunction0(getFocusedComponents), handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = js.Any.fromFunction0(releaseAllFoci), releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
      __obj.asInstanceOf[FocusManager]
    }
    
    @scala.inline
    implicit class FocusManagerMutableBuilder[Self <: FocusManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFocusedComponents(value: () => js.Array[Component]): Self = StObject.set(x, "getFocusedComponents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseAllFoci(value: () => Boolean): Self = StObject.set(x, "releaseAllFoci", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReleaseFocusFromComponent(value: Component => js.Any): Self = StObject.set(x, "releaseFocusFromComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestFocusForComponent(value: Component => js.Any): Self = StObject.set(x, "requestFocusForComponent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ICommandHandler extends StObject {
    
    def canHandleCommand(commandId: String): Boolean = js.native
    
    def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  }
  object ICommandHandler {
    
    @scala.inline
    def apply(canHandleCommand: String => Boolean, handleCommand: (String, js.Any, Double) => Boolean): ICommandHandler = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[ICommandHandler]
    }
    
    @scala.inline
    implicit class ICommandHandlerMutableBuilder[Self <: ICommandHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanHandleCommand(value: String => Boolean): Self = StObject.set(x, "canHandleCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleCommand(value: (String, js.Any, Double) => Boolean): Self = StObject.set(x, "handleCommand", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait PageComponent extends ICommandHandler {
    
    def getFocusedCommands(): js.Array[String] = js.native
    
    def getGlobalCommands(): js.Array[String] = js.native
    
    def getId(): String = js.native
    
    def init(): scala.Unit = js.native
    
    def isFocusable(): Boolean = js.native
    
    def receiveFocus(): Boolean = js.native
    
    def yieldFocus(): Boolean = js.native
  }
  object PageComponent {
    
    @scala.inline
    def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: () => js.Array[String],
      getGlobalCommands: () => js.Array[String],
      getId: () => String,
      handleCommand: (String, js.Any, Double) => Boolean,
      init: () => scala.Unit,
      isFocusable: () => Boolean,
      receiveFocus: () => Boolean,
      yieldFocus: () => Boolean
    ): PageComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
      __obj.asInstanceOf[PageComponent]
    }
    
    @scala.inline
    implicit class PageComponentMutableBuilder[Self <: PageComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFocusedCommands(value: () => js.Array[String]): Self = StObject.set(x, "getFocusedCommands", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGlobalCommands(value: () => js.Array[String]): Self = StObject.set(x, "getGlobalCommands", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => scala.Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFocusable(value: () => Boolean): Self = StObject.set(x, "isFocusable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReceiveFocus(value: () => Boolean): Self = StObject.set(x, "receiveFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setYieldFocus(value: () => Boolean): Self = StObject.set(x, "yieldFocus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PageManager
    extends RootUser
       with ICommandHandler
       with IRootBuildClient {
    
    def add_ribbonInited(value: js.Function0[scala.Unit]): js.Any = js.native
    
    def get_commandDispatcher(): CommandDispatcher = js.native
    
    def get_focusManager(): FocusManager = js.native
    
    def get_undoManager(): UndoManager = js.native
  }
  object PageManager {
    
    @scala.inline
    def apply(
      add_ribbonInited: js.Function0[scala.Unit] => js.Any,
      canHandleCommand: String => Boolean,
      get_commandDispatcher: () => CommandDispatcher,
      get_focusManager: () => FocusManager,
      get_undoManager: () => UndoManager,
      handleCommand: (String, js.Any, Double) => Boolean
    ): PageManager = {
      val __obj = js.Dynamic.literal(add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[PageManager]
    }
    
    @scala.inline
    implicit class PageManagerMutableBuilder[Self <: PageManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd_ribbonInited(value: js.Function0[scala.Unit] => js.Any): Self = StObject.set(x, "add_ribbonInited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet_commandDispatcher(value: () => CommandDispatcher): Self = StObject.set(x, "get_commandDispatcher", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_focusManager(value: () => FocusManager): Self = StObject.set(x, "get_focusManager", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_undoManager(value: () => UndoManager): Self = StObject.set(x, "get_undoManager", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UndoManager extends ICommandHandler
  object UndoManager {
    
    @scala.inline
    def apply(canHandleCommand: String => Boolean, handleCommand: (String, js.Any, Double) => Boolean): UndoManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[UndoManager]
    }
  }
}
