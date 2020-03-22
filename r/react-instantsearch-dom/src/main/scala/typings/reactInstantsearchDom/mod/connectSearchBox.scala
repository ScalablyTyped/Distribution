package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.PartialSearchBoxProvided
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.SearchBoxExposed
import typings.reactInstantsearchCore.mod.SearchBoxProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectSearchBox")
@js.native
object connectSearchBox extends js.Object {
  def apply(stateless: StatelessComponent[SearchBoxProvided]): ComponentClass[SearchBoxExposed, ComponentState] = js.native
  def apply[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = js.native
}

