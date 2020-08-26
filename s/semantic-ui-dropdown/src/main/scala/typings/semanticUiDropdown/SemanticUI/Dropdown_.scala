package typings.semanticUiDropdown.SemanticUI

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

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown_ extends js.Object {
  var settings: DropdownSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  def apply(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  def apply(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  def apply(behavior: `bind touch events`): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  def apply(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  def apply(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  def apply(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  def apply(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  def apply(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  def apply(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  def apply(behavior: `get value`): js.Any = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  def apply(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  def apply(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes dropdown active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  def apply(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  def apply(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  def apply(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  def apply(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  def apply(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  def apply(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  def apply(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  def apply(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  def apply(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  def apply(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  def apply(behavior: `set text`, text: String): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  def apply(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  def apply(behavior: `set visible`): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  def apply(behavior: `setup menu`): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  def apply(behavior: `unbind intent`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dropdown
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: js.UndefOr[scala.Nothing]): both | value | text = js.native
  def apply(behavior: setting, name: `match`, value: both): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: text): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: value): JQuery = js.native
  def apply(behavior: setting, name: action, value: js.UndefOr[scala.Nothing]): activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  def apply(
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
  def apply(behavior: setting, name: action, value: activate): JQuery = js.native
  def apply(behavior: setting, name: action, value: combo): JQuery = js.native
  def apply(behavior: setting, name: action, value: hide): JQuery = js.native
  def apply(behavior: setting, name: action, value: nothing): JQuery = js.native
  def apply(behavior: setting, name: action, value: select): JQuery = js.native
  def apply(behavior: setting, name: allowAdditions, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowCategorySelection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowCategorySelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowReselection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowReselection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowTab, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowTab, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings, value: js.UndefOr[scala.Nothing]): `false` | ApiSettings = js.native
  def apply(behavior: setting, name: apiSettings, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: delay, value: js.UndefOr[scala.Nothing]): DelaySettings = js.native
  def apply(behavior: setting, name: direction, value: js.UndefOr[scala.Nothing]): auto | upward | downward = js.native
  def apply(behavior: setting, name: direction, value: auto): JQuery = js.native
  def apply(behavior: setting, name: direction, value: downward): JQuery = js.native
  def apply(behavior: setting, name: direction, value: upward): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: fields, value: js.UndefOr[scala.Nothing]): FieldsSettings = js.native
  def apply(behavior: setting, name: filterRemoteData, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: filterRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: forceSelection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: forceSelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch, value: js.UndefOr[scala.Nothing]): Boolean | exact = js.native
  def apply(behavior: setting, name: fullTextSearch, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch, value: exact): JQuery = js.native
  def apply(behavior: setting, name: glyphWidth, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: glyphWidth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: hideAdditions, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: hideAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keepOnScreen, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: keepOnScreen, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keys, value: js.UndefOr[scala.Nothing]): KeySettings = js.native
  def apply(behavior: setting, name: label, value: js.UndefOr[scala.Nothing]): LabelSettings = js.native
  def apply(behavior: setting, name: maxSelections, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: maxSelections, value: Double): JQuery = js.native
  def apply(behavior: setting, name: maxSelections, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: message, value: js.UndefOr[scala.Nothing]): MessageSettings = js.native
  def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  def apply(behavior: setting, name: minCharacters, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onAdd, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
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
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLabelCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery] = js.native
  def apply(
    behavior: setting,
    name: onLabelCreate,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelSelect, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelSelect,
    value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onNoResults, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onNoResults,
    value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
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
  def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: js.UndefOr[scala.Nothing]): auto | value | `false` = js.native
  def apply(behavior: setting, name: placeholder, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: auto): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: value): JQuery = js.native
  def apply(behavior: setting, name: preserveHTML, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: preserveHTML, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: saveRemoteData, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: saveRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selectOnKeydown, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: selectOnKeydown, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: showOnFocus, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: showOnFocus, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: sortSelect, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: sortSelect, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): auto | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: auto): JQuery = js.native
  def apply(behavior: setting, name: useLabels, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: useLabels, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: values, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: values,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: DropdownSettings): JQuery = js.native
  /**
    * Shows dropdown
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DropdownSettings): JQuery = js.native
}

