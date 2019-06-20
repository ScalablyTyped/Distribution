package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationConfig[TOperation /* <: OperationType */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var mutation: GraphQLTaggedNode
  var onCompleted: js.UndefOr[
    (js.Function2[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | scala.Null], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var onError: js.UndefOr[(js.Function1[/* error */ stdLib.Error, scala.Unit]) | scala.Null] = js.undefined
  var optimisticResponse: js.UndefOr[
    (/* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any) | scala.Null
  ] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[_] | scala.Null] = js.undefined
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | scala.Null
  ] = js.undefined
  var uploadables: js.UndefOr[UploadableMap] = js.undefined
  var variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any
}

object MutationConfig {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    mutation: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: (/* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | scala.Null]) => scala.Unit = null,
    onError: /* error */ stdLib.Error => scala.Unit = null,
    optimisticResponse: /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any = null,
    optimisticUpdater: SelectorStoreUpdater[_] = null,
    updater: SelectorStoreUpdater[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ] = null,
    uploadables: UploadableMap = null
  ): MutationConfig[TOperation] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables)
    if (configs != null) __obj.updateDynamic("configs")(configs)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction2(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(optimisticUpdater)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[MutationConfig[TOperation]]
  }
}

