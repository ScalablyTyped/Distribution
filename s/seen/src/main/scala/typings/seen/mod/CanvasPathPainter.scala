package typings.seen.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasPathPainter")
@js.native
class CanvasPathPainter protected () extends CanvasStyler {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def path(points: js.Array[Point]): this.type = js.native
}
