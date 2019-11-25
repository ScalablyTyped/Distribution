package typings.reactDashInstantsearchDashDom

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var InstantSearch: ComponentClass[_, ComponentState]
  def findResultsState(App: ComponentType[_], props: js.Any): js.Promise[_]
}

object Anon_App {
  @scala.inline
  def apply(
    InstantSearch: ComponentClass[_, ComponentState],
    findResultsState: (ComponentType[_], js.Any) => js.Promise[_]
  ): Anon_App = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch.asInstanceOf[js.Any], findResultsState = js.Any.fromFunction2(findResultsState))
  
    __obj.asInstanceOf[Anon_App]
  }
}

