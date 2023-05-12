package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeExtendsResult extends StObject
@JSImport("@sinclair/typebox", "TypeExtendsResult")
@js.native
object TypeExtendsResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeExtendsResult & Double] = js.native
  
  @js.native
  sealed trait False
    extends StObject
       with TypeExtendsResult
  /* 2 */ val False: typings.sinclairTypebox.mod.TypeExtendsResult.False & Double = js.native
  
  @js.native
  sealed trait True
    extends StObject
       with TypeExtendsResult
  /* 1 */ val True: typings.sinclairTypebox.mod.TypeExtendsResult.True & Double = js.native
  
  @js.native
  sealed trait Union
    extends StObject
       with TypeExtendsResult
  /* 0 */ val Union: typings.sinclairTypebox.mod.TypeExtendsResult.Union & Double = js.native
}
