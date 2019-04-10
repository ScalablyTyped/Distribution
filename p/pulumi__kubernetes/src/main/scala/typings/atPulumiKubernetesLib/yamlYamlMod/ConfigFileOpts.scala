package typings
package atPulumiKubernetesLib.yamlYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFileOpts extends js.Object {
  /** Path or a URL that uniquely identifies a file. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    */
  var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
}

object ConfigFileOpts {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    transformations: js.Array[js.Function1[/* o */ _, scala.Unit]] = null
  ): ConfigFileOpts = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[ConfigFileOpts]
  }
}

