package typings.reactRefresh

import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import typings.reactRefresh.anon.TypeofimportedCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelMod {
  
  inline def apply(babel: TypeofimportedCore): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
  inline def apply(babel: TypeofimportedCore, opts: Options): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].apply(babel.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  @JSImport("react-refresh/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var emitFullSignatures: js.UndefOr[Boolean] = js.undefined
    
    var refreshReg: js.UndefOr[String] = js.undefined
    
    var refreshSig: js.UndefOr[String] = js.undefined
    
    var skipEnvCheck: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmitFullSignatures(value: Boolean): Self = StObject.set(x, "emitFullSignatures", value.asInstanceOf[js.Any])
      
      inline def setEmitFullSignaturesUndefined: Self = StObject.set(x, "emitFullSignatures", js.undefined)
      
      inline def setRefreshReg(value: String): Self = StObject.set(x, "refreshReg", value.asInstanceOf[js.Any])
      
      inline def setRefreshRegUndefined: Self = StObject.set(x, "refreshReg", js.undefined)
      
      inline def setRefreshSig(value: String): Self = StObject.set(x, "refreshSig", value.asInstanceOf[js.Any])
      
      inline def setRefreshSigUndefined: Self = StObject.set(x, "refreshSig", js.undefined)
      
      inline def setSkipEnvCheck(value: Boolean): Self = StObject.set(x, "skipEnvCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipEnvCheckUndefined: Self = StObject.set(x, "skipEnvCheck", js.undefined)
    }
  }
}
