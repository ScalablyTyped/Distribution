package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsJar extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var jar: java.lang.String
  var mainClass: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_ArgsJar {
  @scala.inline
  def apply(
    jar: java.lang.String,
    args: js.Array[java.lang.String] = null,
    mainClass: java.lang.String = null,
    properties: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ArgsJar = {
    val __obj = js.Dynamic.literal(jar = jar)
    if (args != null) __obj.updateDynamic("args")(args)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Anon_ArgsJar]
  }
}

