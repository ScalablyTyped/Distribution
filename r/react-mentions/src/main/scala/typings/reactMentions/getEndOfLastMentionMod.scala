package typings.reactMentions

import typings.reactMentions.anon.PartialConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEndOfLastMentionMod {
  
  @JSImport("react-mentions/lib/utils/getEndOfLastMention", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndOfLastMention(value: String, config: PartialConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndOfLastMention")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Double]
}
