package typings
package reactDashInstantsearchDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var InstantSearch: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  def findResultsState(App: reactLib.reactMod.ReactNs.ComponentType[_], props: js.Any): js.Promise[_]
}

object Anon_App {
  @scala.inline
  def apply(
    InstantSearch: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState],
    findResultsState: (reactLib.reactMod.ReactNs.ComponentType[_], js.Any) => js.Promise[_]
  ): Anon_App = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch, findResultsState = js.Any.fromFunction2(findResultsState))
  
    __obj.asInstanceOf[Anon_App]
  }
}

