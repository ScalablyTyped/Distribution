package typings.senchaTouch.Ext.form

import typings.senchaTouch.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldSet
  extends StObject
     with IContainer {
  
  /** [Method] A convenient method to disable all fields in this FieldSet
    * @param newDisabled Object
    * @returns Ext.form.FieldSet This FieldSet
    */
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of instructions
    * @param instructions String The new value.
    */
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
}
object IFieldSet {
  
  inline def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldSet] (val x: Self) extends AnyVal {
    
    inline def setDoSetDisabled(value: /* newDisabled */ js.UndefOr[Any] => IFieldSet): Self = StObject.set(x, "doSetDisabled", js.Any.fromFunction1(value))
    
    inline def setDoSetDisabledUndefined: Self = StObject.set(x, "doSetDisabled", js.undefined)
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setSetInstructions(value: /* instructions */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInstructions", js.Any.fromFunction1(value))
    
    inline def setSetInstructionsUndefined: Self = StObject.set(x, "setInstructions", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
