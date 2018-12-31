package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOption[TProps, TData, TGraphQLVariables, TChildProps] extends js.Object {
  var alias: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[
    QueryOpts[TGraphQLVariables] | (MutationOpts[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      QueryOpts[TGraphQLVariables] | (MutationOpts[TData, TGraphQLVariables])
    ])
  ] = js.undefined
  var props: js.UndefOr[
    js.Function2[
      /* props */ OptionProps[TProps, TData, TGraphQLVariables], 
      /* lastProps */ js.UndefOr[TChildProps | scala.Unit], 
      TChildProps
    ]
  ] = js.undefined
  var shouldResubscribe: js.UndefOr[js.Function2[/* props */ TProps, /* nextProps */ TProps, scala.Boolean]] = js.undefined
  var skip: js.UndefOr[scala.Boolean | (js.Function1[/* props */ TProps, scala.Boolean])] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

