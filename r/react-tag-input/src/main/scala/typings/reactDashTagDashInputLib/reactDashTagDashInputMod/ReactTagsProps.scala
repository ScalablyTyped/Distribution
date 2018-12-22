package typings
package reactDashTagDashInputLib.reactDashTagDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactTagsProps extends js.Object {
  var allowDeleteFromEmptyInput: js.UndefOr[scala.Boolean] = js.undefined
  var allowDragDrop: js.UndefOr[scala.Boolean] = js.undefined
  var allowUnique: js.UndefOr[scala.Boolean] = js.undefined
  var autocomplete: js.UndefOr[scala.Boolean | reactDashTagDashInputLib.reactDashTagDashInputLibNumbers.`1`] = js.undefined
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  var classNames: js.UndefOr[reactDashTagDashInputLib.Anon_Tag] = js.undefined
  var delimiters: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var handleDrag: js.UndefOr[
    js.Function3[
      /* tag */ reactDashTagDashInputLib.Anon_Text, 
      /* currPos */ scala.Double, 
      /* newPos */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var handleFilterSuggestions: js.UndefOr[
    js.Function2[
      /* textInputValue */ java.lang.String, 
      /* possibleSuggestionsArray */ js.Array[reactDashTagDashInputLib.Anon_Text], 
      js.Array[reactDashTagDashInputLib.Anon_Text]
    ]
  ] = js.undefined
  var handleInputBlur: js.UndefOr[js.Function1[/* textInputValue */ java.lang.String, scala.Unit]] = js.undefined
  var handleInputChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var handleInputFocus: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  var handleTagClick: js.UndefOr[js.Function1[/* i */ scala.Double, scala.Unit]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var labelField: js.UndefOr[java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var minQueryLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var removeComponent: js.UndefOr[reactLib.reactMod.Component[_, _, _]] = js.undefined
  var suggestions: js.UndefOr[js.Array[reactDashTagDashInputLib.Anon_Text]] = js.undefined
  var tags: js.UndefOr[js.Array[reactDashTagDashInputLib.Anon_Text]] = js.undefined
  def handleAddition(tag: reactDashTagDashInputLib.Anon_Text): scala.Unit
  def handleDelete(i: scala.Double): scala.Unit
}

