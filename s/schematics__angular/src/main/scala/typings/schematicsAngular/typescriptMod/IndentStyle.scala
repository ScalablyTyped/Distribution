package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle & Double] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with IndentStyle
  /* 1 */ val Block: typings.schematicsAngular.typescriptMod.IndentStyle.Block & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IndentStyle
  /* 0 */ val None: typings.schematicsAngular.typescriptMod.IndentStyle.None & Double = js.native
  
  @js.native
  sealed trait Smart
    extends StObject
       with IndentStyle
  /* 2 */ val Smart: typings.schematicsAngular.typescriptMod.IndentStyle.Smart & Double = js.native
}
