package typings.rxjs

import typings.rxjs.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorSubjectMod {
  
  @JSImport("rxjs/internal/BehaviorSubject", "BehaviorSubject")
  @js.native
  class BehaviorSubject[T] protected () extends Subject[T] {
    def this(_value: T) = this()
    
    var _value: js.Any = js.native
    
    def getValue(): T = js.native
    
    val value: T = js.native
  }
}
