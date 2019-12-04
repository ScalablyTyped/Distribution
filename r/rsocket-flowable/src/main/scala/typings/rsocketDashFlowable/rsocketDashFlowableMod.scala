package typings.rsocketDashFlowable

import typings.rsocketDashFlowable.flowableMod.Source
import typings.rsocketDashFlowable.flowableMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", JSImport.Namespace)
@js.native
object rsocketDashFlowableMod extends js.Object {
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends typings.rsocketDashFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @js.native
  class Single[T] protected ()
    extends typings.rsocketDashFlowable.singleMod.default[T] {
    def this(source: typings.rsocketDashFlowable.singleMod.Source[T]) = this()
  }
  
  def every(ms: Double): default[Double] = js.native
  /* static members */
  @js.native
  object Flowable extends js.Object {
    def error(error: Error): typings.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
    def just[U](values: U*): typings.rsocketDashFlowable.flowableMod.Flowable[U] = js.native
    def never(): typings.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
  }
  
  /* static members */
  @js.native
  object Single extends js.Object {
    def error(error: Error): typings.rsocketDashFlowable.singleMod.Single[js.Object] = js.native
    def of[U](value: U): typings.rsocketDashFlowable.singleMod.Single[U] = js.native
  }
  
}

