package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Miscellaneous extends StObject {
  
  var animation: Animation
}
object Miscellaneous {
  
  @scala.inline
  def apply(animation: Animation): Miscellaneous = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Miscellaneous]
  }
  
  @scala.inline
  implicit class MiscellaneousMutableBuilder[Self <: Miscellaneous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
