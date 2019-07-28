package typings.rsocketDashFlowable.rsocketDashFlowableMod

import typings.rsocketDashFlowable.flowableProcessorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", "FlowableProcessor")
@js.native
class FlowableProcessor[T, R] protected () extends default[T, R] {
  def this(source: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
  def this(
    source: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
    fn: js.Function1[/* a */ T, R]
  ) = this()
}

