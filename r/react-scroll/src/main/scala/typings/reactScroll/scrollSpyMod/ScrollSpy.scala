package typings.reactScroll.scrollSpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSpy extends js.Object {
  var scrollSpyContainers: js.Array[_] = js.native
  var spyCallbacks: js.Array[_] = js.native
  var spySetState: js.Array[_] = js.native
  def addSpyHandler(handler: js.Any, scrollSpyContainer: js.Any): Unit = js.native
  def addStateHandler(handler: js.Any): Unit = js.native
  def currentPositionY(scrollSpyContainer: js.Any): Double = js.native
  def isMounted(scrollSpyContainer: js.Any): Boolean = js.native
  def mount(scrollSpyContainer: js.Any): Unit = js.native
  def scrollHandler(scrollSpyContainer: js.Any): Unit = js.native
  def unmount(stateHandler: js.Any, spyHandler: js.Any): Unit = js.native
  def update(): Unit = js.native
  def updateStates(): Unit = js.native
}

object ScrollSpy {
  @scala.inline
  def apply(
    addSpyHandler: (js.Any, js.Any) => Unit,
    addStateHandler: js.Any => Unit,
    currentPositionY: js.Any => Double,
    isMounted: js.Any => Boolean,
    mount: js.Any => Unit,
    scrollHandler: js.Any => Unit,
    scrollSpyContainers: js.Array[_],
    spyCallbacks: js.Array[_],
    spySetState: js.Array[_],
    unmount: (js.Any, js.Any) => Unit,
    update: () => Unit,
    updateStates: () => Unit
  ): ScrollSpy = {
    val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2(addSpyHandler), addStateHandler = js.Any.fromFunction1(addStateHandler), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1(mount), scrollHandler = js.Any.fromFunction1(scrollHandler), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2(unmount), update = js.Any.fromFunction0(update), updateStates = js.Any.fromFunction0(updateStates))
    __obj.asInstanceOf[ScrollSpy]
  }
  @scala.inline
  implicit class ScrollSpyOps[Self <: ScrollSpy] (val x: Self) extends AnyVal {
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
    def setAddSpyHandler(value: (js.Any, js.Any) => Unit): Self = this.set("addSpyHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setAddStateHandler(value: js.Any => Unit): Self = this.set("addStateHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentPositionY(value: js.Any => Double): Self = this.set("currentPositionY", js.Any.fromFunction1(value))
    @scala.inline
    def setIsMounted(value: js.Any => Boolean): Self = this.set("isMounted", js.Any.fromFunction1(value))
    @scala.inline
    def setMount(value: js.Any => Unit): Self = this.set("mount", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollHandler(value: js.Any => Unit): Self = this.set("scrollHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollSpyContainersVarargs(value: js.Any*): Self = this.set("scrollSpyContainers", js.Array(value :_*))
    @scala.inline
    def setScrollSpyContainers(value: js.Array[_]): Self = this.set("scrollSpyContainers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpyCallbacksVarargs(value: js.Any*): Self = this.set("spyCallbacks", js.Array(value :_*))
    @scala.inline
    def setSpyCallbacks(value: js.Array[_]): Self = this.set("spyCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpySetStateVarargs(value: js.Any*): Self = this.set("spySetState", js.Array(value :_*))
    @scala.inline
    def setSpySetState(value: js.Array[_]): Self = this.set("spySetState", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmount(value: (js.Any, js.Any) => Unit): Self = this.set("unmount", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateStates(value: () => Unit): Self = this.set("updateStates", js.Any.fromFunction0(value))
  }
  
}

