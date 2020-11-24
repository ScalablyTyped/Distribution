package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storeMod {
  
  type CallBack = js.Function1[/* s */ typings.storybookApi.mod.State, scala.Unit]
  
  type GetState = js.Function0[typings.storybookApi.mod.State]
  
  type InputFnPatch = js.Function1[/* s */ typings.storybookApi.mod.State, typings.storybookApi.storeMod.Patch]
  
  type InputPatch = typings.storybookApi.storeMod.Patch | typings.storybookApi.storeMod.InputFnPatch
  
  type SetState = js.Function2[/* a */ js.Any, /* b */ js.Any, js.Any]
}
