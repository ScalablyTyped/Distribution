package typings.prosemirrorDevTools

import typings.prosemirrorView.mod.EditorView
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-dev-tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(view: EditorView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(view: EditorView, options: ApplyDevToolsOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ApplyDevToolsOptions extends StObject {
    
    var diffWorker: js.UndefOr[Worker] = js.undefined
  }
  object ApplyDevToolsOptions {
    
    inline def apply(): ApplyDevToolsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplyDevToolsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyDevToolsOptions] (val x: Self) extends AnyVal {
      
      inline def setDiffWorker(value: Worker): Self = StObject.set(x, "diffWorker", value.asInstanceOf[js.Any])
      
      inline def setDiffWorkerUndefined: Self = StObject.set(x, "diffWorker", js.undefined)
    }
  }
}
