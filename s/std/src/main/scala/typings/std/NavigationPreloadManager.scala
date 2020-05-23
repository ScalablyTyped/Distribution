package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[Unit]
  def enable(): js.Promise[Unit]
  def getState(): js.Promise[NavigationPreloadState]
  def setHeaderValue(value: java.lang.String): js.Promise[Unit]
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
}

