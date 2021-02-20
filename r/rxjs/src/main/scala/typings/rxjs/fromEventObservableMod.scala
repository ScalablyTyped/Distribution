package typings.rxjs

import typings.std.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs/observable/FromEventObservable", "FromEventObservable")
  @js.native
  class FromEventObservable[T] ()
    extends typings.rxjsCompat.fromEventObservableMod.FromEventObservable[T]
  /* static members */
  object FromEventObservable {
    
    @JSImport("rxjs/observable/FromEventObservable", "FromEventObservable.create")
    @js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String
    ): js.Any = js.native
    @JSImport("rxjs/observable/FromEventObservable", "FromEventObservable.create")
    @js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions
    ): js.Any = js.native
    @JSImport("rxjs/observable/FromEventObservable", "FromEventObservable.create")
    @js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      options: EventListenerOptions,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
    @JSImport("rxjs/observable/FromEventObservable", "FromEventObservable.create")
    @js.native
    def create[T](
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventTargetLike<T> */ js.Any,
      eventName: String,
      selector: js.Function1[/* repeated */ js.Any, T]
    ): js.Any = js.native
  }
}
