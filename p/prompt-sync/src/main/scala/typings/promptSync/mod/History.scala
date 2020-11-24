package typings.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait History extends js.Object {
  
  def atEnd(): Boolean = js.native
  
  def atPenultimate(): Boolean = js.native
  
  def atStart(): Boolean = js.native
  
  def next(): String = js.native
  
  def pastEnd(): Boolean = js.native
  
  def prev(): String = js.native
  
  def push(str: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def save(): Unit = js.native
}
object History {
  
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    atPenultimate: () => Boolean,
    atStart: () => Boolean,
    next: () => String,
    pastEnd: () => Boolean,
    prev: () => String,
    push: String => Unit,
    reset: () => Unit,
    save: () => Unit
  ): History = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), atPenultimate = js.Any.fromFunction0(atPenultimate), atStart = js.Any.fromFunction0(atStart), next = js.Any.fromFunction0(next), pastEnd = js.Any.fromFunction0(pastEnd), prev = js.Any.fromFunction0(prev), push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[History]
  }
  
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    
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
    def setAtEnd(value: () => Boolean): Self = this.set("atEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAtPenultimate(value: () => Boolean): Self = this.set("atPenultimate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAtStart(value: () => Boolean): Self = this.set("atStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => String): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPastEnd(value: () => Boolean): Self = this.set("pastEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => String): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: String => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
  }
}
