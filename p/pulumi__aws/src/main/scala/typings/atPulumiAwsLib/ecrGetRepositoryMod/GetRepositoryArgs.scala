package typings
package atPulumiAwsLib.ecrGetRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryArgs extends js.Object {
  /**
    * The name of the ECR Repository.
    */
  val name: java.lang.String
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetRepositoryArgs {
  @scala.inline
  def apply(name: java.lang.String, tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null): GetRepositoryArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetRepositoryArgs]
  }
}

