package typings.senchaTouch.Ext.form

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRadio
  extends typings.senchaTouch.Ext.field.ICheckbox {
  
  /** [Method] Returns the selected value if this radio is part of a group other radio fields with the same name in the same FormP
    * @returns String
    */
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Set the matched radio field s status that has the same value as the given string to checked
    * @param value String The value of the radio field to check.
    * @returns Ext.field.Radio The field that is checked.
    */
  var setGroupValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], this.type]] = js.native
  
  /** [Method] Sets the value of value
    * @param value Object
    * @returns Ext.field.Radio this
    */
  @JSName("setValue")
  var setValue_IRadio: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.native
}
object IRadio {
  
  @scala.inline
  def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  
  @scala.inline
  implicit class IRadioMutableBuilder[Self <: IRadio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroupValue(value: () => String): Self = StObject.set(x, "getGroupValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupValueUndefined: Self = StObject.set(x, "getGroupValue", js.undefined)
    
    @scala.inline
    def setSetGroupValue(value: /* value */ js.UndefOr[String] => IRadio): Self = StObject.set(x, "setGroupValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroupValueUndefined: Self = StObject.set(x, "setGroupValue", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => IRadio): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
