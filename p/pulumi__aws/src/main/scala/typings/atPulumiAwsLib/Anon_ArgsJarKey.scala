package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsJarKey extends js.Object {
  var args: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var jar: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var mainClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var properties: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object Anon_ArgsJarKey {
  @scala.inline
  def apply(
    jar: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    args: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    mainClass: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    properties: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Anon_ArgsJarKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsJarKey]
  }
}

