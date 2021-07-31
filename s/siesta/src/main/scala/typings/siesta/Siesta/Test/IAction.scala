package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @abstract
  */
trait IAction extends StObject {
  
  var desc: js.UndefOr[String] = js.undefined
}
object IAction {
  
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  
  @scala.inline
  implicit class IActionMutableBuilder[Self <: IAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
  }
}
