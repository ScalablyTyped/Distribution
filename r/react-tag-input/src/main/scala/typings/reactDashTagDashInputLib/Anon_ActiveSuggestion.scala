package typings
package reactDashTagDashInputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveSuggestion extends js.Object {
  var activeSuggestion: js.UndefOr[java.lang.String] = js.undefined
  var remove: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[java.lang.String] = js.undefined
  var suggestions: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var tagInput: js.UndefOr[java.lang.String] = js.undefined
  var tagInputField: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActiveSuggestion {
  @scala.inline
  def apply(
    activeSuggestion: java.lang.String = null,
    remove: java.lang.String = null,
    selected: java.lang.String = null,
    suggestions: java.lang.String = null,
    tag: java.lang.String = null,
    tagInput: java.lang.String = null,
    tagInputField: java.lang.String = null,
    tags: java.lang.String = null
  ): Anon_ActiveSuggestion = {
    val __obj = js.Dynamic.literal()
    if (activeSuggestion != null) __obj.updateDynamic("activeSuggestion")(activeSuggestion)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (tagInput != null) __obj.updateDynamic("tagInput")(tagInput)
    if (tagInputField != null) __obj.updateDynamic("tagInputField")(tagInputField)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_ActiveSuggestion]
  }
}

