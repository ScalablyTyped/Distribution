package typings.semanticUiDropdown

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.activate
import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.both
import typings.semanticUiDropdown.semanticUiDropdownStrings.combo
import typings.semanticUiDropdown.semanticUiDropdownStrings.downward
import typings.semanticUiDropdown.semanticUiDropdownStrings.exact
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typings.semanticUiDropdown.semanticUiDropdownStrings.select
import typings.semanticUiDropdown.semanticUiDropdownStrings.text
import typings.semanticUiDropdown.semanticUiDropdownStrings.upward
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var action: js.UndefOr[
    activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ] = js.undefined
  var allowAdditions: js.UndefOr[Boolean] = js.undefined
  var allowCategorySelection: js.UndefOr[Boolean] = js.undefined
  var allowReselection: js.UndefOr[Boolean] = js.undefined
  var allowTab: js.UndefOr[Boolean] = js.undefined
  var apiSettings: js.UndefOr[`false` | ApiSettings] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var context: js.UndefOr[String | JQuery] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[DelaySettings] = js.undefined
  var direction: js.UndefOr[auto | upward | downward] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var fields: js.UndefOr[FieldsSettings] = js.undefined
  var filterRemoteData: js.UndefOr[Boolean] = js.undefined
  var forceSelection: js.UndefOr[Boolean] = js.undefined
  var fullTextSearch: js.UndefOr[Boolean | exact] = js.undefined
  var glyphWidth: js.UndefOr[Double] = js.undefined
  var hideAdditions: js.UndefOr[Boolean] = js.undefined
  var keepOnScreen: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[KeySettings] = js.undefined
  var label: js.UndefOr[LabelSettings] = js.undefined
  var `match`: js.UndefOr[both | value | text] = js.undefined
  var maxSelections: js.UndefOr[`false` | Double] = js.undefined
  var message: js.UndefOr[MessageSettings] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var minCharacters: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.undefined
  var onLabelCreate: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ] = js.undefined
  var onLabelRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]] = js.undefined
  var onLabelSelect: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]] = js.undefined
  var onNoResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]] = js.undefined
  var onRemove: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[auto | value | `false`] = js.undefined
  var preserveHTML: js.UndefOr[Boolean] = js.undefined
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  var saveRemoteData: js.UndefOr[Boolean] = js.undefined
  var selectOnKeydown: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var sortSelect: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[auto | String] = js.undefined
  var useLabels: js.UndefOr[Boolean] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]) = null,
    allowAdditions: js.UndefOr[Boolean] = js.undefined,
    allowCategorySelection: js.UndefOr[Boolean] = js.undefined,
    allowReselection: js.UndefOr[Boolean] = js.undefined,
    allowTab: js.UndefOr[Boolean] = js.undefined,
    apiSettings: `false` | ApiSettings = null,
    className: ClassNameSettings = null,
    context: String | JQuery = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delay: DelaySettings = null,
    direction: auto | upward | downward = null,
    duration: Int | Double = null,
    error: ErrorSettings = null,
    fields: FieldsSettings = null,
    filterRemoteData: js.UndefOr[Boolean] = js.undefined,
    forceSelection: js.UndefOr[Boolean] = js.undefined,
    fullTextSearch: Boolean | exact = null,
    glyphWidth: Int | Double = null,
    hideAdditions: js.UndefOr[Boolean] = js.undefined,
    keepOnScreen: js.UndefOr[Boolean] = js.undefined,
    keys: KeySettings = null,
    label: LabelSettings = null,
    `match`: both | value | text = null,
    maxSelections: `false` | Double = null,
    message: MessageSettings = null,
    metadata: MetadataSettings = null,
    minCharacters: Int | Double = null,
    name: String = null,
    namespace: String = null,
    on: String = null,
    onAdd: js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ] = null,
    onChange: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit] = null,
    onHide: js.ThisFunction0[/* this */ JQuery, `false` | Unit] = null,
    onLabelCreate: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery] = null,
    onLabelRemove: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit] = null,
    onLabelSelect: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit] = null,
    onNoResults: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit] = null,
    onRemove: js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ] = null,
    onShow: js.ThisFunction0[/* this */ JQuery, `false` | Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    placeholder: auto | value | `false` = null,
    preserveHTML: js.UndefOr[Boolean] = js.undefined,
    regExp: RegExpSettings = null,
    saveRemoteData: js.UndefOr[Boolean] = js.undefined,
    selectOnKeydown: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    sortSelect: js.UndefOr[Boolean] = js.undefined,
    transition: auto | String = null,
    useLabels: js.UndefOr[Boolean] = js.undefined,
    values: js.Any = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdditions)) __obj.updateDynamic("allowAdditions")(allowAdditions.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCategorySelection)) __obj.updateDynamic("allowCategorySelection")(allowCategorySelection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReselection)) __obj.updateDynamic("allowReselection")(allowReselection.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTab)) __obj.updateDynamic("allowTab")(allowTab.asInstanceOf[js.Any])
    if (apiSettings != null) __obj.updateDynamic("apiSettings")(apiSettings.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(filterRemoteData)) __obj.updateDynamic("filterRemoteData")(filterRemoteData.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSelection)) __obj.updateDynamic("forceSelection")(forceSelection.asInstanceOf[js.Any])
    if (fullTextSearch != null) __obj.updateDynamic("fullTextSearch")(fullTextSearch.asInstanceOf[js.Any])
    if (glyphWidth != null) __obj.updateDynamic("glyphWidth")(glyphWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideAdditions)) __obj.updateDynamic("hideAdditions")(hideAdditions.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOnScreen)) __obj.updateDynamic("keepOnScreen")(keepOnScreen.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (maxSelections != null) __obj.updateDynamic("maxSelections")(maxSelections.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLabelCreate != null) __obj.updateDynamic("onLabelCreate")(onLabelCreate.asInstanceOf[js.Any])
    if (onLabelRemove != null) __obj.updateDynamic("onLabelRemove")(onLabelRemove.asInstanceOf[js.Any])
    if (onLabelSelect != null) __obj.updateDynamic("onLabelSelect")(onLabelSelect.asInstanceOf[js.Any])
    if (onNoResults != null) __obj.updateDynamic("onNoResults")(onNoResults.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHTML)) __obj.updateDynamic("preserveHTML")(preserveHTML.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (!js.isUndefined(saveRemoteData)) __obj.updateDynamic("saveRemoteData")(saveRemoteData.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnKeydown)) __obj.updateDynamic("selectOnKeydown")(selectOnKeydown.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(sortSelect)) __obj.updateDynamic("sortSelect")(sortSelect.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(useLabels)) __obj.updateDynamic("useLabels")(useLabels.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

