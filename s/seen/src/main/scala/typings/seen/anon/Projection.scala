package typings.seen.anon

import typings.seen.mod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  var projection: Matrix
}
object Projection {
  
  @scala.inline
  def apply(projection: Matrix): Projection = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjection(value: Matrix): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
