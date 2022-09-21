package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependenciesUpdateInfo
  extends StObject
     with NotifyInfo {
  
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath]
  
  var `type`: dependenciesUpdate
}
object DependenciesUpdateInfo {
  
  inline def apply(relatedFields: js.Array[InternalNamePath]): DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[DependenciesUpdateInfo]
  }
  
  extension [Self <: DependenciesUpdateInfo](x: Self) {
    
    inline def setRelatedFields(value: js.Array[InternalNamePath]): Self = StObject.set(x, "relatedFields", value.asInstanceOf[js.Any])
    
    inline def setRelatedFieldsVarargs(value: InternalNamePath*): Self = StObject.set(x, "relatedFields", js.Array(value*))
    
    inline def setType(value: dependenciesUpdate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
