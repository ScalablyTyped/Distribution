package typings.reactInstantsearchDom

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var InstantSearch: ComponentClass[_, ComponentState]
  def findResultsState(App: ComponentType[_], props: js.Any): js.Promise[_]
}

object AnonApp {
  @scala.inline
  def apply(
    InstantSearch: ComponentClass[_, ComponentState],
    findResultsState: (ComponentType[_], js.Any) => js.Promise[_]
  ): AnonApp = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch.asInstanceOf[js.Any], findResultsState = js.Any.fromFunction2(findResultsState))
  
    __obj.asInstanceOf[AnonApp]
  }
}

