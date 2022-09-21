package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectableObservableMod {
  
  @JSImport("rxjs/dist/types/internal/observable/ConnectableObservable", "ConnectableObservable")
  @js.native
  open class ConnectableObservable[T] protected () extends Observable[T] {
    /**
      * @param source The source observable
      * @param subjectFactory The factory that creates the subject used internally.
      * @deprecated Will be removed in v8. Use {@link connectable} to create a connectable observable.
      * `new ConnectableObservable(source, factory)` is equivalent to
      * `connectable(source, { connector: factory })`.
      * When the `refCount()` method is needed, the {@link share} operator should be used instead:
      * `new ConnectableObservable(source, factory).refCount()` is equivalent to
      * `source.pipe(share({ connector: factory }))`.
      * Details: https://rxjs.dev/deprecations/multicasting
      */
    def this(source: Observable[T], subjectFactory: js.Function0[Subject[T]]) = this()
    
    /* protected */ var _connection: Subscription | Null = js.native
    
    /* protected */ var _refCount: Double = js.native
    
    /* protected */ var _subject: Subject[T] | Null = js.native
    
    /* protected */ def _teardown(): Unit = js.native
    
    /**
      * @deprecated {@link ConnectableObservable} will be removed in v8. Use {@link connectable} instead.
      * Details: https://rxjs.dev/deprecations/multicasting
      */
    def connect(): Subscription = js.native
    
    /* protected */ def getSubject(): Subject[T] = js.native
    
    /**
      * @deprecated {@link ConnectableObservable} will be removed in v8. Use the {@link share} operator instead.
      * Details: https://rxjs.dev/deprecations/multicasting
      */
    def refCount(): Observable[T] = js.native
    
    @JSName("source")
    var source_ConnectableObservable: Observable[T] = js.native
    
    /* protected */ def subjectFactory(): Subject[T] = js.native
  }
}
