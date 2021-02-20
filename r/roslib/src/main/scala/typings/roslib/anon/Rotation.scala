package typings.roslib.anon

import typings.roslib.mod.QuaternionLike
import typings.roslib.mod.Vector3Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotation extends StObject {
  
  var rotation: js.UndefOr[QuaternionLike | Null] = js.native
  
  var translation: js.UndefOr[Vector3Like | Null] = js.native
}
object Rotation {
  
  @scala.inline
  def apply(): Rotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit class RotationMutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotation(value: QuaternionLike): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationNull: Self = StObject.set(x, "rotation", null)
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setTranslation(value: Vector3Like): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationNull: Self = StObject.set(x, "translation", null)
    
    @scala.inline
    def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
  }
}
