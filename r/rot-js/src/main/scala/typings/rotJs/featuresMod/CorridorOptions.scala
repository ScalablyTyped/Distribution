package typings.rotJs.featuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorridorOptions extends js.Object {
  
  var corridorLength: js.Tuple2[Double, Double] = js.native
}
object CorridorOptions {
  
  @scala.inline
  def apply(corridorLength: js.Tuple2[Double, Double]): CorridorOptions = {
    val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorridorOptions]
  }
  
  @scala.inline
  implicit class CorridorOptionsOps[Self <: CorridorOptions] (val x: Self) extends AnyVal {
    
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
    def setCorridorLength(value: js.Tuple2[Double, Double]): Self = this.set("corridorLength", value.asInstanceOf[js.Any])
  }
}
