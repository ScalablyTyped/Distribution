package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounces extends StObject {
  
  var bounces: Boolean
}
object Bounces {
  
  @scala.inline
  def apply(bounces: Boolean): Bounces = {
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounces]
  }
  
  @scala.inline
  implicit class BouncesMutableBuilder[Self <: Bounces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
  }
}
