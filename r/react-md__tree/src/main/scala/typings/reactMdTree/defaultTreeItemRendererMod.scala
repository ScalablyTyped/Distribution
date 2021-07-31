package typings.reactMdTree

import typings.react.mod.ReactElement
import typings.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typings.reactMdTree.typesMod.ProvidedTreeItemProps
import typings.reactMdTree.typesMod.ProvidedTreeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTreeItemRendererMod {
  
  @JSImport("@react-md/tree/types/defaultTreeItemRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTreeItemRenderer")(itemProps.asInstanceOf[js.Any], item.asInstanceOf[js.Any], treeProps.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
}
