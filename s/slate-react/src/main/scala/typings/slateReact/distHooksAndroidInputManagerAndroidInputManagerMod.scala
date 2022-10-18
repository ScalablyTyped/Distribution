package typings.slateReact

import typings.lodash.mod.DebouncedFunc
import typings.react.mod.CompositionEvent
import typings.react.mod.KeyboardEvent
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import typings.slateReact.slateReactStrings.action
import typings.std.HTMLDivElement
import typings.std.InputEvent
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksAndroidInputManagerAndroidInputManagerMod {
  
  @JSImport("slate-react/dist/hooks/android-input-manager/android-input-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAndroidInputManager(hasEditorScheduleOnDOMSelectionChangeOnDOMSelectionChange: CreateAndroidInputManagerOptions): AndroidInputManager = ^.asInstanceOf[js.Dynamic].applyDynamic("createAndroidInputManager")(hasEditorScheduleOnDOMSelectionChangeOnDOMSelectionChange.asInstanceOf[js.Any]).asInstanceOf[AndroidInputManager]
  
  trait Action extends StObject {
    
    var at: js.UndefOr[Point | Range] = js.undefined
    
    def run(): Unit
  }
  object Action {
    
    inline def apply(run: () => Unit): Action = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAt(value: Point | Range): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AndroidInputManager extends StObject {
    
    def flush(): Unit = js.native
    
    def handleCompositionEnd(event: CompositionEvent[HTMLDivElement]): Unit = js.native
    
    def handleCompositionStart(event: CompositionEvent[HTMLDivElement]): Unit = js.native
    
    def handleDOMBeforeInput(event: InputEvent): Unit = js.native
    
    def handleDomMutations(mutations: js.Array[MutationRecord]): Unit = js.native
    
    def handleInput(): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def handleUserSelect(): Unit = js.native
    def handleUserSelect(range: Range): Unit = js.native
    
    def hasPendingAction(): Boolean = js.native
    
    def hasPendingChanges(): Boolean = js.native
    
    def hasPendingDiffs(): Boolean = js.native
    
    def isFlushing(): Boolean | action = js.native
    
    def scheduleFlush(): Unit = js.native
  }
  
  trait CreateAndroidInputManagerOptions extends StObject {
    
    var editor: ReactEditor
    
    var onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    
    var scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
  }
  object CreateAndroidInputManagerOptions {
    
    inline def apply(
      editor: ReactEditor,
      onDOMSelectionChange: DebouncedFunc[js.Function0[Unit]],
      scheduleOnDOMSelectionChange: DebouncedFunc[js.Function0[Unit]]
    ): CreateAndroidInputManagerOptions = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], onDOMSelectionChange = onDOMSelectionChange.asInstanceOf[js.Any], scheduleOnDOMSelectionChange = scheduleOnDOMSelectionChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAndroidInputManagerOptions]
    }
    
    extension [Self <: CreateAndroidInputManagerOptions](x: Self) {
      
      inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "onDOMSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setScheduleOnDOMSelectionChange(value: DebouncedFunc[js.Function0[Unit]]): Self = StObject.set(x, "scheduleOnDOMSelectionChange", value.asInstanceOf[js.Any])
    }
  }
}
