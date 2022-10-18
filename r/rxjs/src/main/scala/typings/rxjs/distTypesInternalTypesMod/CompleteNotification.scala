package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.rxjsStrings.C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteNotification
  extends StObject
     with ObservableNotification[Any] {
  
  var kind: C
}
object CompleteNotification {
  
  inline def apply(): CompleteNotification = {
    val __obj = js.Dynamic.literal(kind = "C")
    __obj.asInstanceOf[CompleteNotification]
  }
  
  extension [Self <: CompleteNotification](x: Self) {
    
    inline def setKind(value: C): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
