package typings.scriptExtHtmlWebpackPlugin

import typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks :'initial' | 'async' | 'all' | undefined} */
  trait ScriptMatchingPatternHash extends StObject {
    
    var chunks: js.UndefOr[initial | async | all] = js.undefined
    
    var test: ScriptMatchingPatternBase
  }
  object ScriptMatchingPatternHash {
    
    inline def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptMatchingPatternHash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
      
      inline def setChunks(value: initial | async | all): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setTest(value: ScriptMatchingPatternBase): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
}
