package typings.streamingIterables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeConfig extends js.Object {
  
  var progress: js.UndefOr[
    js.Function2[/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double], _]
  ] = js.native
  
  var total: js.UndefOr[js.Function1[/* time */ js.Tuple2[Double, Double], _]] = js.native
}
object TimeConfig {
  
  @scala.inline
  def apply(): TimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeConfig]
  }
  
  @scala.inline
  implicit class TimeConfigOps[Self <: TimeConfig] (val x: Self) extends AnyVal {
    
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
    def setProgress(value: (/* delta */ js.Tuple2[Double, Double], /* total */ js.Tuple2[Double, Double]) => _): Self = this.set("progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setTotal(value: /* time */ js.Tuple2[Double, Double] => _): Self = this.set("total", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
