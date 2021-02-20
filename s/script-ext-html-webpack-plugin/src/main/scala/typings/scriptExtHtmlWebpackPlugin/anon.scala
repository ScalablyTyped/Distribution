package typings.scriptExtHtmlWebpackPlugin

import typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks :'initial' | 'async' | 'all' | undefined} */
  @js.native
  trait ScriptMatchingPatternHash extends StObject {
    
    var chunks: js.UndefOr[initial | async | all] = js.native
    
    var test: ScriptMatchingPatternBase = js.native
  }
  object ScriptMatchingPatternHash {
    
    @scala.inline
    def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptMatchingPatternHash]
    }
    
    @scala.inline
    implicit class ScriptMatchingPatternHashMutableBuilder[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunks(value: initial | async | all): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      @scala.inline
      def setTest(value: ScriptMatchingPatternBase): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
    }
  }
}
