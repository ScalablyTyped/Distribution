package typings.reactNativeCanvas.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas
  extends Component[CanvasProps, js.Object, js.Any] {
  
  def getContext(context: String): CanvasRenderingContext2D = js.native
  
  var height: Double = js.native
  
  def toDataURL(): js.Promise[String] = js.native
  
  var width: Double = js.native
}
