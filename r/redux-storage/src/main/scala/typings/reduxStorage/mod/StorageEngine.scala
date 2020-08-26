package typings.reduxStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageEngine extends js.Object {
  /**
    * Load
    */
  def load(): js.Thenable[_] = js.native
  /**
    * Save
    * @param state
    */
  def save(state: js.Any): js.Thenable[_] = js.native
}

object StorageEngine {
  @scala.inline
  def apply(load: () => js.Thenable[_], save: js.Any => js.Thenable[_]): StorageEngine = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[StorageEngine]
  }
  @scala.inline
  implicit class StorageEngineOps[Self <: StorageEngine] (val x: Self) extends AnyVal {
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
    def setLoad(value: () => js.Thenable[_]): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: js.Any => js.Thenable[_]): Self = this.set("save", js.Any.fromFunction1(value))
  }
  
}

