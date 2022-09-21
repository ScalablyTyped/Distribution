package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalPresenceEventMap extends StObject {
  
  def error(error: Error): Unit
}
object LocalPresenceEventMap {
  
  inline def apply(error: Error => Unit): LocalPresenceEventMap = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[LocalPresenceEventMap]
  }
  
  extension [Self <: LocalPresenceEventMap](x: Self) {
    
    inline def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
  }
}
