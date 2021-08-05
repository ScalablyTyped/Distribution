package typings.reactMdTree

import typings.reactMdTree.typesMod.UnknownTreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultGetItemValueMod {
  
  @JSImport("@react-md/tree/types/defaultGetItemValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetItemValue(item: UnknownTreeItem, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetItemValue")(item.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
}
