package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectMod {
  
  @JSImport("rxjs-compat/Subject", "Subject")
  @js.native
  open class Subject[T] ()
    extends typings.rxjs.mod.Subject[T]
  /* static members */
  object Subject {
    
    @JSImport("rxjs-compat/Subject", "Subject")
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
