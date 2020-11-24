package typings.promClient.mod.Histogram

import typings.promClient.mod.LabelValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Internal[T /* <: String */] extends js.Object {
  
  /**
  		 * Observe value
  		 * @param value The value to observe
  		 */
  def observe(value: Double): Unit = js.native
  
  /**
  		 * Start a timer where the value in seconds will observed
  		 * @param labels Object with label keys and values
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit] = js.native
}
object Internal {
  
  @scala.inline
  def apply[T /* <: String */](
    observe: Double => Unit,
    startTimer: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]
  ): Internal[T] = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction1(observe), startTimer = js.Any.fromFunction0(startTimer))
    __obj.asInstanceOf[Internal[T]]
  }
  
  @scala.inline
  implicit class InternalOps[Self <: Internal[_], T /* <: String */] (val x: Self with Internal[T]) extends AnyVal {
    
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
    def setObserve(value: Double => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartTimer(value: () => js.Function1[/* labels */ js.UndefOr[LabelValues[T]], Unit]): Self = this.set("startTimer", js.Any.fromFunction0(value))
  }
}
