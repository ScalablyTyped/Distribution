package typings.semanticUiDropdown.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiDropdown.JQuery
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
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var action: js.UndefOr[
    activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ] = js.native
  var allowAdditions: js.UndefOr[Boolean] = js.native
  var allowCategorySelection: js.UndefOr[Boolean] = js.native
  var allowReselection: js.UndefOr[Boolean] = js.native
  var allowTab: js.UndefOr[Boolean] = js.native
  var apiSettings: js.UndefOr[`false` | ApiSettings] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var context: js.UndefOr[String | JQuery] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[DelaySettings] = js.native
  var direction: js.UndefOr[auto | upward | downward] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fields: js.UndefOr[FieldsSettings] = js.native
  var filterRemoteData: js.UndefOr[Boolean] = js.native
  var forceSelection: js.UndefOr[Boolean] = js.native
  var fullTextSearch: js.UndefOr[Boolean | exact] = js.native
  var glyphWidth: js.UndefOr[Double] = js.native
  var hideAdditions: js.UndefOr[Boolean] = js.native
  var keepOnScreen: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[KeySettings] = js.native
  var label: js.UndefOr[LabelSettings] = js.native
  var `match`: js.UndefOr[both | value | text] = js.native
  var maxSelections: js.UndefOr[`false` | Double] = js.native
  var message: js.UndefOr[MessageSettings] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var minCharacters: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[String] = js.native
  var onAdd: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ] = js.native
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.native
  var onLabelCreate: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ] = js.native
  var onLabelRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]] = js.native
  var onLabelSelect: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]] = js.native
  var onNoResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]] = js.native
  var onRemove: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ] = js.native
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[auto | value | `false`] = js.native
  var preserveHTML: js.UndefOr[Boolean] = js.native
  var regExp: js.UndefOr[RegExpSettings] = js.native
  var saveRemoteData: js.UndefOr[Boolean] = js.native
  var selectOnKeydown: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var sortSelect: js.UndefOr[Boolean] = js.native
  var transition: js.UndefOr[auto | String] = js.native
  var useLabels: js.UndefOr[Boolean] = js.native
  var values: js.UndefOr[js.Any] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAllowAdditions(value: Boolean): Self = this.set("allowAdditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdditions: Self = this.set("allowAdditions", js.undefined)
    @scala.inline
    def setAllowCategorySelection(value: Boolean): Self = this.set("allowCategorySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCategorySelection: Self = this.set("allowCategorySelection", js.undefined)
    @scala.inline
    def setAllowReselection(value: Boolean): Self = this.set("allowReselection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReselection: Self = this.set("allowReselection", js.undefined)
    @scala.inline
    def setAllowTab(value: Boolean): Self = this.set("allowTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTab: Self = this.set("allowTab", js.undefined)
    @scala.inline
    def setApiSettings(value: `false` | ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiSettings: Self = this.set("apiSettings", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDelay(value: DelaySettings): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDirection(value: auto | upward | downward): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFields(value: FieldsSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilterRemoteData(value: Boolean): Self = this.set("filterRemoteData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterRemoteData: Self = this.set("filterRemoteData", js.undefined)
    @scala.inline
    def setForceSelection(value: Boolean): Self = this.set("forceSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSelection: Self = this.set("forceSelection", js.undefined)
    @scala.inline
    def setFullTextSearch(value: Boolean | exact): Self = this.set("fullTextSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTextSearch: Self = this.set("fullTextSearch", js.undefined)
    @scala.inline
    def setGlyphWidth(value: Double): Self = this.set("glyphWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphWidth: Self = this.set("glyphWidth", js.undefined)
    @scala.inline
    def setHideAdditions(value: Boolean): Self = this.set("hideAdditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideAdditions: Self = this.set("hideAdditions", js.undefined)
    @scala.inline
    def setKeepOnScreen(value: Boolean): Self = this.set("keepOnScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepOnScreen: Self = this.set("keepOnScreen", js.undefined)
    @scala.inline
    def setKeys(value: KeySettings): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLabel(value: LabelSettings): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMatch(value: both | value | text): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setMaxSelections(value: `false` | Double): Self = this.set("maxSelections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSelections: Self = this.set("maxSelections", js.undefined)
    @scala.inline
    def setMessage(value: MessageSettings): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCharacters: Self = this.set("minCharacters", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnAdd(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ js.Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]
    ): Self = this.set("onAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnLabelCreate(value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]): Self = this.set("onLabelCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLabelCreate: Self = this.set("onLabelCreate", js.undefined)
    @scala.inline
    def setOnLabelRemove(value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]): Self = this.set("onLabelRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLabelRemove: Self = this.set("onLabelRemove", js.undefined)
    @scala.inline
    def setOnLabelSelect(value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): Self = this.set("onLabelSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLabelSelect: Self = this.set("onLabelSelect", js.undefined)
    @scala.inline
    def setOnNoResults(value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]): Self = this.set("onNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnNoResults: Self = this.set("onNoResults", js.undefined)
    @scala.inline
    def setOnRemove(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ js.Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]
    ): Self = this.set("onRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setPlaceholder(value: auto | value | `false`): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPreserveHTML(value: Boolean): Self = this.set("preserveHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveHTML: Self = this.set("preserveHTML", js.undefined)
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    @scala.inline
    def setSaveRemoteData(value: Boolean): Self = this.set("saveRemoteData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveRemoteData: Self = this.set("saveRemoteData", js.undefined)
    @scala.inline
    def setSelectOnKeydown(value: Boolean): Self = this.set("selectOnKeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnKeydown: Self = this.set("selectOnKeydown", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnFocus: Self = this.set("showOnFocus", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSortSelect(value: Boolean): Self = this.set("sortSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortSelect: Self = this.set("sortSelect", js.undefined)
    @scala.inline
    def setTransition(value: auto | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setUseLabels(value: Boolean): Self = this.set("useLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLabels: Self = this.set("useLabels", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

