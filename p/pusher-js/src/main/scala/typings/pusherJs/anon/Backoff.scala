package typings.pusherJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backoff extends js.Object {
  
  def backoff(): Unit = js.native
  
  def refused(): Unit = js.native
  
  def retry(): Unit = js.native
  
  def ssl_only(): Unit = js.native
}
object Backoff {
  
  @scala.inline
  def apply(backoff: () => Unit, refused: () => Unit, retry: () => Unit, ssl_only: () => Unit): Backoff = {
    val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
    __obj.asInstanceOf[Backoff]
  }
  
  @scala.inline
  implicit class BackoffOps[Self <: Backoff] (val x: Self) extends AnyVal {
    
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
    def setBackoff(value: () => Unit): Self = this.set("backoff", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefused(value: () => Unit): Self = this.set("refused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRetry(value: () => Unit): Self = this.set("retry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSsl_only(value: () => Unit): Self = this.set("ssl_only", js.Any.fromFunction0(value))
  }
}
