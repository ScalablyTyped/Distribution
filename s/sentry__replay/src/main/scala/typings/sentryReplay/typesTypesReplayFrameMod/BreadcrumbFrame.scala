package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sentryReplay.typesTypesReplayFrameMod.ConsoleFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.ClickFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.InputFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.KeyboardEventFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.BlurFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.FocusFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.SlowClickFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.MultiClickFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.MutationFrame
  - typings.sentryReplay.typesTypesReplayFrameMod.BaseBreadcrumbFrame
*/
trait BreadcrumbFrame
  extends StObject
     with ReplayFrame
object BreadcrumbFrame {
  
  inline def BaseBreadcrumbFrame(category: String, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.BaseBreadcrumbFrame = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.BaseBreadcrumbFrame]
  }
  
  inline def BlurFrame(timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.BlurFrame = {
    val __obj = js.Dynamic.literal(category = "ui.blur", timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.BlurFrame]
  }
  
  inline def ClickFrame(data: ClickFrameData, message: String, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.ClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.click", data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.ClickFrame]
  }
  
  inline def ConsoleFrame(data: ConsoleFrameData, message: String, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.ConsoleFrame = {
    val __obj = js.Dynamic.literal(category = "console", data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.ConsoleFrame]
  }
  
  inline def FocusFrame(timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.FocusFrame = {
    val __obj = js.Dynamic.literal(category = "ui.focus", timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.FocusFrame]
  }
  
  inline def InputFrame(message: String, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.InputFrame = {
    val __obj = js.Dynamic.literal(category = "ui.input", message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.InputFrame]
  }
  
  inline def KeyboardEventFrame(data: KeyboardEventFrameData, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.KeyboardEventFrame = {
    val __obj = js.Dynamic.literal(category = "ui.keyDown", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.KeyboardEventFrame]
  }
  
  inline def MultiClickFrame(data: MultiClickFrameData, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.MultiClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.multiClick", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.MultiClickFrame]
  }
  
  inline def MutationFrame(data: MutationFrameData, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.MutationFrame = {
    val __obj = js.Dynamic.literal(category = "replay.mutations", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.MutationFrame]
  }
  
  inline def SlowClickFrame(data: SlowClickFrameData, timestamp: Double, `type`: String): typings.sentryReplay.typesTypesReplayFrameMod.SlowClickFrame = {
    val __obj = js.Dynamic.literal(category = "ui.slowClickDetected", data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sentryReplay.typesTypesReplayFrameMod.SlowClickFrame]
  }
}
