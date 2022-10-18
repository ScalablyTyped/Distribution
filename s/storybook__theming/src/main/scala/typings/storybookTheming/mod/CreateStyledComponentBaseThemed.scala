package typings.storybookTheming.mod

import typings.std.TemplateStringsArray
import typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStyledComponentBaseThemed[InnerProps, ExtraProps, StyledInstanceTheme /* <: js.Object */] extends StObject {
  
  def apply[StyleProps /* <: DistributiveOmit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](styles: (Interpolation[WithTheme_[StyleProps, StyledInstanceTheme]])*): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
  def apply[StyleProps /* <: DistributiveOmit[Overwrapped[InnerProps, StyleProps], ReactClassPropKeys] */](
    template: TemplateStringsArray,
    styles: (Interpolation[WithTheme_[StyleProps, StyledInstanceTheme]])*
  ): StyledComponent[InnerProps, StyleProps, StyledInstanceTheme] = js.native
}
