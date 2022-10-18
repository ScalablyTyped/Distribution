package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableConnectableObservableMod {
  
  @JSImport("rxjs-compat/observable/ConnectableObservable", "ConnectableObservable")
  @js.native
  open class ConnectableObservable[T] protected ()
    extends typings.rxjs.mod.ConnectableObservable[T] {
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
  }
}
