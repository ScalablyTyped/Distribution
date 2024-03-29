package typings.rsocketFlowable

import typings.rsocketFlowable.flowableMod.Source
import typings.rsocketFlowable.flowableMod.default
import typings.rsocketTypes.reactiveStreamTypesMod.IPublisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-flowable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-flowable", "Flowable")
  @js.native
  open class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object Flowable {
    
    @JSImport("rsocket-flowable", "Flowable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
    
    inline def just[U](values: U*): typings.rsocketFlowable.flowableMod.Flowable[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.rsocketFlowable.flowableMod.Flowable[U]]
    
    inline def never(): typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[typings.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
  }
  
  @JSImport("rsocket-flowable", "FlowableProcessor")
  @js.native
  open class FlowableProcessor[T, R] protected ()
    extends typings.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: IPublisher[T]) = this()
    def this(source: IPublisher[T], fn: js.Function1[/* a */ T, R]) = this()
  }
  
  @JSImport("rsocket-flowable", "Single")
  @js.native
  open class Single[T] protected ()
    extends typings.rsocketFlowable.singleMod.default[T] {
    def this(source: typings.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  object Single {
    
    @JSImport("rsocket-flowable", "Single")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): typings.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    inline def never(): typings.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[typings.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    inline def of[U](value: U): typings.rsocketFlowable.singleMod.Single[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rsocketFlowable.singleMod.Single[U]]
  }
  
  inline def every(ms: Double): default[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(ms.asInstanceOf[js.Any]).asInstanceOf[default[Double]]
}
