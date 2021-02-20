package typings.seen.mod

import typings.seen.anon.Fill
import typings.seen.anon.Stroke
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasStyler")
@js.native
class CanvasStyler protected () extends StObject {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def draw(): this.type = js.native
  def draw(style: Stroke): this.type = js.native
  
  def fill(): this.type = js.native
  def fill(style: Fill): this.type = js.native
}
