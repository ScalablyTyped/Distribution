package typings.atPulumiAws.typesInputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStepHadoopJarStep extends js.Object {
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var jar: Input[String] = js.native
  var mainClass: js.UndefOr[Input[String]] = js.native
  var properties: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterStepHadoopJarStep {
  @scala.inline
  def apply(
    jar: Input[String],
    args: Input[js.Array[Input[String]]] = null,
    mainClass: Input[String] = null,
    properties: Input[StringDictionary[_]] = null
  ): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
}

