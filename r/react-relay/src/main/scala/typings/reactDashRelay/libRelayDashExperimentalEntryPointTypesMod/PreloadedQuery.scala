package typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environment: Environment
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
  val fetchKey: js.UndefOr[String | Double | Null] = js.undefined
  val fetchPolicy: PreloadFetchPolicy
  val name: String
  val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.undefined
  val variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any
}

object PreloadedQuery {
  @scala.inline
  def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    fetchPolicy: PreloadFetchPolicy,
    name: String,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any,
    environmentProviderOptions: TEnvironmentProviderOptions = null,
    fetchKey: String | Double = null,
    source: Observable[GraphQLResponse] = null
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(environment = environment, fetchPolicy = fetchPolicy, name = name, variables = variables)
    if (environmentProviderOptions != null) __obj.updateDynamic("environmentProviderOptions")(environmentProviderOptions.asInstanceOf[js.Any])
    if (fetchKey != null) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
}

