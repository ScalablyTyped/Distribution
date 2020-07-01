package typings.relayRuntime.commitMutationMod

import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationConfig[TOperation /* <: MutationParameters */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var mutation: GraphQLTaggedNode
  var onCompleted: js.UndefOr[
    (js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
      Unit
    ]) | Null
  ] = js.undefined
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.undefined
  var optimisticResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
  ] = js.undefined
  var optimisticUpdater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  var updater: js.UndefOr[
    (SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ]) | Null
  ] = js.undefined
  var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
}

object MutationConfig {
  @scala.inline
  def apply[/* <: typings.relayRuntime.commitMutationMod.MutationParameters */ TOperation](
    mutation: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: js.UndefOr[
      Null | ((/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit)
    ] = js.undefined,
    onError: js.UndefOr[Null | (/* error */ Error => Unit)] = js.undefined,
    optimisticResponse: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any = null,
    optimisticUpdater: js.UndefOr[
      Null | ((/* store */ RecordSourceSelectorProxy[
        /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
      ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit)
    ] = js.undefined,
    updater: js.UndefOr[
      Null | ((/* store */ RecordSourceSelectorProxy[
        /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
      ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit)
    ] = js.undefined,
    uploadables: js.UndefOr[Null | UploadableMap] = js.undefined
  ): MutationConfig[TOperation] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (!js.isUndefined(onCompleted)) __obj.updateDynamic("onCompleted")(if (onCompleted != null) js.Any.fromFunction2(onCompleted.asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit]) else null)
    if (!js.isUndefined(onError)) __obj.updateDynamic("onError")(if (onError != null) js.Any.fromFunction1(onError.asInstanceOf[/* error */ Error => Unit]) else null)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(optimisticUpdater)) __obj.updateDynamic("optimisticUpdater")(if (optimisticUpdater != null) js.Any.fromFunction2(optimisticUpdater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit]) else null)
    if (!js.isUndefined(updater)) __obj.updateDynamic("updater")(if (updater != null) js.Any.fromFunction2(updater.asInstanceOf[(/* store */ RecordSourceSelectorProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
    ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit]) else null)
    if (!js.isUndefined(uploadables)) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationConfig[TOperation]]
  }
}

