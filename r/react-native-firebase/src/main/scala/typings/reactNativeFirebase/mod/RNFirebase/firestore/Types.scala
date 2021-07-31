package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typings.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typings.reactNativeFirebase.reactNativeFirebaseStrings.array
import typings.reactNativeFirebase.reactNativeFirebaseStrings.asc_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typings.reactNativeFirebase.reactNativeFirebaseStrings.cache
import typings.reactNativeFirebase.reactNativeFirebaseStrings.date
import typings.reactNativeFirebase.reactNativeFirebaseStrings.default
import typings.reactNativeFirebase.reactNativeFirebaseStrings.desc_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typings.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typings.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typings.reactNativeFirebase.reactNativeFirebaseStrings.number
import typings.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typings.reactNativeFirebase.reactNativeFirebaseStrings.server
import typings.reactNativeFirebase.reactNativeFirebaseStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Types {
  
  trait GetOptions extends StObject {
    
    var source: default | server | cache
  }
  object GetOptions {
    
    @scala.inline
    def apply(source: default | server | cache): GetOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeDocumentChange extends StObject {
    
    var document: NativeDocumentSnapshot
    
    var newIndex: Double
    
    var oldIndex: Double
    
    var `type`: String
  }
  object NativeDocumentChange {
    
    @scala.inline
    def apply(document: NativeDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: String): NativeDocumentChange = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentChange]
    }
    
    @scala.inline
    implicit class NativeDocumentChangeMutableBuilder[Self <: NativeDocumentChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: NativeDocumentSnapshot): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeDocumentSnapshot extends StObject {
    
    var data: StringDictionary[TypeMap]
    
    var metadata: SnapshotMetadata
    
    var path: String
  }
  object NativeDocumentSnapshot {
    
    @scala.inline
    def apply(data: StringDictionary[TypeMap], metadata: SnapshotMetadata, path: String): NativeDocumentSnapshot = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentSnapshot]
    }
    
    @scala.inline
    implicit class NativeDocumentSnapshotMutableBuilder[Self <: NativeDocumentSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[TypeMap]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.asc_
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.ASC
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.desc_
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.DESC
  */
  trait QueryDirection extends StObject
  object QueryDirection {
    
    @scala.inline
    def ASC: typings.reactNativeFirebase.reactNativeFirebaseStrings.ASC = "ASC".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.ASC]
    
    @scala.inline
    def DESC: typings.reactNativeFirebase.reactNativeFirebaseStrings.DESC = "DESC".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.DESC]
    
    @scala.inline
    def asc: asc_ = "asc".asInstanceOf[asc_]
    
    @scala.inline
    def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`
  */
  trait QueryOperator extends StObject
  object QueryOperator {
    
    @scala.inline
    def Equalssign: typings.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign = "=".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign]
    
    @scala.inline
    def EqualssignEqualssign: typings.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign = "==".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign]
    
    @scala.inline
    def Greaterthansign: typings.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign = ">".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typings.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typings.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign = "<".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typings.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign]
    
    @scala.inline
    def `array-contains`: typings.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains` = "array-contains".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`]
  }
  
  trait SetOptions extends StObject {
    
    var merge: js.UndefOr[Boolean] = js.undefined
  }
  object SetOptions {
    
    @scala.inline
    def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  trait SnapshotMetadata extends StObject {
    
    var fromCache: Boolean
    
    var hasPendingWrites: Boolean
  }
  object SnapshotMetadata {
    
    @scala.inline
    def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
      val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotMetadata]
    }
    
    @scala.inline
    implicit class SnapshotMetadataMutableBuilder[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeMap extends StObject {
    
    var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
    
    var value: js.Any
  }
  object TypeMap {
    
    @scala.inline
    def apply(
      `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
      value: js.Any
    ): TypeMap = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeMap]
    }
    
    @scala.inline
    implicit class TypeMapMutableBuilder[Self <: TypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(
        value: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** The key in update() function for DocumentReference and WriteBatch. */
  type UpdateKey = String | FieldPath
}
