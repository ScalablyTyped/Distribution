package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.reactMdUtils.movementTypesMod.FocusType
import typings.reactMdUtils.movementTypesMod.KeyConfig
import typings.reactMdUtils.movementTypesMod.MovementKey
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/movement/utils", JSImport.Namespace)
@js.native
object movementUtilsMod extends js.Object {
  def getItemId(id: String, i: Double): String = js.native
  def getKeyboardConfig(event: KeyboardEvent[Element], keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  def getKeyboardConfig(event: typings.std.KeyboardEvent, keys: js.Array[KeyConfig]): KeyConfig | Null = js.native
  def getStringifiedKeyConfig(config: KeyConfig): String = js.native
  def transformKeys(keys: js.Array[MovementKey], `type`: FocusType): js.Array[KeyConfig] = js.native
}

