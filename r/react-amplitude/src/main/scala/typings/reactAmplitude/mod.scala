package typings.reactAmplitude

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-amplitude", JSImport.Default)
  @js.native
  val default: AmplitudeInstance = js.native
  
  @js.native
  trait AmplitudeInstance extends StObject {
    
    def amplitude(): Unit = js.native
    
    def clearUserProperties(): Unit = js.native
    
    def getSessionId(): Unit = js.native
    
    def identify(idObj: Any, cb: js.Function0[Unit]): Unit = js.native
    
    def init(apiKey: String): Unit = js.native
    def init(apiKey: String, userId: String): Unit = js.native
    def init(apiKey: String, userId: String, config: Any): Unit = js.native
    def init(apiKey: String, userId: String, config: Any, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: String, config: Unit, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Any): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Any, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Unit, cb: js.Function0[Unit]): Unit = js.native
    
    def isNewSession(): Unit = js.native
    
    def logEvent(eventType: String, eventProperties: js.Object, cb: js.Function0[Unit]): Unit = js.native
    
    def logEventWithTimestamp(eventType: String, eventProperties: js.Object, timestamp: Double, cb: js.Function0[Unit]): Unit = js.native
    
    def resetUserId(): Unit = js.native
    
    def setUserId(userId: String): Unit = js.native
    
    def setUserProperties(userProps: Any): Unit = js.native
  }
  
  type _To = AmplitudeInstance
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AmplitudeInstance = default
}
