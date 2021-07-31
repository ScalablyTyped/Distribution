package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandCountStats
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var all: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[Double] = js.undefined
}
object CommandCountStats {
  
  @scala.inline
  def apply(): CommandCountStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandCountStats]
  }
  
  @scala.inline
  implicit class CommandCountStatsMutableBuilder[Self <: CommandCountStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
