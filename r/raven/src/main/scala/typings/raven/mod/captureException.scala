package typings.raven.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "captureException")
@js.native
object captureException extends js.Object {
  
  def apply(e: Error): String = js.native
  def apply(e: Error, cb: CaptureCallback): String = js.native
  def apply(e: Error, options: js.UndefOr[scala.Nothing], cb: CaptureCallback): String = js.native
  def apply(e: Error, options: CaptureOptions): String = js.native
  def apply(e: Error, options: CaptureOptions, cb: CaptureCallback): String = js.native
}
