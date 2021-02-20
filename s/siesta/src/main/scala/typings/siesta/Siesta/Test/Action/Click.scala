package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait Click
  extends IAction
     with IHasTarget {
  
  var options: js.UndefOr[js.Any] = js.native
}
object Click {
  
  @scala.inline
  def apply(): Click = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit class ClickMutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
