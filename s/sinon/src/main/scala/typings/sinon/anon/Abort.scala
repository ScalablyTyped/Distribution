package typings.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends js.Object {
  
  var abort: js.Array[_] = js.native
  
  var error: js.Array[_] = js.native
  
  var load: js.Array[_] = js.native
  
  var progress: js.Array[_] = js.native
}
object Abort {
  
  @scala.inline
  def apply(abort: js.Array[_], error: js.Array[_], load: js.Array[_], progress: js.Array[_]): Abort = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortOps[Self <: Abort] (val x: Self) extends AnyVal {
    
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
    def setAbortVarargs(value: js.Any*): Self = this.set("abort", js.Array(value :_*))
    
    @scala.inline
    def setAbort(value: js.Array[_]): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorVarargs(value: js.Any*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: js.Array[_]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadVarargs(value: js.Any*): Self = this.set("load", js.Array(value :_*))
    
    @scala.inline
    def setLoad(value: js.Array[_]): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressVarargs(value: js.Any*): Self = this.set("progress", js.Array(value :_*))
    
    @scala.inline
    def setProgress(value: js.Array[_]): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
}
