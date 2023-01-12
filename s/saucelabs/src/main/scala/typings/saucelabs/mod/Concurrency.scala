package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concurrency
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var concurrency: StringDictionary[OrgTeamConcurrencyValues]
  
  var timestamp: Double
}
object Concurrency {
  
  inline def apply(concurrency: StringDictionary[OrgTeamConcurrencyValues], timestamp: Double): Concurrency = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Concurrency] (val x: Self) extends AnyVal {
    
    inline def setConcurrency(value: StringDictionary[OrgTeamConcurrencyValues]): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
