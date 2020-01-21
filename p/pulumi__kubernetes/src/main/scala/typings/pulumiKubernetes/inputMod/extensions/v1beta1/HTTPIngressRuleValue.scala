package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example:
  * http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC
  * 3986, this resource will be used to match against everything after the last '/' and before
  * the first '?' or '#'.
  */
trait HTTPIngressRuleValue extends js.Object {
  /**
    * A collection of paths that map requests to backends.
    */
  var paths: Input[js.Array[Input[HTTPIngressPath]]]
}

object HTTPIngressRuleValue {
  @scala.inline
  def apply(paths: Input[js.Array[Input[HTTPIngressPath]]]): HTTPIngressRuleValue = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTTPIngressRuleValue]
  }
}

