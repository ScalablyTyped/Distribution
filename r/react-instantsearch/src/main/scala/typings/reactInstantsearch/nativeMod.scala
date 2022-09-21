package typings.reactInstantsearch

import typings.reactInstantsearchCore.mod.IndexProps
import typings.reactInstantsearchCore.mod.InstantSearchProps
import typings.reactInstantsearchNative.anon.ReadonlyIndexProps
import typings.reactInstantsearchNative.anon.ReadonlyInstantSearchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  @JSImport("react-instantsearch/native", "Configure")
  @js.native
  open class Configure protected ()
    extends typings.reactInstantsearchNative.mod.Configure {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
  }
  
  @JSImport("react-instantsearch/native", "Index")
  @js.native
  open class Index protected ()
    extends typings.reactInstantsearchNative.mod.Index {
    def this(props: IndexProps) = this()
    def this(props: ReadonlyIndexProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IndexProps, context: Any) = this()
  }
  
  @JSImport("react-instantsearch/native", "InstantSearch")
  @js.native
  open class InstantSearch protected ()
    extends typings.reactInstantsearchNative.mod.InstantSearch {
    def this(props: InstantSearchProps) = this()
    def this(props: ReadonlyInstantSearchProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InstantSearchProps, context: Any) = this()
  }
}
