package typings.rotJs.lightingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Cells with emissivity > threshold will be treated as light source in the next pass. Default = 100 */
  var emissionThreshold: Double = js.native
  
  /** Number of passes. 1 equals to simple FOV of all light sources, >1 means a *highly simplified* radiosity-like algorithm. Default = 1 */
  var passes: Double = js.native
  
  /** Max light range, default = 10 */
  var range: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(emissionThreshold: Double, passes: Double, range: Double): Options = {
    val __obj = js.Dynamic.literal(emissionThreshold = emissionThreshold.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
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
    def setEmissionThreshold(value: Double): Self = this.set("emissionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasses(value: Double): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
