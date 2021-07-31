package typings.rxNode

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RxNode {
  
  @js.native
  trait PublishableEventEmitter
    extends StObject
       with EventEmitter {
    
    def publish(): Unit = js.native
  }
}
