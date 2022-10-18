package typings.sinclairTypebox

import typings.sinclairTypebox.mod.TSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalStructuralMod {
  
  object Structural {
    
    @JSImport("@sinclair/typebox/conditional/structural", "Structural")
    @js.native
    val ^ : js.Any = js.native
    
    /** Structurally tests if the left schema extends the right. */
    inline def Check(left: TSchema, right: TSchema): StructuralResult = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[StructuralResult]
  }
  
  @js.native
  sealed trait StructuralResult extends StObject
  @JSImport("@sinclair/typebox/conditional/structural", "StructuralResult")
  @js.native
  object StructuralResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StructuralResult & Double] = js.native
    
    @js.native
    sealed trait False
      extends StObject
         with StructuralResult
    /* 2 */ val False: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.False & Double = js.native
    
    @js.native
    sealed trait True
      extends StObject
         with StructuralResult
    /* 1 */ val True: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.True & Double = js.native
    
    @js.native
    sealed trait Union
      extends StObject
         with StructuralResult
    /* 0 */ val Union: typings.sinclairTypebox.conditionalStructuralMod.StructuralResult.Union & Double = js.native
  }
}
