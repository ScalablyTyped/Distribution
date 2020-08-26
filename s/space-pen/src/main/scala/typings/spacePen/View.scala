package typings.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  def bindEventHandlers(view: View): Unit = js.native
  def buildHtml(params: js.Any): js.Any = js.native
  def command(commandName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
  def end(): js.Any = js.native
  // tag end
  def initialize(view: View, args: js.Any): Unit = js.native
  def preempt(eventName: js.Any, handler: js.Any): js.Any = js.native
  def pushStack(elems: js.Any): js.Any = js.native
  def wireOutlets(view: View): Unit = js.native
}

object View {
  @scala.inline
  def apply(
    bindEventHandlers: View => Unit,
    buildHtml: js.Any => js.Any,
    command: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    end: () => js.Any,
    initialize: (View, js.Any) => Unit,
    preempt: (js.Any, js.Any) => js.Any,
    pushStack: js.Any => js.Any,
    wireOutlets: View => Unit
  ): View = {
    val __obj = js.Dynamic.literal(bindEventHandlers = js.Any.fromFunction1(bindEventHandlers), buildHtml = js.Any.fromFunction1(buildHtml), command = js.Any.fromFunction4(command), end = js.Any.fromFunction0(end), initialize = js.Any.fromFunction2(initialize), preempt = js.Any.fromFunction2(preempt), pushStack = js.Any.fromFunction1(pushStack), wireOutlets = js.Any.fromFunction1(wireOutlets))
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
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
    def setBindEventHandlers(value: View => Unit): Self = this.set("bindEventHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def setBuildHtml(value: js.Any => js.Any): Self = this.set("buildHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setCommand(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("command", js.Any.fromFunction4(value))
    @scala.inline
    def setEnd(value: () => js.Any): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: (View, js.Any) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    @scala.inline
    def setPreempt(value: (js.Any, js.Any) => js.Any): Self = this.set("preempt", js.Any.fromFunction2(value))
    @scala.inline
    def setPushStack(value: js.Any => js.Any): Self = this.set("pushStack", js.Any.fromFunction1(value))
    @scala.inline
    def setWireOutlets(value: View => Unit): Self = this.set("wireOutlets", js.Any.fromFunction1(value))
  }
  
}

