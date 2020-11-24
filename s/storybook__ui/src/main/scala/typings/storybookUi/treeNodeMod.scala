package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.Depth
import typings.storybookUi.anon.IsExpandable
import typings.storybookUi.anon.IsExpanded
import typings.storybookUi.anon.PickDetailedHTMLPropsHTMLAbout
import typings.storybookUi.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/TreeNode", JSImport.Namespace)
@js.native
object treeNodeMod extends js.Object {
  
  val CollapseIcon: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    IsExpanded, 
    Theme
  ] = js.native
  
  val ComponentNode: FunctionComponent[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]
  ] = js.native
  
  val DocumentNode: FunctionComponent[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        `1`, 
        Theme
      ]
    ]
  ] = js.native
  
  val GroupNode: FunctionComponent[
    (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]) with IsExpandable
  ] = js.native
  
  val Path: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  val RootNode: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  val StoryNode: FunctionComponent[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        `1`, 
        Theme
      ]
    ]
  ] = js.native
}
