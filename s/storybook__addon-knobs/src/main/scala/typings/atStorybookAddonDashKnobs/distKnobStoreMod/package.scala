package typings.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKnobStoreMod {
  import typings.atStorybookAddonDashKnobs.Anon_Callback
  import typings.atStorybookAddonDashKnobs.distTypeDashDefsMod.Knob

  type Callback = js.Function0[js.Any]
  type KnobStoreKnob = Knob[_] with Anon_Callback
}
