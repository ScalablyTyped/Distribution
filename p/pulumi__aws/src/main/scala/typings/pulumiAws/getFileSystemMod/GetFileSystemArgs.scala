package typings.pulumiAws.getFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileSystemArgs extends js.Object {
  /**
    * Restricts the list to the file system with this creation token.
    */
  val creationToken: js.UndefOr[String] = js.native
  /**
    * The ID that identifies the file system (e.g. fs-ccfc0d65).
    */
  val fileSystemId: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetFileSystemArgs {
  @scala.inline
  def apply(creationToken: String = null, fileSystemId: String = null, tags: StringDictionary[js.Any] = null): GetFileSystemArgs = {
    val __obj = js.Dynamic.literal()
    if (creationToken != null) __obj.updateDynamic("creationToken")(creationToken.asInstanceOf[js.Any])
    if (fileSystemId != null) __obj.updateDynamic("fileSystemId")(fileSystemId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileSystemArgs]
  }
}

