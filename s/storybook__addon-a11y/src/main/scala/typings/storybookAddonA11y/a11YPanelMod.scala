package typings.storybookAddonA11y

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11YPanelMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "A11YPanel")
  @js.native
  val A11YPanel: FC[js.Object] = js.native
  
  @js.native
  sealed trait RuleType extends StObject
  @JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "RuleType")
  @js.native
  object RuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
    
    @js.native
    sealed trait INCOMPLETION extends RuleType
    /* 2 */ val INCOMPLETION: typings.storybookAddonA11y.a11YPanelMod.RuleType.INCOMPLETION with Double = js.native
    
    @js.native
    sealed trait PASS extends RuleType
    /* 1 */ val PASS: typings.storybookAddonA11y.a11YPanelMod.RuleType.PASS with Double = js.native
    
    @js.native
    sealed trait VIOLATION extends RuleType
    /* 0 */ val VIOLATION: typings.storybookAddonA11y.a11YPanelMod.RuleType.VIOLATION with Double = js.native
  }
}
