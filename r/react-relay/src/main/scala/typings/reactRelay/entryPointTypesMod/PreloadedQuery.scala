package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
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
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
}

object PreloadedQuery {
  @scala.inline
  def apply[TQuery, TEnvironmentProviderOptions](
    environment: Environment,
    fetchPolicy: PreloadFetchPolicy,
    name: String,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    environmentProviderOptions: js.UndefOr[Null | TEnvironmentProviderOptions] = js.undefined,
    fetchKey: js.UndefOr[Null | String | Double] = js.undefined,
    source: js.UndefOr[Null | Observable[GraphQLResponse]] = js.undefined
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (!js.isUndefined(environmentProviderOptions)) __obj.updateDynamic("environmentProviderOptions")(environmentProviderOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchKey)) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
}

