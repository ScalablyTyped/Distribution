package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofImmutable extends js.Object {
  val CollectionNs: TypeofCollection = js.native
  val ListNs: TypeofList = js.native
  val MapNs: TypeofMap = js.native
  val OrderedMapNs: TypeofOrderedMap = js.native
  val OrderedSetNs: TypeofOrderedSet = js.native
  val RecordNs: TypeofRecord = js.native
  val SeqNs: TypeofSeq = js.native
  val SetNs: TypeofSet = js.native
  val StackNs: TypeofStack = js.native
  def Collection[I /* <: immutableLib.immutableMod.Collection[_, _] */](collection: I): I = js.native
  def Collection[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.CollectionNs.Indexed[T] = js.native
  def Collection[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.CollectionNs.Keyed[java.lang.String, V] = js.native
  def List(): immutableLib.immutableMod.List[_] = js.native
  def List[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.List[T] = js.native
  @JSName("List")
  def List_T[T](): immutableLib.immutableMod.List[T] = js.native
  def Map(): immutableLib.immutableMod.Map[_, _] = js.native
  def Map[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.Map[java.lang.String, V] = js.native
  def Map[K, V](collection: stdLib.Iterable[js.Tuple2[K, V]]): immutableLib.immutableMod.Map[K, V] = js.native
  @JSName("Map")
  def Map_KV[K, V](): immutableLib.immutableMod.Map[K, V] = js.native
  def OrderedMap(): immutableLib.immutableMod.OrderedMap[_, _] = js.native
  def OrderedMap[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.OrderedMap[java.lang.String, V] = js.native
  def OrderedMap[K, V](collection: stdLib.Iterable[js.Tuple2[K, V]]): immutableLib.immutableMod.OrderedMap[K, V] = js.native
  @JSName("OrderedMap")
  def OrderedMap_KV[K, V](): immutableLib.immutableMod.OrderedMap[K, V] = js.native
  def OrderedSet(): immutableLib.immutableMod.OrderedSet[_] = js.native
  def OrderedSet[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.OrderedSet[T] = js.native
  @JSName("OrderedSet")
  def OrderedSet_T[T](): immutableLib.immutableMod.OrderedSet[T] = js.native
  def Range(): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double, end: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Range(start: scala.Double, end: scala.Double, step: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[scala.Double] = js.native
  def Record[TProps](defaultValues: TProps): immutableLib.immutableMod.RecordNs.Factory[TProps] = js.native
  def Record[TProps](defaultValues: TProps, name: java.lang.String): immutableLib.immutableMod.RecordNs.Factory[TProps] = js.native
  def Repeat[T](value: T): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Repeat[T](value: T, times: scala.Double): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq(): immutableLib.immutableMod.Seq[_, _] = js.native
  def Seq[T](collection: immutableLib.immutableMod.CollectionNs.Indexed[T]): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[T](collection: immutableLib.immutableMod.CollectionNs.Set[T]): immutableLib.immutableMod.SeqNs.Set[T] = js.native
  def Seq[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[V](obj: org.scalablytyped.runtime.StringDictionary[V]): immutableLib.immutableMod.SeqNs.Keyed[java.lang.String, V] = js.native
  def Seq[S /* <: immutableLib.immutableMod.Seq[_, _] */](seq: S): S = js.native
  def Seq[K, V](collection: immutableLib.immutableMod.CollectionNs.Keyed[K, V]): immutableLib.immutableMod.SeqNs.Keyed[K, V] = js.native
  def Set(): immutableLib.immutableMod.Set[_] = js.native
  def Set[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): immutableLib.immutableMod.Set[T] = js.native
  def Stack(): immutableLib.immutableMod.Stack[_] = js.native
  def Stack[T](collection: stdLib.Iterable[T]): immutableLib.immutableMod.Stack[T] = js.native
  @JSName("Stack")
  def Stack_T[T](): immutableLib.immutableMod.Stack[T] = js.native
  def fromJS(jsValue: js.Any): js.Any = js.native
  def fromJS(
    jsValue: js.Any,
    reviver: js.Function3[
      /* key */ java.lang.String | scala.Double, 
      /* sequence */ (immutableLib.immutableMod.CollectionNs.Keyed[java.lang.String, _]) | immutableLib.immutableMod.CollectionNs.Indexed[_], 
      /* path */ js.UndefOr[js.Array[java.lang.String | scala.Double]], 
      _
    ]
  ): js.Any = js.native
  def get[V](collection: js.Array[V], key: scala.Double): js.UndefOr[V] = js.native
  def get[V](collection: org.scalablytyped.runtime.StringDictionary[V], key: java.lang.String): js.UndefOr[V] = js.native
  def get[K, V](collection: immutableLib.immutableMod.Collection[K, V], key: K): js.UndefOr[V] = js.native
  def get[V, NSV](collection: js.Array[V], key: scala.Double, notSetValue: NSV): V | NSV = js.native
  def get[V, NSV](collection: org.scalablytyped.runtime.StringDictionary[V], key: java.lang.String, notSetValue: NSV): V | NSV = js.native
  def get[C /* <: js.Object */, K /* <: java.lang.String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any = js.native
  def get[TProps, K /* <: java.lang.String */](record: immutableLib.immutableMod.Record[TProps], key: K, notSetValue: js.Any): /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[K, V, NSV](collection: immutableLib.immutableMod.Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
  def getIn(collection: js.Any, keyPath: stdLib.Iterable[_], notSetValue: js.Any): js.Any = js.native
  def has(collection: js.Object, key: js.Any): scala.Boolean = js.native
  def hasIn(collection: js.Any, keyPath: stdLib.Iterable[_]): scala.Boolean = js.native
  def hash(value: js.Any): scala.Double = js.native
  def is(first: js.Any, second: js.Any): scala.Boolean = js.native
  def isAssociative(maybeAssociative: js.Any): scala.Boolean = js.native
  def isCollection(maybeCollection: js.Any): /* is immutable.immutable.Collection<any, any> */ scala.Boolean = js.native
  def isImmutable(maybeImmutable: js.Any): /* is immutable.immutable.Collection<any, any> */ scala.Boolean = js.native
  def isIndexed(maybeIndexed: js.Any): /* is immutable.immutable.Collection.Indexed<any> */ scala.Boolean = js.native
  def isKeyed(maybeKeyed: js.Any): /* is immutable.immutable.Collection.Keyed<any, any> */ scala.Boolean = js.native
  def isList(maybeList: js.Any): /* is immutable.immutable.List<any> */ scala.Boolean = js.native
  def isMap(maybeMap: js.Any): /* is immutable.immutable.Map<any, any> */ scala.Boolean = js.native
  def isOrdered(maybeOrdered: js.Any): scala.Boolean = js.native
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.immutable.OrderedMap<any, any> */ scala.Boolean = js.native
  def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.immutable.OrderedSet<any> */ scala.Boolean = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ scala.Boolean = js.native
  def isSeq(maybeSeq: js.Any): scala.Boolean = js.native
  def isSet(maybeSet: js.Any): /* is immutable.immutable.Set<any> */ scala.Boolean = js.native
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ scala.Boolean = js.native
  def isValueObject(maybeValue: js.Any): /* is immutable.immutable.ValueObject */ scala.Boolean = js.native
  def merge[C](
    collection: C,
    collections: ((stdLib.Iterable[_ | (js.Tuple2[_, _])]) | org.scalablytyped.runtime.StringDictionary[js.Any])*
  ): C = js.native
  def mergeDeep[C](
    collection: C,
    collections: ((stdLib.Iterable[_ | (js.Tuple2[_, _])]) | org.scalablytyped.runtime.StringDictionary[js.Any])*
  ): C = js.native
  def mergeDeepWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((stdLib.Iterable[_ | (js.Tuple2[_, _])]) | org.scalablytyped.runtime.StringDictionary[js.Any])*
  ): C = js.native
  def mergeWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((stdLib.Iterable[_ | (js.Tuple2[_, _])]) | org.scalablytyped.runtime.StringDictionary[js.Any])*
  ): C = js.native
  def remove[C /* <: js.Array[_] */](collection: C, key: scala.Double): C = js.native
  def remove[K, C /* <: immutableLib.immutableMod.Collection[K, _] */](collection: C, key: K): C = js.native
  def removeIn[C](collection: C, keyPath: stdLib.Iterable[_]): C = js.native
  @JSName("remove")
  def remove_CKString[C, K /* <: java.lang.String */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_CStringDictionaryKString[C /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, K /* <: java.lang.String */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_TPropsCRecordKString[TProps, C /* <: immutableLib.immutableMod.Record[TProps] */, K /* <: java.lang.String */](collection: C, key: K): C = js.native
  def set[V, C /* <: org.scalablytyped.runtime.StringDictionary[V] */](collection: C, key: java.lang.String, value: V): C = js.native
  def set[V, C /* <: js.Array[V] */](collection: C, key: scala.Double, value: V): C = js.native
  def set[C, K /* <: java.lang.String */](
    `object`: C,
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  def set[K, V, C /* <: immutableLib.immutableMod.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
  def setIn[C](collection: C, keyPath: stdLib.Iterable[_], value: js.Any): C = js.native
  @JSName("set")
  def set_TPropsCRecordKString[TProps, C /* <: immutableLib.immutableMod.Record[TProps] */, K /* <: java.lang.String */](
    record: C,
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
  ): C = js.native
  def update[V](collection: js.Array[V], key: scala.Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
  def update[V, NSV](
    collection: js.Array[V],
    key: scala.Double,
    notSetValue: NSV,
    updater: js.Function1[/* value */ V | NSV, V]
  ): js.Array[V] = js.native
  def update[C, K /* <: java.lang.String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def update[C, K /* <: java.lang.String */, NSV](
    `object`: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any) | NSV, 
      /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def updateIn[C](
    collection: C,
    keyPath: stdLib.Iterable[_],
    notSetValue: js.Any,
    updater: js.Function1[/* value */ js.Any, _]
  ): C = js.native
  def updateIn[C](collection: C, keyPath: stdLib.Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
  @JSName("update")
  def update_KVCCollection[K, V, C /* <: immutableLib.immutableMod.Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
  @JSName("update")
  def update_KVCCollectionNSV[K, V, C /* <: immutableLib.immutableMod.Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
  @JSName("update")
  def update_TPropsCRecordKString[TProps, C /* <: immutableLib.immutableMod.Record[TProps] */, K /* <: java.lang.String */](
    record: C,
    key: K,
    updater: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_TPropsCRecordKStringNSV[TProps, C /* <: immutableLib.immutableMod.Record[TProps] */, K /* <: java.lang.String */, NSV](
    record: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_VCStringDictionaryKStringNSVStringDictionary[V, C /* <: org.scalablytyped.runtime.StringDictionary[V] */, K /* <: java.lang.String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): org.scalablytyped.runtime.StringDictionary[V] = js.native
  @JSName("update")
  def update_VCStringDictionaryKStringStringDictionary[V, C /* <: org.scalablytyped.runtime.StringDictionary[V] */, K /* <: java.lang.String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): org.scalablytyped.runtime.StringDictionary[V] = js.native
}

