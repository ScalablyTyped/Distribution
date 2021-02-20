package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
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
  implicit class IGenericObjectPropertiesMutableBuilder[Self <: IGenericObjectProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExtendsId(value: String): Self = StObject.set(x, "qExtendsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExtendsIdUndefined: Self = StObject.set(x, "qExtendsId", js.undefined)
  }
}
