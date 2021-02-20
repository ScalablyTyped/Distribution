package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeStoriesMod {
  
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
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "Expandable")
  @js.native
  def Expandable(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "Nested")
  @js.native
  def Nested(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "Selection")
  @js.native
  def Selection(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode.stories", "Types")
  @js.native
  def Types(): Element = js.native
}
