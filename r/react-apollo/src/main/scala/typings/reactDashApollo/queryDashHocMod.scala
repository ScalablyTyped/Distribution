package typings.reactDashApollo

import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.reactDashApollo.typesMod.OperationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/query-hoc", JSImport.Namespace)
@js.native
object queryDashHocMod extends js.Object {
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: DocumentNode): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: DocumentNode,
    operationOptions: OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ ComponentType[TProps with TChildProps], 
    ComponentClass[TProps, _]
  ] = js.native
}

