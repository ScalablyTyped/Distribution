package typings.rcUpload.interfaceMod

import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProgressEvent extends ProgressEvent[EventTarget] {
  
  var percent: Double = js.native
}
