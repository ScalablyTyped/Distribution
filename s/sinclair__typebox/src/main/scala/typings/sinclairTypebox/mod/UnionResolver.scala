package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnionResolver {
  
  @JSImport("@sinclair/typebox", "UnionResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a resolved union with interior unions flattened */
  inline def Resolve(union: TUnion[js.Array[TSchema]]): TUnion[js.Array[TSchema]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(union.asInstanceOf[js.Any]).asInstanceOf[TUnion[js.Array[TSchema]]]
}
