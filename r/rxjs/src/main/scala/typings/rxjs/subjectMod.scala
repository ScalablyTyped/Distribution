package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.Observer
import typings.rxjs.internalTypesMod.SubscriptionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectMod {
  
  @JSImport("rxjs/dist/types/internal/Subject", "AnonymousSubject")
  @js.native
  open class AnonymousSubject[T] () extends Subject[T] {
    def this(/** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    destination: Observer[T]) = this()
    def this(
      /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    destination: Unit,
      source: Observable[T]
    ) = this()
    def this(
      /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    destination: Observer[T],
      source: Observable[T]
    ) = this()
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    var destination: js.UndefOr[Observer[T]] = js.native
  }
  
  @JSImport("rxjs/dist/types/internal/Subject", "Subject")
  @js.native
  open class Subject[T] ()
    extends Observable[T]
       with SubscriptionLike {
    
    /**
      * Creates a new Observable with this Subject as the source. You can do this
      * to create custom Observer-side logic of the Subject and conceal it from
      * code that uses the Observable.
      * @return {Observable} Observable that the Subject casts to
      */
    def asObservable(): Observable[T] = js.native
    
    /* CompleteClass */
    override val closed: Boolean = js.native
    
    def complete(): Unit = js.native
    
    /* private */ var currentObservers: Any = js.native
    
    def error(err: Any): Unit = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    var hasError: Boolean = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    var isStopped: Boolean = js.native
    
    def next(value: T): Unit = js.native
    
    def observed: Boolean = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    var observers: js.Array[Observer[T]] = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    var thrownError: Any = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  /* static members */
  object Subject {
    
    @JSImport("rxjs/dist/types/internal/Subject", "Subject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a "subject" by basically gluing an observer to an observable.
      *
      * @nocollapse
      * @deprecated Recommended you do not use. Will be removed at some point in the future. Plans for replacement still under discussion.
      */
    inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
}
