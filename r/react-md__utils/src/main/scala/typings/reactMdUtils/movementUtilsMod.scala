package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.reactMdUtils.movementTypesMod.FocusType
import typings.reactMdUtils.movementTypesMod.KeyConfig
import typings.reactMdUtils.movementTypesMod.MovementKey
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movementUtilsMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getItemId(id: String, i: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemId")(id.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getKeyboardConfig(event: KeyboardEvent[Element], keys: js.Array[KeyConfig]): KeyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardConfig")(event.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[KeyConfig | Null]
  inline def getKeyboardConfig(event: typings.std.KeyboardEvent, keys: js.Array[KeyConfig]): KeyConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyboardConfig")(event.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[KeyConfig | Null]
  
  inline def getStringifiedKeyConfig(config: KeyConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringifiedKeyConfig")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transformKeys(keys: js.Array[MovementKey], `type`: FocusType): js.Array[KeyConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformKeys")(keys.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyConfig]]
}
