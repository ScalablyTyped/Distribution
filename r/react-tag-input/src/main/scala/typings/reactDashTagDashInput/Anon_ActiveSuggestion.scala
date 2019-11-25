package typings.reactDashTagDashInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveSuggestion extends js.Object {
  var activeSuggestion: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
  var suggestions: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var tagInput: js.UndefOr[String] = js.undefined
  var tagInputField: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
}

object Anon_ActiveSuggestion {
  @scala.inline
  def apply(
    activeSuggestion: String = null,
    remove: String = null,
    selected: String = null,
    suggestions: String = null,
    tag: String = null,
    tagInput: String = null,
    tagInputField: String = null,
    tags: String = null
  ): Anon_ActiveSuggestion = {
    val __obj = js.Dynamic.literal()
    if (activeSuggestion != null) __obj.updateDynamic("activeSuggestion")(activeSuggestion.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagInput != null) __obj.updateDynamic("tagInput")(tagInput.asInstanceOf[js.Any])
    if (tagInputField != null) __obj.updateDynamic("tagInputField")(tagInputField.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveSuggestion]
  }
}

