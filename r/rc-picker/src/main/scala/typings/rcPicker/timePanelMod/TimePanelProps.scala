package typings.rcPicker.timePanelMod

import typings.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePanelProps[DateType]
  extends SharedTimeProps[DateType]
     with PanelSharedProps[DateType] {
  var active: js.UndefOr[Boolean] = js.native
}

