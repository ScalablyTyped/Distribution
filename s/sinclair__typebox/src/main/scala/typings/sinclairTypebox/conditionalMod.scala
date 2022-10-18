package typings.sinclairTypebox

import typings.sinclairTypebox.conditionalConditionalMod.TExclude
import typings.sinclairTypebox.conditionalConditionalMod.TExtends
import typings.sinclairTypebox.conditionalConditionalMod.TExtract
import typings.sinclairTypebox.conditionalStructuralMod.StructuralResult
import typings.sinclairTypebox.mod.SchemaOptions
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  object Conditional {
    
    @JSImport("@sinclair/typebox/conditional", "Conditional")
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
  
  object Structural {
    
    @JSImport("@sinclair/typebox/conditional", "Structural")
    @js.native
    val ^ : js.Any = js.native
    
    /** Structurally tests if the left schema extends the right. */
    inline def Check(left: TSchema, right: TSchema): StructuralResult = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[StructuralResult]
  }
  
  @JSImport("@sinclair/typebox/conditional", "StructuralResult")
  @js.native
  object StructuralResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sinclairTypebox.conditionalStructuralMod.StructuralResult & Double] = js.native
    
    /* 2 */ val False: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.False & Double = js.native
    
    /* 1 */ val True: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.True & Double = js.native
    
    /* 0 */ val Union: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.Union & Double = js.native
  }
}
