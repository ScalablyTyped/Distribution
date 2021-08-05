package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MemoExoticComponent
import typings.std.HTMLDivElement
import typings.std.ReturnType
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.ComposedRefstateReturnTyp
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.storybookUiStrings.auth
import typings.storybookUi.storybookUiStrings.empty
import typings.storybookUi.storybookUiStrings.error
import typings.storybookUi.storybookUiStrings.loading
import typings.storybookUi.storybookUiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refIndicatorMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefIndicator", "MessageWrapper")
  @js.native
  val MessageWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/RefIndicator", "RefIndicator")
  @js.native
  val RefIndicator: MemoExoticComponent[ForwardRefExoticComponent[ComposedRefstateReturnTyp]] = js.native
  
  type ClickHandler = /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'][number]['onClick'] */ js.Any
  
  trait CurrentVersionProps extends StObject {
    
    var url: String
    
    var versions: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any
  }
  object CurrentVersionProps {
    
    inline def apply(
      url: String,
      versions: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any
    ): CurrentVersionProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentVersionProps]
    }
    
    extension [Self <: CurrentVersionProps](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.RefType['versions'] */ js.Any
      ): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndicatorIconProps extends StObject {
    
    var `type`: ReturnType[
        js.Function4[
          /* isLoading */ Boolean, 
          /* isAuthRequired */ Boolean, 
          /* isError */ Boolean, 
          /* isEmpty */ Boolean, 
          auth | error | loading | empty | ready
        ]
      ]
  }
  object IndicatorIconProps {
    
    inline def apply(
      `type`: ReturnType[
          js.Function4[
            /* isLoading */ Boolean, 
            /* isAuthRequired */ Boolean, 
            /* isError */ Boolean, 
            /* isEmpty */ Boolean, 
            auth | error | loading | empty | ready
          ]
        ]
    ): IndicatorIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndicatorIconProps]
    }
    
    extension [Self <: IndicatorIconProps](x: Self) {
      
      inline def setType(
        value: ReturnType[
              js.Function4[
                /* isLoading */ Boolean, 
                /* isAuthRequired */ Boolean, 
                /* isError */ Boolean, 
                /* isEmpty */ Boolean, 
                auth | error | loading | empty | ready
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
