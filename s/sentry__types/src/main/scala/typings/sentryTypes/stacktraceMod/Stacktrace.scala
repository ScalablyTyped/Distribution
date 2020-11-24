package typings.sentryTypes.stacktraceMod

import typings.sentryTypes.stackframeMod.StackFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stacktrace extends js.Object {
  
  var frames: js.UndefOr[js.Array[StackFrame]] = js.native
  
  var frames_omitted: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object Stacktrace {
  
  @scala.inline
  def apply(): Stacktrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stacktrace]
  }
  
  @scala.inline
  implicit class StacktraceOps[Self <: Stacktrace] (val x: Self) extends AnyVal {
    
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
    def setFramesVarargs(value: StackFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[StackFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setFrames_omitted(value: js.Tuple2[Double, Double]): Self = this.set("frames_omitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames_omitted: Self = this.set("frames_omitted", js.undefined)
  }
}
