package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replacement extends js.Object {
  /**
    * The region of the artifact to delete.
    */
  var deletedRegion: Region
  /**
    * The content to insert at the location specified by the 'deletedRegion' property.
    */
  var insertedContent: js.UndefOr[ArtifactContent] = js.undefined
  /**
    * Key/value pairs that provide additional information about the replacement.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Replacement {
  @scala.inline
  def apply(deletedRegion: Region, insertedContent: ArtifactContent = null, properties: PropertyBag = null): Replacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deletedRegion")(deletedRegion)
    if (insertedContent != null) __obj.updateDynamic("insertedContent")(insertedContent)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Replacement]
  }
}

