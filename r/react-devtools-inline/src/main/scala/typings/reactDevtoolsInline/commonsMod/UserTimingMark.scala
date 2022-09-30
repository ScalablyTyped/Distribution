package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTimingMark extends StObject {
  
  var name: String
  
  var timestamp: Milliseconds
}
object UserTimingMark {
  
  inline def apply(name: String, timestamp: Milliseconds): UserTimingMark = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserTimingMark]
  }
  
  extension [Self <: UserTimingMark](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Milliseconds): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
