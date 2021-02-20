package typings.stellarSdk

import org.scalablytyped.runtime.Shortcut
import typings.axios.mod.AxiosInstance
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizonAxiosClientMod extends Shortcut {
  
  @JSImport("stellar-sdk/lib/horizon_axios_client", JSImport.Default)
  @js.native
  val default: AxiosInstance = js.native
  
  @JSImport("stellar-sdk/lib/horizon_axios_client", "SERVER_TIME_MAP")
  @js.native
  val SERVER_TIME_MAP: Record[String, ServerTime] = js.native
  
  @JSImport("stellar-sdk/lib/horizon_axios_client", "getCurrentServerTime")
  @js.native
  def getCurrentServerTime(hostname: String): Double | Null = js.native
  
  @js.native
  trait ServerTime extends StObject {
    
    var localTimeRecorded: Double = js.native
    
    var serverTime: Double = js.native
  }
  object ServerTime {
    
    @scala.inline
    def apply(localTimeRecorded: Double, serverTime: Double): ServerTime = {
      val __obj = js.Dynamic.literal(localTimeRecorded = localTimeRecorded.asInstanceOf[js.Any], serverTime = serverTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTime]
    }
    
    @scala.inline
    implicit class ServerTimeMutableBuilder[Self <: ServerTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalTimeRecorded(value: Double): Self = StObject.set(x, "localTimeRecorded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerTime(value: Double): Self = StObject.set(x, "serverTime", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AxiosInstance
  
  /* This means you don't have to write `default`, but can instead just say `horizonAxiosClientMod.foo` */
  override def _to: AxiosInstance = default
}
