package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Expandable(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Expandable")().asInstanceOf[Element]
  
  @scala.inline
  def Nested(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Nested")().asInstanceOf[Element]
  
  @scala.inline
  def Selection(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Selection")().asInstanceOf[Element]
  
  @scala.inline
  def Types(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Types")().asInstanceOf[Element]
}
