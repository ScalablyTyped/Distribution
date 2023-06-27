package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Recurrence rule used with reminders and calendar events._
  * @see https://docs.scriptable.app/recurrencerule
  */
trait RecurrenceRule extends StObject {
  
  /**
    * _This is only here for TypeScript_
    *
    * TypeScript can't distinguish an instance of this class from an empty object if it doesn't have at least one property or function
    */
  /* private */ var recurrenceRule: Boolean
}
object RecurrenceRule {
  
  inline def apply(recurrenceRule: Boolean): RecurrenceRule = {
    val __obj = js.Dynamic.literal(recurrenceRule = recurrenceRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecurrenceRule] (val x: Self) extends AnyVal {
    
    inline def setRecurrenceRule(value: Boolean): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
  }
}
