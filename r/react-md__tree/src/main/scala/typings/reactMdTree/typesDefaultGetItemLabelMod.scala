package typings.reactMdTree

import typings.react.mod.ReactNode
import typings.reactMdTree.typesTypesMod.UnknownTreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDefaultGetItemLabelMod {
  
  @JSImport("@react-md/tree/types/defaultGetItemLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetItemLabel(item: UnknownTreeItem, labelKey: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetItemLabel")(item.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
