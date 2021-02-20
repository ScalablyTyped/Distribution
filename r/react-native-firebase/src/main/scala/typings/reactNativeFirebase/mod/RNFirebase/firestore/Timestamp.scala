package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp.fromDate")
  @js.native
  def fromDate(date: Date): Timestamp = js.native
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp.fromMillis")
  @js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp.now")
  @js.native
  def now(): Timestamp = js.native
}
