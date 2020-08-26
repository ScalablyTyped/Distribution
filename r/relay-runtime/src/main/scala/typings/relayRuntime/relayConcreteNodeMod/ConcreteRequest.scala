package typings.relayRuntime.relayConcreteNodeMod

import typings.relayRuntime.normalizationNodeMod.NormalizationOperation
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayModernGraphQLTagMod._GraphQLTaggedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcreteRequest
  extends GeneratedNode
     with _GraphQLTaggedNode {
   // 'Request';
  val fragment: ReaderFragment = js.native
  val kind: String = js.native
  val operation: NormalizationOperation = js.native
  val params: RequestParameters = js.native
}

object ConcreteRequest {
  @scala.inline
  def apply(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcreteRequest]
  }
  @scala.inline
  implicit class ConcreteRequestOps[Self <: ConcreteRequest] (val x: Self) extends AnyVal {
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
    def setFragment(value: ReaderFragment): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: NormalizationOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: RequestParameters): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

