package typings.rsocketFlowable

import typings.rsocketTypes.reactiveStreamTypesMod.IPublisher
import typings.rsocketTypes.reactiveStreamTypesMod.ISubscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowableMod {
  
  @JSImport("rsocket-flowable/Flowable", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Flowable[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rsocket-flowable/Flowable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[Flowable[scala.Nothing]]
    
    inline def just[U](values: U*): Flowable[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Flowable[U]]
    
    inline def never(): Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Flowable[scala.Nothing]]
  }
  
  @js.native
  trait Flowable[T]
    extends StObject
       with IPublisher[T] {
    
    def lift[R](onSubscribeLift: js.Function1[/* subscriber */ ISubscriber[R], ISubscriber[T]]): Flowable[R] = js.native
    
    def subscribe(subscriberOrCallback: js.Function1[/* a */ T, Unit]): Unit = js.native
    
    def take(toTake: Double): Flowable[T] = js.native
  }
  
  type Source[T] = js.Function1[/* subscriber */ ISubscriber[T], Unit]
}
