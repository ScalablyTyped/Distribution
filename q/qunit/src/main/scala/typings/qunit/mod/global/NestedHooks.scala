package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedHooks extends StObject {
  
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
}
object NestedHooks {
  
  inline def apply(
    after: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    before: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit
  ): NestedHooks = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
    __obj.asInstanceOf[NestedHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedHooks] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
    
    inline def setBefore(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
  }
}
