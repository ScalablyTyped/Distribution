package typings.reactRelay.mod

import typings.react.mod.ReactNode
import typings.reactRelay.anon.Error
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment = js.native
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.native
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any = js.native
  def render(renderProps: Error[TOperation]): ReactNode = js.native
}

object QueryRendererProps {
  @scala.inline
  def apply[/* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TOperation](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    render: Error[TOperation] => ReactNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
  @scala.inline
  implicit class QueryRendererPropsOps[Self <: QueryRendererProps[_], /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TOperation] (val x: Self with QueryRendererProps[TOperation]) extends AnyVal {
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
    def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: Error[TOperation] => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = this.set("query", js.Any.fromFunction0(value))
    @scala.inline
    def setQuery(value: GraphQLTaggedNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
  }
  
}

