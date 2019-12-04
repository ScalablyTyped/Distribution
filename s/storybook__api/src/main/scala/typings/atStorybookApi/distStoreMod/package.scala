package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStoreMod {
  import typings.atStorybookApi.atStorybookApiMod.State

  type CallBack = js.Function1[/* s */ State, Unit]
  type GetState = js.Function0[State]
  type InputFnPatch = js.Function1[/* s */ State, Patch]
  type InputPatch = Patch | InputFnPatch
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
}
