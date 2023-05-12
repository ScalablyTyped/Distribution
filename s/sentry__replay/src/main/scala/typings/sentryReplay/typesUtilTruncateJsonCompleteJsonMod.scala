package typings.sentryReplay

import typings.sentryReplay.typesUtilTruncateJsonConstantsMod.JsonToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilTruncateJsonCompleteJsonMod {
  
  @JSImport("@sentry/replay/types/util/truncateJson/completeJson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeJson(incompleteJson: String, stack: js.Array[JsonToken]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("completeJson")(incompleteJson.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[String]
}
