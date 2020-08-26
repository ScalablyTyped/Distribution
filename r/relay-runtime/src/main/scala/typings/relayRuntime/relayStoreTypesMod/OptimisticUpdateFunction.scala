package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticUpdateFunction extends OptimisticUpdate {
  def storeUpdater(store: RecordSourceProxy): Unit = js.native
}

object OptimisticUpdateFunction {
  @scala.inline
  def apply(storeUpdater: RecordSourceProxy => Unit): OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[OptimisticUpdateFunction]
  }
  @scala.inline
  implicit class OptimisticUpdateFunctionOps[Self <: OptimisticUpdateFunction] (val x: Self) extends AnyVal {
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
    def setStoreUpdater(value: RecordSourceProxy => Unit): Self = this.set("storeUpdater", js.Any.fromFunction1(value))
  }
  
}

