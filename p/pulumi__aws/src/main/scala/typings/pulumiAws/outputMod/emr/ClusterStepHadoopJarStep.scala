package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStepHadoopJarStep extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var jar: String = js.native
  var mainClass: js.UndefOr[String] = js.native
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ClusterStepHadoopJarStep {
  @scala.inline
  def apply(
    jar: String,
    args: js.Array[String] = null,
    mainClass: String = null,
    properties: StringDictionary[js.Any] = null
  ): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (mainClass != null) __obj.updateDynamic("mainClass")(mainClass.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
}

