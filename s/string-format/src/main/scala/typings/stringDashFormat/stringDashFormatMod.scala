package typings.stringDashFormat

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-format", JSImport.Namespace)
@js.native
object stringDashFormatMod extends js.Object {
  def apply(template: String, args: (StringDictionary[js.Any] | String)*): String = js.native
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  def create(transformers: Transformers): js.Any = js.native
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  def extend(prototype: js.Any, transformers: Transformers): Unit = js.native
  type Transformers = StringDictionary[js.Function1[/* s */ js.Any, String]]
}

