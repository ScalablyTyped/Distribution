package typings.reactRelay.useMutationMod

import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMutationConfig[TMutation /* <: MutationParameters */] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var onCompleted: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, 
      /* errors */ js.Array[PayloadError], 
      Unit
    ]
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onUnsubscribe: js.UndefOr[js.Function0[Unit]] = js.undefined
  var optimisticResponse: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
  ] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object]] = js.undefined
  var uploadables: js.UndefOr[UploadableMap] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['variables'] */ js.Any
}

object UseMutationConfig {
  @scala.inline
  def apply[TMutation](
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['variables'] */ js.Any,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: (/* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, /* errors */ js.Array[PayloadError]) => Unit = null,
    onError: /* error */ Error => Unit = null,
    onUnsubscribe: () => Unit = null,
    optimisticResponse: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit = null,
    uploadables: UploadableMap = null
  ): UseMutationConfig[TMutation] = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction2(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(js.Any.fromFunction0(onUnsubscribe))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2(optimisticUpdater))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMutationConfig[TMutation]]
  }
}

