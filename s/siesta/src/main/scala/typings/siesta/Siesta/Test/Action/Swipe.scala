package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Swipe
  extends StObject
     with IAction
     with IHasTarget {
  
  var direction: js.UndefOr[String] = js.undefined
}
object Swipe {
  
  inline def apply(): Swipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Swipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Swipe] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
