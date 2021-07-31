package typings.reactVirtualized

import typings.reactVirtualized.anon.AutoHeight
import typings.reactVirtualized.esListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("react-virtualized/dist/commonjs/List", "List")
  @js.native
  class List protected ()
    extends typings.reactVirtualized.esListMod.List {
    def this(props: ListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListProps, context: js.Any) = this()
  }
  /* static members */
  object List {
    
    @JSImport("react-virtualized/dist/commonjs/List", "List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/List", "List.defaultProps")
    @js.native
    def defaultProps: AutoHeight = js.native
    @scala.inline
    def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
