package typings.rxjs

import typings.rxjs.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncSubjectMod {
  
  @JSImport("rxjs/internal/AsyncSubject", "AsyncSubject")
  @js.native
  class AsyncSubject[T] () extends Subject[T] {
    
    var hasCompleted: js.Any = js.native
    
    var hasNext: js.Any = js.native
    
    var value: js.Any = js.native
  }
}
