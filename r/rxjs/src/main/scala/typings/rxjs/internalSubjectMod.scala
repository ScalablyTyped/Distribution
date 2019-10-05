package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalSubjectMod.Subject
import typings.rxjs.internalSubscriberMod.Subscriber
import typings.rxjs.internalTypesMod.Observer
import typings.rxjs.internalTypesMod.SubscriptionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", JSImport.Namespace)
@js.native
object internalSubjectMod extends js.Object {
  @js.native
  class AnonymousSubject[T] () extends Subject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: Observer[T], source: Observable[T]) = this()
    var destination: js.UndefOr[Observer[T]] = js.native
  }
  
  @js.native
  class Subject[T] ()
    extends Observable[T]
       with SubscriptionLike {
    /* CompleteClass */
    override val closed: Boolean = js.native
    var hasError: Boolean = js.native
    var isStopped: Boolean = js.native
    var observers: js.Array[Observer[T]] = js.native
    var thrownError: js.Any = js.native
    /**
      * Creates a new Observable with this Subject as the source. You can do this
      * to create customize Observer-side logic of the Subject and conceal it from
      * code that uses the Observable.
      * @return {Observable} Observable that the Subject casts to
      */
    def asObservable(): Observable[T] = js.native
    def complete(): Unit = js.native
    def error(err: js.Any): Unit = js.native
    def next(): Unit = js.native
    def next(value: T): Unit = js.native
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  
  @js.native
  class SubjectSubscriber[T] protected () extends Subscriber[T] {
    def this(destination: Subject[T]) = this()
    @JSName("destination")
    var destination_SubjectSubscriber: Subject[T] = js.native
  }
  
  /* static members */
  @js.native
  object Subject extends js.Object {
    /**@nocollapse
      * @deprecated use new Subject() instead
      */
    var create: js.Function = js.native
  }
  
}

