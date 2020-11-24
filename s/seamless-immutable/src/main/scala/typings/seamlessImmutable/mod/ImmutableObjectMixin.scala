package typings.seamlessImmutable.mod

import org.scalablytyped.runtime.TopLevel
import typings.seamlessImmutable.seamlessImmutableBooleans.`false`
import typings.seamlessImmutable.seamlessImmutableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImmutableObjectMixin[T] extends js.Object {
  
  def asMutable(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.ImmutableObjectMixin with TopLevel[T] = js.native
  def asMutable(opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.ImmutableObjectMixin with TopLevel[T]) = js.native
  @JSName("asMutable")
  def asMutable_false(opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.ImmutableObjectMixin with TopLevel[T] = js.native
  @JSName("asMutable")
  def asMutable_true(opts: AsMutableOptions[`true`]): T = js.native
  
  def getIn(propertyPath: js.Array[String]): Immutable[_, js.Object] = js.native
  def getIn[TValue](propertyPath: js.Array[String], defaultValue: TValue): Immutable[TValue, js.Object] = js.native
  def getIn[K /* <: /* keyof T */ String */](
    propertyPath: js.Array[K],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](propertyPath: js.Tuple2[K, L]): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
    propertyPath: js.Tuple2[K, L],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any
  ): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](propertyPath: js.Tuple3[K, L, M]): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](propertyPath: js.Tuple4[K, L, M, N]): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
    propertyPath: js.Tuple4[K, L, M, N],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any
  ): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](propertyPath: js.Tuple5[K, L, M, N, O]): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
    js.Object
  ] = js.native
  def getIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any
  ): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
    js.Object
  ] = js.native
  @JSName("getIn")
  def getIn_K_String[K /* <: /* keyof T */ String */](propertyPath: js.Array[K]): Immutable[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    js.Object
  ] = js.native
  
  def merge(part: DeepPartial[T | (Immutable[T, js.Object])]): Immutable[T, js.Object] = js.native
  def merge(part: DeepPartial[T | (Immutable[T, js.Object])], config: MergeConfig): Immutable[T, js.Object] = js.native
  
  def replace[S](valueObj: S): Immutable[S, js.Object] = js.native
  def replace[S](valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
  
  def set[K /* <: /* keyof T */ String */](
    property: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def set[TValue](property: String, value: TValue): Immutable[T, js.Object] = js.native
  
  def setIn[TValue](propertyPath: js.Array[String], value: TValue): Immutable[T, js.Object] = js.native
  def setIn[K /* <: /* keyof T */ String */](
    propertyPath: js.Array[K],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
    propertyPath: js.Tuple2[K, L],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](
    propertyPath: js.Tuple3[K, L, M],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
    propertyPath: js.Tuple4[K, L, M, N],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any
  ): Immutable[T, js.Object] = js.native
  def setIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any
  ): Immutable[T, js.Object] = js.native
  
  def update[K /* <: /* keyof T */ String */](
    property: K,
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def update[TValue](
    property: String,
    updaterFunction: js.Function2[/* value */ Immutable[TValue, js.Object], /* repeated */ js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  
  def updateIn[K /* <: /* keyof T */ String */](
    propertyPath: js.Array[K],
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
    propertyPath: js.Tuple2[K, L],
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](
    propertyPath: js.Tuple3[K, L, M],
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
    propertyPath: js.Tuple4[K, L, M, N],
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
    propertyPath: js.Tuple5[K, L, M, N, O],
    updaterFunction: js.Function2[
      /* value */ Immutable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
        js.Object
      ], 
      /* repeated */ js.Any, 
      _
    ],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  @JSName("updateIn")
  def updateIn_TValue[TValue](
    propertyPath: js.Array[String],
    updaterFunction: js.Function2[/* value */ TValue, /* repeated */ js.Any, _],
    additionalArguments: js.Any*
  ): Immutable[T, js.Object] = js.native
  
  def without[K /* <: /* keyof T */ String */](
    filter: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* value */ js.Any, 
      /* key */ K, 
      Boolean
    ]
  ): Immutable[T, js.Object] = js.native
  def without[K /* <: /* keyof T */ String */](properties: K*): Immutable[T, js.Object] = js.native
  def without[K /* <: /* keyof T */ String */](property: K): Immutable[T, js.Object] = js.native
}
