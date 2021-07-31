package typings.reactMdTypography

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTypography.srOnlyMod.SrOnlyProps
import typings.reactMdTypography.textContainerMod.TextContainerProps
import typings.reactMdTypography.textMod.TextElement
import typings.reactMdTypography.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/typography", "SrOnly")
  @js.native
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps & RefAttributes[TextElement]] = js.native
  
  @JSImport("@react-md/typography", "Text")
  @js.native
  val Text: ForwardRefExoticComponent[TextProps & RefAttributes[TextElement]] = js.native
  
  @JSImport("@react-md/typography", "TextContainer")
  @js.native
  val TextContainer: ForwardRefExoticComponent[
    TextContainerProps & (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])
  ] = js.native
}
