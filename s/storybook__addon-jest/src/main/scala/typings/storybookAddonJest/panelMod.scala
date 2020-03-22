package typings.storybookAddonJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Context
import typings.storybookAddonJest.provideJestResultMod.HocProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-jest/dist/components/Panel", JSImport.Namespace)
@js.native
object panelMod extends js.Object {
  @js.native
  class default protected () extends AnonComponentDidCatch {
    def this(props: ReadonlyHocProps) = this()
    def this(props: HocProps) = this()
    def this(props: HocProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable1[(/* props */ HocProps) | (/* props */ ReadonlyHocProps), AnonComponentDidCatch]
       with Instantiable2[/* props */ HocProps, /* context */ js.Any, AnonComponentDidCatch] {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: AnonActive = js.native
  }
  
}

