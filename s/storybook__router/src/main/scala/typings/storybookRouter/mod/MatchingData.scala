package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingData extends StObject {
  
  var `match`: Null | typings.storybookRouter.anon.Path
}
object MatchingData {
  
  inline def apply(): MatchingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(null)
    __obj.asInstanceOf[MatchingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchingData] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: typings.storybookRouter.anon.Path): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchNull: Self = StObject.set(x, "match", null)
  }
}
