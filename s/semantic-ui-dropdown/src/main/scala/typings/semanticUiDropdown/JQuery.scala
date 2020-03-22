package typings.semanticUiDropdown

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown
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
import typings.semanticUiDropdown.SemanticUI.DropdownSettings
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`determine intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`determine select action`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get default text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get item`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get placeholder text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`get value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`hide others`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is animated`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is hidden`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is selection`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`is visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`match`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove active`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove selected`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`remove visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore default text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore default value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore defaults`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`restore placeholder text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`save defaults`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set active`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set exactly`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set selected`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set text`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set value`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`set visible`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`setup menu`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`unbind intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.action
import typings.semanticUiDropdown.semanticUiDropdownStrings.activate
import typings.semanticUiDropdown.semanticUiDropdownStrings.allowAdditions
import typings.semanticUiDropdown.semanticUiDropdownStrings.allowCategorySelection
import typings.semanticUiDropdown.semanticUiDropdownStrings.allowReselection
import typings.semanticUiDropdown.semanticUiDropdownStrings.allowTab
import typings.semanticUiDropdown.semanticUiDropdownStrings.apiSettings
import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.both
import typings.semanticUiDropdown.semanticUiDropdownStrings.className
import typings.semanticUiDropdown.semanticUiDropdownStrings.clear
import typings.semanticUiDropdown.semanticUiDropdownStrings.combo
import typings.semanticUiDropdown.semanticUiDropdownStrings.context
import typings.semanticUiDropdown.semanticUiDropdownStrings.debug
import typings.semanticUiDropdown.semanticUiDropdownStrings.delay
import typings.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typings.semanticUiDropdown.semanticUiDropdownStrings.direction
import typings.semanticUiDropdown.semanticUiDropdownStrings.downward
import typings.semanticUiDropdown.semanticUiDropdownStrings.duration
import typings.semanticUiDropdown.semanticUiDropdownStrings.error
import typings.semanticUiDropdown.semanticUiDropdownStrings.exact
import typings.semanticUiDropdown.semanticUiDropdownStrings.fields
import typings.semanticUiDropdown.semanticUiDropdownStrings.filterRemoteData
import typings.semanticUiDropdown.semanticUiDropdownStrings.forceSelection
import typings.semanticUiDropdown.semanticUiDropdownStrings.fullTextSearch
import typings.semanticUiDropdown.semanticUiDropdownStrings.glyphWidth
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.hideAdditions
import typings.semanticUiDropdown.semanticUiDropdownStrings.keepOnScreen
import typings.semanticUiDropdown.semanticUiDropdownStrings.keys
import typings.semanticUiDropdown.semanticUiDropdownStrings.label
import typings.semanticUiDropdown.semanticUiDropdownStrings.maxSelections
import typings.semanticUiDropdown.semanticUiDropdownStrings.message
import typings.semanticUiDropdown.semanticUiDropdownStrings.metadata
import typings.semanticUiDropdown.semanticUiDropdownStrings.minCharacters
import typings.semanticUiDropdown.semanticUiDropdownStrings.name
import typings.semanticUiDropdown.semanticUiDropdownStrings.namespace
import typings.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typings.semanticUiDropdown.semanticUiDropdownStrings.on
import typings.semanticUiDropdown.semanticUiDropdownStrings.onAdd
import typings.semanticUiDropdown.semanticUiDropdownStrings.onChange
import typings.semanticUiDropdown.semanticUiDropdownStrings.onHide
import typings.semanticUiDropdown.semanticUiDropdownStrings.onLabelCreate
import typings.semanticUiDropdown.semanticUiDropdownStrings.onLabelRemove
import typings.semanticUiDropdown.semanticUiDropdownStrings.onLabelSelect
import typings.semanticUiDropdown.semanticUiDropdownStrings.onNoResults
import typings.semanticUiDropdown.semanticUiDropdownStrings.onRemove
import typings.semanticUiDropdown.semanticUiDropdownStrings.onShow
import typings.semanticUiDropdown.semanticUiDropdownStrings.performance
import typings.semanticUiDropdown.semanticUiDropdownStrings.placeholder
import typings.semanticUiDropdown.semanticUiDropdownStrings.preserveHTML
import typings.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typings.semanticUiDropdown.semanticUiDropdownStrings.regExp
import typings.semanticUiDropdown.semanticUiDropdownStrings.saveRemoteData
import typings.semanticUiDropdown.semanticUiDropdownStrings.select
import typings.semanticUiDropdown.semanticUiDropdownStrings.selectOnKeydown
import typings.semanticUiDropdown.semanticUiDropdownStrings.selector
import typings.semanticUiDropdown.semanticUiDropdownStrings.setting
import typings.semanticUiDropdown.semanticUiDropdownStrings.show
import typings.semanticUiDropdown.semanticUiDropdownStrings.showOnFocus
import typings.semanticUiDropdown.semanticUiDropdownStrings.silent
import typings.semanticUiDropdown.semanticUiDropdownStrings.sortSelect
import typings.semanticUiDropdown.semanticUiDropdownStrings.text
import typings.semanticUiDropdown.semanticUiDropdownStrings.toggle
import typings.semanticUiDropdown.semanticUiDropdownStrings.transition
import typings.semanticUiDropdown.semanticUiDropdownStrings.upward
import typings.semanticUiDropdown.semanticUiDropdownStrings.useLabels
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import typings.semanticUiDropdown.semanticUiDropdownStrings.values
import typings.semanticUiDropdown.semanticUiDropdownStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dropdown")
  var dropdown_Original: Dropdown = js.native
  def dropdown(): JQuery = js.native
  def dropdown(behavior: setting, name: `match`): both | value | text = js.native
  def dropdown(behavior: setting, name: `match`, value: both): JQuery = js.native
  def dropdown(behavior: setting, name: `match`, value: text): JQuery = js.native
  def dropdown(behavior: setting, name: `match`, value: value): JQuery = js.native
  def dropdown(behavior: setting, name: action): activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  def dropdown(
    behavior: setting,
    name: action,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: action, value: activate): JQuery = js.native
  def dropdown(behavior: setting, name: action, value: combo): JQuery = js.native
  def dropdown(behavior: setting, name: action, value: hide): JQuery = js.native
  def dropdown(behavior: setting, name: action, value: nothing): JQuery = js.native
  def dropdown(behavior: setting, name: action, value: select): JQuery = js.native
  def dropdown(behavior: setting, name: allowAdditions): Boolean = js.native
  def dropdown(behavior: setting, name: allowAdditions, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: allowCategorySelection): Boolean = js.native
  def dropdown(behavior: setting, name: allowCategorySelection, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: allowReselection): Boolean = js.native
  def dropdown(behavior: setting, name: allowReselection, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: allowTab): Boolean = js.native
  def dropdown(behavior: setting, name: allowTab, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: apiSettings): `false` | ApiSettings = js.native
  def dropdown(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def dropdown(behavior: setting, name: apiSettings, value: `false`): JQuery = js.native
  def dropdown(behavior: setting, name: className): ClassNameSettings = js.native
  def dropdown(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def dropdown(behavior: setting, name: context): String | JQuery = js.native
  def dropdown(behavior: setting, name: context, value: String): JQuery = js.native
  def dropdown(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def dropdown(behavior: setting, name: debug): Boolean = js.native
  def dropdown(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: delay): DelaySettings = js.native
  def dropdown(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def dropdown(behavior: setting, name: direction): auto | upward | downward = js.native
  def dropdown(behavior: setting, name: direction, value: auto): JQuery = js.native
  def dropdown(behavior: setting, name: direction, value: downward): JQuery = js.native
  def dropdown(behavior: setting, name: direction, value: upward): JQuery = js.native
  def dropdown(behavior: setting, name: duration): Double = js.native
  def dropdown(behavior: setting, name: duration, value: Double): JQuery = js.native
  def dropdown(behavior: setting, name: error): ErrorSettings = js.native
  def dropdown(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def dropdown(behavior: setting, name: fields): FieldsSettings = js.native
  def dropdown(behavior: setting, name: fields, value: FieldsSettings): JQuery = js.native
  def dropdown(behavior: setting, name: filterRemoteData): Boolean = js.native
  def dropdown(behavior: setting, name: filterRemoteData, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: forceSelection): Boolean = js.native
  def dropdown(behavior: setting, name: forceSelection, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: fullTextSearch): Boolean | exact = js.native
  def dropdown(behavior: setting, name: fullTextSearch, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: fullTextSearch, value: exact): JQuery = js.native
  def dropdown(behavior: setting, name: glyphWidth): Double = js.native
  def dropdown(behavior: setting, name: glyphWidth, value: Double): JQuery = js.native
  def dropdown(behavior: setting, name: hideAdditions): Boolean = js.native
  def dropdown(behavior: setting, name: hideAdditions, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: keepOnScreen): Boolean = js.native
  def dropdown(behavior: setting, name: keepOnScreen, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: keys): KeySettings = js.native
  def dropdown(behavior: setting, name: keys, value: KeySettings): JQuery = js.native
  def dropdown(behavior: setting, name: label): LabelSettings = js.native
  def dropdown(behavior: setting, name: label, value: LabelSettings): JQuery = js.native
  def dropdown(behavior: setting, name: maxSelections): `false` | Double = js.native
  def dropdown(behavior: setting, name: maxSelections, value: Double): JQuery = js.native
  def dropdown(behavior: setting, name: maxSelections, value: `false`): JQuery = js.native
  def dropdown(behavior: setting, name: message): MessageSettings = js.native
  def dropdown(behavior: setting, name: message, value: MessageSettings): JQuery = js.native
  def dropdown(behavior: setting, name: metadata): MetadataSettings = js.native
  def dropdown(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def dropdown(behavior: setting, name: minCharacters): Double = js.native
  def dropdown(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def dropdown(behavior: setting, name: name): String = js.native
  def dropdown(behavior: setting, name: namespace): String = js.native
  def dropdown(behavior: setting, name: namespace, value: String): JQuery = js.native
  def dropdown(behavior: setting, name: name, value: String): JQuery = js.native
  def dropdown(behavior: setting, name: on): String = js.native
  def dropdown(behavior: setting, name: onAdd): js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ] = js.native
  def dropdown(
    behavior: setting,
    name: onAdd,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onChange): js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit] = js.native
  def dropdown(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def dropdown(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def dropdown(behavior: setting, name: onLabelCreate): js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery] = js.native
  def dropdown(
    behavior: setting,
    name: onLabelCreate,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onLabelRemove): js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit] = js.native
  def dropdown(
    behavior: setting,
    name: onLabelRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onLabelSelect): js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit] = js.native
  def dropdown(
    behavior: setting,
    name: onLabelSelect,
    value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onNoResults): js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit] = js.native
  def dropdown(
    behavior: setting,
    name: onNoResults,
    value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onRemove): js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ] = js.native
  def dropdown(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def dropdown(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def dropdown(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def dropdown(behavior: setting, name: on, value: String): JQuery = js.native
  def dropdown(behavior: setting, name: performance): Boolean = js.native
  def dropdown(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: placeholder): auto | value | `false` = js.native
  def dropdown(behavior: setting, name: placeholder, value: `false`): JQuery = js.native
  def dropdown(behavior: setting, name: placeholder, value: auto): JQuery = js.native
  def dropdown(behavior: setting, name: placeholder, value: value): JQuery = js.native
  def dropdown(behavior: setting, name: preserveHTML): Boolean = js.native
  def dropdown(behavior: setting, name: preserveHTML, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: regExp): RegExpSettings = js.native
  def dropdown(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def dropdown(behavior: setting, name: saveRemoteData): Boolean = js.native
  def dropdown(behavior: setting, name: saveRemoteData, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: selectOnKeydown): Boolean = js.native
  def dropdown(behavior: setting, name: selectOnKeydown, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: selector): SelectorSettings = js.native
  def dropdown(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def dropdown(behavior: setting, name: showOnFocus): Boolean = js.native
  def dropdown(behavior: setting, name: showOnFocus, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: silent): Boolean = js.native
  def dropdown(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: sortSelect): Boolean = js.native
  def dropdown(behavior: setting, name: sortSelect, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: transition): auto | String = js.native
  def dropdown(behavior: setting, name: transition, value: String): JQuery = js.native
  def dropdown(behavior: setting, name: transition, value: auto): JQuery = js.native
  def dropdown(behavior: setting, name: useLabels): Boolean = js.native
  def dropdown(behavior: setting, name: useLabels, value: Boolean): JQuery = js.native
  def dropdown(behavior: setting, name: values): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any = js.native
  def dropdown(
    behavior: setting,
    name: values,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  ): JQuery = js.native
  def dropdown(behavior: setting, name: verbose): Boolean = js.native
  def dropdown(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def dropdown(settings: DropdownSettings): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  @JSName("dropdown")
  def dropdown_bindintent(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  @JSName("dropdown")
  def dropdown_bindmouseevents(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  @JSName("dropdown")
  def dropdown_bindtouchevents(behavior: `bind touch events`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  @JSName("dropdown")
  def dropdown_clear(behavior: clear): JQuery = js.native
  @JSName("dropdown")
  def dropdown_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  @JSName("dropdown")
  def dropdown_determineintent(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  @JSName("dropdown")
  def dropdown_determineselectaction(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  @JSName("dropdown")
  def dropdown_getdefaulttext(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  @JSName("dropdown")
  def dropdown_getitem(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  @JSName("dropdown")
  def dropdown_getplaceholdertext(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  @JSName("dropdown")
  def dropdown_gettext(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  @JSName("dropdown")
  def dropdown_getvalue(behavior: `get value`): js.Any = js.native
  /**
    * Hides dropdown
    */
  @JSName("dropdown")
  def dropdown_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  @JSName("dropdown")
  def dropdown_hideothers(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  @JSName("dropdown")
  def dropdown_isanimated(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  @JSName("dropdown")
  def dropdown_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  @JSName("dropdown")
  def dropdown_isselection(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  @JSName("dropdown")
  def dropdown_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("dropdown")
  def dropdown_refresh(behavior: refresh): JQuery = js.native
  /**
    * Removes dropdown active state
    */
  @JSName("dropdown")
  def dropdown_removeactive(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  @JSName("dropdown")
  def dropdown_removeselected(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  @JSName("dropdown")
  def dropdown_removevisible(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaults(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaulttext(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaultvalue(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  @JSName("dropdown")
  def dropdown_restoreplaceholdertext(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  @JSName("dropdown")
  def dropdown_savedefaults(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  @JSName("dropdown")
  def dropdown_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  @JSName("dropdown")
  def dropdown_setexactly(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  @JSName("dropdown")
  def dropdown_settext(behavior: `set text`, text: String): JQuery = js.native
  @JSName("dropdown")
  def dropdown_setting(behavior: setting, value: DropdownSettings): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  @JSName("dropdown")
  def dropdown_setupmenu(behavior: `setup menu`): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  @JSName("dropdown")
  def dropdown_setvalue(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  @JSName("dropdown")
  def dropdown_setvisible(behavior: `set visible`): JQuery = js.native
  /**
    * Shows dropdown
    */
  @JSName("dropdown")
  def dropdown_show(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  @JSName("dropdown")
  def dropdown_toggle(behavior: toggle): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  @JSName("dropdown")
  def dropdown_unbindintent(behavior: `unbind intent`): JQuery = js.native
}

