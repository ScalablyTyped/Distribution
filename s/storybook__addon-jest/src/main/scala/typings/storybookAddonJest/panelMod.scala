package typings.storybookAddonJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Context
import typings.storybookAddonJest.anon.Active
import typings.storybookAddonJest.anon.ComponentDidCatch
import typings.storybookAddonJest.anon.ReadonlyHocProps
import typings.storybookAddonJest.provideJestResultMod.HocProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-jest/dist/components/Panel", JSImport.Namespace)
@js.native
object panelMod extends js.Object {
  @js.native
  class default protected () extends ComponentDidCatch {
    def this(props: ReadonlyHocProps) = this()
    def this(props: HocProps) = this()
    def this(props: HocProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable1[(/* props */ HocProps) | (/* props */ ReadonlyHocProps), ComponentDidCatch]
       with Instantiable2[/* props */ HocProps, /* context */ js.Any, ComponentDidCatch] {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: Active = js.native
  }
  
}

