package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCStatsProvider extends EventTarget {
  
  def getStats(): js.Promise[RTCStatsReport] = js.native
  
  def msGetStats(): js.Promise[RTCStatsReport] = js.native
}
