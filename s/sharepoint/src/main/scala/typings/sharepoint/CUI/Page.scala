package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  trait CommandDispatcher extends StObject {
    
    def executeCommand(commandId: String, properties: Any): Any
  }
  object CommandDispatcher {
    
    inline def apply(executeCommand: (String, Any) => Any): CommandDispatcher = {
      val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
      __obj.asInstanceOf[CommandDispatcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandDispatcher] (val x: Self) extends AnyVal {
      
      inline def setExecuteCommand(value: (String, Any) => Any): Self = StObject.set(x, "executeCommand", js.Any.fromFunction2(value))
    }
  }
  
  trait FocusManager
    extends StObject
       with CommandDispatcher
       with ICommandHandler {
    
    def getFocusedComponents(): js.Array[Component]
    
    def releaseAllFoci(): Boolean
    
    def releaseFocusFromComponent(component: Component): Any
    
    def requestFocusForComponent(component: Component): Any
  }
  object FocusManager {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      executeCommand: (String, Any) => Any,
      getFocusedComponents: () => js.Array[Component],
      handleCommand: (String, Any, Double) => Boolean,
      releaseAllFoci: () => Boolean,
      releaseFocusFromComponent: Component => Any,
      requestFocusForComponent: Component => Any
    ): FocusManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = js.Any.fromFunction0(getFocusedComponents), handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = js.Any.fromFunction0(releaseAllFoci), releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
      __obj.asInstanceOf[FocusManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusManager] (val x: Self) extends AnyVal {
      
      inline def setGetFocusedComponents(value: () => js.Array[Component]): Self = StObject.set(x, "getFocusedComponents", js.Any.fromFunction0(value))
      
      inline def setReleaseAllFoci(value: () => Boolean): Self = StObject.set(x, "releaseAllFoci", js.Any.fromFunction0(value))
      
      inline def setReleaseFocusFromComponent(value: Component => Any): Self = StObject.set(x, "releaseFocusFromComponent", js.Any.fromFunction1(value))
      
      inline def setRequestFocusForComponent(value: Component => Any): Self = StObject.set(x, "requestFocusForComponent", js.Any.fromFunction1(value))
    }
  }
  
  trait ICommandHandler extends StObject {
    
    def canHandleCommand(commandId: String): Boolean
    
    def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean
  }
  object ICommandHandler {
    
    inline def apply(canHandleCommand: String => Boolean, handleCommand: (String, Any, Double) => Boolean): ICommandHandler = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[ICommandHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICommandHandler] (val x: Self) extends AnyVal {
      
      inline def setCanHandleCommand(value: String => Boolean): Self = StObject.set(x, "canHandleCommand", js.Any.fromFunction1(value))
      
      inline def setHandleCommand(value: (String, Any, Double) => Boolean): Self = StObject.set(x, "handleCommand", js.Any.fromFunction3(value))
    }
  }
  
  trait PageComponent
    extends StObject
       with ICommandHandler {
    
    def getFocusedCommands(): js.Array[String]
    
    def getGlobalCommands(): js.Array[String]
    
    def getId(): String
    
    def init(): scala.Unit
    
    def isFocusable(): Boolean
    
    def receiveFocus(): Boolean
    
    def yieldFocus(): Boolean
  }
  object PageComponent {
    
    inline def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: () => js.Array[String],
      getGlobalCommands: () => js.Array[String],
      getId: () => String,
      handleCommand: (String, Any, Double) => Boolean,
      init: () => scala.Unit,
      isFocusable: () => Boolean,
      receiveFocus: () => Boolean,
      yieldFocus: () => Boolean
    ): PageComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
      __obj.asInstanceOf[PageComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageComponent] (val x: Self) extends AnyVal {
      
      inline def setGetFocusedCommands(value: () => js.Array[String]): Self = StObject.set(x, "getFocusedCommands", js.Any.fromFunction0(value))
      
      inline def setGetGlobalCommands(value: () => js.Array[String]): Self = StObject.set(x, "getGlobalCommands", js.Any.fromFunction0(value))
      
      inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => scala.Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setIsFocusable(value: () => Boolean): Self = StObject.set(x, "isFocusable", js.Any.fromFunction0(value))
      
      inline def setReceiveFocus(value: () => Boolean): Self = StObject.set(x, "receiveFocus", js.Any.fromFunction0(value))
      
      inline def setYieldFocus(value: () => Boolean): Self = StObject.set(x, "yieldFocus", js.Any.fromFunction0(value))
    }
  }
  
  trait PageManager
    extends StObject
       with RootUser
       with ICommandHandler
       with IRootBuildClient {
    
    def add_ribbonInited(value: js.Function0[scala.Unit]): Any
    
    def get_commandDispatcher(): CommandDispatcher
    
    def get_focusManager(): FocusManager
    
    def get_undoManager(): UndoManager
  }
  object PageManager {
    
    inline def apply(
      add_ribbonInited: js.Function0[scala.Unit] => Any,
      canHandleCommand: String => Boolean,
      get_commandDispatcher: () => CommandDispatcher,
      get_focusManager: () => FocusManager,
      get_undoManager: () => UndoManager,
      handleCommand: (String, Any, Double) => Boolean
    ): PageManager = {
      val __obj = js.Dynamic.literal(add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[PageManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageManager] (val x: Self) extends AnyVal {
      
      inline def setAdd_ribbonInited(value: js.Function0[scala.Unit] => Any): Self = StObject.set(x, "add_ribbonInited", js.Any.fromFunction1(value))
      
      inline def setGet_commandDispatcher(value: () => CommandDispatcher): Self = StObject.set(x, "get_commandDispatcher", js.Any.fromFunction0(value))
      
      inline def setGet_focusManager(value: () => FocusManager): Self = StObject.set(x, "get_focusManager", js.Any.fromFunction0(value))
      
      inline def setGet_undoManager(value: () => UndoManager): Self = StObject.set(x, "get_undoManager", js.Any.fromFunction0(value))
    }
  }
  
  trait UndoManager
    extends StObject
       with ICommandHandler
  object UndoManager {
    
    inline def apply(canHandleCommand: String => Boolean, handleCommand: (String, Any, Double) => Boolean): UndoManager = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), handleCommand = js.Any.fromFunction3(handleCommand))
      __obj.asInstanceOf[UndoManager]
    }
  }
}
