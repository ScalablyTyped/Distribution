package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Query.Observer
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Query.ObserverOnError
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Query.ObserverOnNext
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.GetOptions
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryDirection
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.QueryOperator
import typings.reactNativeFirebase.reactNativeFirebaseStrings.fieldpath
import typings.reactNativeFirebase.reactNativeFirebaseStrings.string
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  def endAt(varargs: Any*): Query = js.native
  
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  def endBefore(varargs: Any*): Query = js.native
  
  val firestore: Firestore = js.native
  
  def get(): js.Promise[QuerySnapshot] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot] = js.native
  
  def isEqual(otherQuery: Query): Boolean = js.native
  
  def limit(limit: Double): Query = js.native
  
  def onSnapshot(metadataChanges: MetadataChanges, observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(metadataChanges: MetadataChanges, onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  def onSnapshot(observer: Observer): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext): js.Function0[Unit] = js.native
  def onSnapshot(onNext: ObserverOnNext, onError: ObserverOnError): js.Function0[Unit] = js.native
  
  def orderBy(fieldPath: String): Query = js.native
  def orderBy(fieldPath: String, directionStr: QueryDirection): Query = js.native
  def orderBy(fieldPath: FieldPath): Query = js.native
  def orderBy(fieldPath: FieldPath, directionStr: QueryDirection): Query = js.native
  
  def startAfter(snapshot: DocumentSnapshot): Query = js.native
  def startAfter(varargs: Any*): Query = js.native
  
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def startAt(varargs: Any*): Query = js.native
  
  def where(fieldPath: String, op: QueryOperator, value: Any): Query = js.native
  def where(fieldPath: FieldPath, op: QueryOperator, value: Any): Query = js.native
}
object Query {
  
  trait FieldFilter extends StObject {
    
    var fieldPath: NativeFieldPath
    
    var operator: String
    
    var value: Any
  }
  object FieldFilter {
    
    inline def apply(fieldPath: NativeFieldPath, operator: String, value: Any): FieldFilter = {
      val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldFilter]
    }
    
    extension [Self <: FieldFilter](x: Self) {
      
      inline def setFieldPath(value: NativeFieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldOrder extends StObject {
    
    var direction: String
    
    var fieldPath: NativeFieldPath
  }
  object FieldOrder {
    
    inline def apply(direction: String, fieldPath: NativeFieldPath): FieldOrder = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOrder]
    }
    
    extension [Self <: FieldOrder](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFieldPath(value: NativeFieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeError
    extends StObject
       with Error {
    
    var code: String
    
    var nativeErrorCode: js.UndefOr[String] = js.undefined
    
    var nativeErrorMessage: js.UndefOr[String] = js.undefined
  }
  object NativeError {
    
    inline def apply(code: String, message: String, name: String): NativeError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeError]
    }
    
    extension [Self <: NativeError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNativeErrorCode(value: String): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
      
      inline def setNativeErrorCodeUndefined: Self = StObject.set(x, "nativeErrorCode", js.undefined)
      
      inline def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setNativeErrorMessageUndefined: Self = StObject.set(x, "nativeErrorMessage", js.undefined)
    }
  }
  
  trait NativeFieldPath extends StObject {
    
    var elements: js.UndefOr[js.Array[String]] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
    
    var `type`: fieldpath | string
  }
  object NativeFieldPath {
    
    inline def apply(`type`: fieldpath | string): NativeFieldPath = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeFieldPath]
    }
    
    extension [Self <: NativeFieldPath](x: Self) {
      
      inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setType(value: fieldpath | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Observer extends StObject {
    
    var error: js.UndefOr[ObserverOnError] = js.undefined
    
    var next: ObserverOnNext
  }
  object Observer {
    
    inline def apply(next: /* querySnapshot */ QuerySnapshot => Unit): Observer = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setError(value: /* err */ SnapshotError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setNext(value: /* querySnapshot */ QuerySnapshot => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type ObserverOnError = js.Function1[/* err */ SnapshotError, Unit]
  
  type ObserverOnNext = js.Function1[/* querySnapshot */ QuerySnapshot, Unit]
  
  trait QueryOptions extends StObject {
    
    var endAt: js.UndefOr[js.Array[Any]] = js.undefined
    
    var endBefore: js.UndefOr[js.Array[Any]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var selectFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var startAfter: js.UndefOr[js.Array[Any]] = js.undefined
    
    var startAt: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    extension [Self <: QueryOptions](x: Self) {
      
      inline def setEndAt(value: js.Array[Any]): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
      
      inline def setEndAtVarargs(value: Any*): Self = StObject.set(x, "endAt", js.Array(value*))
      
      inline def setEndBefore(value: js.Array[Any]): Self = StObject.set(x, "endBefore", value.asInstanceOf[js.Any])
      
      inline def setEndBeforeUndefined: Self = StObject.set(x, "endBefore", js.undefined)
      
      inline def setEndBeforeVarargs(value: Any*): Self = StObject.set(x, "endBefore", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSelectFields(value: js.Array[String]): Self = StObject.set(x, "selectFields", value.asInstanceOf[js.Any])
      
      inline def setSelectFieldsUndefined: Self = StObject.set(x, "selectFields", js.undefined)
      
      inline def setSelectFieldsVarargs(value: String*): Self = StObject.set(x, "selectFields", js.Array(value*))
      
      inline def setStartAfter(value: js.Array[Any]): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
      
      inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
      
      inline def setStartAfterVarargs(value: Any*): Self = StObject.set(x, "startAfter", js.Array(value*))
      
      inline def setStartAt(value: js.Array[Any]): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setStartAtVarargs(value: Any*): Self = StObject.set(x, "startAt", js.Array(value*))
    }
  }
  
  trait SnapshotError
    extends StObject
       with NativeError {
    
    var appName: String
    
    var path: String
  }
  object SnapshotError {
    
    inline def apply(appName: String, code: String, message: String, name: String, path: String): SnapshotError = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotError]
    }
    
    extension [Self <: SnapshotError](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
