package typings.randomUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-useragent", "getRandom")
@js.native
object getRandom extends js.Object {
  
  def apply(): String | Null = js.native
  def apply(
    filter: js.Function3[/* value */ UserAgent, /* index */ Double, /* array */ js.Array[UserAgent], Boolean]
  ): String | Null = js.native
}
