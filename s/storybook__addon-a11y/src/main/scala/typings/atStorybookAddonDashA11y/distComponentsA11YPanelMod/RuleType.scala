package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleType extends js.Object

@JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "RuleType")
@js.native
object RuleType extends js.Object {
  @js.native
  sealed trait INCOMPLETION extends RuleType
  
  @js.native
  sealed trait PASS extends RuleType
  
  @js.native
  sealed trait VIOLATION extends RuleType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  /* 2 */ @js.native
  object INCOMPLETION extends TopLevel[INCOMPLETION with Double]
  
  /* 1 */ @js.native
  object PASS extends TopLevel[PASS with Double]
  
  /* 0 */ @js.native
  object VIOLATION extends TopLevel[VIOLATION with Double]
  
}

