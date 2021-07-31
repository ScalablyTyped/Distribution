package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait MouseUp
  extends StObject
     with IAction
     with IHasTarget {
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object MouseUp {
  
  @scala.inline
  def apply(): MouseUp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseUp]
  }
  
  @scala.inline
  implicit class MouseUpMutableBuilder[Self <: MouseUp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
