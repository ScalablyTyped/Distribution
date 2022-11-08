package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeOption extends StObject {
  
  var mode: js.UndefOr[Double | String] = js.undefined
}
object ModeOption {
  
  inline def apply(): ModeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeOption]
  }
  
  extension [Self <: ModeOption](x: Self) {
    
    inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
