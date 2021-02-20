package typings.reactAmplitude

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    def identify(idObj: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def init(apiKey: String): Unit = js.native
    def init(
      apiKey: String,
      userId: js.UndefOr[scala.Nothing],
      config: js.UndefOr[scala.Nothing],
      cb: js.Function0[Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: js.UndefOr[scala.Nothing], config: js.Any): Unit = js.native
    def init(apiKey: String, userId: js.UndefOr[scala.Nothing], config: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: String): Unit = js.native
    def init(apiKey: String, userId: String, config: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def init(apiKey: String, userId: String, config: js.Any): Unit = js.native
    def init(apiKey: String, userId: String, config: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def isNewSession(): Unit = js.native
    
    def logEvent(eventType: String, eventProperties: js.Object, cb: js.Function0[Unit]): Unit = js.native
    
    def logEventWithTimestamp(eventType: String, eventProperties: js.Object, timestamp: Double, cb: js.Function0[Unit]): Unit = js.native
    
    def resetUserId(): Unit = js.native
    
    def setUserId(userId: String): Unit = js.native
    
    def setUserProperties(userProps: js.Any): Unit = js.native
  }
  
  type _To = AmplitudeInstance
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AmplitudeInstance = default
}
