package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Modifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Padding
import typings.storybookComponents.anon.Placement
import typings.storybookComponents.storybookComponentsStrings.arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@popperjsCoreLibModifiersArrowMod` extends Shortcut {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-arrow", JSImport.Default)
  @js.native
  val default: ArrowModifier = js.native
  
  type ArrowModifier = Modifier[arrow, Options]
  
  trait Options extends StObject {
    
    var element: HTMLElement | String | Null
    
    var padding: Padding | (js.Function1[/* arg0 */ Placement, Padding])
  }
  object Options {
    
    inline def apply(padding: Padding | (js.Function1[/* arg0 */ Placement, Padding])): Options = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setPadding(value: Padding | (js.Function1[/* arg0 */ Placement, Padding])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingFunction1(value: /* arg0 */ Placement => Padding): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ArrowModifier
  
  /* This means you don't have to write `default`, but can instead just say ``distTs3Dot9Modules@popperjsCoreLibModifiersArrowMod`.foo` */
  override def _to: ArrowModifier = default
}
