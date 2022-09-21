package typings.rxjs

import typings.rxjs.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncSubjectMod {
  
  @JSImport("rxjs/dist/types/internal/AsyncSubject", "AsyncSubject")
  @js.native
  open class AsyncSubject[T] () extends Subject[T] {
    
    /* private */ var _hasValue: Any = js.native
    
    /* private */ var _isComplete: Any = js.native
    
    /* private */ var _value: Any = js.native
  }
}
