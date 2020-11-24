package typings.reactMdTypography

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTypography.srOnlyMod.SrOnlyProps
import typings.reactMdTypography.textContainerMod.TextContainerProps
import typings.reactMdTypography.textMod.TextElement
import typings.reactMdTypography.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/typography", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps with RefAttributes[TextElement]] = js.native
  
  val Text: ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]] = js.native
  
  val TextContainer: ForwardRefExoticComponent[
    TextContainerProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])
  ] = js.native
}
