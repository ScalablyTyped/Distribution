package typings.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rsocketTypes.anon.Kind
  - typings.rsocketTypes.anon.`0`
  - typings.rsocketTypes.anon.`1`
  - typings.rsocketTypes.anon.`2`
  - typings.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  inline def `0`(): typings.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTING")
    __obj.asInstanceOf[typings.rsocketTypes.anon.`0`]
  }
  
  inline def `1`(): typings.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTED")
    __obj.asInstanceOf[typings.rsocketTypes.anon.`1`]
  }
  
  inline def `2`(): typings.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = "CLOSED")
    __obj.asInstanceOf[typings.rsocketTypes.anon.`2`]
  }
  
  inline def Error(error: typings.std.Error): typings.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "ERROR")
    __obj.asInstanceOf[typings.rsocketTypes.anon.Error]
  }
  
  inline def Kind(): typings.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "NOT_CONNECTED")
    __obj.asInstanceOf[typings.rsocketTypes.anon.Kind]
  }
}
