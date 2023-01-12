package typings.reactScriptHook

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseScriptMod {
  
  @JSImport("react-script-hook/lib/use-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ScriptProps): js.Tuple2[Boolean, ErrorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, ErrorState]]
  
  @JSImport("react-script-hook/lib/use-script", "scripts")
  @js.native
  val scripts: ScriptStatusMap = js.native
  
  type ErrorState = ErrorEvent | Null
  
  trait ScriptProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var checkForExisting: js.UndefOr[Boolean] = js.undefined
    
    var src: String | Null
  }
  object ScriptProps {
    
    inline def apply(): ScriptProps = {
      val __obj = js.Dynamic.literal(src = null)
      __obj.asInstanceOf[ScriptProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptProps] (val x: Self) extends AnyVal {
      
      inline def setCheckForExisting(value: Boolean): Self = StObject.set(x, "checkForExisting", value.asInstanceOf[js.Any])
      
      inline def setCheckForExistingUndefined: Self = StObject.set(x, "checkForExisting", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcNull: Self = StObject.set(x, "src", null)
    }
  }
  
  trait ScriptStatus extends StObject {
    
    var error: ErrorState
    
    var loading: Boolean
    
    var scriptEl: HTMLScriptElement
  }
  object ScriptStatus {
    
    inline def apply(loading: Boolean, scriptEl: HTMLScriptElement): ScriptStatus = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], scriptEl = scriptEl.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[ScriptStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptStatus] (val x: Self) extends AnyVal {
      
      inline def setError(value: ErrorState): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setScriptEl(value: HTMLScriptElement): Self = StObject.set(x, "scriptEl", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptStatusMap = StringDictionary[ScriptStatus]
}
