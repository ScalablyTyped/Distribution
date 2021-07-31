package typings.reactMdUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bemMod {
  
  @JSImport("@react-md/utils/types/bem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bem(base: Block): BEMResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bem")(base.asInstanceOf[js.Any]).asInstanceOf[BEMResult]
  
  type BEMResult = js.Function2[
    /* elementOrModifier */ js.UndefOr[Element | Modifier], 
    /* modifier */ js.UndefOr[Modifier], 
    String
  ]
  
  type Block = String
  
  type Element = String
  
  type Modifier = Record[String, js.Any]
}
