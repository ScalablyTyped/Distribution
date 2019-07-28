package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsJar extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var jar: String
  var mainClass: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_ArgsJar {
  @scala.inline
  def apply(
    jar: String,
    args: js.Array[String] = null,
    mainClass: String = null,
    properties: StringDictionary[js.Any] = null
  ): Anon_ArgsJar = {
    val __obj = js.Dynamic.literal(jar = jar)
    if (args != null) __obj.updateDynamic("args")(args)
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Anon_ArgsJar]
  }
}

