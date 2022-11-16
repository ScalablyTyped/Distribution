package typings.sinclairTypebox

import typings.sinclairTypebox.mod.SchemaOptions
import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TUnion
import typings.std.Exclude
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalConditionalMod {
  
  object Conditional {
    
    @JSImport("@sinclair/typebox/conditional/conditional", "Conditional")
    @js.native
    val ^ : js.Any = js.native
    
    /** (Experimental) Constructs a type by excluding from UnionType all union members that are assignable to ExcludedMembers. */
    inline def Exclude[T /* <: TUnion[js.Array[TSchema]] */, U /* <: TUnion[js.Array[TSchema]] */](unionType: T, excludedMembers: U): TExclude[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(unionType.asInstanceOf[js.Any], excludedMembers.asInstanceOf[js.Any])).asInstanceOf[TExclude[T, U]]
    inline def Exclude[T /* <: TUnion[js.Array[TSchema]] */, U /* <: TUnion[js.Array[TSchema]] */](unionType: T, excludedMembers: U, options: SchemaOptions): TExclude[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("Exclude")(unionType.asInstanceOf[js.Any], excludedMembers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TExclude[T, U]]
    
    /** (Experimental) Creates a conditional expression type */
    inline def Extends[L /* <: TSchema */, R /* <: TSchema */, T /* <: TSchema */, U /* <: TSchema */](left: L, right: R, ok: T, fail: U): TExtends[L, R, T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("Extends")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], fail.asInstanceOf[js.Any])).asInstanceOf[TExtends[L, R, T, U]]
    
    /** (Experimental) Constructs a type by extracting from Type all union members that are assignable to Union. */
    inline def Extract[T /* <: TSchema */, U /* <: TUnion[js.Array[TSchema]] */](`type`: T, union: U): TExtract[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(`type`.asInstanceOf[js.Any], union.asInstanceOf[js.Any])).asInstanceOf[TExtract[T, U]]
    inline def Extract[T /* <: TSchema */, U /* <: TUnion[js.Array[TSchema]] */](`type`: T, union: U, options: SchemaOptions): TExtract[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(`type`.asInstanceOf[js.Any], union.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TExtract[T, U]]
  }
  
  @js.native
  trait TExclude[T /* <: TUnion[js.Array[TSchema]] */, U /* <: TUnion[js.Array[TSchema]] */]
    extends StObject
       with TUnion[js.Array[Any]] {
    
    @JSName("static")
    var static_TExclude: Exclude[
        Static[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
        ], 
        Static[
          U, 
          /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
        ]
      ] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @sinclair/typebox.@sinclair/typebox.Static<L, []> extends @sinclair/typebox.@sinclair/typebox.Static<R, []> ? T : U
    }}}
    */
  type TExtends[L /* <: TSchema */, R /* <: TSchema */, T /* <: TSchema */, U /* <: TSchema */] = T
  
  @js.native
  trait TExtract[T /* <: TSchema */, U /* <: TUnion[js.Array[TSchema]] */]
    extends StObject
       with TUnion[js.Array[Any]] {
    
    @JSName("static")
    var static_TExtract: Extract[
        Static[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
        ], 
        Static[
          U, 
          /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
        ]
      ] = js.native
  }
}
