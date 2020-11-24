package typings.rotJs.cellularMod

import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var born: js.Array[Double] = js.native
  
  var survive: js.Array[Double] = js.native
  
  var topology: `4` | `6` | `8` = js.native
}
object Options {
  
  @scala.inline
  def apply(born: js.Array[Double], survive: js.Array[Double], topology: `4` | `6` | `8`): Options = {
    val __obj = js.Dynamic.literal(born = born.asInstanceOf[js.Any], survive = survive.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setSurviveVarargs(value: Double*): Self = this.set("survive", js.Array(value :_*))
    
    @scala.inline
    def setSurvive(value: js.Array[Double]): Self = this.set("survive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopology(value: `4` | `6` | `8`): Self = this.set("topology", value.asInstanceOf[js.Any])
  }
}
