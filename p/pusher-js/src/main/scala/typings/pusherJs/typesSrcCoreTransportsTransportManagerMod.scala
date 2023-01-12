package typings.pusherJs

import typings.pusherJs.typesSrcCoreTransportsPingDelayOptionsMod.PingDelayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsTransportManagerMod {
  
  @JSImport("pusher-js/types/src/core/transports/transport_manager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TransportManager {
    def this(options: TransportManagerOptions) = this()
    
    /* CompleteClass */
    override def getAssistant(transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default): typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default = js.native
    
    /* CompleteClass */
    override def isAlive(): Boolean = js.native
    
    /* CompleteClass */
    var livesLeft: Double = js.native
    
    /* CompleteClass */
    var options: TransportManagerOptions = js.native
    
    /* CompleteClass */
    override def reportDeath(): Unit = js.native
  }
  
  trait TransportManager extends StObject {
    
    def getAssistant(transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default): typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default
    
    def isAlive(): Boolean
    
    var livesLeft: Double
    
    var options: TransportManagerOptions
    
    def reportDeath(): Unit
  }
  object TransportManager {
    
    inline def apply(
      getAssistant: typings.pusherJs.typesSrcCoreTransportsTransportMod.default => typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default,
      isAlive: () => Boolean,
      livesLeft: Double,
      options: TransportManagerOptions,
      reportDeath: () => Unit
    ): TransportManager = {
      val __obj = js.Dynamic.literal(getAssistant = js.Any.fromFunction1(getAssistant), isAlive = js.Any.fromFunction0(isAlive), livesLeft = livesLeft.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], reportDeath = js.Any.fromFunction0(reportDeath))
      __obj.asInstanceOf[TransportManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportManager] (val x: Self) extends AnyVal {
      
      inline def setGetAssistant(
        value: typings.pusherJs.typesSrcCoreTransportsTransportMod.default => typings.pusherJs.typesSrcCoreTransportsAssistantToTheTransportManagerMod.default
      ): Self = StObject.set(x, "getAssistant", js.Any.fromFunction1(value))
      
      inline def setIsAlive(value: () => Boolean): Self = StObject.set(x, "isAlive", js.Any.fromFunction0(value))
      
      inline def setLivesLeft(value: Double): Self = StObject.set(x, "livesLeft", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: TransportManagerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setReportDeath(value: () => Unit): Self = StObject.set(x, "reportDeath", js.Any.fromFunction0(value))
    }
  }
  
  trait TransportManagerOptions
    extends StObject
       with PingDelayOptions {
    
    var lives: js.UndefOr[Double] = js.undefined
  }
  object TransportManagerOptions {
    
    inline def apply(): TransportManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setLives(value: Double): Self = StObject.set(x, "lives", value.asInstanceOf[js.Any])
      
      inline def setLivesUndefined: Self = StObject.set(x, "lives", js.undefined)
    }
  }
}
