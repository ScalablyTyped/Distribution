package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp")
@js.native
class Timestamp protected () extends StObject {
  def this(seconds: Double, nanoseconds: Double) = this()
  
  def isEqual(other: Timestamp): Boolean = js.native
  
  val nanoseconds: Double = js.native
  
  val seconds: Double = js.native
  
  def toDate(): Date = js.native
  
  def toMillis(): Double = js.native
}
object Timestamp {
  
  @JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromDate(date: Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /* static member */
  inline def fromMillis(milliseconds: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /* static member */
  inline def now(): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Timestamp]
}
