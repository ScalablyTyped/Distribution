package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesignTagConfig extends js.Object {
  
  val delimeter: js.Tuple2[String, String] = js.native
}
object DesignTagConfig {
  
  @scala.inline
  def apply(delimeter: js.Tuple2[String, String]): DesignTagConfig = {
    val __obj = js.Dynamic.literal(delimeter = delimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignTagConfig]
  }
  
  @scala.inline
  implicit class DesignTagConfigOps[Self <: DesignTagConfig] (val x: Self) extends AnyVal {
    
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
    def setDelimeter(value: js.Tuple2[String, String]): Self = this.set("delimeter", value.asInstanceOf[js.Any])
  }
}
