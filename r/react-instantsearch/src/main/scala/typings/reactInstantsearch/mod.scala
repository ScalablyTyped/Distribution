package typings.reactInstantsearch

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactInstantsearchCore.mod.AdditionalWidgetProperties
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import typings.reactInstantsearchCore.mod.ConnectorDescription
import typings.reactInstantsearchCore.mod.ConnectorProvided
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-instantsearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClass[TExposed, ComponentState]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClass[TExposed, ComponentState]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ])]
}
