package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofForecastQueryServic extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofForecastQueryServic {
  
  @scala.inline
  def apply(Types: TypeofForecastQueryServic): TypeofForecastQueryServic = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofForecastQueryServic]
  }
  
  @scala.inline
  implicit class TypeofForecastQueryServicOps[Self <: TypeofForecastQueryServic] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofForecastQueryServic): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
