package typings.storybookRouter.mod

import typings.storybookRouter.anon.PartialLocation1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterData
  extends StObject
     with Other {
  
  var location: PartialLocation1
  
  var navigate: NavigateFunction
}
object RouterData {
  
  inline def apply(
    location: PartialLocation1,
    navigate: (/* to */ To | Double, /* options */ js.UndefOr[NavigateOptions]) => Unit,
    path: String
  ): RouterData = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = js.Any.fromFunction2(navigate), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterData] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: PartialLocation1): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: (/* to */ To | Double, /* options */ js.UndefOr[NavigateOptions]) => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction2(value))
  }
}
