package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableObjectMixin[T] extends js.Object {
  def asMutable(): T = js.native
  def asMutable(opts: AsMutableOptions): T = js.native
  def getIn(propertyPath: js.Array[java.lang.String]): Immutable[_] = js.native
  def getIn[TValue](propertyPath: js.Array[java.lang.String], defaultValue: TValue): Immutable[TValue] = js.native
  def getIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
  ): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */](propertyPath: js.Tuple2[K, L]): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))) */js.Any
  ): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](propertyPath: js.Tuple3[K, L, M]): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](propertyPath: js.Tuple4[K, L, M, N]): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))) */js.Any
  ): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](propertyPath: js.Tuple5[K, L, M, N, O]): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))),Left(TsIdentSimple(O))) */js.Any
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))),Left(TsIdentSimple(O))) */js.Any
  ): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))),Left(TsIdentSimple(O))) */js.Any
  ] = js.native
  @JSName("getIn")
  def getIn_KString[K /* <: java.lang.String */](propertyPath: js.Array[K]): Immutable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
  ] = js.native
  def merge(part: DeepPartial[T]): Immutable[T] = js.native
  def merge(part: DeepPartial[T], config: MergeConfig): Immutable[T] = js.native
  def replace[S](valueObj: S): Immutable[S] = js.native
  def replace[S](valueObj: S, options: ReplaceConfig): Immutable[S] = js.native
  def set[K /* <: java.lang.String */](
    property: K,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
  ): Immutable[T] = js.native
  def set[TValue](property: java.lang.String, value: TValue): Immutable[T] = js.native
  def setIn[TValue](propertyPath: js.Array[java.lang.String], value: TValue): Immutable[T] = js.native
  def setIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) */js.Any
  ): Immutable[T] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))) */js.Any
  ): Immutable[T] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](
    propertyPath: js.Tuple3[K, L, M],
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))) */js.Any
  ): Immutable[T] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))) */js.Any
  ): Immutable[T] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))),Left(TsIdentSimple(O))) */js.Any
  ): Immutable[T] = js.native
  def update[K /* <: java.lang.String */](
    property: K,
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def update[TValue](
    property: java.lang.String,
    updaterFunction: js.Function2[/* value */ TValue, /* repeated */js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def updateIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](
    propertyPath: js.Tuple3[K, L, M],
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    updaterFunction: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))),Left(TsIdentSimple(L))),Left(TsIdentSimple(M))),Left(TsIdentSimple(N))),Left(TsIdentSimple(O))) *//* value */ js.Any, 
      /* repeated */js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  @JSName("updateIn")
  def updateIn_TValue[TValue](
    propertyPath: js.Array[java.lang.String],
    updaterFunction: js.Function2[/* value */ TValue, /* repeated */js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T] = js.native
  def without[K /* <: java.lang.String */](
    filter: js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(K))) *//* value */ js.Any, 
      /* key */ K, 
      scala.Boolean
    ]
  ): Immutable[T] = js.native
  def without[K /* <: java.lang.String */](properties: K*): Immutable[T] = js.native
  def without[K /* <: java.lang.String */](property: K): Immutable[T] = js.native
}

