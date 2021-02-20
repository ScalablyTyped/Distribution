package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concurrency
  extends /* key */ StringDictionary[js.Any] {
  
  var concurrency: StringDictionary[OrgTeamConcurrencyValues] = js.native
  
  var timestamp: Double = js.native
}
object Concurrency {
  
  @scala.inline
  def apply(concurrency: StringDictionary[OrgTeamConcurrencyValues], timestamp: Double): Concurrency = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrency]
  }
  
  @scala.inline
  implicit class ConcurrencyMutableBuilder[Self <: Concurrency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrency(value: StringDictionary[OrgTeamConcurrencyValues]): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
