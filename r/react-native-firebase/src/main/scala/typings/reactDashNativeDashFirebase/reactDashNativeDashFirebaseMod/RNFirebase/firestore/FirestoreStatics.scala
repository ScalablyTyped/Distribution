package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import org.scalablytyped.runtime.Instantiable2
import typings.reactDashNativeDashFirebase.TypeofClassBlob
import typings.reactDashNativeDashFirebase.TypeofClassFieldPath
import typings.reactDashNativeDashFirebase.TypeofClassFieldValue
import typings.reactDashNativeDashFirebase.TypeofClassTimestamp
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.debug
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.error
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirestoreStatics extends js.Object {
  var Blob: TypeofClassBlob = js.native
  var FieldPath: TypeofClassFieldPath = js.native
  var FieldValue: TypeofClassFieldValue = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.GeoPoint
  ] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def enableLogging(enabled: Boolean): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}

