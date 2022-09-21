package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.searchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "SearchResult")
@js.native
open class SearchResult protected () extends Component[SearchResultProps, ComponentState, Any] {
  def this(props: SearchResultProps) = this()
  def this(props: SearchResultProps, context: Any) = this()
}
object SearchResult {
  
  inline def apply: ComponentClass[SearchResultProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchResult").asInstanceOf[ComponentClass[SearchResultProps, ComponentState]]
}
