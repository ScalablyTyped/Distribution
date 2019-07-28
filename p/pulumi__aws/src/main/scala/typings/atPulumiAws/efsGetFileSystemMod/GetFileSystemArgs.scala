package typings.atPulumiAws.efsGetFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileSystemArgs extends js.Object {
  /**
    * Restricts the list to the file system with this creation token.
    */
  val creationToken: js.UndefOr[String] = js.undefined
  /**
    * The ID that identifies the file system (e.g. fs-ccfc0d65).
    */
  val fileSystemId: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetFileSystemArgs {
  @scala.inline
  def apply(creationToken: String = null, fileSystemId: String = null, tags: StringDictionary[js.Any] = null): GetFileSystemArgs = {
    val __obj = js.Dynamic.literal()
    if (creationToken != null) __obj.updateDynamic("creationToken")(creationToken)
    if (fileSystemId != null) __obj.updateDynamic("fileSystemId")(fileSystemId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetFileSystemArgs]
  }
}

