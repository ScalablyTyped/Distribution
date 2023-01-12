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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirestoreStatics extends StObject {
  
  var Blob: TypeofBlob & Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.firestore.Blob]
  
  var FieldPath: TypeofFieldPath & (Instantiable1[
    /* segments (repeated) */ String, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
  ])
  
  var FieldValue: TypeofFieldValue & Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue]
  
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ]
  
  var Timestamp: TypeofTimestamp & (Instantiable2[
    /* seconds */ Double, 
    /* nanoseconds */ Double, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
  ])
  
  def enableLogging(enabled: Boolean): Unit
  
  def setLogLevel(logLevel: debug | error_ | silent): Unit
}
object FirestoreStatics {
  
  inline def apply(
    Blob: TypeofBlob & Instantiable0[Blob],
    FieldPath: TypeofFieldPath & (Instantiable1[/* segments (repeated) */ String, FieldPath]),
    FieldValue: TypeofFieldValue & Instantiable0[FieldValue],
    GeoPoint: Instantiable2[/* latitude */ Double, /* longitude */ Double, GeoPoint],
    Timestamp: TypeofTimestamp & (Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp]),
    enableLogging: Boolean => Unit,
    setLogLevel: debug | error_ | silent => Unit
  ): FirestoreStatics = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], FieldPath = FieldPath.asInstanceOf[js.Any], FieldValue = FieldValue.asInstanceOf[js.Any], GeoPoint = GeoPoint.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], enableLogging = js.Any.fromFunction1(enableLogging), setLogLevel = js.Any.fromFunction1(setLogLevel))
    __obj.asInstanceOf[FirestoreStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirestoreStatics] (val x: Self) extends AnyVal {
    
    inline def setBlob(value: TypeofBlob & Instantiable0[Blob]): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setEnableLogging(value: Boolean => Unit): Self = StObject.set(x, "enableLogging", js.Any.fromFunction1(value))
    
    inline def setFieldPath(value: TypeofFieldPath & (Instantiable1[/* segments (repeated) */ String, FieldPath])): Self = StObject.set(x, "FieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: TypeofFieldValue & Instantiable0[FieldValue]): Self = StObject.set(x, "FieldValue", value.asInstanceOf[js.Any])
    
    inline def setGeoPoint(value: Instantiable2[/* latitude */ Double, /* longitude */ Double, GeoPoint]): Self = StObject.set(x, "GeoPoint", value.asInstanceOf[js.Any])
    
    inline def setSetLogLevel(value: debug | error_ | silent => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    inline def setTimestamp(
      value: TypeofTimestamp & (Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp])
    ): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
