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
trait DoubleClick
  extends IAction
     with IHasTarget {
  
  var options: js.UndefOr[js.Any] = js.native
}
object DoubleClick {
  
  @scala.inline
  def apply(): DoubleClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleClick]
  }
  
  @scala.inline
  implicit class DoubleClickMutableBuilder[Self <: DoubleClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
