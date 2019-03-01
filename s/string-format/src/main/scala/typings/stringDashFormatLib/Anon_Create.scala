package typings
package stringDashFormatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  def create(transformers: stringDashFormatLib.stringDashFormatMod.Transformers): /* import warning: ImportType.apply Failed type conversion: typeof Format */ js.Any
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  def extend(prototype: js.Any, transformers: stringDashFormatLib.stringDashFormatMod.Transformers): scala.Unit
}

object Anon_Create {
  @scala.inline
  def apply(
    create: js.Function1[
      stringDashFormatLib.stringDashFormatMod.Transformers, 
      /* import warning: ImportType.apply Failed type conversion: typeof Format */ js.Any
    ],
    extend: js.Function2[js.Any, stringDashFormatLib.stringDashFormatMod.Transformers, scala.Unit]
  ): Anon_Create = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_Create]
  }
}

