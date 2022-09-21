package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("pulsar-client", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  /* 0 */ val DEBUG: typings.pulsarClient.mod.LogLevel.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  /* 3 */ val ERROR: typings.pulsarClient.mod.LogLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  /* 1 */ val INFO: typings.pulsarClient.mod.LogLevel.INFO & Double = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
  /* 2 */ val WARN: typings.pulsarClient.mod.LogLevel.WARN & Double = js.native
}
