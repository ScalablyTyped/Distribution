package typings.remotedevDashSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Collection.Keyed
import typings.immutable.Immutable.Seq.Indexed
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofImmutable extends js.Object {
  val Collection: TypeofCollection = js.native
  val List: TypeofList = js.native
  val Map: TypeofMap = js.native
  val OrderedMap: TypeofOrderedMap = js.native
  val OrderedSet: TypeofOrderedSet = js.native
  val Record: TypeofRecord = js.native
  val Seq: TypeofSeq = js.native
  val Set: TypeofSetCollectionFromKeys = js.native
  val Stack: TypeofStack = js.native
  def Range(): Indexed[Double] = js.native
  def Range(start: Double): Indexed[Double] = js.native
  def Range(start: Double, end: Double): Indexed[Double] = js.native
  def Range(start: Double, end: Double, step: Double): Indexed[Double] = js.native
  def Repeat[T](value: T): Indexed[T] = js.native
  def Repeat[T](value: T, times: Double): Indexed[T] = js.native
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
  def get[C /* <: js.Object */, K /* <: String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
  def get[TProps, K /* <: String */](record: typings.immutable.Immutable.Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
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
  def remove[C /* <: StringDictionary[js.Any] */, K /* <: String */](collection: C, key: K): C = js.native
  def removeIn[C](collection: C, keyPath: Iterable[_]): C = js.native
  @JSName("remove")
  def remove_CK_String[C, K /* <: String */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_KC_CollectionKWildcard[K, C /* <: typings.immutable.Immutable.Collection[K, _] */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: String */](collection: C, key: K): C = js.native
  def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
  def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
  def set[C, K /* <: String */](
    `object`: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  def set[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
  def setIn[C](collection: C, keyPath: Iterable[_], value: js.Any): C = js.native
  @JSName("set")
  def set_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: String */](
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
  def update[C, K /* <: String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def update[C, K /* <: String */, NSV](
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
  def update_TPropsC_RecordTPropsK_String[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: String */](
    record: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: typings.immutable.Immutable.Record[TProps] */, K /* <: String */, NSV](
    record: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
  @JSName("update")
  def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
}

