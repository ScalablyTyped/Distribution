package typings.simonwepSelectionJs

import typings.simonwepSelectionJs.mod.SelectionOptions
import typings.simonwepSelectionJs.mod.SelectionUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Selection {
    
    @JSGlobal("Selection")
    @js.native
    class ^ protected ()
      extends typings.simonwepSelectionJs.mod.^ {
      def this(options: SelectionOptions) = this()
    }
    
    @JSGlobal("Selection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(options: SelectionOptions): typings.simonwepSelectionJs.mod.Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.simonwepSelectionJs.mod.Selection]
    
    /* static member */
    @JSGlobal("Selection.utils")
    @js.native
    def utils: SelectionUtils = js.native
    inline def utils_=(x: SelectionUtils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Selection.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
