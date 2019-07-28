package typings.atPulumiAws.ecrGetRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryArgs extends js.Object {
  /**
    * The name of the ECR Repository.
    */
  val name: String
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetRepositoryArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetRepositoryArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetRepositoryArgs]
  }
}

