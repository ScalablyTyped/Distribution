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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  def endAt(varargs: js.Any*): Query = js.native
  
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  def endBefore(varargs: js.Any*): Query = js.native
  
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
  def startAfter(varargs: js.Any*): Query = js.native
  
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def startAt(varargs: js.Any*): Query = js.native
  
  def where(fieldPath: String, op: QueryOperator, value: js.Any): Query = js.native
  def where(fieldPath: FieldPath, op: QueryOperator, value: js.Any): Query = js.native
}
object Query {
  
  @js.native
  trait FieldFilter extends StObject {
    
    var fieldPath: NativeFieldPath = js.native
    
    var operator: String = js.native
    
    var value: js.Any = js.native
  }
  object FieldFilter {
    
    @scala.inline
    def apply(fieldPath: NativeFieldPath, operator: String, value: js.Any): FieldFilter = {
      val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldFilter]
    }
    
    @scala.inline
    implicit class FieldFilterMutableBuilder[Self <: FieldFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldPath(value: NativeFieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldOrder extends StObject {
    
    var direction: String = js.native
    
    var fieldPath: NativeFieldPath = js.native
  }
  object FieldOrder {
    
    @scala.inline
    def apply(direction: String, fieldPath: NativeFieldPath): FieldOrder = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOrder]
    }
    
    @scala.inline
    implicit class FieldOrderMutableBuilder[Self <: FieldOrder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldPath(value: NativeFieldPath): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeError extends Error {
    
    var code: String = js.native
    
    var nativeErrorCode: js.UndefOr[String] = js.native
    
    var nativeErrorMessage: js.UndefOr[String] = js.native
  }
  object NativeError {
    
    @scala.inline
    def apply(code: String, message: String, name: String): NativeError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeError]
    }
    
    @scala.inline
    implicit class NativeErrorMutableBuilder[Self <: NativeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeErrorCode(value: String): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeErrorCodeUndefined: Self = StObject.set(x, "nativeErrorCode", js.undefined)
      
      @scala.inline
      def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeErrorMessageUndefined: Self = StObject.set(x, "nativeErrorMessage", js.undefined)
    }
  }
  
  @js.native
  trait NativeFieldPath extends StObject {
    
    var elements: js.UndefOr[js.Array[String]] = js.native
    
    var string: js.UndefOr[String] = js.native
    
    var `type`: fieldpath | string = js.native
  }
  object NativeFieldPath {
    
    @scala.inline
    def apply(`type`: fieldpath | string): NativeFieldPath = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeFieldPath]
    }
    
    @scala.inline
    implicit class NativeFieldPathMutableBuilder[Self <: NativeFieldPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setType(value: fieldpath | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Observer extends StObject {
    
    var error: js.UndefOr[ObserverOnError] = js.native
    
    var next: ObserverOnNext = js.native
  }
  object Observer {
    
    @scala.inline
    def apply(next: /* querySnapshot */ QuerySnapshot => Unit): Observer = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* err */ SnapshotError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNext(value: /* querySnapshot */ QuerySnapshot => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type ObserverOnError = js.Function1[/* err */ SnapshotError, Unit]
  
  type ObserverOnNext = js.Function1[/* querySnapshot */ QuerySnapshot, Unit]
  
  @js.native
  trait QueryOptions extends StObject {
    
    var endAt: js.UndefOr[js.Array[_]] = js.native
    
    var endBefore: js.UndefOr[js.Array[_]] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var selectFields: js.UndefOr[js.Array[String]] = js.native
    
    var startAfter: js.UndefOr[js.Array[_]] = js.native
    
    var startAt: js.UndefOr[js.Array[_]] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndAt(value: js.Array[_]): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
      
      @scala.inline
      def setEndAtVarargs(value: js.Any*): Self = StObject.set(x, "endAt", js.Array(value :_*))
      
      @scala.inline
      def setEndBefore(value: js.Array[_]): Self = StObject.set(x, "endBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndBeforeUndefined: Self = StObject.set(x, "endBefore", js.undefined)
      
      @scala.inline
      def setEndBeforeVarargs(value: js.Any*): Self = StObject.set(x, "endBefore", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setSelectFields(value: js.Array[String]): Self = StObject.set(x, "selectFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectFieldsUndefined: Self = StObject.set(x, "selectFields", js.undefined)
      
      @scala.inline
      def setSelectFieldsVarargs(value: String*): Self = StObject.set(x, "selectFields", js.Array(value :_*))
      
      @scala.inline
      def setStartAfter(value: js.Array[_]): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
      
      @scala.inline
      def setStartAfterVarargs(value: js.Any*): Self = StObject.set(x, "startAfter", js.Array(value :_*))
      
      @scala.inline
      def setStartAt(value: js.Array[_]): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setStartAtVarargs(value: js.Any*): Self = StObject.set(x, "startAt", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SnapshotError extends NativeError {
    
    var appName: String = js.native
    
    var path: String = js.native
  }
  object SnapshotError {
    
    @scala.inline
    def apply(appName: String, code: String, message: String, name: String, path: String): SnapshotError = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotError]
    }
    
    @scala.inline
    implicit class SnapshotErrorMutableBuilder[Self <: SnapshotError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
