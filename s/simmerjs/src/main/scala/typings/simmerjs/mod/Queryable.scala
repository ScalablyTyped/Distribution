package typings.simmerjs.mod

import typings.std.ArrayLike
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable extends Scope {
  
  def querySelectorAll(selector: String, onError: js.Function1[/* error */ js.Any, Unit]): ArrayLike[Element] = js.native
  @JSName("querySelectorAll")
  var querySelectorAll_Original: QueryEngine = js.native
}
