package typings.seamlessImmutable

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.seamlessImmutable.mod.Immutable.MakeImmutable
import typings.seamlessImmutable.mod.ImmutableArray.Additions
import typings.seamlessImmutable.mod.ImmutableArray.Overrides
import typings.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer
import typings.seamlessImmutable.mod.ImmutableArray.Remaining
import typings.seamlessImmutable.seamlessImmutableBooleans.`false`
import typings.seamlessImmutable.seamlessImmutableBooleans.`true`
import typings.seamlessImmutable.seamlessImmutableStrings.asMutable
import typings.seamlessImmutable.seamlessImmutableStrings.concat
import typings.seamlessImmutable.seamlessImmutableStrings.filter
import typings.seamlessImmutable.seamlessImmutableStrings.forEach
import typings.seamlessImmutable.seamlessImmutableStrings.map
import typings.seamlessImmutable.seamlessImmutableStrings.merge
import typings.seamlessImmutable.seamlessImmutableStrings.pop
import typings.seamlessImmutable.seamlessImmutableStrings.push
import typings.seamlessImmutable.seamlessImmutableStrings.reduce
import typings.seamlessImmutable.seamlessImmutableStrings.reduceRight
import typings.seamlessImmutable.seamlessImmutableStrings.replace
import typings.seamlessImmutable.seamlessImmutableStrings.reverse
import typings.seamlessImmutable.seamlessImmutableStrings.shift
import typings.seamlessImmutable.seamlessImmutableStrings.slice
import typings.seamlessImmutable.seamlessImmutableStrings.sort
import typings.seamlessImmutable.seamlessImmutableStrings.splice
import typings.seamlessImmutable.seamlessImmutableStrings.unshift
import typings.std.Date
import typings.std.Error
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seamless-immutable", JSImport.Namespace)
  @js.native
  def apply[T](obj: T): Immutable[T, js.Object] = js.native
  @JSImport("seamless-immutable", JSImport.Namespace)
  @js.native
  def apply[T](obj: T, options: Options): Immutable[T, js.Object] = js.native
  
  @JSImport("seamless-immutable", "ImmutableError")
  @js.native
  def ImmutableError(message: String): Error = js.native
  
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.asMutable with TopLevel[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: T, opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.asMutable with TopLevel[T]) = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: js.Array[T]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: js.Array[T], opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: ImmutableArray[T]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: ImmutableArray[T], opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: ImmutableObject[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.asMutable with TopLevel[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable[T](obj: ImmutableObject[T], opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ typings.seamlessImmutable.seamlessImmutableStrings.asMutable with TopLevel[T]) = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_false[T](obj: T, opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ asMutable with TopLevel[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_false[T](obj: js.Array[T], opts: AsMutableOptions[`false`]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_false[T](obj: ImmutableArray[T], opts: AsMutableOptions[`false`]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_false[T](obj: ImmutableObject[T], opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>}
    */ asMutable with TopLevel[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_true[T](obj: T, opts: AsMutableOptions[`true`]): T = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_true[T](obj: js.Array[T], opts: AsMutableOptions[`true`]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_true[T](obj: ImmutableArray[T], opts: AsMutableOptions[`true`]): js.Array[T] = js.native
  @JSImport("seamless-immutable", "asMutable")
  @js.native
  def asMutable_true[T](obj: ImmutableObject[T], opts: AsMutableOptions[`true`]): T = js.native
  
  @JSImport("seamless-immutable", "from")
  @js.native
  def from[T](obj: T): Immutable[T, js.Object] = js.native
  @JSImport("seamless-immutable", "from")
  @js.native
  def from[T](obj: T, options: Options): Immutable[T, js.Object] = js.native
  
  @JSImport("seamless-immutable", "isImmutable")
  @js.native
  def isImmutable[T](target: T): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean = js.native
  @JSImport("seamless-immutable", "isImmutable")
  @js.native
  def isImmutable[T](target: Immutable[T, js.Object]): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean = js.native
  
  @JSImport("seamless-immutable", "replace")
  @js.native
  def replace[T, S](obj: Immutable[T, js.Object], valueObj: S): Immutable[S, js.Object] = js.native
  @JSImport("seamless-immutable", "replace")
  @js.native
  def replace[T, S](obj: Immutable[T, js.Object], valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
  
  @js.native
  trait AsMutableOptions[TDeep /* <: Boolean */] extends StObject {
    
    var deep: TDeep = js.native
  }
  object AsMutableOptions {
    
    @scala.inline
    def apply[TDeep /* <: Boolean */](deep: TDeep): AsMutableOptions[TDeep] = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsMutableOptions[TDeep]]
    }
    
    @scala.inline
    implicit class AsMutableOptionsMutableBuilder[Self <: AsMutableOptions[_], TDeep /* <: Boolean */] (val x: Self with AsMutableOptions[TDeep]) extends AnyVal {
      
      @scala.inline
      def setDeep(value: TDeep): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias seamless-immutable.seamless-immutable.DeepPartial<T[P]> * / object}
    */ typings.seamlessImmutable.seamlessImmutableStrings.DeepPartial with TopLevel[js.Any]
  
  object Immutable {
    
    type AlreadyImmutable[O /* <: js.Object */] = ImmutableObject[O] | ImmutableArray[js.Any] | ImmutableDate
    
    type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
    
    type CannotMakeImmutable[O /* <: js.Object */] = AlreadyImmutable[O] | Primitive
    
    type MakeImmutable[T, O /* <: js.Object */] = ImmutableObject[T] | ImmutableDate | ImmutableArray[js.Any] | T
    
    type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | AnyFunction | Null]
  }
  type Immutable[T, O /* <: js.Object */] = (MakeImmutable[T, O]) | (js.Promise[MakeImmutable[js.Any, O]])
  
  object ImmutableArray {
    
    /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
    /* Inlined std.Extract<std.Array<keyof any>, 'copyWithin' | 'fill'> */
    /* Rewritten from type alias, can be one of: 
      - typings.seamlessImmutable.seamlessImmutableStrings.fill
      - typings.seamlessImmutable.seamlessImmutableStrings.copyWithin
    */
    trait AdditionalMutatingArrayMethods extends StObject
    object AdditionalMutatingArrayMethods {
      
      @scala.inline
      def copyWithin: typings.seamlessImmutable.seamlessImmutableStrings.copyWithin = "copyWithin".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.copyWithin]
      
      @scala.inline
      def fill: typings.seamlessImmutable.seamlessImmutableStrings.fill = "fill".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.fill]
    }
    
    /** New methods added by seamless-immutable. */
    @js.native
    trait Additions[T] extends StObject {
      
      def asMutable(): js.Array[Immutable[T, js.Object]] = js.native
      def asMutable(opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = js.native
      @JSName("asMutable")
      def asMutable_false(opts: AsMutableOptions[`false`]): js.Array[Immutable[T, js.Object]] = js.native
      @JSName("asMutable")
      def asMutable_true(opts: AsMutableOptions[`true`]): js.Array[T] = js.native
      
      def asObject[U /* <: js.Object */, K /* <: /* keyof U */ String */](
        toKeyValue: js.Function1[
              /* item */ T, 
              js.Tuple2[
                K, 
                /* import warning: importer.ImportType#apply Failed type conversion: U[K] */ js.Any
              ]
            ]
      ): Immutable[U, js.Object] = js.native
      
      def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): Immutable[js.Array[TTarget] | TTarget, js.Object] = js.native
    }
    
    /** These methods are banned by seamless-immutable. */
    type MutatingArrayMethods = Extract[
        js.Array[/* keyof any */ String], 
        push | pop | sort | splice | shift | unshift | reverse | Double
      ]
    
    /** Custom implementation of the array functions, which return Immutable. */
    @js.native
    trait Overrides[T] extends StObject {
      
      def concat(arr: (T | (js.Array[(Immutable[T, js.Object]) | T]) | (Immutable[js.Array[T] | T, js.Object]))*): Immutable[js.Array[T], js.Object] = js.native
      
      def filter(filterFunction: js.Function2[/* item */ Immutable[T, js.Object], /* index */ Double, Boolean]): Immutable[js.Array[T], js.Object] = js.native
      
      def forEach(
        callbackfn: js.Function3[
              /* value */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              Unit
            ]
      ): Unit = js.native
      def forEach(
        callbackfn: js.Function3[
              /* value */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              Unit
            ],
        thisArg: js.Any
      ): Unit = js.native
      
      def map[TTarget](
        mapFuction: js.Function3[
              /* item */ Immutable[T, js.Object], 
              /* index */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[js.Array[TTarget], js.Object] = js.native
      
      def reduce(
        callbackfn: js.Function4[
              /* previousValue */ Immutable[T, js.Object], 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              T
            ]
      ): Immutable[T, js.Object] = js.native
      def reduce[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ],
        initialValue: TTarget
      ): Immutable[TTarget, js.Object] = js.native
      
      def reduceRight(
        callbackfn: js.Function4[
              /* previousValue */ Immutable[T, js.Object], 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              T
            ]
      ): Immutable[T, js.Object] = js.native
      def reduceRight[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ],
        initialValue: TTarget
      ): Immutable[TTarget, js.Object] = js.native
      @JSName("reduceRight")
      def reduceRight_TTarget[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[TTarget, js.Object] = js.native
      
      @JSName("reduce")
      def reduce_TTarget[TTarget](
        callbackfn: js.Function4[
              /* previousValue */ TTarget, 
              /* currentValue */ Immutable[T, js.Object], 
              /* currentIndex */ Double, 
              /* array */ Immutable[js.Array[T], js.Object], 
              TTarget
            ]
      ): Immutable[TTarget, js.Object] = js.native
      
      def slice(): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: js.UndefOr[scala.Nothing], end: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Double, end: Double): Immutable[js.Array[T], js.Object] = js.native
    }
    
    /** Merging this into Overrides breaks stuff, so this is split out */
    @js.native
    trait ReadOnlyIndexer[T]
      extends /* key */ NumberDictionary[Immutable[T, js.Object]]
    object ReadOnlyIndexer {
      
      @scala.inline
      def apply[T](): ReadOnlyIndexer[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReadOnlyIndexer[T]]
      }
    }
    
    /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
    type Remaining[T] = Omit[
        js.Array[T], 
        MutatingArrayMethods | AdditionalMutatingArrayMethods | forEach | map | filter | slice | concat | reduce | reduceRight
      ]
  }
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] with Additions[T] with Overrides[T] with ReadOnlyIndexer[T]
  
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  /* Inlined seamless-immutable.seamless-immutable.ImmutableDate.Remaining & seamless-immutable.seamless-immutable.ImmutableDate.Additions */
  @js.native
  trait ImmutableDate extends StObject {
    
    def asMutable(): Date = js.native
    
    def getDate(): Double = js.native
    @JSName("getDate")
    var getDate_Original: js.Function0[Double] = js.native
    
    def getDay(): Double = js.native
    @JSName("getDay")
    var getDay_Original: js.Function0[Double] = js.native
    
    def getFullYear(): Double = js.native
    @JSName("getFullYear")
    var getFullYear_Original: js.Function0[Double] = js.native
    
    def getHours(): Double = js.native
    @JSName("getHours")
    var getHours_Original: js.Function0[Double] = js.native
    
    def getMilliseconds(): Double = js.native
    @JSName("getMilliseconds")
    var getMilliseconds_Original: js.Function0[Double] = js.native
    
    def getMinutes(): Double = js.native
    @JSName("getMinutes")
    var getMinutes_Original: js.Function0[Double] = js.native
    
    def getMonth(): Double = js.native
    @JSName("getMonth")
    var getMonth_Original: js.Function0[Double] = js.native
    
    def getSeconds(): Double = js.native
    @JSName("getSeconds")
    var getSeconds_Original: js.Function0[Double] = js.native
    
    def getTime(): Double = js.native
    @JSName("getTime")
    var getTime_Original: js.Function0[Double] = js.native
    
    def getTimezoneOffset(): Double = js.native
    @JSName("getTimezoneOffset")
    var getTimezoneOffset_Original: js.Function0[Double] = js.native
    
    def getUTCDate(): Double = js.native
    @JSName("getUTCDate")
    var getUTCDate_Original: js.Function0[Double] = js.native
    
    def getUTCDay(): Double = js.native
    @JSName("getUTCDay")
    var getUTCDay_Original: js.Function0[Double] = js.native
    
    def getUTCFullYear(): Double = js.native
    @JSName("getUTCFullYear")
    var getUTCFullYear_Original: js.Function0[Double] = js.native
    
    def getUTCHours(): Double = js.native
    @JSName("getUTCHours")
    var getUTCHours_Original: js.Function0[Double] = js.native
    
    def getUTCMilliseconds(): Double = js.native
    @JSName("getUTCMilliseconds")
    var getUTCMilliseconds_Original: js.Function0[Double] = js.native
    
    def getUTCMinutes(): Double = js.native
    @JSName("getUTCMinutes")
    var getUTCMinutes_Original: js.Function0[Double] = js.native
    
    def getUTCMonth(): Double = js.native
    @JSName("getUTCMonth")
    var getUTCMonth_Original: js.Function0[Double] = js.native
    
    def getUTCSeconds(): Double = js.native
    @JSName("getUTCSeconds")
    var getUTCSeconds_Original: js.Function0[Double] = js.native
    
    def getVarDate(): VarDate = js.native
    @JSName("getVarDate")
    var getVarDate_Original: js.Function0[VarDate] = js.native
    
    def toDateString(): String = js.native
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String] = js.native
    
    def toISOString(): String = js.native
    @JSName("toISOString")
    var toISOString_Original: js.Function0[String] = js.native
    
    def toJSON(): String = js.native
    @JSName("toJSON")
    var toJSON_Original: js.Function0[String] = js.native
    
    def toLocaleDateString(): String = js.native
    @JSName("toLocaleDateString")
    var toLocaleDateString_Original: js.Function0[String] = js.native
    
    @JSName("toLocaleString")
    var toLocaleString_Original: js.Function0[String] = js.native
    
    def toLocaleTimeString(): String = js.native
    @JSName("toLocaleTimeString")
    var toLocaleTimeString_Original: js.Function0[String] = js.native
    
    @JSName("toString")
    var toString_Original: js.Function0[String] = js.native
    
    def toTimeString(): String = js.native
    @JSName("toTimeString")
    var toTimeString_Original: js.Function0[String] = js.native
    
    def toUTCString(): String = js.native
    @JSName("toUTCString")
    var toUTCString_Original: js.Function0[String] = js.native
    
    @JSName("valueOf")
    var valueOf_Original: js.Function0[Double] = js.native
  }
  object ImmutableDate {
    
    /** New functions added by seamless-immutable. */
    @js.native
    trait Additions extends StObject {
      
      def asMutable(): Date = js.native
    }
    object Additions {
      
      @scala.inline
      def apply(asMutable: () => Date): typings.seamlessImmutable.mod.ImmutableDate.Additions = {
        val __obj = js.Dynamic.literal(asMutable = js.Any.fromFunction0(asMutable))
        __obj.asInstanceOf[typings.seamlessImmutable.mod.ImmutableDate.Additions]
      }
      
      @scala.inline
      implicit class AdditionsMutableBuilder[Self <: typings.seamlessImmutable.mod.ImmutableDate.Additions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsMutable(value: () => Date): Self = StObject.set(x, "asMutable", js.Any.fromFunction0(value))
      }
    }
    
    // These methods are banned by seamless-immutable
    /* Inlined std.Extract<keyof std.Date, 'setDate' | 'setFullYear' | 'setHours' | 'setMilliseconds' | 'setMinutes' | 'setMonth' | 'setSeconds' | 'setTime' | 'setUTCDate' | 'setUTCFullYear' | 'setUTCHours' | 'setUTCMilliseconds' | 'setUTCMinutes' | 'setUTCMonth' | 'setUTCSeconds' | 'setYear'> */
    /* Rewritten from type alias, can be one of: 
      - typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate
      - typings.seamlessImmutable.seamlessImmutableStrings.setTime
      - typings.seamlessImmutable.seamlessImmutableStrings.setDate
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours
      - typings.seamlessImmutable.seamlessImmutableStrings.setMinutes
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds
      - typings.seamlessImmutable.seamlessImmutableStrings.setFullYear
      - typings.seamlessImmutable.seamlessImmutableStrings.setMonth
      - typings.seamlessImmutable.seamlessImmutableStrings.setSeconds
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear
      - typings.seamlessImmutable.seamlessImmutableStrings.setHours
      - typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth
    */
    trait MutatingDateMethods extends StObject
    object MutatingDateMethods {
      
      @scala.inline
      def setDate: typings.seamlessImmutable.seamlessImmutableStrings.setDate = "setDate".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setDate]
      
      @scala.inline
      def setFullYear: typings.seamlessImmutable.seamlessImmutableStrings.setFullYear = "setFullYear".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setFullYear]
      
      @scala.inline
      def setHours: typings.seamlessImmutable.seamlessImmutableStrings.setHours = "setHours".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setHours]
      
      @scala.inline
      def setMilliseconds: typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds = "setMilliseconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds]
      
      @scala.inline
      def setMinutes: typings.seamlessImmutable.seamlessImmutableStrings.setMinutes = "setMinutes".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMinutes]
      
      @scala.inline
      def setMonth: typings.seamlessImmutable.seamlessImmutableStrings.setMonth = "setMonth".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMonth]
      
      @scala.inline
      def setSeconds: typings.seamlessImmutable.seamlessImmutableStrings.setSeconds = "setSeconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setSeconds]
      
      @scala.inline
      def setTime: typings.seamlessImmutable.seamlessImmutableStrings.setTime = "setTime".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setTime]
      
      @scala.inline
      def setUTCDate: typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate = "setUTCDate".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate]
      
      @scala.inline
      def setUTCFullYear: typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear = "setUTCFullYear".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear]
      
      @scala.inline
      def setUTCHours: typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours = "setUTCHours".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours]
      
      @scala.inline
      def setUTCMilliseconds: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds = "setUTCMilliseconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds]
      
      @scala.inline
      def setUTCMinutes: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes = "setUTCMinutes".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes]
      
      @scala.inline
      def setUTCMonth: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth = "setUTCMonth".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth]
      
      @scala.inline
      def setUTCSeconds: typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds = "setUTCSeconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds]
    }
    
    /** Only allows Date methods, which are the getters. */
    /* Inlined seamless-immutable.seamless-immutable.Omit<std.Date, seamless-immutable.seamless-immutable.ImmutableDate.MutatingDateMethods> */
    @js.native
    trait Remaining extends StObject {
      
      def getDate(): Double = js.native
      @JSName("getDate")
      var getDate_Original: js.Function0[Double] = js.native
      
      def getDay(): Double = js.native
      @JSName("getDay")
      var getDay_Original: js.Function0[Double] = js.native
      
      def getFullYear(): Double = js.native
      @JSName("getFullYear")
      var getFullYear_Original: js.Function0[Double] = js.native
      
      def getHours(): Double = js.native
      @JSName("getHours")
      var getHours_Original: js.Function0[Double] = js.native
      
      def getMilliseconds(): Double = js.native
      @JSName("getMilliseconds")
      var getMilliseconds_Original: js.Function0[Double] = js.native
      
      def getMinutes(): Double = js.native
      @JSName("getMinutes")
      var getMinutes_Original: js.Function0[Double] = js.native
      
      def getMonth(): Double = js.native
      @JSName("getMonth")
      var getMonth_Original: js.Function0[Double] = js.native
      
      def getSeconds(): Double = js.native
      @JSName("getSeconds")
      var getSeconds_Original: js.Function0[Double] = js.native
      
      def getTime(): Double = js.native
      @JSName("getTime")
      var getTime_Original: js.Function0[Double] = js.native
      
      def getTimezoneOffset(): Double = js.native
      @JSName("getTimezoneOffset")
      var getTimezoneOffset_Original: js.Function0[Double] = js.native
      
      def getUTCDate(): Double = js.native
      @JSName("getUTCDate")
      var getUTCDate_Original: js.Function0[Double] = js.native
      
      def getUTCDay(): Double = js.native
      @JSName("getUTCDay")
      var getUTCDay_Original: js.Function0[Double] = js.native
      
      def getUTCFullYear(): Double = js.native
      @JSName("getUTCFullYear")
      var getUTCFullYear_Original: js.Function0[Double] = js.native
      
      def getUTCHours(): Double = js.native
      @JSName("getUTCHours")
      var getUTCHours_Original: js.Function0[Double] = js.native
      
      def getUTCMilliseconds(): Double = js.native
      @JSName("getUTCMilliseconds")
      var getUTCMilliseconds_Original: js.Function0[Double] = js.native
      
      def getUTCMinutes(): Double = js.native
      @JSName("getUTCMinutes")
      var getUTCMinutes_Original: js.Function0[Double] = js.native
      
      def getUTCMonth(): Double = js.native
      @JSName("getUTCMonth")
      var getUTCMonth_Original: js.Function0[Double] = js.native
      
      def getUTCSeconds(): Double = js.native
      @JSName("getUTCSeconds")
      var getUTCSeconds_Original: js.Function0[Double] = js.native
      
      def getVarDate(): VarDate = js.native
      @JSName("getVarDate")
      var getVarDate_Original: js.Function0[VarDate] = js.native
      
      def toDateString(): String = js.native
      @JSName("toDateString")
      var toDateString_Original: js.Function0[String] = js.native
      
      def toISOString(): String = js.native
      @JSName("toISOString")
      var toISOString_Original: js.Function0[String] = js.native
      
      def toJSON(): String = js.native
      @JSName("toJSON")
      var toJSON_Original: js.Function0[String] = js.native
      
      def toLocaleDateString(): String = js.native
      @JSName("toLocaleDateString")
      var toLocaleDateString_Original: js.Function0[String] = js.native
      
      @JSName("toLocaleString")
      var toLocaleString_Original: js.Function0[String] = js.native
      
      def toLocaleTimeString(): String = js.native
      @JSName("toLocaleTimeString")
      var toLocaleTimeString_Original: js.Function0[String] = js.native
      
      @JSName("toString")
      var toString_Original: js.Function0[String] = js.native
      
      def toTimeString(): String = js.native
      @JSName("toTimeString")
      var toTimeString_Original: js.Function0[String] = js.native
      
      def toUTCString(): String = js.native
      @JSName("toUTCString")
      var toUTCString_Original: js.Function0[String] = js.native
      
      @JSName("valueOf")
      var valueOf_Original: js.Function0[Double] = js.native
    }
  }
  
  type ImmutableObject[T] = ImmutableObjectMixin[T] with typings.seamlessImmutable.seamlessImmutableStrings.ImmutableObject with TopLevel[T]
  
  @js.native
  trait ImmutableObjectMixin[T] extends StObject {
    
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
  
  @js.native
  trait MergeConfig extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.native
    
    var merger: js.UndefOr[js.Function3[/* a */ js.Any, /* b */ js.Any, /* config */ js.Any, _]] = js.native
    
    var mode: js.UndefOr[replace | merge] = js.native
  }
  object MergeConfig {
    
    @scala.inline
    def apply(): MergeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeConfig]
    }
    
    @scala.inline
    implicit class MergeConfigMutableBuilder[Self <: MergeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setMerger(value: (/* a */ js.Any, /* b */ js.Any, /* config */ js.Any) => _): Self = StObject.set(x, "merger", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMergerUndefined: Self = StObject.set(x, "merger", js.undefined)
      
      @scala.inline
      def setMode(value: replace | merge): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait Options extends StObject
  
  @js.native
  trait ReplaceConfig extends StObject {
    
    var deep: Boolean = js.native
  }
  object ReplaceConfig {
    
    @scala.inline
    def apply(deep: Boolean): ReplaceConfig = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceConfig]
    }
    
    @scala.inline
    implicit class ReplaceConfigMutableBuilder[Self <: ReplaceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
}
