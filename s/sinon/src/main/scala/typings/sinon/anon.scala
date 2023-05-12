package typings.sinon

import typings.sinon.mod.SinonFakeServer
import typings.sinon.mod.SinonMatcher
import typings.sinon.mod.SinonSpy
import typings.sinonjsFakeTimers.mod.Clock
import typings.sinonjsFakeTimers.mod.FakeMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    var abort: js.Array[Any]
    
    var error: js.Array[Any]
    
    var load: js.Array[Any]
    
    var progress: js.Array[Any]
  }
  object Abort {
    
    inline def apply(abort: js.Array[Any], error: js.Array[Any], load: js.Array[Any], progress: js.Array[Any]): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: js.Array[Any]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortVarargs(value: Any*): Self = StObject.set(x, "abort", js.Array(value*))
      
      inline def setError(value: js.Array[Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorVarargs(value: Any*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setLoad(value: js.Array[Any]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadVarargs(value: Any*): Self = StObject.set(x, "load", js.Array(value*))
      
      inline def setProgress(value: js.Array[Any]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressVarargs(value: Any*): Self = StObject.set(x, "progress", js.Array(value*))
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(now: js.Date): Clock = js.native
    def create(now: Double): Clock = js.native
  }
  
  trait Get[T, K /* <: /* keyof T */ String */] extends StObject {
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    @JSName("get")
    var get_Original: SinonSpy[
        js.Array[Any], 
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ]
    ): Unit
    @JSName("set")
    var set_Original: SinonSpy[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ], 
        Unit
      ]
  }
  object Get {
    
    inline def apply[T, K /* <: /* keyof T */ String */](
      get: SinonSpy[
          js.Array[Any], 
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ],
      set: SinonSpy[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          Unit
        ]
    ): Get[T, K] = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get[?, ?], T, K /* <: /* keyof T */ String */] (val x: Self & (Get[T, K])) extends AnyVal {
      
      inline def setGet(
        value: SinonSpy[
              js.Array[Any], 
              /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
            ]
      ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setSet(
        value: SinonSpy[
              js.Array[
                /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined sinon.sinon.MatchExactArguments<std.Array<any>> */
  trait MatchExactArgumentsArraya extends StObject {
    
    var at: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? sinon.sinon.MatchExactArguments<(index : number): any | undefined> : (index : number): any | undefined */ js.Any)
    
    var concat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : (items : ...std.ConcatArray<any>): std.Array<any> */ js.Any)
    
    var copyWithin: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? sinon.sinon.MatchExactArguments<(target : number, start : number): this> : (target : number, start : number): this */ js.Any)
    
    var entries: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<[number, any]>> : (): std.IterableIterator<[number, any]> */ js.Any)
    
    var every: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> */ js.Any)
    
    var fill: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? sinon.sinon.MatchExactArguments<(value : any): this> : (value : any): this */ js.Any)
    
    var filter: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> */ js.Any)
    
    var find: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined */ js.Any)
    
    var findIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number */ js.Any)
    
    var findLast: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined */ js.Any)
    
    var findLastIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): number */ js.Any)
    
    var flat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? sinon.sinon.MatchExactArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> */ js.Any)
    
    var flatMap: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> */ js.Any)
    
    var forEach: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : (callbackfn : (value : any, index : number, array : std.Array<any>): void): void */ js.Any)
    
    var includes: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): boolean> : (searchElement : any): boolean */ js.Any)
    
    var indexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
    
    var join: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
    
    var keys: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<number>> : (): std.IterableIterator<number> */ js.Any)
    
    var lastIndexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
    
    var length: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? sinon.sinon.MatchExactArguments<number> : number */ js.Any)
    
    var map: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> */ js.Any)
    
    var pop: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any)
    
    var push: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
    
    var reduce: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
    
    var reduceRight: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
    
    var reverse: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
    
    var shift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any)
    
    var slice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
    
    var some: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean */ js.Any)
    
    var sort: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? sinon.sinon.MatchExactArguments<(): this> : (): this */ js.Any)
    
    var splice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(start : number): std.Array<any>> : (start : number): std.Array<any> */ js.Any)
    
    @JSName("toLocaleString")
    var toLocaleString_FMatchExactArgumentsArraya: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
    
    @JSName("toString")
    var toString_FMatchExactArgumentsArraya: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
    
    var unshift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
    
    var values: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<any>> : (): std.IterableIterator<any> */ js.Any)
  }
  object MatchExactArgumentsArraya {
    
    inline def apply(
      at: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? sinon.sinon.MatchExactArguments<(index : number): any | undefined> : (index : number): any | undefined */ js.Any),
      concat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : (items : ...std.ConcatArray<any>): std.Array<any> */ js.Any),
      copyWithin: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? sinon.sinon.MatchExactArguments<(target : number, start : number): this> : (target : number, start : number): this */ js.Any),
      entries: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<[number, any]>> : (): std.IterableIterator<[number, any]> */ js.Any),
      every: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> */ js.Any),
      fill: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? sinon.sinon.MatchExactArguments<(value : any): this> : (value : any): this */ js.Any),
      filter: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> */ js.Any),
      find: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined */ js.Any),
      findIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number */ js.Any),
      findLast: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined */ js.Any),
      findLastIndex: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): number */ js.Any),
      flat: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? sinon.sinon.MatchExactArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> */ js.Any),
      flatMap: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> */ js.Any),
      forEach: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : (callbackfn : (value : any, index : number, array : std.Array<any>): void): void */ js.Any),
      includes: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): boolean> : (searchElement : any): boolean */ js.Any),
      indexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any),
      join: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any),
      keys: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<number>> : (): std.IterableIterator<number> */ js.Any),
      lastIndexOf: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any),
      length: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? sinon.sinon.MatchExactArguments<number> : number */ js.Any),
      map: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> */ js.Any),
      pop: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any),
      push: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any),
      reduce: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any),
      reduceRight: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any),
      reverse: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any),
      shift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any),
      slice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any),
      some: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean */ js.Any),
      sort: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? sinon.sinon.MatchExactArguments<(): this> : (): this */ js.Any),
      splice: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(start : number): std.Array<any>> : (start : number): std.Array<any> */ js.Any),
      toLocaleString: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any),
      toString_ : SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any),
      unshift: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any),
      values: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<any>> : (): std.IterableIterator<any> */ js.Any)
    ): MatchExactArgumentsArraya = {
      val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], concat = concat.asInstanceOf[js.Any], copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], findLast = findLast.asInstanceOf[js.Any], findLastIndex = findLastIndex.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any], flatMap = flatMap.asInstanceOf[js.Any], forEach = forEach.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], indexOf = indexOf.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lastIndexOf = lastIndexOf.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], pop = pop.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reduce = reduce.asInstanceOf[js.Any], reduceRight = reduceRight.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], splice = splice.asInstanceOf[js.Any], toLocaleString = toLocaleString.asInstanceOf[js.Any], unshift = unshift.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchExactArgumentsArraya]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchExactArgumentsArraya] (val x: Self) extends AnyVal {
      
      inline def setAt(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? sinon.sinon.MatchExactArguments<(index : number): any | undefined> : (index : number): any | undefined */ js.Any)
      ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setConcat(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : (items : ...std.ConcatArray<any>): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setCopyWithin(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? sinon.sinon.MatchExactArguments<(target : number, start : number): this> : (target : number, start : number): this */ js.Any)
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setEntries(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<[number, any]>> : (): std.IterableIterator<[number, any]> */ js.Any)
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEvery(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> */ js.Any)
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setFill(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? sinon.sinon.MatchExactArguments<(value : any): this> : (value : any): this */ js.Any)
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFilter(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> */ js.Any)
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFind(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined */ js.Any)
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number */ js.Any)
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindLast(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchExactArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined */ js.Any)
      ): Self = StObject.set(x, "findLast", value.asInstanceOf[js.Any])
      
      inline def setFindLastIndex(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): number */ js.Any)
      ): Self = StObject.set(x, "findLastIndex", value.asInstanceOf[js.Any])
      
      inline def setFlat(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? sinon.sinon.MatchExactArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> */ js.Any)
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> */ js.Any)
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setForEach(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : (callbackfn : (value : any, index : number, array : std.Array<any>): void): void */ js.Any)
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setIncludes(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): boolean> : (searchElement : any): boolean */ js.Any)
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIndexOf(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setJoin(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setKeys(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<number>> : (): std.IterableIterator<number> */ js.Any)
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOf(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchExactArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLength(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? sinon.sinon.MatchExactArguments<number> : number */ js.Any)
      ): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? sinon.sinon.MatchExactArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> */ js.Any)
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setPop(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPush(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setReduce(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceRight(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchExactArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReverse(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setShift(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchExactArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setSlice(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSome(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? sinon.sinon.MatchExactArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean */ js.Any)
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSort(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? sinon.sinon.MatchExactArguments<(): this> : (): this */ js.Any)
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSplice(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? sinon.sinon.MatchExactArguments<(start : number): std.Array<any>> : (start : number): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setToLocaleString(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToString_(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchExactArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setUnshift(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchExactArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setValues(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? sinon.sinon.MatchExactArguments<(): std.IterableIterator<any>> : (): std.IterableIterator<any> */ js.Any)
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined sinon.sinon.MatchPartialArguments<std.Array<any>> */
  trait MatchPartialArgumentsArra extends StObject {
    
    var at: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(index : number): any | undefined> : (index : number): any | undefined */ js.Any)
      ] = js.undefined
    
    var concat: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : (items : ...std.ConcatArray<any>): std.Array<any> */ js.Any)
      ] = js.undefined
    
    var copyWithin: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? sinon.sinon.MatchPartialArguments<(target : number, start : number): this> : (target : number, start : number): this */ js.Any)
      ] = js.undefined
    
    var entries: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<[number, any]>> : (): std.IterableIterator<[number, any]> */ js.Any)
      ] = js.undefined
    
    var every: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> */ js.Any)
      ] = js.undefined
    
    var fill: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? sinon.sinon.MatchPartialArguments<(value : any): this> : (value : any): this */ js.Any)
      ] = js.undefined
    
    var filter: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> */ js.Any)
      ] = js.undefined
    
    var find: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined */ js.Any)
      ] = js.undefined
    
    var findIndex: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number */ js.Any)
      ] = js.undefined
    
    var findLast: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined */ js.Any)
      ] = js.undefined
    
    var findLastIndex: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): number */ js.Any)
      ] = js.undefined
    
    var flat: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? sinon.sinon.MatchPartialArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> */ js.Any)
      ] = js.undefined
    
    var flatMap: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? sinon.sinon.MatchPartialArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> */ js.Any)
      ] = js.undefined
    
    var forEach: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : (callbackfn : (value : any, index : number, array : std.Array<any>): void): void */ js.Any)
      ] = js.undefined
    
    var includes: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): boolean> : (searchElement : any): boolean */ js.Any)
      ] = js.undefined
    
    var indexOf: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ] = js.undefined
    
    var join: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ] = js.undefined
    
    var keys: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<number>> : (): std.IterableIterator<number> */ js.Any)
      ] = js.undefined
    
    var lastIndexOf: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ] = js.undefined
    
    var length: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? sinon.sinon.MatchPartialArguments<number> : number */ js.Any)
      ] = js.undefined
    
    var map: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? sinon.sinon.MatchPartialArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> */ js.Any)
      ] = js.undefined
    
    var pop: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ] = js.undefined
    
    var push: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchPartialArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ] = js.undefined
    
    var reduce: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ] = js.undefined
    
    var reduceRight: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ] = js.undefined
    
    var reverse: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ] = js.undefined
    
    var shift: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ] = js.undefined
    
    var slice: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ] = js.undefined
    
    var some: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean */ js.Any)
      ] = js.undefined
    
    var sort: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? sinon.sinon.MatchPartialArguments<(): this> : (): this */ js.Any)
      ] = js.undefined
    
    var splice: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(start : number): std.Array<any>> : (start : number): std.Array<any> */ js.Any)
      ] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FMatchPartialArgumentsArra: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ] = js.undefined
    
    @JSName("toString")
    var toString_FMatchPartialArgumentsArra: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ] = js.undefined
    
    var unshift: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchPartialArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ] = js.undefined
    
    var values: js.UndefOr[
        SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<any>> : (): std.IterableIterator<any> */ js.Any)
      ] = js.undefined
  }
  object MatchPartialArgumentsArra {
    
    inline def apply(): MatchPartialArgumentsArra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchPartialArgumentsArra]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchPartialArgumentsArra] (val x: Self) extends AnyVal {
      
      inline def setAt(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (index : number): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(index : number): any | undefined> : (index : number): any | undefined */ js.Any)
      ): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setConcat(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...std.ConcatArray<any>): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(items : ...std.ConcatArray<any>): std.Array<any>> : (items : ...std.ConcatArray<any>): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (target : number, start : number): this extends object ? sinon.sinon.MatchPartialArguments<(target : number, start : number): this> : (target : number, start : number): this */ js.Any)
      ): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<[number, any]> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<[number, any]>> : (): std.IterableIterator<[number, any]> */ js.Any)
      ): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): this is std.Array<S> */ js.Any)
      ): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (value : any): this extends object ? sinon.sinon.MatchPartialArguments<(value : any): this> : (value : any): this */ js.Any)
      ): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S>> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): std.Array<S> */ js.Any)
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, obj : std.Array<any>): value is S): S | undefined */ js.Any)
      ): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, obj : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, obj : std.Array<any>): unknown): number */ js.Any)
      ): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindLast(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined extends object ? sinon.sinon.MatchPartialArguments<<S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined> : <S extends any>(predicate : (value : any, index : number, array : std.Array<any>): value is S): S | undefined */ js.Any)
      ): Self = StObject.set(x, "findLast", value.asInstanceOf[js.Any])
      
      inline def setFindLastIndex(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): number extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): number> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): number */ js.Any)
      ): Self = StObject.set(x, "findLastIndex", value.asInstanceOf[js.Any])
      
      inline def setFindLastIndexUndefined: Self = StObject.set(x, "findLastIndex", js.undefined)
      
      inline def setFindLastUndefined: Self = StObject.set(x, "findLast", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> extends object ? sinon.sinon.MatchPartialArguments<<A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>>> : <A, D extends number = 1>(this : A): std.Array<std.FlatArray<A, D>> */ js.Any)
      ): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> extends object ? sinon.sinon.MatchPartialArguments<<U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U>> : <U, This = undefined>(callback : (this : This, value : any, index : number, array : std.Array<any>): U | std.ReadonlyArray<U>): std.Array<U> */ js.Any)
      ): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (value : any, index : number, array : std.Array<any>): void): void extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (value : any, index : number, array : std.Array<any>): void): void> : (callbackfn : (value : any, index : number, array : std.Array<any>): void): void */ js.Any)
      ): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): boolean extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): boolean> : (searchElement : any): boolean */ js.Any)
      ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<number> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<number>> : (): std.IterableIterator<number> */ js.Any)
      ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (searchElement : any): number extends object ? sinon.sinon.MatchPartialArguments<(searchElement : any): number> : (searchElement : any): number */ js.Any)
      ): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: number extends object ? sinon.sinon.MatchPartialArguments<number> : number */ js.Any)
      ): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> extends object ? sinon.sinon.MatchPartialArguments<<U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U>> : <U>(callbackfn : (value : any, index : number, array : std.Array<any>): U): std.Array<U> */ js.Any)
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchPartialArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceRight(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any extends object ? sinon.sinon.MatchPartialArguments<(callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any> : (callbackfn : (previousValue : any, currentValue : any, currentIndex : number, array : std.Array<any>): any): any */ js.Any)
      ): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): any | undefined extends object ? sinon.sinon.MatchPartialArguments<(): any | undefined> : (): any | undefined */ js.Any)
      ): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.Array<any>> : (): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean extends object ? sinon.sinon.MatchPartialArguments<(predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean> : (predicate : (value : any, index : number, array : std.Array<any>): unknown): boolean */ js.Any)
      ): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): this extends object ? sinon.sinon.MatchPartialArguments<(): this> : (): this */ js.Any)
      ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (start : number): std.Array<any> extends object ? sinon.sinon.MatchPartialArguments<(start : number): std.Array<any>> : (start : number): std.Array<any> */ js.Any)
      ): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): string extends object ? sinon.sinon.MatchPartialArguments<(): string> : (): string */ js.Any)
      ): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (items : ...any): number extends object ? sinon.sinon.MatchPartialArguments<(items : ...any): number> : (items : ...any): number */ js.Any)
      ): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(
        value: SinonMatcher | (/* import warning: importer.ImportType#apply Failed type conversion: (): std.IterableIterator<any> extends object ? sinon.sinon.MatchPartialArguments<(): std.IterableIterator<any>> : (): std.IterableIterator<any> */ js.Any)
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sinonjs/fake-timers.@sinonjs/fake-timers.FakeTimerInstallOpts> */
  trait PartialFakeTimerInstallOp extends StObject {
    
    var advanceTimeDelta: js.UndefOr[Double] = js.undefined
    
    var loopLimit: js.UndefOr[Double] = js.undefined
    
    var now: js.UndefOr[Double | js.Date] = js.undefined
    
    var shouldAdvanceTime: js.UndefOr[Boolean] = js.undefined
    
    var shouldClearNativeTimers: js.UndefOr[Boolean] = js.undefined
    
    var toFake: js.UndefOr[js.Array[FakeMethod]] = js.undefined
  }
  object PartialFakeTimerInstallOp {
    
    inline def apply(): PartialFakeTimerInstallOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFakeTimerInstallOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFakeTimerInstallOp] (val x: Self) extends AnyVal {
      
      inline def setAdvanceTimeDelta(value: Double): Self = StObject.set(x, "advanceTimeDelta", value.asInstanceOf[js.Any])
      
      inline def setAdvanceTimeDeltaUndefined: Self = StObject.set(x, "advanceTimeDelta", js.undefined)
      
      inline def setLoopLimit(value: Double): Self = StObject.set(x, "loopLimit", value.asInstanceOf[js.Any])
      
      inline def setLoopLimitUndefined: Self = StObject.set(x, "loopLimit", js.undefined)
      
      inline def setNow(value: Double | js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setShouldAdvanceTime(value: Boolean): Self = StObject.set(x, "shouldAdvanceTime", value.asInstanceOf[js.Any])
      
      inline def setShouldAdvanceTimeUndefined: Self = StObject.set(x, "shouldAdvanceTime", js.undefined)
      
      inline def setShouldClearNativeTimers(value: Boolean): Self = StObject.set(x, "shouldClearNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setShouldClearNativeTimersUndefined: Self = StObject.set(x, "shouldClearNativeTimers", js.undefined)
      
      inline def setToFake(value: js.Array[FakeMethod]): Self = StObject.set(x, "toFake", value.asInstanceOf[js.Any])
      
      inline def setToFakeUndefined: Self = StObject.set(x, "toFake", js.undefined)
      
      inline def setToFakeVarargs(value: FakeMethod*): Self = StObject.set(x, "toFake", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonExposeOptions> */
  trait PartialSinonExposeOptions extends StObject {
    
    var includeFail: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object PartialSinonExposeOptions {
    
    inline def apply(): PartialSinonExposeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonExposeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSinonExposeOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
      
      inline def setIncludeFailUndefined: Self = StObject.set(x, "includeFail", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonFakeServerOptions> */
  trait PartialSinonFakeServerOpt extends StObject {
    
    var autoRespond: js.UndefOr[Boolean] = js.undefined
    
    var autoRespondAfter: js.UndefOr[Double] = js.undefined
    
    var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
    
    var respondImmediately: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSinonFakeServerOpt {
    
    inline def apply(): PartialSinonFakeServerOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonFakeServerOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSinonFakeServerOpt] (val x: Self) extends AnyVal {
      
      inline def setAutoRespond(value: Boolean): Self = StObject.set(x, "autoRespond", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfter(value: Double): Self = StObject.set(x, "autoRespondAfter", value.asInstanceOf[js.Any])
      
      inline def setAutoRespondAfterUndefined: Self = StObject.set(x, "autoRespondAfter", js.undefined)
      
      inline def setAutoRespondUndefined: Self = StObject.set(x, "autoRespond", js.undefined)
      
      inline def setFakeHTTPMethods(value: Boolean): Self = StObject.set(x, "fakeHTTPMethods", value.asInstanceOf[js.Any])
      
      inline def setFakeHTTPMethodsUndefined: Self = StObject.set(x, "fakeHTTPMethods", js.undefined)
      
      inline def setRespondImmediately(value: Boolean): Self = StObject.set(x, "respondImmediately", value.asInstanceOf[js.Any])
      
      inline def setRespondImmediatelyUndefined: Self = StObject.set(x, "respondImmediately", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sinon.sinon.SinonSandboxConfig> */
  trait PartialSinonSandboxConfig extends StObject {
    
    var injectInto: js.UndefOr[js.Object | Null] = js.undefined
    
    var properties: js.UndefOr[js.Array[String]] = js.undefined
    
    var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.undefined
    
    var useFakeTimers: js.UndefOr[Boolean | PartialFakeTimerInstallOp] = js.undefined
  }
  object PartialSinonSandboxConfig {
    
    inline def apply(): PartialSinonSandboxConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSinonSandboxConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSinonSandboxConfig] (val x: Self) extends AnyVal {
      
      inline def setInjectInto(value: js.Object): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
      
      inline def setInjectIntoNull: Self = StObject.set(x, "injectInto", null)
      
      inline def setInjectIntoUndefined: Self = StObject.set(x, "injectInto", js.undefined)
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
      
      inline def setUseFakeServer(value: Boolean | SinonFakeServer): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
      
      inline def setUseFakeServerUndefined: Self = StObject.set(x, "useFakeServer", js.undefined)
      
      inline def setUseFakeTimers(value: Boolean | PartialFakeTimerInstallOp): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
      
      inline def setUseFakeTimersUndefined: Self = StObject.set(x, "useFakeTimers", js.undefined)
    }
  }
  
  trait Restore extends StObject {
    
    /**
      * Restores the original clock
      * Identical to uninstall()
      */
    def restore(): Unit
  }
  object Restore {
    
    inline def apply(restore: () => Unit): Restore = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
      __obj.asInstanceOf[Restore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Restore] (val x: Self) extends AnyVal {
      
      inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    }
  }
}
