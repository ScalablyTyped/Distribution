package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericProperties
  */
@js.native
trait IGenericProperties
  extends // ?Dynamic properties?
/* qMetaDef */ StringDictionary[js.Any] {
  
  /**
    * Identifier and type of the object.
    * >> This parameter is mandatory.
    */
  var qInfo: INxInfo = js.native
}
object IGenericProperties {
  
  @scala.inline
  def apply(qInfo: INxInfo): IGenericProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericProperties]
  }
  
  @scala.inline
  implicit class IGenericPropertiesMutableBuilder[Self <: IGenericProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
