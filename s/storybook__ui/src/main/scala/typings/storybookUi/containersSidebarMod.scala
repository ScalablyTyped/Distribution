package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersSidebarMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/containers/sidebar", JSImport.Default)
  @js.native
  val default: FunctionComponent[js.Object] = js.native
  
  /* Inlined @storybook/api.@storybook/api.StoriesHash[keyof @storybook/api.@storybook/api.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.kind
    - typings.storybookUi.storybookUiStrings.children
    - typings.storybookUi.storybookUiStrings.refId
    - typings.storybookUi.storybookUiStrings.isComponent
    - typings.storybookUi.storybookUiStrings.depth
    - typings.storybookUi.storybookUiStrings.parent
    - typings.storybookUi.storybookUiStrings.isLeaf
    - typings.storybookUi.storybookUiStrings.args
    - typings.storybookUi.storybookUiStrings.parameters
    - typings.storybookUi.storybookUiStrings.name
    - typings.storybookUi.storybookUiStrings.id
    - typings.storybookUi.storybookUiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    inline def args: typings.storybookUi.storybookUiStrings.args = "args".asInstanceOf[typings.storybookUi.storybookUiStrings.args]
    
    inline def children: typings.storybookUi.storybookUiStrings.children = "children".asInstanceOf[typings.storybookUi.storybookUiStrings.children]
    
    inline def depth: typings.storybookUi.storybookUiStrings.depth = "depth".asInstanceOf[typings.storybookUi.storybookUiStrings.depth]
    
    inline def id: typings.storybookUi.storybookUiStrings.id = "id".asInstanceOf[typings.storybookUi.storybookUiStrings.id]
    
    inline def isComponent: typings.storybookUi.storybookUiStrings.isComponent = "isComponent".asInstanceOf[typings.storybookUi.storybookUiStrings.isComponent]
    
    inline def isLeaf: typings.storybookUi.storybookUiStrings.isLeaf = "isLeaf".asInstanceOf[typings.storybookUi.storybookUiStrings.isLeaf]
    
    inline def isRoot: typings.storybookUi.storybookUiStrings.isRoot = "isRoot".asInstanceOf[typings.storybookUi.storybookUiStrings.isRoot]
    
    inline def kind: typings.storybookUi.storybookUiStrings.kind = "kind".asInstanceOf[typings.storybookUi.storybookUiStrings.kind]
    
    inline def name: typings.storybookUi.storybookUiStrings.name = "name".asInstanceOf[typings.storybookUi.storybookUiStrings.name]
    
    inline def parameters: typings.storybookUi.storybookUiStrings.parameters = "parameters".asInstanceOf[typings.storybookUi.storybookUiStrings.parameters]
    
    inline def parent: typings.storybookUi.storybookUiStrings.parent = "parent".asInstanceOf[typings.storybookUi.storybookUiStrings.parent]
    
    inline def refId: typings.storybookUi.storybookUiStrings.refId = "refId".asInstanceOf[typings.storybookUi.storybookUiStrings.refId]
  }
  
  type _To = FunctionComponent[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `containersSidebarMod.foo` */
  override def _to: FunctionComponent[js.Object] = default
}
