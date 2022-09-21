package typings.rxjs

import typings.rxjs.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorSubjectMod {
  
  @JSImport("rxjs/dist/types/internal/BehaviorSubject", "BehaviorSubject")
  @js.native
  open class BehaviorSubject[T] protected () extends Subject[T] {
    def this(_value: T) = this()
    
    /* private */ var _value: Any = js.native
    
    def getValue(): T = js.native
    
    def value: T = js.native
  }
}
