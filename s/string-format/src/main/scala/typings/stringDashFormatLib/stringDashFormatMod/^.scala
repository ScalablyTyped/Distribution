package typings
package stringDashFormatLib.stringDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    template: java.lang.String,
    args: (org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String)*
  ): java.lang.String = js.native
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  def create(transformers: Transformers): (js.Function2[
    /* template */ java.lang.String, 
    /* repeated */ org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String, 
    java.lang.String
  ]) with stringDashFormatLib.Anon_Create = js.native
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  def extend(prototype: js.Any, transformers: Transformers): scala.Unit = js.native
}

