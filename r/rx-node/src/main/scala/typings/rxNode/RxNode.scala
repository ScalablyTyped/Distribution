package typings.rxNode

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("RxNode")
@js.native
object RxNode extends js.Object {
  
  @js.native
  trait PublishableEventEmitter extends EventEmitter {
    
    def publish(): Unit = js.native
  }
}
