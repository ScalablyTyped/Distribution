package typings.rxCore.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduler extends js.Object {
  
  def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
  
  def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler = js.native
}
object IScheduler {
  
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, Boolean] => IScheduler,
    catchException: js.Function1[/* exception */ js.Any, Boolean] => IScheduler
  ): IScheduler = {
    val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[IScheduler]
  }
  
  @scala.inline
  implicit class ISchedulerOps[Self <: IScheduler] (val x: Self) extends AnyVal {
    
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
    def setCatch(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = this.set("catch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCatchException(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = this.set("catchException", js.Any.fromFunction1(value))
  }
}
