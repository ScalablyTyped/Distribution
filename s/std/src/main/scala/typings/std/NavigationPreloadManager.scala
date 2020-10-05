package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[Unit] = js.native
  def enable(): js.Promise[Unit] = js.native
  def getState(): js.Promise[NavigationPreloadState] = js.native
  def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}

object NavigationPreloadManager {
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getState: () => js.Promise[NavigationPreloadState],
    setHeaderValue: java.lang.String => js.Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  @scala.inline
  implicit class NavigationPreloadManagerOps[Self <: NavigationPreloadManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => js.Promise[NavigationPreloadState]): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setSetHeaderValue(value: java.lang.String => js.Promise[Unit]): Self = this.set("setHeaderValue", js.Any.fromFunction1(value))
  }
  
}

