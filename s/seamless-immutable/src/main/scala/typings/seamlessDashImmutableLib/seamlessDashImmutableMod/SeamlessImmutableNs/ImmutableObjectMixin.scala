package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod.SeamlessImmutableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImmutableObjectMixin[T] extends js.Object {
  def asMutable(): T = js.native
  def asMutable(opts: AsMutableOptions): T = js.native
  def getIn(propertyPath: js.Array[java.lang.String]): Immutable[_, js.Object] = js.native
  def getIn[TValue](propertyPath: js.Array[java.lang.String], defaultValue: TValue): Immutable[TValue, js.Object] = js.native
  def getIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    defaultValue: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */](propertyPath: js.Tuple2[K, L]): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    defaultValue: /* import warning: ImportType.apply Failed type conversion: T[K][L] */ js.Any
  ): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](propertyPath: js.Tuple3[K, L, M]): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L][M] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](propertyPath: js.Tuple4[K, L, M, N]): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    defaultValue: /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N] */ js.Any
  ): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](propertyPath: js.Tuple5[K, L, M, N, O]): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    defaultValue: /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N][O] */ js.Any
  ): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
    js.Object
  ] = js.native
  @JSName("getIn")
  def getIn_KString[K /* <: java.lang.String */](propertyPath: js.Array[K]): Immutable[
    /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any, 
    js.Object
  ] = js.native
  def merge(part: DeepPartial[T]): Immutable[T, js.Object] = js.native
  def merge(part: DeepPartial[T], config: MergeConfig): Immutable[T, js.Object] = js.native
  def replace[S](valueObj: S): Immutable[S, js.Object] = js.native
  def replace[S](valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
  def set[K /* <: java.lang.String */](property: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): Immutable[T, js.Object] = js.native
  def set[TValue](property: java.lang.String, value: TValue): Immutable[T, js.Object] = js.native
  def setIn[TValue](propertyPath: js.Array[java.lang.String], value: TValue): Immutable[T, js.Object] = js.native
  def setIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    value: /* import warning: ImportType.apply Failed type conversion: T[K][L] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](
    propertyPath: js.Tuple3[K, L, M],
    value: /* import warning: ImportType.apply Failed type conversion: T[K][L][M] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    value: /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    value: /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N][O] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def update[K /* <: java.lang.String */](
    property: K,
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def update[TValue](
    property: java.lang.String,
    updaterFunction: js.Function2[/* value */ TValue, /* repeated */ js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: java.lang.String */](
    propertyPath: js.Array[K],
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */](
    propertyPath: js.Tuple2[K, L],
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K][L] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */](
    propertyPath: js.Tuple3[K, L, M],
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K][L][M] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */](
    propertyPath: js.Tuple4[K, L, M, N],
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: java.lang.String */, L /* <: java.lang.String */, M /* <: java.lang.String */, N /* <: java.lang.String */, O /* <: java.lang.String */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    updaterFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K][L][M][N][O] */ /* value */ js.Any, 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  @JSName("updateIn")
  def updateIn_TValue[TValue](
    propertyPath: js.Array[java.lang.String],
    updaterFunction: js.Function2[/* value */ TValue, /* repeated */ js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def without[K /* <: java.lang.String */](
    filter: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[K] */ /* value */ js.Any, 
      /* key */ K, 
      scala.Boolean
    ]
  ): Immutable[T, js.Object] = js.native
  def without[K /* <: java.lang.String */](properties: K*): Immutable[T, js.Object] = js.native
  def without[K /* <: java.lang.String */](property: K): Immutable[T, js.Object] = js.native
}

