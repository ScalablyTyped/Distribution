package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "RenderModel")
@js.native
class RenderModel protected () extends js.Object {
  def this(surface: Surface, transform: Matrix, projection: Matrix, viewport: Matrix) = this()
  
  def update(transform: Matrix, projection: Matrix, viewport: Matrix): Unit = js.native
}
