package typings.pulumiKubernetes.outputMod.authorization.v1

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
  val nonResourceURLs: js.Array[String]
  /**
    * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch,
    * head, options.  "*" means all.
    */
  val verbs: js.Array[String]
}

object NonResourceRule {
  @scala.inline
  def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourceRule = {
    val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NonResourceRule]
  }
}

