package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriptionMod.Subscription
import typings.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectableObservableMod {
  
  @JSImport("rxjs/internal/observable/ConnectableObservable", "ConnectableObservable")
  @js.native
  class ConnectableObservable[T] protected () extends Observable[T] {
    def this(source: Observable[T], subjectFactory: js.Function0[Subject[T]]) = this()
    
    /* protected */ var _connection: Subscription = js.native
    
    /** @internal */
    var _isComplete: Boolean = js.native
    
    /* protected */ var _refCount: Double = js.native
    
    /* protected */ var _subject: Subject[T] = js.native
    
    def connect(): Subscription = js.native
    
    /* protected */ def getSubject(): Subject[T] = js.native
    
    def refCount(): Observable[T] = js.native
    
    @JSName("source")
    var source_ConnectableObservable: Observable[T] = js.native
    
    /* protected */ def subjectFactory(): Subject[T] = js.native
  }
  
  @JSImport("rxjs/internal/observable/ConnectableObservable", "connectableObservableDescriptor")
  @js.native
  val connectableObservableDescriptor: PropertyDescriptorMap = js.native
}
