package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesSearchSearchMod.SearchComponent
import typings.semanticUiReact.distCommonjsModulesSearchSearchMod.SearchProps
import typings.semanticUiReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Search")
@js.native
open class Search protected () extends Component[SearchProps, ComponentState, Any] {
  def this(props: SearchProps) = this()
  def this(props: SearchProps, context: Any) = this()
}
object Search extends Shortcut {
  
  @JSImport("semantic-ui-react", "Search")
  @js.native
  val ^ : SearchComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Search.Result")
  @js.native
  open class Result protected () extends Component[SearchResultProps, ComponentState, Any] {
    def this(props: SearchResultProps) = this()
    def this(props: SearchResultProps, context: Any) = this()
  }
  
  type _To = SearchComponent
  
  /* This means you don't have to write `^`, but can instead just say `Search.foo` */
  override def _to: SearchComponent = ^
}
