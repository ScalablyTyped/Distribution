package typings.storybookTheming.mod

import typings.std.TemplateStringsArray
import typings.storybookTheming.anon.ThemeTheme
import typings.storybookTheming.distCreateC2b2ce6dMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typeparam ComponentProps  Props which will be included when withComponent is called
  * @typeparam SpecificComponentProps  Props which will *not* be included when withComponent is called
  */
@js.native
trait CreateStyledComponent[ComponentProps /* <: js.Object */, SpecificComponentProps /* <: js.Object */, JSXProps /* <: js.Object */] extends StObject {
  
  def apply(
    template: TemplateStringsArray,
    styles: (Interpolation[ComponentProps & SpecificComponentProps & ThemeTheme])*
  ): StyledComponent[ComponentProps, SpecificComponentProps, JSXProps] = js.native
  /**
    * @typeparam AdditionalProps  Additional props to add to your styled component
    */
  def apply[AdditionalProps /* <: js.Object */](styles: (Interpolation[ComponentProps & SpecificComponentProps & AdditionalProps & ThemeTheme])*): StyledComponent[ComponentProps & AdditionalProps, SpecificComponentProps, JSXProps] = js.native
}
