package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import typings.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalTestingColdObservableMod {
  
  @JSImport("rxjs/internal/testing/ColdObservable", "ColdObservable")
  @js.native
  open class ColdObservable[T] protected ()
    extends typings.rxjs.distTypesInternalTestingColdObservableMod.ColdObservable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
  }
}
