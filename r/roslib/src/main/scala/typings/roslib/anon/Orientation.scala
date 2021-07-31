package typings.roslib.anon

import typings.roslib.mod.QuaternionLike
import typings.roslib.mod.Vector3Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  var orientation: js.UndefOr[QuaternionLike | Null] = js.undefined
  
  var position: js.UndefOr[Vector3Like | Null] = js.undefined
}
object Orientation {
  
  @scala.inline
  def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  @scala.inline
  implicit class OrientationMutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: QuaternionLike): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPosition(value: Vector3Like): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
