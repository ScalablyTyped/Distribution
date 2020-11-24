package typings.reactMeasure.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasuredComponentProps extends js.Object {
  
  var contentRect: ContentRect = js.native
  
  def measure(): Unit = js.native
  
  def measureRef(): Unit = js.native
  def measureRef(ref: Element): Unit = js.native
}
