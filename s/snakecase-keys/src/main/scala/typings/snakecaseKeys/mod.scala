package typings.snakecaseKeys

import typings.snakecaseKeys.snakecaseKeysBooleans.`false`
import typings.snakecaseKeys.snakecaseKeysBooleans.`true`
import typings.snakecaseKeys.snakecaseKeysStrings._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert object keys to snake using [`to-snake-case`](https://github.com/ianstormtaylor/to-snake-case).
  @param input - Object or array of objects to snake-case.
  @param options - Options of conversion.
  */
  inline def apply[T /* <: (Record[String, Any]) | js.Array[Any] */, Options /* <: Options */](input: T): SnakeCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['deep'] */ js.Any, 
      `true`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[SnakeCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['deep'] */ js.Any, 
      `true`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ]]
  inline def apply[T /* <: (Record[String, Any]) | js.Array[Any] */, Options /* <: Options */](input: T, options: Options): SnakeCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['deep'] */ js.Any, 
      `true`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SnakeCaseKeys[
    T, 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['deep'] */ js.Any, 
      `true`
    ], 
    WithDefault[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['exclude'] */ js.Any, 
      EmptyTuple
    ], 
    _empty
  ]]
  
  @JSImport("snakecase-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Append a segment to dot-notation path.
  @template S - Base path.
  @template Last - Additional path.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends '' ? Last : / * template literal string: ${S}.${Last} * / string
    }}}
    */
  type AppendPath[S /* <: String */, Last /* <: String */] = Last
  
  // eslint-disable-next-line @typescript-eslint/ban-types
  type EmptyTuple = js.Array[Any]
  
  /**
  Check if an element is included in a tuple.
  @template List - List of values.
  @template Target - Target to search.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    List extends undefined ? false : List extends std.Readonly<snakecase-keys.snakecase-keys.EmptyTuple> ? false : List extends [infer First, ...infer Rest] ? First extends Target ? true : snakecase-keys.snakecase-keys.Includes<Rest, Target> : boolean
    }}}
    */
  type Includes[List /* <: js.Array[Any] */, Target] = `false`
  
  trait Options extends StObject {
    
    /**
    		Recurse nested objects and objects in arrays.
    		@default true
    		*/
    val deep: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Exclude keys from being snakeCased.
    		@default []
    		*/
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
      Options object that gets passed to snake-case parsing function.
      @default {}
      */
    val parsingOptions: js.UndefOr[typings.noCase.mod.Options] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setParsingOptions(value: typings.noCase.mod.Options): Self = StObject.set(x, "parsingOptions", value.asInstanceOf[js.Any])
      
      inline def setParsingOptionsUndefined: Self = StObject.set(x, "parsingOptions", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<any> ? // Handle arrays or tuples.
  {[ P in keyof T ]: T[P] extends std.Record<string, any> | std.Array<any>? snakecase-keys.snakecase-keys.SnakeCaseKeys<T[P], Deep, Exclude, ''> : T[P]} : T extends std.Record<string, any> ? // Handle objects.
  {[ P in keyof T as [snakecase-keys.snakecase-keys.Includes<Exclude, P>] extends [true]? P : type-fest.type-fest/source/snake-case.SnakeCase<P> ]: [Deep] extends [true]? T[P] extends std.Record<string, any> | undefined? snakecase-keys.snakecase-keys.SnakeCaseKeys<T[P], Deep, Exclude, snakecase-keys.snakecase-keys.AppendPath<Path, P & string>> : T[P] : T[P]} : // Return anything else as-is.
  T
    }}}
    */
  type SnakeCaseKeys[T /* <: (Record[String, Any]) | js.Array[Any] */, Deep /* <: Boolean */, Exclude /* <: js.Array[Any] */, Path /* <: String */] = // Return anything else as-is.
  T
  
  /**
  Return a default type if input type is nil.
  @template T - Input type.
  @template U - Default type.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined | void | null ? U : T
    }}}
    */
  type WithDefault[T, U /* <: T */] = U
}
