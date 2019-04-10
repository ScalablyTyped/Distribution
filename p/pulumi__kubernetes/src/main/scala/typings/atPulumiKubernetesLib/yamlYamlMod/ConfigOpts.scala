package typings
package atPulumiKubernetesLib.yamlYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOpts extends js.Object {
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.Array[_]
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    */
  var transformations: js.UndefOr[js.Array[js.Function1[/* o */ _, scala.Unit]]] = js.undefined
}

object ConfigOpts {
  @scala.inline
  def apply(objs: js.Array[_], transformations: js.Array[js.Function1[/* o */ _, scala.Unit]] = null): ConfigOpts = {
    val __obj = js.Dynamic.literal(objs = objs)
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[ConfigOpts]
  }
}

