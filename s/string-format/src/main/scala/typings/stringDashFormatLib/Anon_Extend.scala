package typings
package stringDashFormatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  def create(transformers: stringDashFormatLib.stringDashFormatMod.Transformers): /* import warning: ImportType.apply Failed type conversion: typeof string-format.string-format.Format */ js.Any
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  def extend(prototype: js.Any, transformers: stringDashFormatLib.stringDashFormatMod.Transformers): scala.Unit
}

