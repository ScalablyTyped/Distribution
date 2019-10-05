package typings.atPulumiKubernetes.typesInputMod.authorization.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NonResourceRule holds information that describes a rule for the non-resource
  */
trait NonResourceRule extends js.Object {
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path.  "*" means all.
    */
  var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch,
    * head, options.  "*" means all.
    */
  var verbs: Input[js.Array[Input[String]]]
}

object NonResourceRule {
  @scala.inline
  def apply(verbs: Input[js.Array[Input[String]]], nonResourceURLs: Input[js.Array[Input[String]]] = null): NonResourceRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    if (nonResourceURLs != null) __obj.updateDynamic("nonResourceURLs")(nonResourceURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonResourceRule]
  }
}

