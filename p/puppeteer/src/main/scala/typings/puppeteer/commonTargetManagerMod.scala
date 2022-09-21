package typings.puppeteer

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteer.commonEventEmitterMod.EventEmitter
import typings.puppeteer.commonTargetMod.Target
import typings.puppeteer.puppeteerCommonConnectionMod.CDPSession
import typings.puppeteer.puppeteerStrings.targetAvailable
import typings.puppeteer.puppeteerStrings.targetChanged
import typings.puppeteer.puppeteerStrings.targetDiscovered
import typings.puppeteer.puppeteerStrings.targetGone
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTargetManagerMod {
  
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
    - typings.puppeteer.puppeteerStrings.targetDiscovered
    - typings.puppeteer.puppeteerStrings.targetAvailable
    - typings.puppeteer.puppeteerStrings.targetGone
    - typings.puppeteer.puppeteerStrings.targetChanged
  */
  trait TargetManagerEmittedEvents extends StObject
  object TargetManagerEmittedEvents {
    
    inline def TargetAvailable: targetAvailable = "targetAvailable".asInstanceOf[targetAvailable]
    
    inline def TargetChanged: targetChanged = "targetChanged".asInstanceOf[targetChanged]
    
    inline def TargetDiscovered: targetDiscovered = "targetDiscovered".asInstanceOf[targetDiscovered]
    
    inline def TargetGone: targetGone = "targetGone".asInstanceOf[targetGone]
  }
}
