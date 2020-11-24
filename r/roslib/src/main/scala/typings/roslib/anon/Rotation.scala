package typings.roslib.anon

import typings.roslib.mod.QuaternionLike
import typings.roslib.mod.Vector3Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rotation extends js.Object {
  
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
  implicit class RotationOps[Self <: Rotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRotation(value: QuaternionLike): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationNull: Self = this.set("rotation", null)
    
    @scala.inline
    def setTranslation(value: Vector3Like): Self = this.set("translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslation: Self = this.set("translation", js.undefined)
    
    @scala.inline
    def setTranslationNull: Self = this.set("translation", null)
  }
}
