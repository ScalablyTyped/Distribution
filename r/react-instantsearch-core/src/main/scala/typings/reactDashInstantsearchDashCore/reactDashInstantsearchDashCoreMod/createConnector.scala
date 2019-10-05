package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "createConnector")
@js.native
object createConnector extends js.Object {
  def apply[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ StatelessComponent[ConnectorProvided[TProvided]], 
    ComponentClass[TExposed, ComponentState]
  ]) with (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = js.native
}

