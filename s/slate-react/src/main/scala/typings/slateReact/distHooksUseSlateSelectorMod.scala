package typings.slateReact

import typings.react.mod.Context
import typings.slate.distInterfacesEditorMod.Editor
import typings.slateReact.anon.AddEventListener
import typings.slateReact.anon.OnChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseSlateSelectorMod {
  
  @JSImport("slate-react/dist/hooks/use-slate-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-slate-selector", "SlateSelectorContext")
  @js.native
  val SlateSelectorContext: Context[AddEventListener] = js.native
  
  inline def getSelectorContext(editor: Editor): OnChange = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectorContext")(editor.asInstanceOf[js.Any]).asInstanceOf[OnChange]
  
  inline def useSlateSelector[T](selector: js.Function1[/* editor */ Editor, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useSlateSelector[T](
    selector: js.Function1[/* editor */ Editor, T],
    equalityFn: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelector")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type EditorChangeHandler = js.Function1[/* editor */ Editor, Unit]
}
