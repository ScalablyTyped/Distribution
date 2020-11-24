package typings.rotJs.anon

import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rot-js.rot-js/lib/map/cellular.Options> */
@js.native
trait PartialOptionsBorn extends js.Object {
  
  var born: js.UndefOr[js.Array[Double]] = js.native
  
  var survive: js.UndefOr[js.Array[Double]] = js.native
  
  var topology: js.UndefOr[`4` | `6` | `8`] = js.native
}
object PartialOptionsBorn {
  
  @scala.inline
  def apply(): PartialOptionsBorn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsBorn]
  }
  
  @scala.inline
  implicit class PartialOptionsBornOps[Self <: PartialOptionsBorn] (val x: Self) extends AnyVal {
    
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
    def setBornVarargs(value: Double*): Self = this.set("born", js.Array(value :_*))
    
    @scala.inline
    def setBorn(value: js.Array[Double]): Self = this.set("born", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorn: Self = this.set("born", js.undefined)
    
    @scala.inline
    def setSurviveVarargs(value: Double*): Self = this.set("survive", js.Array(value :_*))
    
    @scala.inline
    def setSurvive(value: js.Array[Double]): Self = this.set("survive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurvive: Self = this.set("survive", js.undefined)
    
    @scala.inline
    def setTopology(value: `4` | `6` | `8`): Self = this.set("topology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopology: Self = this.set("topology", js.undefined)
  }
}
