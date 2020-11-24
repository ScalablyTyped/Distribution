package typings.storybookUi

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.PassArgsFirst
import typings.storybookUi.anon.PropsMobileProps
import typings.storybookUi.mobileMod.Mobile
import typings.storybookUi.mobileMod.MobileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/layout/mobile.stories", JSImport.Namespace)
@js.native
object mobileStoriesMod extends js.Object {
  
  def InitialAddons(hasProps: PropsMobileProps): Element = js.native
  
  def InitialCanvas(hasProps: PropsMobileProps): Element = js.native
  
  def InitialSidebar(hasProps: PropsMobileProps): Element = js.native
  
  def Page(hasProps: PropsMobileProps): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var decorators: js.Array[js.Function1[/* args */ _, _]] = js.native
    
    var parameters: PassArgsFirst = js.native
    
    var title: String = js.native
    
    @js.native
    class component protected () extends Mobile {
      def this(props: MobileProps) = this()
    }
    @js.native
    object component extends TopLevel[Instantiable1[/* props */ MobileProps, Mobile]]
  }
}
