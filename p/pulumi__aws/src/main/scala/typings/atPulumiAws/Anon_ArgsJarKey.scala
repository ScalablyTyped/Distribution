package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsJarKey extends js.Object {
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var jar: Input[String]
  var mainClass: js.UndefOr[Input[String]] = js.undefined
  var properties: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object Anon_ArgsJarKey {
  @scala.inline
  def apply(
    jar: Input[String],
    args: Input[js.Array[Input[String]]] = null,
    mainClass: Input[String] = null,
    properties: Input[StringDictionary[_]] = null
  ): Anon_ArgsJarKey = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsJarKey]
  }
}

