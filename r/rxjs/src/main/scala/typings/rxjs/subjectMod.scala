package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.Observer
import typings.rxjs.typesMod.SubscriptionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectMod {
  
  @JSImport("rxjs/internal/Subject", "AnonymousSubject")
  @js.native
  class AnonymousSubject[T] () extends Subject[T] {
    def this(destination: Observer[T]) = this()
    def this(destination: Unit, source: Observable[T]) = this()
    def this(destination: Observer[T], source: Observable[T]) = this()
    
    var destination: js.UndefOr[Observer[T]] = js.native
  }
  
  @JSImport("rxjs/internal/Subject", "Subject")
  @js.native
  class Subject[T] ()
    extends Observable[T]
       with SubscriptionLike {
    
    /**
      * Creates a new Observable with this Subject as the source. You can do this
      * to create customize Observer-side logic of the Subject and conceal it from
      * code that uses the Observable.
      * @return {Observable} Observable that the Subject casts to
      */
    def asObservable(): Observable[T] = js.native
    
    /* CompleteClass */
    override val closed: Boolean = js.native
    
    def complete(): Unit = js.native
    
    def error(err: js.Any): Unit = js.native
    
    var hasError: Boolean = js.native
    
    var isStopped: Boolean = js.native
    
    def next(): Unit = js.native
    def next(value: T): Unit = js.native
    
    var observers: js.Array[Observer[T]] = js.native
    
    var thrownError: js.Any = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  /* static members */
  object Subject {
    
    @JSImport("rxjs/internal/Subject", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    /**@nocollapse
      * @deprecated use new Subject() instead
      */
    @JSImport("rxjs/internal/Subject", "Subject.create")
    @js.native
    def create: js.Function = js.native
    @scala.inline
    def create_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/Subject", "SubjectSubscriber")
  @js.native
  class SubjectSubscriber[T] protected () extends Subscriber[T] {
    def this(destination: Subject[T]) = this()
    
    @JSName("destination")
    var destination_SubjectSubscriber: Subject[T] = js.native
  }
}
