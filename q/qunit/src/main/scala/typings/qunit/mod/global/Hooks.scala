package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hooks extends StObject {
  
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
  
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.undefined
}
object Hooks {
  
  inline def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  
  extension [Self <: Hooks](x: Self) {
    
    inline def setAfter(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
    
    inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
    
    inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
