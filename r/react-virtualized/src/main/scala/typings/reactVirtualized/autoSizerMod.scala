package typings.reactVirtualized

import typings.reactVirtualized.anon.DisableHeight
import typings.reactVirtualized.esAutoSizerMod.AutoSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoSizerMod {
  
  @JSImport("react-virtualized/dist/commonjs/AutoSizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactVirtualized.esAutoSizerMod.AutoSizer {
    def this(props: AutoSizerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", "default.defaultProps")
    @js.native
    def defaultProps: DisableHeight = js.native
    inline def defaultProps_=(x: DisableHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer")
  @js.native
  open class AutoSizer protected ()
    extends typings.reactVirtualized.esAutoSizerMod.AutoSizer {
    def this(props: AutoSizerProps) = this()
  }
  /* static members */
  object AutoSizer {
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/AutoSizer", "AutoSizer.defaultProps")
    @js.native
    def defaultProps: DisableHeight = js.native
    inline def defaultProps_=(x: DisableHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
