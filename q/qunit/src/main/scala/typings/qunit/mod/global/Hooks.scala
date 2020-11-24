package typings.qunit.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hooks extends js.Object {
  
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
}
object Hooks {
  
  @scala.inline
  def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = this.set("afterEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    
    @scala.inline
    def setBefore(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = this.set("beforeEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
  }
}
