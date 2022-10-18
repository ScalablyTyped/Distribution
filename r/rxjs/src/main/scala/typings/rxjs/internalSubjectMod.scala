package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSubjectMod {
  
  @JSImport("rxjs/internal/Subject", "AnonymousSubject")
  @js.native
  open class AnonymousSubject[T] ()
    extends typings.rxjs.distTypesInternalSubjectMod.AnonymousSubject[T] {
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
  }
  
  @JSImport("rxjs/internal/Subject", "Subject")
  @js.native
  open class Subject[T] ()
    extends typings.rxjs.distTypesInternalSubjectMod.Subject[T]
  /* static members */
  object Subject {
    
    @JSImport("rxjs/internal/Subject", "Subject")
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
