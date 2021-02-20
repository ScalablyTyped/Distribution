package typings.reactInstantsearch

import typings.reactInstantsearchCore.mod.InstantSearchProps
import typings.reactInstantsearchNative.anon.ReadonlyInstantSearchProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  @JSImport("react-instantsearch/native", "Configure")
  @js.native
  class Configure protected ()
    extends typings.reactInstantsearchNative.mod.Configure {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("react-instantsearch/native", "Index")
  @js.native
  class Index protected ()
    extends typings.reactInstantsearchNative.mod.Index {
    def this(props: js.Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Any, context: js.Any) = this()
  }
  
  @JSImport("react-instantsearch/native", "InstantSearch")
  @js.native
  class InstantSearch protected ()
    extends typings.reactInstantsearchNative.mod.InstantSearch {
    def this(props: InstantSearchProps) = this()
    def this(props: ReadonlyInstantSearchProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InstantSearchProps, context: js.Any) = this()
  }
}
