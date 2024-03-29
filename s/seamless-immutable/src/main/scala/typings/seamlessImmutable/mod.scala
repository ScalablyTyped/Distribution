package typings.seamlessImmutable

import org.scalablytyped.runtime.NumberDictionary
import typings.seamlessImmutable.mod.ImmutableArray.Additions
import typings.seamlessImmutable.mod.ImmutableArray.Overrides
import typings.seamlessImmutable.mod.ImmutableArray.ReadOnlyIndexer
import typings.seamlessImmutable.mod.ImmutableArray.Remaining
import typings.seamlessImmutable.seamlessImmutableBooleans.`false`
import typings.seamlessImmutable.seamlessImmutableBooleans.`true`
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
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](obj: T): Immutable[T, js.Object] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Immutable[T, js.Object]]
  inline def apply[T](obj: T, options: Options): Immutable[T, js.Object] = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[T, js.Object]]
  
  @JSImport("seamless-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImmutableError(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("ImmutableError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def asMutable[T](obj: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable[T](obj: T, opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any)]
  inline def asMutable[T](obj: js.Array[T] | ImmutableArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asMutable[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[Boolean]): js.Array[(Immutable[T, js.Object]) | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[(Immutable[T, js.Object]) | T]]
  inline def asMutable[T](obj: ImmutableObject[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable[T](obj: ImmutableObject[T], opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any)]
  
  inline def asMutable_false[T](obj: T, opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  inline def asMutable_false[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[`false`]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def asMutable_false[T](obj: ImmutableObject[T], opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any]
  
  inline def asMutable_true[T](obj: T, opts: AsMutableOptions[`true`]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def asMutable_true[T](obj: js.Array[T] | ImmutableArray[T], opts: AsMutableOptions[`true`]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def asMutable_true[T](obj: ImmutableObject[T], opts: AsMutableOptions[`true`]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("asMutable")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def from[T](obj: T): Immutable[T, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[Immutable[T, js.Object]]
  inline def from[T](obj: T, options: Options): Immutable[T, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[T, js.Object]]
  
  inline def isImmutable[T](target: (Immutable[T, js.Object]) | T): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutable")(target.asInstanceOf[js.Any]).asInstanceOf[/* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ Boolean]
  
  inline def replace[T, S](obj: Immutable[T, js.Object], valueObj: S): Immutable[S, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(obj.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any])).asInstanceOf[Immutable[S, js.Object]]
  inline def replace[T, S](obj: Immutable[T, js.Object], valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(obj.asInstanceOf[js.Any], valueObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Immutable[S, js.Object]]
  
  trait AsMutableOptions[TDeep /* <: Boolean */] extends StObject {
    
    var deep: TDeep
  }
  object AsMutableOptions {
    
    inline def apply[TDeep /* <: Boolean */](deep: TDeep): AsMutableOptions[TDeep] = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsMutableOptions[TDeep]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsMutableOptions[?], TDeep /* <: Boolean */] (val x: Self & AsMutableOptions[TDeep]) extends AnyVal {
      
      inline def setDeep(value: TDeep): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? seamless-immutable.seamless-immutable.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  object Immutable {
    
    type AlreadyImmutable[O /* <: js.Object */] = ImmutableObject[O] | ImmutableArray[Any] | ImmutableDate
    
    @js.native
    trait AnyFunction extends StObject {
      
      def apply(args: Any*): Any = js.native
    }
    
    type CannotMakeImmutable[O /* <: js.Object */] = AlreadyImmutable[O] | Primitive
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
      * TS definition: {{{
      T extends seamless-immutable.seamless-immutable.Immutable.CannotMakeImmutable<O> ? T : T extends std.Array<infer Element> ? seamless-immutable.seamless-immutable.ImmutableArray<Element> : T extends std.Date ? seamless-immutable.seamless-immutable.ImmutableDate : seamless-immutable.seamless-immutable.ImmutableObject<T>
      }}}
      */
    type MakeImmutable[T, O /* <: js.Object */] = T
    
    type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | AnyFunction | Null]
  }
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Promise<infer U> ? std.Promise<seamless-immutable.seamless-immutable.Immutable.MakeImmutable<U, O>> : seamless-immutable.seamless-immutable.Immutable.MakeImmutable<T, O>
    }}}
    */
  type Immutable[T, O /* <: js.Object */] = T
  
  object ImmutableArray {
    
    /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
    /* Inlined std.Extract<std.Array<keyof any>, 'copyWithin' | 'fill'> */
    /* Rewritten from type alias, can be one of: 
      - typings.seamlessImmutable.seamlessImmutableStrings.fill
      - typings.seamlessImmutable.seamlessImmutableStrings.copyWithin
    */
    trait AdditionalMutatingArrayMethods extends StObject
    object AdditionalMutatingArrayMethods {
      
      inline def copyWithin: typings.seamlessImmutable.seamlessImmutableStrings.copyWithin = "copyWithin".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.copyWithin]
      
      inline def fill: typings.seamlessImmutable.seamlessImmutableStrings.fill = "fill".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.fill]
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
      
      def flatMap[TTarget](mapFunction: js.Function1[/* item */ T, TTarget]): Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: TTarget extends std.Array<any> ? TTarget : std.Array<TTarget> */ js.Any, 
            js.Object
          ] = js.native
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
        thisArg: Any
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
      def slice(start: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Double, end: Double): Immutable[js.Array[T], js.Object] = js.native
      def slice(start: Unit, end: Double): Immutable[js.Array[T], js.Object] = js.native
    }
    
    /** Merging this into Overrides breaks stuff, so this is split out */
    type ReadOnlyIndexer[T] = NumberDictionary[Immutable[T, js.Object]]
    
    /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
    type Remaining[T] = Omit[
        js.Array[T], 
        MutatingArrayMethods | AdditionalMutatingArrayMethods | forEach | map | filter | slice | concat | reduce | reduceRight
      ]
  }
  /** An ImmutableArray provides read-only access to the array elements, and provides functions (such as `map()`) that return immutable data structures. */
  type ImmutableArray[T] = Remaining[T] & Additions[T] & Overrides[T] & ReadOnlyIndexer[T]
  
  /** An ImmutableDate disables the use of mutating functions like `setDate` and `setFullYear`. */
  /* Inlined seamless-immutable.seamless-immutable.ImmutableDate.Remaining & seamless-immutable.seamless-immutable.ImmutableDate.Additions */
  trait ImmutableDate extends StObject {
    
    def asMutable(): js.Date
    
    def getDate(): Double
    @JSName("getDate")
    var getDate_Original: js.Function0[Double]
    
    def getDay(): Double
    @JSName("getDay")
    var getDay_Original: js.Function0[Double]
    
    def getFullYear(): Double
    @JSName("getFullYear")
    var getFullYear_Original: js.Function0[Double]
    
    def getHours(): Double
    @JSName("getHours")
    var getHours_Original: js.Function0[Double]
    
    def getMilliseconds(): Double
    @JSName("getMilliseconds")
    var getMilliseconds_Original: js.Function0[Double]
    
    def getMinutes(): Double
    @JSName("getMinutes")
    var getMinutes_Original: js.Function0[Double]
    
    def getMonth(): Double
    @JSName("getMonth")
    var getMonth_Original: js.Function0[Double]
    
    def getSeconds(): Double
    @JSName("getSeconds")
    var getSeconds_Original: js.Function0[Double]
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
    
    def getTimezoneOffset(): Double
    @JSName("getTimezoneOffset")
    var getTimezoneOffset_Original: js.Function0[Double]
    
    def getUTCDate(): Double
    @JSName("getUTCDate")
    var getUTCDate_Original: js.Function0[Double]
    
    def getUTCDay(): Double
    @JSName("getUTCDay")
    var getUTCDay_Original: js.Function0[Double]
    
    def getUTCFullYear(): Double
    @JSName("getUTCFullYear")
    var getUTCFullYear_Original: js.Function0[Double]
    
    def getUTCHours(): Double
    @JSName("getUTCHours")
    var getUTCHours_Original: js.Function0[Double]
    
    def getUTCMilliseconds(): Double
    @JSName("getUTCMilliseconds")
    var getUTCMilliseconds_Original: js.Function0[Double]
    
    def getUTCMinutes(): Double
    @JSName("getUTCMinutes")
    var getUTCMinutes_Original: js.Function0[Double]
    
    def getUTCMonth(): Double
    @JSName("getUTCMonth")
    var getUTCMonth_Original: js.Function0[Double]
    
    def getUTCSeconds(): Double
    @JSName("getUTCSeconds")
    var getUTCSeconds_Original: js.Function0[Double]
    
    def getVarDate(): VarDate
    @JSName("getVarDate")
    var getVarDate_Original: js.Function0[VarDate]
    
    def toDateString(): String
    @JSName("toDateString")
    var toDateString_Original: js.Function0[String]
    
    def toISOString(): String
    @JSName("toISOString")
    var toISOString_Original: js.Function0[String]
    
    def toJSON(): String
    @JSName("toJSON")
    var toJSON_Original: js.Function0[String]
    
    def toLocaleDateString(): String
    @JSName("toLocaleDateString")
    var toLocaleDateString_Original: js.Function0[String]
    
    @JSName("toLocaleString")
    var toLocaleString_Original: js.Function0[String]
    
    def toLocaleTimeString(): String
    @JSName("toLocaleTimeString")
    var toLocaleTimeString_Original: js.Function0[String]
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
    
    def toTimeString(): String
    @JSName("toTimeString")
    var toTimeString_Original: js.Function0[String]
    
    def toUTCString(): String
    @JSName("toUTCString")
    var toUTCString_Original: js.Function0[String]
    
    @JSName("valueOf")
    var valueOf_Original: js.Function0[Double]
  }
  object ImmutableDate {
    
    inline def apply(
      asMutable: () => js.Date,
      getDate: () => Double,
      getDay: () => Double,
      getFullYear: () => Double,
      getHours: () => Double,
      getMilliseconds: () => Double,
      getMinutes: () => Double,
      getMonth: () => Double,
      getSeconds: () => Double,
      getTime: () => Double,
      getTimezoneOffset: () => Double,
      getUTCDate: () => Double,
      getUTCDay: () => Double,
      getUTCFullYear: () => Double,
      getUTCHours: () => Double,
      getUTCMilliseconds: () => Double,
      getUTCMinutes: () => Double,
      getUTCMonth: () => Double,
      getUTCSeconds: () => Double,
      getVarDate: () => VarDate,
      toDateString: () => String,
      toISOString: () => String,
      toJSON: () => String,
      toLocaleDateString: () => String,
      toLocaleString: () => String,
      toLocaleTimeString: () => String,
      toString_ : () => String,
      toTimeString: () => String,
      toUTCString: () => String,
      valueOf: () => Double
    ): ImmutableDate = {
      val __obj = js.Dynamic.literal(asMutable = js.Any.fromFunction0(asMutable), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getTimezoneOffset = js.Any.fromFunction0(getTimezoneOffset), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMilliseconds = js.Any.fromFunction0(getUTCMilliseconds), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), getVarDate = js.Any.fromFunction0(getVarDate), toDateString = js.Any.fromFunction0(toDateString), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON), toLocaleDateString = js.Any.fromFunction0(toLocaleDateString), toLocaleString = js.Any.fromFunction0(toLocaleString), toLocaleTimeString = js.Any.fromFunction0(toLocaleTimeString), toTimeString = js.Any.fromFunction0(toTimeString), toUTCString = js.Any.fromFunction0(toUTCString), valueOf = js.Any.fromFunction0(valueOf))
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[ImmutableDate]
    }
    
    /** New functions added by seamless-immutable. */
    trait Additions extends StObject {
      
      def asMutable(): js.Date
    }
    object Additions {
      
      inline def apply(asMutable: () => js.Date): typings.seamlessImmutable.mod.ImmutableDate.Additions = {
        val __obj = js.Dynamic.literal(asMutable = js.Any.fromFunction0(asMutable))
        __obj.asInstanceOf[typings.seamlessImmutable.mod.ImmutableDate.Additions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.seamlessImmutable.mod.ImmutableDate.Additions] (val x: Self) extends AnyVal {
        
        inline def setAsMutable(value: () => js.Date): Self = StObject.set(x, "asMutable", js.Any.fromFunction0(value))
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImmutableDate] (val x: Self) extends AnyVal {
      
      inline def setAsMutable(value: () => js.Date): Self = StObject.set(x, "asMutable", js.Any.fromFunction0(value))
      
      inline def setGetDate(value: () => Double): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      inline def setGetDay(value: () => Double): Self = StObject.set(x, "getDay", js.Any.fromFunction0(value))
      
      inline def setGetFullYear(value: () => Double): Self = StObject.set(x, "getFullYear", js.Any.fromFunction0(value))
      
      inline def setGetHours(value: () => Double): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
      
      inline def setGetMilliseconds(value: () => Double): Self = StObject.set(x, "getMilliseconds", js.Any.fromFunction0(value))
      
      inline def setGetMinutes(value: () => Double): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
      
      inline def setGetMonth(value: () => Double): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
      
      inline def setGetSeconds(value: () => Double): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      inline def setGetTimezoneOffset(value: () => Double): Self = StObject.set(x, "getTimezoneOffset", js.Any.fromFunction0(value))
      
      inline def setGetUTCDate(value: () => Double): Self = StObject.set(x, "getUTCDate", js.Any.fromFunction0(value))
      
      inline def setGetUTCDay(value: () => Double): Self = StObject.set(x, "getUTCDay", js.Any.fromFunction0(value))
      
      inline def setGetUTCFullYear(value: () => Double): Self = StObject.set(x, "getUTCFullYear", js.Any.fromFunction0(value))
      
      inline def setGetUTCHours(value: () => Double): Self = StObject.set(x, "getUTCHours", js.Any.fromFunction0(value))
      
      inline def setGetUTCMilliseconds(value: () => Double): Self = StObject.set(x, "getUTCMilliseconds", js.Any.fromFunction0(value))
      
      inline def setGetUTCMinutes(value: () => Double): Self = StObject.set(x, "getUTCMinutes", js.Any.fromFunction0(value))
      
      inline def setGetUTCMonth(value: () => Double): Self = StObject.set(x, "getUTCMonth", js.Any.fromFunction0(value))
      
      inline def setGetUTCSeconds(value: () => Double): Self = StObject.set(x, "getUTCSeconds", js.Any.fromFunction0(value))
      
      inline def setGetVarDate(value: () => VarDate): Self = StObject.set(x, "getVarDate", js.Any.fromFunction0(value))
      
      inline def setToDateString(value: () => String): Self = StObject.set(x, "toDateString", js.Any.fromFunction0(value))
      
      inline def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToLocaleDateString(value: () => String): Self = StObject.set(x, "toLocaleDateString", js.Any.fromFunction0(value))
      
      inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
      
      inline def setToLocaleTimeString(value: () => String): Self = StObject.set(x, "toLocaleTimeString", js.Any.fromFunction0(value))
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToTimeString(value: () => String): Self = StObject.set(x, "toTimeString", js.Any.fromFunction0(value))
      
      inline def setToUTCString(value: () => String): Self = StObject.set(x, "toUTCString", js.Any.fromFunction0(value))
      
      inline def setValueOf(value: () => Double): Self = StObject.set(x, "valueOf", js.Any.fromFunction0(value))
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
      
      inline def setDate: typings.seamlessImmutable.seamlessImmutableStrings.setDate = "setDate".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setDate]
      
      inline def setFullYear: typings.seamlessImmutable.seamlessImmutableStrings.setFullYear = "setFullYear".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setFullYear]
      
      inline def setHours: typings.seamlessImmutable.seamlessImmutableStrings.setHours = "setHours".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setHours]
      
      inline def setMilliseconds: typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds = "setMilliseconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds]
      
      inline def setMinutes: typings.seamlessImmutable.seamlessImmutableStrings.setMinutes = "setMinutes".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMinutes]
      
      inline def setMonth: typings.seamlessImmutable.seamlessImmutableStrings.setMonth = "setMonth".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setMonth]
      
      inline def setSeconds: typings.seamlessImmutable.seamlessImmutableStrings.setSeconds = "setSeconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setSeconds]
      
      inline def setTime: typings.seamlessImmutable.seamlessImmutableStrings.setTime = "setTime".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setTime]
      
      inline def setUTCDate: typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate = "setUTCDate".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate]
      
      inline def setUTCFullYear: typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear = "setUTCFullYear".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear]
      
      inline def setUTCHours: typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours = "setUTCHours".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours]
      
      inline def setUTCMilliseconds: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds = "setUTCMilliseconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds]
      
      inline def setUTCMinutes: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes = "setUTCMinutes".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes]
      
      inline def setUTCMonth: typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth = "setUTCMonth".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth]
      
      inline def setUTCSeconds: typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds = "setUTCSeconds".asInstanceOf[typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds]
    }
    
    /** Only allows Date methods, which are the getters. */
    /* Inlined seamless-immutable.seamless-immutable.Omit<std.Date, seamless-immutable.seamless-immutable.ImmutableDate.MutatingDateMethods> */
    trait Remaining extends StObject {
      
      def getDate(): Double
      @JSName("getDate")
      var getDate_Original: js.Function0[Double]
      
      def getDay(): Double
      @JSName("getDay")
      var getDay_Original: js.Function0[Double]
      
      def getFullYear(): Double
      @JSName("getFullYear")
      var getFullYear_Original: js.Function0[Double]
      
      def getHours(): Double
      @JSName("getHours")
      var getHours_Original: js.Function0[Double]
      
      def getMilliseconds(): Double
      @JSName("getMilliseconds")
      var getMilliseconds_Original: js.Function0[Double]
      
      def getMinutes(): Double
      @JSName("getMinutes")
      var getMinutes_Original: js.Function0[Double]
      
      def getMonth(): Double
      @JSName("getMonth")
      var getMonth_Original: js.Function0[Double]
      
      def getSeconds(): Double
      @JSName("getSeconds")
      var getSeconds_Original: js.Function0[Double]
      
      def getTime(): Double
      @JSName("getTime")
      var getTime_Original: js.Function0[Double]
      
      def getTimezoneOffset(): Double
      @JSName("getTimezoneOffset")
      var getTimezoneOffset_Original: js.Function0[Double]
      
      def getUTCDate(): Double
      @JSName("getUTCDate")
      var getUTCDate_Original: js.Function0[Double]
      
      def getUTCDay(): Double
      @JSName("getUTCDay")
      var getUTCDay_Original: js.Function0[Double]
      
      def getUTCFullYear(): Double
      @JSName("getUTCFullYear")
      var getUTCFullYear_Original: js.Function0[Double]
      
      def getUTCHours(): Double
      @JSName("getUTCHours")
      var getUTCHours_Original: js.Function0[Double]
      
      def getUTCMilliseconds(): Double
      @JSName("getUTCMilliseconds")
      var getUTCMilliseconds_Original: js.Function0[Double]
      
      def getUTCMinutes(): Double
      @JSName("getUTCMinutes")
      var getUTCMinutes_Original: js.Function0[Double]
      
      def getUTCMonth(): Double
      @JSName("getUTCMonth")
      var getUTCMonth_Original: js.Function0[Double]
      
      def getUTCSeconds(): Double
      @JSName("getUTCSeconds")
      var getUTCSeconds_Original: js.Function0[Double]
      
      def getVarDate(): VarDate
      @JSName("getVarDate")
      var getVarDate_Original: js.Function0[VarDate]
      
      def toDateString(): String
      @JSName("toDateString")
      var toDateString_Original: js.Function0[String]
      
      def toISOString(): String
      @JSName("toISOString")
      var toISOString_Original: js.Function0[String]
      
      def toJSON(): String
      @JSName("toJSON")
      var toJSON_Original: js.Function0[String]
      
      def toLocaleDateString(): String
      @JSName("toLocaleDateString")
      var toLocaleDateString_Original: js.Function0[String]
      
      @JSName("toLocaleString")
      var toLocaleString_Original: js.Function0[String]
      
      def toLocaleTimeString(): String
      @JSName("toLocaleTimeString")
      var toLocaleTimeString_Original: js.Function0[String]
      
      @JSName("toString")
      var toString_Original: js.Function0[String]
      
      def toTimeString(): String
      @JSName("toTimeString")
      var toTimeString_Original: js.Function0[String]
      
      def toUTCString(): String
      @JSName("toUTCString")
      var toUTCString_Original: js.Function0[String]
      
      @JSName("valueOf")
      var valueOf_Original: js.Function0[Double]
    }
    object Remaining {
      
      inline def apply(
        getDate: () => Double,
        getDay: () => Double,
        getFullYear: () => Double,
        getHours: () => Double,
        getMilliseconds: () => Double,
        getMinutes: () => Double,
        getMonth: () => Double,
        getSeconds: () => Double,
        getTime: () => Double,
        getTimezoneOffset: () => Double,
        getUTCDate: () => Double,
        getUTCDay: () => Double,
        getUTCFullYear: () => Double,
        getUTCHours: () => Double,
        getUTCMilliseconds: () => Double,
        getUTCMinutes: () => Double,
        getUTCMonth: () => Double,
        getUTCSeconds: () => Double,
        getVarDate: () => VarDate,
        toDateString: () => String,
        toISOString: () => String,
        toJSON: () => String,
        toLocaleDateString: () => String,
        toLocaleString: () => String,
        toLocaleTimeString: () => String,
        toString_ : () => String,
        toTimeString: () => String,
        toUTCString: () => String,
        valueOf: () => Double
      ): typings.seamlessImmutable.mod.ImmutableDate.Remaining = {
        val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getTimezoneOffset = js.Any.fromFunction0(getTimezoneOffset), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMilliseconds = js.Any.fromFunction0(getUTCMilliseconds), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), getVarDate = js.Any.fromFunction0(getVarDate), toDateString = js.Any.fromFunction0(toDateString), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON), toLocaleDateString = js.Any.fromFunction0(toLocaleDateString), toLocaleString = js.Any.fromFunction0(toLocaleString), toLocaleTimeString = js.Any.fromFunction0(toLocaleTimeString), toTimeString = js.Any.fromFunction0(toTimeString), toUTCString = js.Any.fromFunction0(toUTCString), valueOf = js.Any.fromFunction0(valueOf))
        __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
        __obj.asInstanceOf[typings.seamlessImmutable.mod.ImmutableDate.Remaining]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.seamlessImmutable.mod.ImmutableDate.Remaining] (val x: Self) extends AnyVal {
        
        inline def setGetDate(value: () => Double): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
        
        inline def setGetDay(value: () => Double): Self = StObject.set(x, "getDay", js.Any.fromFunction0(value))
        
        inline def setGetFullYear(value: () => Double): Self = StObject.set(x, "getFullYear", js.Any.fromFunction0(value))
        
        inline def setGetHours(value: () => Double): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
        
        inline def setGetMilliseconds(value: () => Double): Self = StObject.set(x, "getMilliseconds", js.Any.fromFunction0(value))
        
        inline def setGetMinutes(value: () => Double): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
        
        inline def setGetMonth(value: () => Double): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
        
        inline def setGetSeconds(value: () => Double): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
        
        inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
        
        inline def setGetTimezoneOffset(value: () => Double): Self = StObject.set(x, "getTimezoneOffset", js.Any.fromFunction0(value))
        
        inline def setGetUTCDate(value: () => Double): Self = StObject.set(x, "getUTCDate", js.Any.fromFunction0(value))
        
        inline def setGetUTCDay(value: () => Double): Self = StObject.set(x, "getUTCDay", js.Any.fromFunction0(value))
        
        inline def setGetUTCFullYear(value: () => Double): Self = StObject.set(x, "getUTCFullYear", js.Any.fromFunction0(value))
        
        inline def setGetUTCHours(value: () => Double): Self = StObject.set(x, "getUTCHours", js.Any.fromFunction0(value))
        
        inline def setGetUTCMilliseconds(value: () => Double): Self = StObject.set(x, "getUTCMilliseconds", js.Any.fromFunction0(value))
        
        inline def setGetUTCMinutes(value: () => Double): Self = StObject.set(x, "getUTCMinutes", js.Any.fromFunction0(value))
        
        inline def setGetUTCMonth(value: () => Double): Self = StObject.set(x, "getUTCMonth", js.Any.fromFunction0(value))
        
        inline def setGetUTCSeconds(value: () => Double): Self = StObject.set(x, "getUTCSeconds", js.Any.fromFunction0(value))
        
        inline def setGetVarDate(value: () => VarDate): Self = StObject.set(x, "getVarDate", js.Any.fromFunction0(value))
        
        inline def setToDateString(value: () => String): Self = StObject.set(x, "toDateString", js.Any.fromFunction0(value))
        
        inline def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
        
        inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
        
        inline def setToLocaleDateString(value: () => String): Self = StObject.set(x, "toLocaleDateString", js.Any.fromFunction0(value))
        
        inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
        
        inline def setToLocaleTimeString(value: () => String): Self = StObject.set(x, "toLocaleTimeString", js.Any.fromFunction0(value))
        
        inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
        
        inline def setToTimeString(value: () => String): Self = StObject.set(x, "toTimeString", js.Any.fromFunction0(value))
        
        inline def setToUTCString(value: () => String): Self = StObject.set(x, "toUTCString", js.Any.fromFunction0(value))
        
        inline def setValueOf(value: () => Double): Self = StObject.set(x, "valueOf", js.Any.fromFunction0(value))
      }
    }
  }
  
  type ImmutableObject[T] = ImmutableObjectMixin[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ P in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[P], {}>} */ js.Any)
  
  @js.native
  trait ImmutableObjectMixin[T] extends StObject {
    
    def asMutable(): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = js.native
    def asMutable(opts: AsMutableOptions[Boolean]): T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any) = js.native
    @JSName("asMutable")
    def asMutable_false(opts: AsMutableOptions[`false`]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: seamless-immutable.seamless-immutable.Immutable<T[K], {}>} */ js.Any = js.native
    @JSName("asMutable")
    def asMutable_true(opts: AsMutableOptions[`true`]): T = js.native
    
    def getIn(propertyPath: js.Array[String]): Immutable[Any, js.Object] = js.native
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
    def getIn_K[K /* <: /* keyof T */ String */](propertyPath: js.Array[K]): Immutable[
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
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def update[TValue](
      property: String,
      updaterFunction: js.Function2[/* value */ Immutable[TValue, js.Object], /* repeated */ Any, Any],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    
    def updateIn[TValue](
      propertyPath: js.Array[String],
      updaterFunction: js.Function2[/* value */ TValue, /* repeated */ Any, Any],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */](
      propertyPath: js.Tuple2[K, L],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */](
      propertyPath: js.Tuple3[K, L, M],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */](
      propertyPath: js.Tuple4[K, L, M, N],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    def updateIn[K /* <: /* keyof T */ String */, L /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K] */ js.Any */, M /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L] */ js.Any */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M] */ js.Any */, O /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K][L][M][N] */ js.Any */](
      propertyPath: js.Tuple5[K, L, M, N, O],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K][L][M][N][O] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
    ): Immutable[T, js.Object] = js.native
    @JSName("updateIn")
    def updateIn_K[K /* <: /* keyof T */ String */](
      propertyPath: js.Array[K],
      updaterFunction: js.Function2[
          /* value */ Immutable[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
            js.Object
          ], 
          /* repeated */ Any, 
          Any
        ],
      additionalArguments: Any*
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
  
  trait MergeConfig extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var merger: js.UndefOr[js.Function3[/* a */ Any, /* b */ Any, /* config */ Any, Any]] = js.undefined
    
    var mode: js.UndefOr[replace | merge] = js.undefined
  }
  object MergeConfig {
    
    inline def apply(): MergeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergeConfig] (val x: Self) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setMerger(value: (/* a */ Any, /* b */ Any, /* config */ Any) => Any): Self = StObject.set(x, "merger", js.Any.fromFunction3(value))
      
      inline def setMergerUndefined: Self = StObject.set(x, "merger", js.undefined)
      
      inline def setMode(value: replace | merge): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  /** From type T, take all properties except those specified by K. */
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait Options extends StObject
  
  trait ReplaceConfig extends StObject {
    
    var deep: Boolean
  }
  object ReplaceConfig {
    
    inline def apply(deep: Boolean): ReplaceConfig = {
      val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceConfig] (val x: Self) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    }
  }
}
