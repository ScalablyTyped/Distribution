package typings.promClient.mod.Summary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
  		 * Configurable percentiles, values should never be greater than 1
  		 */
  var percentiles: js.UndefOr[js.Array[Double]] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setPercentilesVarargs(value: Double*): Self = this.set("percentiles", js.Array(value :_*))
    
    @scala.inline
    def setPercentiles(value: js.Array[Double]): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentiles: Self = this.set("percentiles", js.undefined)
  }
}
