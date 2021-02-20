package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel[T] extends CustomEventEmitter[ChannelEvent[T]] {
  
  var localQueue: LocalQueue[T] = js.native
  
  def sendIndexRequest(): Unit = js.native
}
