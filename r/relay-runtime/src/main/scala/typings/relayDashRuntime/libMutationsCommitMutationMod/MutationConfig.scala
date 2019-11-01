package typings.relayDashRuntime.libMutationsCommitMutationMod

import typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadError
import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationConfig[TOperation /* <: MutationParameters */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var mutation: GraphQLTaggedNode
  var onCompleted: js.UndefOr[
    (js.Function2[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
      Unit
    ]) | Null
  ] = js.undefined
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.undefined
  var optimisticResponse: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
  ] = js.undefined
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
  var variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any
}

object MutationConfig {
  @scala.inline
  def apply[TOperation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: (/* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit = null,
    onError: /* error */ Error => Unit = null,
    optimisticResponse: /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ], /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any) => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy[
      /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any
    ], /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any) => Unit = null,
    uploadables: UploadableMap = null
  ): MutationConfig[TOperation] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables)
    if (configs != null) __obj.updateDynamic("configs")(configs)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction2(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2(optimisticUpdater))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables)
    __obj.asInstanceOf[MutationConfig[TOperation]]
  }
}

