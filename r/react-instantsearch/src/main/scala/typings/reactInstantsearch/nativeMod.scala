package typings.reactInstantsearch

import typings.react.mod.Component
import typings.reactInstantsearchCore.mod.InstantSearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/native", JSImport.Namespace)
@js.native
object nativeMod extends js.Object {
  @js.native
  class Configure ()
    extends Component[js.Any, js.Any, js.Any]
  
  @js.native
  class Index ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  class InstantSearch ()
    extends Component[InstantSearchProps, js.Object, js.Any]
  
}

