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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def dropdown(): JQuery
  def dropdown(behavior: setting, name: `match`, value: Unit): both | value | text
  def dropdown(behavior: setting, name: `match`, value: both): JQuery
  def dropdown(behavior: setting, name: `match`, value: text): JQuery
  def dropdown(behavior: setting, name: `match`, value: value): JQuery
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
  ): JQuery
  def dropdown(behavior: setting, name: action, value: Unit): activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ])
  def dropdown(behavior: setting, name: action, value: activate): JQuery
  def dropdown(behavior: setting, name: action, value: combo): JQuery
  def dropdown(behavior: setting, name: action, value: hide): JQuery
  def dropdown(behavior: setting, name: action, value: nothing): JQuery
  def dropdown(behavior: setting, name: action, value: select): JQuery
  def dropdown(behavior: setting, name: allowAdditions, value: Boolean): JQuery
  def dropdown(behavior: setting, name: allowAdditions, value: Unit): Boolean
  def dropdown(behavior: setting, name: allowCategorySelection, value: Boolean): JQuery
  def dropdown(behavior: setting, name: allowCategorySelection, value: Unit): Boolean
  def dropdown(behavior: setting, name: allowReselection, value: Boolean): JQuery
  def dropdown(behavior: setting, name: allowReselection, value: Unit): Boolean
  def dropdown(behavior: setting, name: allowTab, value: Boolean): JQuery
  def dropdown(behavior: setting, name: allowTab, value: Unit): Boolean
  def dropdown(behavior: setting, name: apiSettings, value: Unit): `false` | ApiSettings
  def dropdown(behavior: setting, name: apiSettings, value: ApiSettings): JQuery
  def dropdown(behavior: setting, name: apiSettings, value: `false`): JQuery
  def dropdown(behavior: setting, name: className, value: Unit): ClassNameSettings
  def dropdown(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def dropdown(behavior: setting, name: context, value: String): JQuery
  def dropdown(behavior: setting, name: context, value: Unit): String | JQuery
  def dropdown(behavior: setting, name: context, value: JQuery): JQuery
  def dropdown(behavior: setting, name: debug, value: Boolean): JQuery
  def dropdown(behavior: setting, name: debug, value: Unit): Boolean
  def dropdown(behavior: setting, name: delay, value: Unit): DelaySettings
  def dropdown(behavior: setting, name: delay, value: DelaySettings): JQuery
  def dropdown(behavior: setting, name: direction, value: Unit): auto | upward | downward
  def dropdown(behavior: setting, name: direction, value: auto): JQuery
  def dropdown(behavior: setting, name: direction, value: downward): JQuery
  def dropdown(behavior: setting, name: direction, value: upward): JQuery
  def dropdown(behavior: setting, name: duration, value: Double): JQuery
  def dropdown(behavior: setting, name: duration, value: Unit): Double
  def dropdown(behavior: setting, name: error, value: Unit): ErrorSettings
  def dropdown(behavior: setting, name: error, value: ErrorSettings): JQuery
  def dropdown(behavior: setting, name: fields, value: Unit): FieldsSettings
  def dropdown(behavior: setting, name: fields, value: FieldsSettings): JQuery
  def dropdown(behavior: setting, name: filterRemoteData, value: Boolean): JQuery
  def dropdown(behavior: setting, name: filterRemoteData, value: Unit): Boolean
  def dropdown(behavior: setting, name: forceSelection, value: Boolean): JQuery
  def dropdown(behavior: setting, name: forceSelection, value: Unit): Boolean
  def dropdown(behavior: setting, name: fullTextSearch, value: Boolean): JQuery
  def dropdown(behavior: setting, name: fullTextSearch, value: Unit): Boolean | exact
  def dropdown(behavior: setting, name: fullTextSearch, value: exact): JQuery
  def dropdown(behavior: setting, name: glyphWidth, value: Double): JQuery
  def dropdown(behavior: setting, name: glyphWidth, value: Unit): Double
  def dropdown(behavior: setting, name: hideAdditions, value: Boolean): JQuery
  def dropdown(behavior: setting, name: hideAdditions, value: Unit): Boolean
  def dropdown(behavior: setting, name: keepOnScreen, value: Boolean): JQuery
  def dropdown(behavior: setting, name: keepOnScreen, value: Unit): Boolean
  def dropdown(behavior: setting, name: keys, value: Unit): KeySettings
  def dropdown(behavior: setting, name: keys, value: KeySettings): JQuery
  def dropdown(behavior: setting, name: label, value: Unit): LabelSettings
  def dropdown(behavior: setting, name: label, value: LabelSettings): JQuery
  def dropdown(behavior: setting, name: maxSelections, value: Double): JQuery
  def dropdown(behavior: setting, name: maxSelections, value: Unit): `false` | Double
  def dropdown(behavior: setting, name: maxSelections, value: `false`): JQuery
  def dropdown(behavior: setting, name: message, value: Unit): MessageSettings
  def dropdown(behavior: setting, name: message, value: MessageSettings): JQuery
  def dropdown(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def dropdown(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def dropdown(behavior: setting, name: minCharacters, value: Double): JQuery
  def dropdown(behavior: setting, name: minCharacters, value: Unit): Double
  def dropdown(behavior: setting, name: namespace, value: String): JQuery
  def dropdown(behavior: setting, name: namespace, value: Unit): String
  def dropdown(behavior: setting, name: name, value: String): JQuery
  def dropdown(behavior: setting, name: name, value: Unit): String
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
  ): JQuery
  def dropdown(behavior: setting, name: onAdd, value: Unit): js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ]
  def dropdown(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): JQuery
  def dropdown(behavior: setting, name: onChange, value: Unit): js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  def dropdown(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery
  def dropdown(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, `false` | Unit]
  def dropdown(
    behavior: setting,
    name: onLabelCreate,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ): JQuery
  def dropdown(behavior: setting, name: onLabelCreate, value: Unit): js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  def dropdown(
    behavior: setting,
    name: onLabelRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  ): JQuery
  def dropdown(behavior: setting, name: onLabelRemove, value: Unit): js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  def dropdown(
    behavior: setting,
    name: onLabelSelect,
    value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  ): JQuery
  def dropdown(behavior: setting, name: onLabelSelect, value: Unit): js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  def dropdown(
    behavior: setting,
    name: onNoResults,
    value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
  ): JQuery
  def dropdown(behavior: setting, name: onNoResults, value: Unit): js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
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
  ): JQuery
  def dropdown(behavior: setting, name: onRemove, value: Unit): js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ]
  def dropdown(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery
  def dropdown(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, `false` | Unit]
  def dropdown(behavior: setting, name: on, value: String): JQuery
  def dropdown(behavior: setting, name: on, value: Unit): String
  def dropdown(behavior: setting, name: performance, value: Boolean): JQuery
  def dropdown(behavior: setting, name: performance, value: Unit): Boolean
  def dropdown(behavior: setting, name: placeholder, value: Unit): auto | value | `false`
  def dropdown(behavior: setting, name: placeholder, value: `false`): JQuery
  def dropdown(behavior: setting, name: placeholder, value: auto): JQuery
  def dropdown(behavior: setting, name: placeholder, value: value): JQuery
  def dropdown(behavior: setting, name: preserveHTML, value: Boolean): JQuery
  def dropdown(behavior: setting, name: preserveHTML, value: Unit): Boolean
  def dropdown(behavior: setting, name: regExp, value: Unit): RegExpSettings
  def dropdown(behavior: setting, name: regExp, value: RegExpSettings): JQuery
  def dropdown(behavior: setting, name: saveRemoteData, value: Boolean): JQuery
  def dropdown(behavior: setting, name: saveRemoteData, value: Unit): Boolean
  def dropdown(behavior: setting, name: selectOnKeydown, value: Boolean): JQuery
  def dropdown(behavior: setting, name: selectOnKeydown, value: Unit): Boolean
  def dropdown(behavior: setting, name: selector, value: Unit): SelectorSettings
  def dropdown(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def dropdown(behavior: setting, name: showOnFocus, value: Boolean): JQuery
  def dropdown(behavior: setting, name: showOnFocus, value: Unit): Boolean
  def dropdown(behavior: setting, name: silent, value: Boolean): JQuery
  def dropdown(behavior: setting, name: silent, value: Unit): Boolean
  def dropdown(behavior: setting, name: sortSelect, value: Boolean): JQuery
  def dropdown(behavior: setting, name: sortSelect, value: Unit): Boolean
  def dropdown(behavior: setting, name: transition, value: String): JQuery
  def dropdown(behavior: setting, name: transition, value: Unit): auto | String
  def dropdown(behavior: setting, name: transition, value: auto): JQuery
  def dropdown(behavior: setting, name: useLabels, value: Boolean): JQuery
  def dropdown(behavior: setting, name: useLabels, value: Unit): Boolean
  def dropdown(
    behavior: setting,
    name: values,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  ): JQuery
  def dropdown(behavior: setting, name: values, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  def dropdown(behavior: setting, name: verbose, value: Boolean): JQuery
  def dropdown(behavior: setting, name: verbose, value: Unit): Boolean
  def dropdown(settings: DropdownSettings): JQuery
  @JSName("dropdown")
  var dropdown_Original: Dropdown
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  @JSName("dropdown")
  def dropdown_bindintent(behavior: `bind intent`): JQuery
  /**
    * Adds mouse events to element
    */
  @JSName("dropdown")
  def dropdown_bindmouseevents(behavior: `bind mouse events`): JQuery
  /**
    * Adds touch events to element
    */
  @JSName("dropdown")
  def dropdown_bindtouchevents(behavior: `bind touch events`): JQuery
  /**
    * Clears dropdown of selection
    */
  @JSName("dropdown")
  def dropdown_clear(behavior: clear): JQuery
  @JSName("dropdown")
  def dropdown_destroy(behavior: destroy): JQuery
  /**
    * Returns whether event occurred inside dropdown
    */
  @JSName("dropdown")
  def dropdown_determineintent(behavior: `determine intent`): Boolean
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  @JSName("dropdown")
  def dropdown_determineselectaction(behavior: `determine select action`, text: String, value: js.Any): JQuery
  /**
    * Returns dropdown value as set on page load
    */
  @JSName("dropdown")
  def dropdown_getdefaulttext(behavior: `get default text`): String
  /**
    * Returns DOM element that matches a given input value
    */
  @JSName("dropdown")
  def dropdown_getitem(behavior: `get item`, value: js.Any): JQuery
  /**
    * Returns placeholder text
    */
  @JSName("dropdown")
  def dropdown_getplaceholdertext(behavior: `get placeholder text`): String
  /**
    * Returns current dropdown text
    */
  @JSName("dropdown")
  def dropdown_gettext(behavior: `get text`): String
  /**
    * Returns current dropdown input value
    */
  @JSName("dropdown")
  def dropdown_getvalue(behavior: `get value`): js.Any
  /**
    * Hides dropdown
    */
  @JSName("dropdown")
  def dropdown_hide(behavior: hide): JQuery
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  @JSName("dropdown")
  def dropdown_hideothers(behavior: `hide others`): JQuery
  /**
    * Returns whether dropdown is animated
    */
  @JSName("dropdown")
  def dropdown_isanimated(behavior: `is animated`): Boolean
  /**
    * Returns whether dropdown is hidden
    */
  @JSName("dropdown")
  def dropdown_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether dropdown is a selection dropdown
    */
  @JSName("dropdown")
  def dropdown_isselection(behavior: `is selection`): Boolean
  /**
    * Returns whether dropdown is visible
    */
  @JSName("dropdown")
  def dropdown_isvisible(behavior: `is visible`): Boolean
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("dropdown")
  def dropdown_refresh(behavior: refresh): JQuery
  /**
    * Removes dropdown active state
    */
  @JSName("dropdown")
  def dropdown_removeactive(behavior: `remove active`): JQuery
  /**
    * Remove value from selected
    */
  @JSName("dropdown")
  def dropdown_removeselected(behavior: `remove selected`, value: js.Any): JQuery
  /**
    * Removes dropdown visible state
    */
  @JSName("dropdown")
  def dropdown_removevisible(behavior: `remove visible`): JQuery
  /**
    * Restores dropdown text and value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaults(behavior: `restore defaults`): JQuery
  /**
    * Restores dropdown text to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaulttext(behavior: `restore default text`): JQuery
  /**
    * Restores dropdown value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaultvalue(behavior: `restore default value`): JQuery
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  @JSName("dropdown")
  def dropdown_restoreplaceholdertext(behavior: `restore placeholder text`): JQuery
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  @JSName("dropdown")
  def dropdown_savedefaults(behavior: `save defaults`): JQuery
  /**
    * Sets dropdown to active state
    */
  @JSName("dropdown")
  def dropdown_setactive(behavior: `set active`): JQuery
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  @JSName("dropdown")
  def dropdown_setexactly(behavior: `set exactly`, values: js.Array[js.Any]): JQuery
  /**
    * Sets value as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, value: js.Any): JQuery
  /**
    * Adds a group of values as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, values: js.Array[js.Any]): JQuery
  /**
    * Sets dropdown text to a value
    */
  @JSName("dropdown")
  def dropdown_settext(behavior: `set text`, text: String): JQuery
  @JSName("dropdown")
  def dropdown_setting(behavior: setting, value: DropdownSettings): JQuery
  /**
    * Recreates dropdown menu from select option values.
    */
  @JSName("dropdown")
  def dropdown_setupmenu(behavior: `setup menu`): JQuery
  /**
    * Sets dropdown input to value (does not update display state)
    */
  @JSName("dropdown")
  def dropdown_setvalue(behavior: `set value`, value: js.Any): JQuery
  /**
    * Sets dropdown to visible state
    */
  @JSName("dropdown")
  def dropdown_setvisible(behavior: `set visible`): JQuery
  /**
    * Shows dropdown
    */
  @JSName("dropdown")
  def dropdown_show(behavior: show): JQuery
  /**
    * Toggles current visibility of dropdown
    */
  @JSName("dropdown")
  def dropdown_toggle(behavior: toggle): JQuery
  /**
    * Unbinds document intent click
    */
  @JSName("dropdown")
  def dropdown_unbindintent(behavior: `unbind intent`): JQuery
}
object JQuery {
  
  inline def apply(dropdown: Dropdown): JQuery = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
