package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.baseHelpersFactoryMod.MakeValidatingTransformFunction
import typings.rbx.baseHelpersFactoryMod.TransformFunction
import typings.rbx.rbxInts.`1`
import typings.rbx.rbxInts.`2`
import typings.rbx.rbxInts.`3`
import typings.rbx.rbxInts.`4`
import typings.rbx.rbxInts.`5`
import typings.rbx.rbxInts.`6`
import typings.rbx.rbxInts.`7`
import typings.rbx.rbxStrings.`black-bis`
import typings.rbx.rbxStrings.`black-ter`
import typings.rbx.rbxStrings.`grey-dark`
import typings.rbx.rbxStrings.`grey-darker`
import typings.rbx.rbxStrings.`grey-light`
import typings.rbx.rbxStrings.`grey-lighter`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseHelpersTypographyMod {
  
  @JSImport("rbx/base/helpers/typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropTypes(): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[Any]]
  inline def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[Any]]
  
  @JSImport("rbx/base/helpers/typography", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[TypographyHelpersProps, js.Object] = js.native
  
  @JSImport("rbx/base/helpers/typography", "transform")
  @js.native
  val transform: TransformFunction[TypographyHelpersProps, js.Object] = js.native
  
  trait TypographyHelpersProps extends StObject {
    
    var backgroundColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var textAlign: js.UndefOr[centered | justified | left | right] = js.undefined
    
    var textColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
    
    var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
    
    var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.undefined
  }
  object TypographyHelpersProps {
    
    inline def apply(): TypographyHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyHelpersProps]
    }
    
    extension [Self <: TypographyHelpersProps](x: Self) {
      
      inline def setBackgroundColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setTextAlign(value: centered | justified | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setTextTransform(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextWeight(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeight", value.asInstanceOf[js.Any])
      
      inline def setTextWeightUndefined: Self = StObject.set(x, "textWeight", js.undefined)
    }
  }
}
