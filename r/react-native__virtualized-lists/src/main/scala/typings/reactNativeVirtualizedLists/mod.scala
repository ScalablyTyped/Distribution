package typings.reactNativeVirtualizedLists

import typings.reactNativeVirtualizedLists.listsVirtualizedListMod.VirtualizedListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native/virtualized-lists", "VirtualizedList")
  @js.native
  open class VirtualizedList[ItemT] protected ()
    extends typings.reactNativeVirtualizedLists.listsVirtualizedListMod.VirtualizedList[ItemT] {
    def this(props: VirtualizedListProps[ItemT]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: VirtualizedListProps[ItemT], context: Any) = this()
  }
}
