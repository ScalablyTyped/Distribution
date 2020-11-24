package typings.restartHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set extends js.Object {
  
  def clear(): Unit = js.native
  
  def set(fn: js.Function0[Unit]): Unit = js.native
  def set(fn: js.Function0[Unit], delayMs: Double): Unit = js.native
}
