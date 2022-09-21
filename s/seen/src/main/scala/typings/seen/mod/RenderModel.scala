package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "RenderModel")
@js.native
open class RenderModel protected () extends StObject {
  def this(surface: Surface, transform: Matrix, projection: Matrix, viewport: Matrix) = this()
  
  def update(transform: Matrix, projection: Matrix, viewport: Matrix): Unit = js.native
}
