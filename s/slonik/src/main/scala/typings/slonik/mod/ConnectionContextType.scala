package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionContextType extends StObject {
  
  /**
    * Unique connection ID
    */
  var connectionId: String = js.native
  
  var connectionType: ConnectionTypeType = js.native
  
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  def log(args: String*): scala.Nothing = js.native
  /**
    * Instance of Roarr logger with bound connection context parameters
    */
  @JSName("log")
  var log_Original: LoggerType = js.native
  
  /**
    * Unique connection pool ID
    */
  var poolId: String = js.native
}
