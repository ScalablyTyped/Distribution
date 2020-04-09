package typings.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.initial
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.askingPermission
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.waiting
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.recognizing
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.finished
  - typings.reactInstantsearchDom.reactInstantsearchDomStrings.error
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def askingPermission: typings.reactInstantsearchDom.reactInstantsearchDomStrings.askingPermission = this.cast("askingPermission")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactInstantsearchDom.reactInstantsearchDomStrings.error = this.cast("error")
  @scala.inline
  def finished: typings.reactInstantsearchDom.reactInstantsearchDomStrings.finished = this.cast("finished")
  @scala.inline
  def initial: typings.reactInstantsearchDom.reactInstantsearchDomStrings.initial = this.cast("initial")
  @scala.inline
  def recognizing: typings.reactInstantsearchDom.reactInstantsearchDomStrings.recognizing = this.cast("recognizing")
  @scala.inline
  def waiting: typings.reactInstantsearchDom.reactInstantsearchDomStrings.waiting = this.cast("waiting")
}

