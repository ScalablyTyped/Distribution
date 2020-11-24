package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.Instantiable2
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTimestamp extends Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp] {
  
  def fromDate(date: Date): Timestamp = js.native
  
  def fromMillis(milliseconds: Double): Timestamp = js.native
  
  def now(): Timestamp = js.native
}
