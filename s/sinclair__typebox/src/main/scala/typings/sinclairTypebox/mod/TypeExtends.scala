package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeExtends {
  
  @JSImport("@sinclair/typebox", "TypeExtends")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Extends(left: TSchema, right: TSchema): TypeExtendsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("Extends")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TypeExtendsResult]
}
