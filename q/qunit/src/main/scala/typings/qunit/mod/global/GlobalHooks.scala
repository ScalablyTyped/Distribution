package typings.qunit.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalHooks extends StObject {
  
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
  
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit
}
object GlobalHooks {
  
  inline def apply(
    afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit
  ): GlobalHooks = {
    val __obj = js.Dynamic.literal(afterEach = js.Any.fromFunction1(afterEach), beforeEach = js.Any.fromFunction1(beforeEach))
    __obj.asInstanceOf[GlobalHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalHooks] (val x: Self) extends AnyVal {
    
    inline def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction1(value))
    
    inline def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1(value))
  }
}
