package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependenciesUpdateInfo extends NotifyInfo {
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath]
  var `type`: dependenciesUpdate
}

object DependenciesUpdateInfo {
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependenciesUpdateInfo]
  }
}

