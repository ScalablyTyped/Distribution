package typings.reactVirtualized

import typings.reactVirtualized.anon.ChildrenValidator
import typings.reactVirtualized.esScrollSyncMod.ScrollSyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollSyncMod {
  
  @JSImport("react-virtualized/dist/commonjs/ScrollSync", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.reactVirtualized.esScrollSyncMod.ScrollSync {
    def this(props: ScrollSyncProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollSyncProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-virtualized/dist/commonjs/ScrollSync", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/ScrollSync", "default.propTypes")
    @js.native
    def propTypes: ChildrenValidator = js.native
    inline def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/ScrollSync", "ScrollSync")
  @js.native
  open class ScrollSync protected ()
    extends typings.reactVirtualized.esScrollSyncMod.ScrollSync {
    def this(props: ScrollSyncProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollSyncProps, context: Any) = this()
  }
  /* static members */
  object ScrollSync {
    
    @JSImport("react-virtualized/dist/commonjs/ScrollSync", "ScrollSync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/ScrollSync", "ScrollSync.propTypes")
    @js.native
    def propTypes: ChildrenValidator = js.native
    inline def propTypes_=(x: ChildrenValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
