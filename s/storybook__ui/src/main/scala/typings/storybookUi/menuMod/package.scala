package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object menuMod {
  
  type MenuButtonProps = (typings.react.mod.ComponentProps[
    typings.react.mod.FunctionComponent[
      typings.react.mod.ComponentProps[
        typings.emotionStyledBase.mod.StyledComponent[
          typings.react.mod.DetailedHTMLProps[
            typings.react.mod.ButtonHTMLAttributes[typings.std.HTMLButtonElement], 
            typings.std.HTMLButtonElement
          ], 
          typings.storybookComponents.buttonButtonMod.ButtonProps, 
          typings.storybookTheming.typesMod.Theme
        ]
      ]
    ]
  ]) with typings.react.mod.ComponentProps[typings.storybookUi.storybookUiStrings.button] with typings.storybookUi.anon.Highlighted
  
  type MenuList = /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
}
