package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recorded extends StObject {
  
  /**
    * Checks whether the given recorded object is equal to the current instance.
    *
    * @param {Recorded} other Recorded object to check for equality.
    * @returns {Boolean} true if both objects are equal; false otherwise.
    */
  def equals(other: Recorded): Boolean = js.native
  
  var time: Double = js.native
  
  var value: js.Any = js.native
}
object Recorded {
  
  @scala.inline
  def apply(equals_ : Recorded => Boolean, time: Double, value: js.Any): Recorded = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Recorded]
  }
  
  @scala.inline
  implicit class RecordedMutableBuilder[Self <: Recorded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: Recorded => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
