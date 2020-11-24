package typings.prex.cancellationMod

import typings.prex.prexStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortSignalLike extends js.Object {
  
  val aborted: Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, callback: js.Function0[_]): js.Any = js.native
}
object AbortSignalLike {
  
  @scala.inline
  def apply(aborted: Boolean, addEventListener: (abort, js.Function0[_]) => js.Any): AbortSignalLike = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener))
    __obj.asInstanceOf[AbortSignalLike]
  }
  
  @scala.inline
  implicit class AbortSignalLikeOps[Self <: AbortSignalLike] (val x: Self) extends AnyVal {
    
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
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEventListener(value: (abort, js.Function0[_]) => js.Any): Self = this.set("addEventListener", js.Any.fromFunction2(value))
  }
}
