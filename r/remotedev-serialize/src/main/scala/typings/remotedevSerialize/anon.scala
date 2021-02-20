package typings.remotedevSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Collection
import typings.immutable.Immutable.Collection.Keyed
import typings.immutable.Immutable.Collection.Set
import typings.immutable.Immutable.List
import typings.immutable.Immutable.Map
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.OrderedSet
import typings.immutable.Immutable.Record
import typings.immutable.Immutable.Seq
import typings.immutable.Immutable.Seq.Indexed
import typings.immutable.Immutable.Stack
import typings.remotedevSerialize.mod.DefaultReplacer
import typings.remotedevSerialize.mod.DefaultReviver
import typings.remotedevSerialize.mod.Refs
import typings.remotedevSerialize.mod.Replacer
import typings.remotedevSerialize.mod.Reviver
import typings.std.Iterable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Options extends StObject {
    
    var options: typings.remotedevSerialize.mod.Options = js.native
    
    def replacer(key: String, value: js.Any, replacer: DefaultReplacer): js.Any = js.native
    @JSName("replacer")
    var replacer_Original: Replacer = js.native
    
    def reviver(key: String, value: js.Any, reviver: DefaultReviver): js.Any = js.native
    @JSName("reviver")
    var reviver_Original: Reviver = js.native
  }
  
  @js.native
  trait Parse extends StObject {
    
    def parse(input: String): js.Any = js.native
    
    def serialize(immutable: TypeofImmutable): Options = js.native
    def serialize(
      immutable: TypeofImmutable,
      refs: js.UndefOr[scala.Nothing],
      customReplacer: js.UndefOr[scala.Nothing],
      customReviver: Reviver
    ): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: js.UndefOr[scala.Nothing], customReplacer: Replacer): Options = js.native
    def serialize(
      immutable: TypeofImmutable,
      refs: js.UndefOr[scala.Nothing],
      customReplacer: Replacer,
      customReviver: Reviver
    ): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs): Options = js.native
    def serialize(
      immutable: TypeofImmutable,
      refs: Refs,
      customReplacer: js.UndefOr[scala.Nothing],
      customReviver: Reviver
    ): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): Options = js.native
    def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): Options = js.native
    
    def stringify(input: js.Any): String = js.native
  }
  
  @js.native
  trait TypeofCollection extends StObject {
    
    def apply[I /* <: Collection[_, _] */](collection: I): I = js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
    
    val Indexed: TypeofIndexed = js.native
    
    val Keyed: TypeofKeyed = js.native
    
    val Set: TypeofSet = js.native
    
    /**
      * @deprecated use `const { isAssociative } = require('immutable')`
      */
    def isAssociative(maybeAssociative: js.Any): Boolean = js.native
    
    /**
      * @deprecated use `const { isIndexed } = require('immutable')`
      */
    def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isKeyed } = require('immutable')`
      */
    def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
    
    /**
      * @deprecated use `const { isOrdered } = require('immutable')`
      */
    def isOrdered(maybeOrdered: js.Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofFactory extends StObject {
    
    def apply[TProps /* <: js.Object */](): Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] with TProps = js.native
  }
  
  @js.native
  trait TypeofImmutable extends StObject {
    
    val Collection: TypeofCollection = js.native
    
    val List: TypeofList = js.native
    
    val Map: TypeofMap = js.native
    
    val OrderedMap: TypeofOrderedMap = js.native
    
    val OrderedSet: TypeofOrderedSet = js.native
    
    def Range(): Indexed[Double] = js.native
    def Range(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], step: Double): Indexed[Double] = js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double): Indexed[Double] = js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double, step: Double): Indexed[Double] = js.native
    def Range(start: Double): Indexed[Double] = js.native
    def Range(start: Double, end: js.UndefOr[scala.Nothing], step: Double): Indexed[Double] = js.native
    def Range(start: Double, end: Double): Indexed[Double] = js.native
    def Range(start: Double, end: Double, step: Double): Indexed[Double] = js.native
    
    val Record: TypeofRecord = js.native
    
    def Repeat[T](value: T): Indexed[T] = js.native
    def Repeat[T](value: T, times: Double): Indexed[T] = js.native
    
    val Seq: TypeofSeq = js.native
    
    val Set: TypeofSetFromKeys = js.native
    
    val Stack: TypeofStack = js.native
    
    def fromJS(jsValue: js.Any): js.Any = js.native
    def fromJS(
      jsValue: js.Any,
      reviver: js.Function3[
          /* key */ String | Double, 
          /* sequence */ (Keyed[String, _]) | typings.immutable.Immutable.Collection.Indexed[_], 
          /* path */ js.UndefOr[js.Array[String | Double]], 
          _
        ]
    ): js.Any = js.native
    
    def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
    def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
    def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
    def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
    def get[K, V](collection: typings.immutable.Immutable.Collection[K, V], key: K): js.UndefOr[V] = js.native
    def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
    def get[TProps, K /* <: /* keyof TProps */ String */](record: typings.immutable.Immutable.Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    def get[K, V, NSV](collection: typings.immutable.Immutable.Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
    
    def getIn(collection: js.Any, keyPath: Iterable[_], notSetValue: js.Any): js.Any = js.native
    
    def has(collection: js.Object, key: js.Any): Boolean = js.native
    
    def hasIn(collection: js.Any, keyPath: Iterable[_]): Boolean = js.native
    
    def hash(value: js.Any): Double = js.native
    
    def is(first: js.Any, second: js.Any): Boolean = js.native
    
    def isAssociative(maybeAssociative: js.Any): Boolean = js.native
    
    def isCollection(maybeCollection: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    def isImmutable(maybeImmutable: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
    
    def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
    
    def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
    
    def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
    
    def isOrdered(maybeOrdered: js.Any): Boolean = js.native
    
    def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
    
    def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.Immutable.OrderedSet<any> */ Boolean = js.native
    
    def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
    
    def isSeq(maybeSeq: js.Any): Boolean = js.native
    
    def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
    
    def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
    
    def isValueObject(maybeValue: js.Any): /* is immutable.Immutable.ValueObject */ Boolean = js.native
    
    def merge[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    def mergeDeep[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    def mergeDeepWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    def mergeWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    def remove[C /* <: js.Array[_] */](collection: C, key: Double): C = js.native
    def remove[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    
    def removeIn[C](collection: C, keyPath: Iterable[_]): C = js.native
    
    @JSName("remove")
    def remove_C_StringDictionaryAnyK_String[C /* <: StringDictionary[js.Any] */, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    @JSName("remove")
    def remove_KC_CollectionKWildcard[K, C /* <: typings.immutable.Immutable.Collection[K, _] */](collection: C, key: K): C = js.native
    @JSName("remove")
    def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = js.native
    
    def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
    def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
    def set[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ): C = js.native
    def set[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
    
    def setIn[C](collection: C, keyPath: Iterable[_], value: js.Any): C = js.native
    
    @JSName("set")
    def set_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): C = js.native
    
    def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
    def update[V, NSV](
      collection: js.Array[V],
      key: Double,
      notSetValue: NSV,
      updater: js.Function1[/* value */ V | NSV, V]
    ): js.Array[V] = js.native
    def update[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    def update[C, K /* <: /* keyof C */ String */, NSV](
      `object`: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    
    def updateIn[C](
      collection: C,
      keyPath: Iterable[_],
      notSetValue: js.Any,
      updater: js.Function1[/* value */ js.Any, _]
    ): C = js.native
    def updateIn[C](collection: C, keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
    
    @JSName("update")
    def update_KVC_CollectionKV[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
    @JSName("update")
    def update_KVC_CollectionKVNSV[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
    @JSName("update")
    def update_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSName("update")
    def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
      record: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSName("update")
    def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
    @JSName("update")
    def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
  }
  
  @js.native
  trait TypeofIndexed extends StObject {
    
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
  }
  
  @js.native
  trait TypeofIndexedOf extends StObject {
    
    def apply(): Indexed[_] = js.native
    def apply[T](collection: Iterable[T]): Indexed[T] = js.native
    
    /**
      * Provides an Seq.Indexed of the values provided.
      */
    def of[T](values: T*): Indexed[T] = js.native
  }
  
  @js.native
  trait TypeofKeyed extends StObject {
    
    def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Keyed[K, V] = js.native
  }
  
  @js.native
  trait TypeofKeyed0 extends StObject {
    
    def apply(): typings.immutable.Immutable.Seq.Keyed[_, _] = js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
  }
  
  @js.native
  trait TypeofList extends StObject {
    
    def apply(): List[_] = js.native
    def apply[T](collection: Iterable[T]): List[T] = js.native
    
    /**
      * True if the provided value is a List
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.isList([]); // false
      * List.isList(List()); // true
      * ```
      */
    def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
    
    /**
      * Creates a new List containing `values`.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.of(1, 2, 3, 4)
      * // List [ 1, 2, 3, 4 ]
      * ```
      *
      * Note: Values are not altered or converted in any way.
      *
      * <!-- runkit:activate -->
      * ```js
      * const { List } = require('immutable');
      * List.of({x:1}, 2, [3], 4)
      * // List [ { x: 1 }, 2, [ 3 ], 4 ]
      * ```
      */
    def of[T](values: T*): List[T] = js.native
  }
  
  @js.native
  trait TypeofMap extends StObject {
    
    def apply(): Map[_, _] = js.native
    def apply[V](obj: StringDictionary[V]): Map[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): Map[K, V] = js.native
    
    /**
      * True if the provided value is a Map
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map.isMap({}) // false
      * Map.isMap(Map()) // true
      * ```
      */
    def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
    
    /**
      * Creates a new Map from alternating keys and values
      *
      * <!-- runkit:activate -->
      * ```js
      * const { Map } = require('immutable')
      * Map.of(
      *   'key', 'value',
      *   'numerical value', 3,
      *    0, 'numerical key'
      * )
      * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
      * ```
      *
      * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
      */
    def of(keyValues: js.Any*): Map[_, _] = js.native
  }
  
  @js.native
  trait TypeofOrderedMap extends StObject {
    
    def apply(): OrderedMap[_, _] = js.native
    def apply[V](obj: StringDictionary[V]): OrderedMap[String, V] = js.native
    def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): OrderedMap[K, V] = js.native
    
    /**
      * True if the provided value is an OrderedMap.
      */
    def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
  }
  
  @js.native
  trait TypeofOrderedSet extends StObject {
    
    def apply(): OrderedSet[_] = js.native
    def apply[T](collection: Iterable[T]): OrderedSet[T] = js.native
    
    def fromKeys(obj: StringDictionary[js.Any]): OrderedSet[String] = js.native
    /**
      * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
      * the keys from this Collection or JavaScript Object.
      */
    def fromKeys[T](iter: Collection[T, _]): OrderedSet[T] = js.native
    
    /**
      * True if the provided value is an OrderedSet.
      */
    def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
    
    /**
      * Creates a new OrderedSet containing `values`.
      */
    def of[T](values: T*): OrderedSet[T] = js.native
  }
  
  @js.native
  trait TypeofRecord extends StObject {
    
    def apply[TProps](defaultValues: TProps): typings.immutable.Immutable.Record.Factory[TProps] = js.native
    def apply[TProps](defaultValues: TProps, name: String): typings.immutable.Immutable.Record.Factory[TProps] = js.native
    
    val Factory: TypeofFactory = js.native
    
    def getDescriptiveName(record: Record[_]): String = js.native
    
    def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  }
  
  @js.native
  trait TypeofSeq extends StObject {
    
    def apply(): Seq[_, _] = js.native
    def apply[T](collection: typings.immutable.Immutable.Collection.Indexed[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    def apply[T](collection: typings.immutable.Immutable.Collection.Set[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
    def apply[S /* <: Seq[_, _] */](seq: S): S = js.native
    def apply[K, V](collection: typings.immutable.Immutable.Collection.Keyed[K, V]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
    
    /**
      * `Seq` which represents an ordered indexed list of values.
      */
    val Indexed: TypeofIndexedOf = js.native
    
    val Keyed: TypeofKeyed0 = js.native
    
    val Set: TypeofSetOf = js.native
    
    /**
      * True if `maybeSeq` is a Seq, it is not backed by a concrete
      * structure such as Map, List, or Set.
      */
    def isSeq(maybeSeq: js.Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofSet extends StObject {
    
    def apply[T](collection: Iterable[T]): Set[T] = js.native
  }
  
  @js.native
  trait TypeofSetFromKeys extends StObject {
    
    def apply(): typings.immutable.Immutable.Set[_] = js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Set[T] = js.native
    
    def fromKeys(obj: StringDictionary[js.Any]): typings.immutable.Immutable.Set[String] = js.native
    /**
      * `Set.fromKeys()` creates a new immutable Set containing the keys from
      * this Collection or JavaScript Object.
      */
    def fromKeys[T](iter: Collection[T, _]): typings.immutable.Immutable.Set[T] = js.native
    
    /**
      * `Set.intersect()` creates a new immutable Set that is the intersection of
      * a collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const intersected = Set.intersect([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "c"" ]
      * ```
      */
    def intersect[T](sets: Iterable[Iterable[T]]): typings.immutable.Immutable.Set[T] = js.native
    
    /**
      * True if the provided value is a Set
      */
    def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
    
    /**
      * Creates a new Set containing `values`.
      */
    def of[T](values: T*): typings.immutable.Immutable.Set[T] = js.native
    
    /**
      * `Set.union()` creates a new immutable Set that is the union of a
      * collection of other sets.
      *
      * ```js
      * const { Set } = require('immutable')
      * const unioned = Set.union([
      *   Set([ 'a', 'b', 'c' ])
      *   Set([ 'c', 'a', 't' ])
      * ])
      * // Set [ "a", "b", "c", "t"" ]
      * ```
      */
    def union[T](sets: Iterable[Iterable[T]]): typings.immutable.Immutable.Set[T] = js.native
  }
  
  @js.native
  trait TypeofSetOf extends StObject {
    
    def apply(): typings.immutable.Immutable.Seq.Set[_] = js.native
    def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
    
    /**
      * Returns a Seq.Set of the provided values
      */
    def of[T](values: T*): typings.immutable.Immutable.Seq.Set[T] = js.native
  }
  
  @js.native
  trait TypeofStack extends StObject {
    
    def apply(): Stack[_] = js.native
    def apply[T](collection: Iterable[T]): Stack[T] = js.native
    
    /**
      * True if the provided value is a Stack
      */
    def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
    
    /**
      * Creates a new Stack containing `values`.
      */
    def of[T](values: T*): Stack[T] = js.native
  }
}
