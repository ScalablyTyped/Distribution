package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import typings.puppeteerCore.libCjsPuppeteerCommonEventEmitterMod.EventEmitter
import typings.puppeteerCore.libCjsPuppeteerCommonTargetMod.Target
import typings.puppeteerCore.puppeteerCoreStrings.targetAvailable
import typings.puppeteerCore.puppeteerCoreStrings.targetChanged
import typings.puppeteerCore.puppeteerCoreStrings.targetDiscovered
import typings.puppeteerCore.puppeteerCoreStrings.targetGone
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonTargetManagerMod {
  
  type TargetFactory = js.Function2[/* targetInfo */ TargetInfo, /* session */ js.UndefOr[CDPSession], Target]
  
  type TargetInterceptor = js.Function2[/* createdTarget */ Target, /* parentTarget */ Target | Null, js.Promise[Unit]]
  
  @js.native
  trait TargetManager extends EventEmitter {
    
    def addTargetInterceptor(session: CDPSession, interceptor: TargetInterceptor): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getAvailableTargets(): Map[String, Target] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def removeTargetInterceptor(session: CDPSession, interceptor: TargetInterceptor): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.targetDiscovered
    - typings.puppeteerCore.puppeteerCoreStrings.targetAvailable
    - typings.puppeteerCore.puppeteerCoreStrings.targetGone
    - typings.puppeteerCore.puppeteerCoreStrings.targetChanged
  */
  trait TargetManagerEmittedEvents extends StObject
  object TargetManagerEmittedEvents {
    
    inline def TargetAvailable: targetAvailable = "targetAvailable".asInstanceOf[targetAvailable]
    
    inline def TargetChanged: targetChanged = "targetChanged".asInstanceOf[targetChanged]
    
    inline def TargetDiscovered: targetDiscovered = "targetDiscovered".asInstanceOf[targetDiscovered]
    
    inline def TargetGone: targetGone = "targetGone".asInstanceOf[targetGone]
  }
}
