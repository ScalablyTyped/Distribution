package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.NamedExoticComponent
import typings.storybookUi.anon.WithLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersPreviewMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/containers/preview", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[WithLoader] = js.native
  
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
    
    @scala.inline
    def args: typings.storybookUi.storybookUiStrings.args = "args".asInstanceOf[typings.storybookUi.storybookUiStrings.args]
    
    @scala.inline
    def children: typings.storybookUi.storybookUiStrings.children = "children".asInstanceOf[typings.storybookUi.storybookUiStrings.children]
    
    @scala.inline
    def depth: typings.storybookUi.storybookUiStrings.depth = "depth".asInstanceOf[typings.storybookUi.storybookUiStrings.depth]
    
    @scala.inline
    def id: typings.storybookUi.storybookUiStrings.id = "id".asInstanceOf[typings.storybookUi.storybookUiStrings.id]
    
    @scala.inline
    def isComponent: typings.storybookUi.storybookUiStrings.isComponent = "isComponent".asInstanceOf[typings.storybookUi.storybookUiStrings.isComponent]
    
    @scala.inline
    def isLeaf: typings.storybookUi.storybookUiStrings.isLeaf = "isLeaf".asInstanceOf[typings.storybookUi.storybookUiStrings.isLeaf]
    
    @scala.inline
    def isRoot: typings.storybookUi.storybookUiStrings.isRoot = "isRoot".asInstanceOf[typings.storybookUi.storybookUiStrings.isRoot]
    
    @scala.inline
    def kind: typings.storybookUi.storybookUiStrings.kind = "kind".asInstanceOf[typings.storybookUi.storybookUiStrings.kind]
    
    @scala.inline
    def name: typings.storybookUi.storybookUiStrings.name = "name".asInstanceOf[typings.storybookUi.storybookUiStrings.name]
    
    @scala.inline
    def parameters: typings.storybookUi.storybookUiStrings.parameters = "parameters".asInstanceOf[typings.storybookUi.storybookUiStrings.parameters]
    
    @scala.inline
    def parent: typings.storybookUi.storybookUiStrings.parent = "parent".asInstanceOf[typings.storybookUi.storybookUiStrings.parent]
    
    @scala.inline
    def refId: typings.storybookUi.storybookUiStrings.refId = "refId".asInstanceOf[typings.storybookUi.storybookUiStrings.refId]
  }
  
  type _To = NamedExoticComponent[WithLoader]
  
  /* This means you don't have to write `default`, but can instead just say `containersPreviewMod.foo` */
  override def _to: NamedExoticComponent[WithLoader] = default
}
