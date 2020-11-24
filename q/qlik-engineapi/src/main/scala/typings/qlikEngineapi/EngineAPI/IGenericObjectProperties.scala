package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectProperties width extend GenericProperties
  */
@js.native
trait IGenericObjectProperties extends IGenericProperties {
  
  var qExtendsId: js.UndefOr[String] = js.native
}
object IGenericObjectProperties {
  
  @scala.inline
  def apply(qInfo: INxInfo): IGenericObjectProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectProperties]
  }
  
  @scala.inline
  implicit class IGenericObjectPropertiesOps[Self <: IGenericObjectProperties] (val x: Self) extends AnyVal {
    
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
    def setQExtendsId(value: String): Self = this.set("qExtendsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQExtendsId: Self = this.set("qExtendsId", js.undefined)
  }
}
