package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends js.Object {
  val environment: Environment = js.native
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.native
  val fetchKey: js.UndefOr[String | Double | Null] = js.native
  val fetchPolicy: PreloadFetchPolicy = js.native
  val name: String = js.native
  val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.native
  val variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any = js.native
}

object PreloadedQuery {
  @scala.inline
  def apply[/* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TEnvironmentProviderOptions](
    environment: Environment,
    fetchPolicy: PreloadFetchPolicy,
    name: String,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
  @scala.inline
  implicit class PreloadedQueryOps[Self <: PreloadedQuery[_, _], /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TQuery, TEnvironmentProviderOptions] (val x: Self with (PreloadedQuery[TQuery, TEnvironmentProviderOptions])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchPolicy(value: PreloadFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = this.set("environmentProviderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentProviderOptions: Self = this.set("environmentProviderOptions", js.undefined)
    @scala.inline
    def setEnvironmentProviderOptionsNull: Self = this.set("environmentProviderOptions", null)
    @scala.inline
    def setFetchKey(value: String | Double): Self = this.set("fetchKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchKey: Self = this.set("fetchKey", js.undefined)
    @scala.inline
    def setFetchKeyNull: Self = this.set("fetchKey", null)
    @scala.inline
    def setSource(value: Observable[GraphQLResponse]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}

