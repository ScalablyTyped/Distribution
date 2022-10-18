package typings.storybookAddonJest

import typings.react.mod.Context
import typings.storybookAddonJest.anon.Active
import typings.storybookAddonJest.anon.ComponentDidCatch
import typings.storybookAddonJest.anon.ReadonlyHocProps
import typings.storybookAddonJest.distTs3Dot9HocProvideJestResultMod.HocProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsPanelMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@storybook/addon-jest/dist/ts3.9/components/Panel", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: ReadonlyHocProps) = this()
    def this(props: HocProps) = this()
    def this(props: HocProps, context: Any) = this()
  }
  object default {
    
    @JSImport("@storybook/addon-jest/dist/ts3.9/components/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-jest/dist/ts3.9/components/Panel", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-jest/dist/ts3.9/components/Panel", "default.defaultProps")
    @js.native
    def defaultProps: Active = js.native
    inline def defaultProps_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
