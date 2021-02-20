package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends StObject {
  
  var height: Double = js.native
  
  var route: typings.reactNavigationStack.vendorTypesMod.Route[String] = js.native
}
object Height {
  
  @scala.inline
  def apply(height: Double, route: typings.reactNavigationStack.vendorTypesMod.Route[String]): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: typings.reactNavigationStack.vendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
