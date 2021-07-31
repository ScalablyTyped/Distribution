package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait MoveCursor
  extends StObject
     with IAction
     with IHasTarget {
  
  var by: js.UndefOr[js.Any] = js.undefined
  
  var to: js.UndefOr[js.Any] = js.undefined
}
object MoveCursor {
  
  @scala.inline
  def apply(): MoveCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveCursor]
  }
  
  @scala.inline
  implicit class MoveCursorMutableBuilder[Self <: MoveCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: js.Any): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
