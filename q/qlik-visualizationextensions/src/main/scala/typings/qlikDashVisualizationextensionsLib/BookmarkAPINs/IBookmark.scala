package typings
package qlikDashVisualizationextensionsLib.BookmarkAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBookmark extends js.Object {
  /**
    * Applies a bookmark.
    * @param id - Bookmark id.
    * @return - A promise of a Qlik engine reply.
    */
  @JSName("apply")
  def apply(id: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Creates a bookmark based on the current selection.
    * @param title - Bookmark title.
    * @param description - Bookmark description.
    * @param [sheetId] - Optional. Bookmark sheet id. Introduced in version 2.2.
    * @return - A promise of a Qlik engine reply.
    */
  def create(title: java.lang.String, description: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def create(title: java.lang.String, description: java.lang.String, sheetId: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Removes a bookmark.
    * @param id - Bookmark id.
    * @return - A promise of a Qlik engine reply.
    */
  def remove(id: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

