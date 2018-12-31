package typings
package atPulumiAwsLib.efsGetFileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileSystemArgs extends js.Object {
  /**
    * Restricts the list to the file system with this creation token.
    */
  val creationToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID that identifies the file system (e.g. fs-ccfc0d65).
    */
  val fileSystemId: js.UndefOr[java.lang.String] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

