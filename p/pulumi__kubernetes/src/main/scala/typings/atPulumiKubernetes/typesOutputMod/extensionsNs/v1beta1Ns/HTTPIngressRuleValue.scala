package typings.atPulumiKubernetes.typesOutputMod.extensionsNs.v1beta1Ns

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
  val paths: js.Array[HTTPIngressPath]
}

object HTTPIngressRuleValue {
  @scala.inline
  def apply(paths: js.Array[HTTPIngressPath]): HTTPIngressRuleValue = {
    val __obj = js.Dynamic.literal(paths = paths)
  
    __obj.asInstanceOf[HTTPIngressRuleValue]
  }
}

