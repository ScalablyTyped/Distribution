package typings.qunit.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedHooks extends js.Object {
  
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
  
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]): Unit = js.native
}
object NestedHooks {
  
  @scala.inline
  def apply(
    after: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    afterEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    before: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit,
    beforeEach: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit
  ): NestedHooks = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
    __obj.asInstanceOf[NestedHooks]
  }
  
  @scala.inline
  implicit class NestedHooksOps[Self <: NestedHooks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfter(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = this.set("afterEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEach(value: js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]] => Unit): Self = this.set("beforeEach", js.Any.fromFunction1(value))
  }
}
