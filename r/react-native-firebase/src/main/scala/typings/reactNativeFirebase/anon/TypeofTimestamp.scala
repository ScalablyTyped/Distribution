package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimestamp extends StObject {
  
  /* static member */
  def fromDate(date: js.Date): Timestamp
  
  /* static member */
  def fromMillis(milliseconds: Double): Timestamp
  
  /* static member */
  def now(): Timestamp
}
object TypeofTimestamp {
  
  inline def apply(fromDate: js.Date => Timestamp, fromMillis: Double => Timestamp, now: () => Timestamp): TypeofTimestamp = {
    val __obj = js.Dynamic.literal(fromDate = js.Any.fromFunction1(fromDate), fromMillis = js.Any.fromFunction1(fromMillis), now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[TypeofTimestamp]
  }
  
  extension [Self <: TypeofTimestamp](x: Self) {
    
    inline def setFromDate(value: js.Date => Timestamp): Self = StObject.set(x, "fromDate", js.Any.fromFunction1(value))
    
    inline def setFromMillis(value: Double => Timestamp): Self = StObject.set(x, "fromMillis", js.Any.fromFunction1(value))
    
    inline def setNow(value: () => Timestamp): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
