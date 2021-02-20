package typings.rollupPluginDelete

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-delete", JSImport.Default)
  @js.native
  def default(): Plugin = js.native
  @JSImport("rollup-plugin-delete", JSImport.Default)
  @js.native
  def default(options: Options): Plugin = js.native
  
  @js.native
  trait Options
    extends typings.del.mod.Options {
    
    /**
      * Rollup hook the plugin should use.
      * @default 'buildStart'
      */
    val hook: js.UndefOr[String] = js.native
    
    /**
      * Delete items once. Useful in watch mode.
      * @default false
      */
    val runOnce: js.UndefOr[Boolean] = js.native
    
    /**
      * Patterns of files and folders to be deleted.
      * @default []
      */
    val targets: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Outputs removed files and folders to console.
      * @default false
      */
    val verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      @scala.inline
      def setRunOnce(value: Boolean): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
      
      @scala.inline
      def setTargets(value: String | js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
