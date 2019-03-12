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

object OperationOption {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables, TChildProps](
    alias: java.lang.String = null,
    name: java.lang.String = null,
    options: QueryOpts[TGraphQLVariables] | (MutationOpts[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      QueryOpts[TGraphQLVariables] | (MutationOpts[TData, TGraphQLVariables])
    ]) = null,
    props: (/* props */ OptionProps[TProps, TData, TGraphQLVariables], /* lastProps */ js.UndefOr[TChildProps | scala.Unit]) => TChildProps = null,
    shouldResubscribe: (/* props */ TProps, /* nextProps */ TProps) => scala.Boolean = null,
    skip: scala.Boolean | (js.Function1[/* props */ TProps, scala.Boolean]) = null,
    withRef: js.UndefOr[scala.Boolean] = js.undefined
  ): OperationOption[TProps, TData, TGraphQLVariables, TChildProps] = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(js.Any.fromFunction2(props))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(js.Any.fromFunction2(shouldResubscribe))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[OperationOption[TProps, TData, TGraphQLVariables, TChildProps]]
  }
}

