package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.Instantiable2
import typings.reactNativeFirebase.TypeofClassBlob
import typings.reactNativeFirebase.TypeofClassFieldPath
import typings.reactNativeFirebase.TypeofClassFieldValue
import typings.reactNativeFirebase.TypeofClassTimestamp
import typings.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typings.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.silent
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
    typings.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def enableLogging(enabled: Boolean): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error_): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}

