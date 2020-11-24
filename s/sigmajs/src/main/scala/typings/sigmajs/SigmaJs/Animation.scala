package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  def camera(camera: Camera, target: StringDictionary[js.Any], options: StringDictionary[js.Any]): Double = js.native
}
object Animation {
  
  @scala.inline
  def apply(camera: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => Double): Animation = {
    val __obj = js.Dynamic.literal(camera = js.Any.fromFunction3(camera))
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCamera(value: (Camera, StringDictionary[js.Any], StringDictionary[js.Any]) => Double): Self = this.set("camera", js.Any.fromFunction3(value))
  }
}
