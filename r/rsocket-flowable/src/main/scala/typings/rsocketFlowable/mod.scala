package typings.rsocketFlowable

import typings.rsocketFlowable.flowableMod.Source
import typings.rsocketFlowable.flowableMod.default
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-flowable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def every(ms: Double): default[Double] = js.native
  
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  @js.native
  object Flowable extends js.Object {
    
    def error(error: Error): typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
    
    def just[U](values: U*): typings.rsocketFlowable.flowableMod.Flowable[U] = js.native
    
    def never(): typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
  }
  
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends typings.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @js.native
  class Single[T] protected ()
    extends typings.rsocketFlowable.singleMod.default[T] {
    def this(source: typings.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  @js.native
  object Single extends js.Object {
    
    def error(error: Error): typings.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    def never(): typings.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    def of[U](value: U): typings.rsocketFlowable.singleMod.Single[U] = js.native
  }
}
