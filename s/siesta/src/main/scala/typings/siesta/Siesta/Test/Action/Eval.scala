package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
trait Eval
  extends StObject
     with IAction {
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object Eval {
  
  @scala.inline
  def apply(): Eval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eval]
  }
  
  @scala.inline
  implicit class EvalMutableBuilder[Self <: Eval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
