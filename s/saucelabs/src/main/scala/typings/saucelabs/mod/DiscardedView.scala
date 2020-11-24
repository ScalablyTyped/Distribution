package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscardedView
  extends /* key */ StringDictionary[js.Any] {
  
  var job_ids: js.UndefOr[js.Array[String]] = js.native
}
object DiscardedView {
  
  @scala.inline
  def apply(): DiscardedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscardedView]
  }
  
  @scala.inline
  implicit class DiscardedViewOps[Self <: DiscardedView] (val x: Self) extends AnyVal {
    
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
    def setJob_idsVarargs(value: String*): Self = this.set("job_ids", js.Array(value :_*))
    
    @scala.inline
    def setJob_ids(value: js.Array[String]): Self = this.set("job_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_ids: Self = this.set("job_ids", js.undefined)
  }
}
