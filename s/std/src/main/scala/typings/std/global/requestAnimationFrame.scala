package typings.std.global

import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("requestAnimationFrame")
@js.native
object requestAnimationFrame extends js.Object {
  def apply(callback: FrameRequestCallback): Double = js.native
}

