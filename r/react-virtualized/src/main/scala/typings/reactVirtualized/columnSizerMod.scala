package typings.reactVirtualized

import typings.reactVirtualized.anon.Children
import typings.reactVirtualized.esColumnSizerMod.ColumnSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnSizerMod {
  
  @JSImport("react-virtualized/dist/commonjs/ColumnSizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactVirtualized.esColumnSizerMod.ColumnSizer {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "default.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer")
  @js.native
  open class ColumnSizer protected ()
    extends typings.reactVirtualized.esColumnSizerMod.ColumnSizer {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: Any) = this()
  }
  /* static members */
  object ColumnSizer {
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
