package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.NotifyInfo
import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedFields extends NotifyInfo {
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath]
  var `type`: dependenciesUpdate
}

object RelatedFields {
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): RelatedFields = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedFields]
  }
}

