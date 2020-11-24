package typings.streamingJsonStringify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  var closer: String = js.native
  
  var opener: String = js.native
  
  def replacer(key: String, value: js.Any): js.Any = js.native
  @JSName("replacer")
  var replacer_Original: Replacer = js.native
  
  var seperator: String = js.native
  
  var space: String | Double = js.native
  
  def stringifier(value: js.Any, replacer: Replacer, space: String): String = js.native
  def stringifier(value: js.Any, replacer: Replacer, space: Double): String = js.native
}
