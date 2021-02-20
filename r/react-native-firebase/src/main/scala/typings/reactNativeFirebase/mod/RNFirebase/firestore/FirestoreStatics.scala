package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.reactNativeFirebase.anon.TypeofBlob
import typings.reactNativeFirebase.anon.TypeofFieldPath
import typings.reactNativeFirebase.anon.TypeofFieldValue
import typings.reactNativeFirebase.anon.TypeofTimestamp
import typings.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typings.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreStatics extends StObject {
  
  var Blob: TypeofBlob with Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.firestore.Blob] = js.native
  
  var FieldPath: TypeofFieldPath with (Instantiable1[
    /* segments (repeated) */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
  ]) = js.native
  
  var FieldValue: TypeofFieldValue with Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue] = js.native
  
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ] = js.native
  
  var Timestamp: TypeofTimestamp with (Instantiable2[
    /* seconds */ Double, 
    /* nanoseconds */ Double, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
  ]) = js.native
  
  def enableLogging(enabled: Boolean): Unit = js.native
  
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error_): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}
