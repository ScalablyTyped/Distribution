package typings.roslib.anon

import typings.roslib.mod.QuaternionLike
import typings.roslib.mod.Vector3Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotation extends StObject {
  
  var rotation: js.UndefOr[QuaternionLike | Null] = js.undefined
  
  var translation: js.UndefOr[Vector3Like | Null] = js.undefined
}
object Rotation {
  
  inline def apply(): Rotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    inline def setRotation(value: QuaternionLike): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationNull: Self = StObject.set(x, "rotation", null)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setTranslation(value: Vector3Like): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    
    inline def setTranslationNull: Self = StObject.set(x, "translation", null)
    
    inline def setTranslationUndefined: Self = StObject.set(x, "translation", js.undefined)
  }
}
