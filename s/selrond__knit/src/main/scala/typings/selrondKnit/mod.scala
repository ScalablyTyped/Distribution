package typings.selrondKnit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@selrond/knit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def knit[TOriginal, TInsert](array: js.Array[TOriginal], item: TInsert): js.Array[TOriginal | TInsert] = (^.asInstanceOf[js.Dynamic].applyDynamic("knit")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[TOriginal | TInsert]]
}
