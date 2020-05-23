package typings.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  def bindEventHandlers(view: View): Unit
  def buildHtml(params: js.Any): js.Any
  def command(commandName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any
  def end(): js.Any
  // tag end
  def initialize(view: View, args: js.Any): Unit
  def preempt(eventName: js.Any, handler: js.Any): js.Any
  def pushStack(elems: js.Any): js.Any
  def wireOutlets(view: View): Unit
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
}

