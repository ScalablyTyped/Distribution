package typings.semanticUiDropdown.SemanticUI

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings.Param
import typings.semanticUiDropdown.anon.Name
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typings.semanticUiDropdown.semanticUiDropdownStrings.`change values`
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
import typings.semanticUiDropdown.semanticUiDropdownStrings.clear
import typings.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typings.semanticUiDropdown.semanticUiDropdownStrings.setting
import typings.semanticUiDropdown.semanticUiDropdownStrings.show
import typings.semanticUiDropdown.semanticUiDropdownStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown extends StObject {
  
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
    * Changes dropdown to use new values. values structure: [ {value, text, name} ].
    */
  def apply(behavior: `change values`): JQuery = js.native
  /**
    * Changes dropdown to use new values. values structure: [ {value, text, name} ].
    */
  def apply(behavior: `change values`, values: js.Array[Name]): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  def apply(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  def apply(behavior: `determine select action`, text: String, value: Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  def apply(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  def apply(behavior: `get item`, value: Any): JQuery = js.native
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
  def apply(behavior: `get value`): Any = js.native
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
  def apply(behavior: `remove selected`, value: Any): JQuery = js.native
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
  def apply(behavior: `set exactly`, values: js.Array[Any]): JQuery = js.native
  /**
    * Sets value as selected
    */
  def apply(behavior: `set selected`, value: Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  def apply(behavior: `set selected`, values: js.Array[Any]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  def apply(behavior: `set text`, text: String): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  def apply(behavior: `set value`, value: Any): JQuery = js.native
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
  def apply[K /* <: /* keyof semantic-ui-dropdown.SemanticUI.DropdownSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-dropdown.SemanticUI.DropdownSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any = js.native
  
  var settings: DropdownSettings = js.native
}
object Dropdown {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'addition'
        */
      var addition: String
      
      /**
        * @default 'animating'
        */
      var animating: String
      
      /**
        * @default 'disabled'
        */
      var disabled: String
      
      /**
        * @default 'ui dropdown'
        */
      var dropdown: String
      
      /**
        * @default 'filtered'
        */
      var filtered: String
      
      /**
        * @default 'hidden transition'
        */
      var hidden: String
      
      /**
        * @default 'item'
        */
      var item: String
      
      /**
        * @default 'ui label'
        */
      var label: String
      
      /**
        * @default 'loading'
        */
      var loading: String
      
      /**
        * @default 'menu'
        */
      var menu: String
      
      /**
        * @default 'message'
        */
      var message: String
      
      /**
        * @default 'multiple'
        */
      var multiple: String
      
      /**
        * @default 'default'
        */
      var placeholder: String
      
      /**
        * @default 'search'
        */
      var search: String
      
      /**
        * @default 'selected'
        */
      var selected: String
      
      /**
        * @default 'selection'
        */
      var selection: String
      
      /**
        * @default 'upward'
        */
      var upward: String
      
      /**
        * @default 'visible'
        */
      var visible: String
    }
    object Impl {
      
      inline def apply(
        active: String,
        addition: String,
        animating: String,
        disabled: String,
        dropdown: String,
        filtered: String,
        hidden: String,
        item: String,
        label: String,
        loading: String,
        menu: String,
        message: String,
        multiple: String,
        placeholder: String,
        search: String,
        selected: String,
        selection: String,
        upward: String,
        visible: String
      ): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addition = addition.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], upward = upward.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
        
        inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
        
        inline def setFiltered(value: String): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
        
        inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
        
        inline def setUpward(value: String): Self = StObject.set(x, "upward", value.asInstanceOf[js.Any])
        
        inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImplactivePartialPick
      - typings.semanticUiDropdown.anon.PickImpladditionPartialPiActive
      - typings.semanticUiDropdown.anon.PickImplanimatingPartialP
      - typings.semanticUiDropdown.anon.PickImpldisabledPartialPi
      - typings.semanticUiDropdown.anon.PickImpldropdownPartialPiActive
      - typings.semanticUiDropdown.anon.PickImplfilteredPartialPi
      - typings.semanticUiDropdown.anon.PickImplhiddenPartialPick
      - typings.semanticUiDropdown.anon.PickImplitemPartialPickImActive
      - typings.semanticUiDropdown.anon.PickImpllabelPartialPickIActive
      - typings.semanticUiDropdown.anon.PickImplloadingPartialPic
      - typings.semanticUiDropdown.anon.PickImplmenuPartialPickImActive
      - typings.semanticUiDropdown.anon.PickImplmessagePartialPicActive
      - typings.semanticUiDropdown.anon.PickImplmultiplePartialPi
      - typings.semanticUiDropdown.anon.PickImplplaceholderPartiaActive
      - typings.semanticUiDropdown.anon.PickImplsearchPartialPickActive
      - typings.semanticUiDropdown.anon.PickImplselectedPartialPi
      - typings.semanticUiDropdown.anon.PickImplselectionPartialP
      - typings.semanticUiDropdown.anon.PickImplupwardPartialPick
      - typings.semanticUiDropdown.anon.PickImplvisiblePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String): typings.semanticUiDropdown.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplactivePartialPick]
      }
      
      inline def PickImpladditionPartialPiActive(addition: String): typings.semanticUiDropdown.anon.PickImpladditionPartialPiActive = {
        val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpladditionPartialPiActive]
      }
      
      inline def PickImplanimatingPartialP(animating: String): typings.semanticUiDropdown.anon.PickImplanimatingPartialP = {
        val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplanimatingPartialP]
      }
      
      inline def PickImpldisabledPartialPi(disabled: String): typings.semanticUiDropdown.anon.PickImpldisabledPartialPi = {
        val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldisabledPartialPi]
      }
      
      inline def PickImpldropdownPartialPiActive(dropdown: String): typings.semanticUiDropdown.anon.PickImpldropdownPartialPiActive = {
        val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldropdownPartialPiActive]
      }
      
      inline def PickImplfilteredPartialPi(filtered: String): typings.semanticUiDropdown.anon.PickImplfilteredPartialPi = {
        val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplfilteredPartialPi]
      }
      
      inline def PickImplhiddenPartialPick(hidden: String): typings.semanticUiDropdown.anon.PickImplhiddenPartialPick = {
        val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplhiddenPartialPick]
      }
      
      inline def PickImplitemPartialPickImActive(item: String): typings.semanticUiDropdown.anon.PickImplitemPartialPickImActive = {
        val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplitemPartialPickImActive]
      }
      
      inline def PickImpllabelPartialPickIActive(label: String): typings.semanticUiDropdown.anon.PickImpllabelPartialPickIActive = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpllabelPartialPickIActive]
      }
      
      inline def PickImplloadingPartialPic(loading: String): typings.semanticUiDropdown.anon.PickImplloadingPartialPic = {
        val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplloadingPartialPic]
      }
      
      inline def PickImplmenuPartialPickImActive(menu: String): typings.semanticUiDropdown.anon.PickImplmenuPartialPickImActive = {
        val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmenuPartialPickImActive]
      }
      
      inline def PickImplmessagePartialPicActive(message: String): typings.semanticUiDropdown.anon.PickImplmessagePartialPicActive = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmessagePartialPicActive]
      }
      
      inline def PickImplmultiplePartialPi(multiple: String): typings.semanticUiDropdown.anon.PickImplmultiplePartialPi = {
        val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmultiplePartialPi]
      }
      
      inline def PickImplplaceholderPartiaActive(placeholder: String): typings.semanticUiDropdown.anon.PickImplplaceholderPartiaActive = {
        val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplplaceholderPartiaActive]
      }
      
      inline def PickImplsearchPartialPickActive(search: String): typings.semanticUiDropdown.anon.PickImplsearchPartialPickActive = {
        val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsearchPartialPickActive]
      }
      
      inline def PickImplselectedPartialPi(selected: String): typings.semanticUiDropdown.anon.PickImplselectedPartialPi = {
        val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplselectedPartialPi]
      }
      
      inline def PickImplselectionPartialP(selection: String): typings.semanticUiDropdown.anon.PickImplselectionPartialP = {
        val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplselectionPartialP]
      }
      
      inline def PickImplupwardPartialPick(upward: String): typings.semanticUiDropdown.anon.PickImplupwardPartialPick = {
        val __obj = js.Dynamic.literal(upward = upward.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplupwardPartialPick]
      }
      
      inline def PickImplvisiblePartialPic(visible: String): typings.semanticUiDropdown.anon.PickImplvisiblePartialPic = {
        val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvisiblePartialPic]
      }
    }
  }
  type ClassNameSettings = Param
  
  object DelaySettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 300
        */
      var hide: Double
      
      /**
        * @default 50
        */
      var search: Double
      
      /**
        * @default 200
        */
      var show: Double
      
      /**
        * @default 50
        */
      var touch: Double
    }
    object Impl {
      
      inline def apply(hide: Double, search: Double, show: Double, touch: Double): Impl = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImplhidePartialPickIm
      - typings.semanticUiDropdown.anon.PickImplshowPartialPickIm
      - typings.semanticUiDropdown.anon.PickImplsearchPartialPick
      - typings.semanticUiDropdown.anon.PickImpltouchPartialPickI
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplhidePartialPickIm(hide: Double): typings.semanticUiDropdown.anon.PickImplhidePartialPickIm = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplhidePartialPickIm]
      }
      
      inline def PickImplsearchPartialPick(search: Double): typings.semanticUiDropdown.anon.PickImplsearchPartialPick = {
        val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsearchPartialPick]
      }
      
      inline def PickImplshowPartialPickIm(show: Double): typings.semanticUiDropdown.anon.PickImplshowPartialPickIm = {
        val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplshowPartialPickIm]
      }
      
      inline def PickImpltouchPartialPickI(touch: Double): typings.semanticUiDropdown.anon.PickImpltouchPartialPickI = {
        val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpltouchPartialPickI]
      }
    }
  }
  type DelaySettings = typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings.Param
  
  object ErrorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'You called a dropdown action that was not defined'
        */
      var action: String
      
      /**
        * @default 'Once a select has been initialized behaviors must be called on the created ui dropdown'
        */
      var alreadySetup: String
      
      /**
        * @default 'Allowing user additions currently requires the use of labels.'
        */
      var labels: String
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
      
      /**
        * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
        */
      var noTransition: String
    }
    object Impl {
      
      inline def apply(action: String, alreadySetup: String, labels: String, method: String, noTransition: String): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], alreadySetup = alreadySetup.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setAlreadySetup(value: String): Self = StObject.set(x, "alreadySetup", value.asInstanceOf[js.Any])
        
        inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImplactionPartialPickAction
      - typings.semanticUiDropdown.anon.PickImplalreadySetupParti
      - typings.semanticUiDropdown.anon.PickImpllabelsPartialPick
      - typings.semanticUiDropdown.anon.PickImplmethodPartialPick
      - typings.semanticUiDropdown.anon.PickImplnoTransitionParti
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactionPartialPickAction(action: String): typings.semanticUiDropdown.anon.PickImplactionPartialPickAction = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplactionPartialPickAction]
      }
      
      inline def PickImplalreadySetupParti(alreadySetup: String): typings.semanticUiDropdown.anon.PickImplalreadySetupParti = {
        val __obj = js.Dynamic.literal(alreadySetup = alreadySetup.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplalreadySetupParti]
      }
      
      inline def PickImpllabelsPartialPick(labels: String): typings.semanticUiDropdown.anon.PickImpllabelsPartialPick = {
        val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpllabelsPartialPick]
      }
      
      inline def PickImplmethodPartialPick(method: String): typings.semanticUiDropdown.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplnoTransitionParti(noTransition: String): typings.semanticUiDropdown.anon.PickImplnoTransitionParti = {
        val __obj = js.Dynamic.literal(noTransition = noTransition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplnoTransitionParti]
      }
    }
  }
  type ErrorSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings.Param
  
  object FieldsSettings {
    
    trait Impl extends StObject {
      
      /**
        * displayed dropdown text
        *
        * @default 'name'
        */
      var name: String
      
      /**
        * grouping for api results
        *
        * @default 'results'
        */
      var remoteValues: String
      
      /**
        * actual dropdown value
        *
        * @default 'value'
        */
      var value: String
      
      /**
        * grouping for all dropdown values
        *
        * @default 'values'
        */
      var values: String
    }
    object Impl {
      
      inline def apply(name: String, remoteValues: String, value: String, values: String): Impl = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remoteValues = remoteValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImplremoteValuesParti
      - typings.semanticUiDropdown.anon.PickImplvaluesPartialPickName
      - typings.semanticUiDropdown.anon.PickImplnamePartialPickImName
      - typings.semanticUiDropdown.anon.PickImplvaluePartialPickI
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplnamePartialPickImName(name: String): typings.semanticUiDropdown.anon.PickImplnamePartialPickImName = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplnamePartialPickImName]
      }
      
      inline def PickImplremoteValuesParti(remoteValues: String): typings.semanticUiDropdown.anon.PickImplremoteValuesParti = {
        val __obj = js.Dynamic.literal(remoteValues = remoteValues.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplremoteValuesParti]
      }
      
      inline def PickImplvaluePartialPickI(value: String): typings.semanticUiDropdown.anon.PickImplvaluePartialPickI = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvaluePartialPickI]
      }
      
      inline def PickImplvaluesPartialPickName(values: String): typings.semanticUiDropdown.anon.PickImplvaluesPartialPickName = {
        val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvaluesPartialPickName]
      }
    }
  }
  type FieldsSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings.Param
  
  object KeySettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 8
        */
      var backspace: Double
      
      /**
        * @default 46
        */
      var deleteKey: Double
      
      /**
        * @default 188
        */
      var delimiter: Double | `false`
      
      /**
        * @default 40
        */
      var downArrow: Double
      
      /**
        * @default 13
        */
      var enter: Double
      
      /**
        * @default 27
        */
      var escape: Double
      
      /**
        * @default 37
        */
      var leftArrow: Double
      
      /**
        * @default 34
        */
      var pageDown: Double
      
      /**
        * @default 33
        */
      var pageUp: Double
      
      /**
        * @default 39
        */
      var rightArrow: Double
      
      /**
        * @default 38
        */
      var upArrow: Double
    }
    object Impl {
      
      inline def apply(
        backspace: Double,
        deleteKey: Double,
        delimiter: Double | `false`,
        downArrow: Double,
        enter: Double,
        escape: Double,
        leftArrow: Double,
        pageDown: Double,
        pageUp: Double,
        rightArrow: Double,
        upArrow: Double
      ): Impl = {
        val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], deleteKey = deleteKey.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setBackspace(value: Double): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
        
        inline def setDeleteKey(value: Double): Self = StObject.set(x, "deleteKey", value.asInstanceOf[js.Any])
        
        inline def setDelimiter(value: Double | `false`): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        inline def setDownArrow(value: Double): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
        
        inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        inline def setEscape(value: Double): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
        
        inline def setLeftArrow(value: Double): Self = StObject.set(x, "leftArrow", value.asInstanceOf[js.Any])
        
        inline def setPageDown(value: Double): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
        
        inline def setPageUp(value: Double): Self = StObject.set(x, "pageUp", value.asInstanceOf[js.Any])
        
        inline def setRightArrow(value: Double): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
        
        inline def setUpArrow(value: Double): Self = StObject.set(x, "upArrow", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImplbackspacePartialP
      - typings.semanticUiDropdown.anon.PickImpldelimiterPartialP
      - typings.semanticUiDropdown.anon.PickImpldeleteKeyPartialP
      - typings.semanticUiDropdown.anon.PickImplenterPartialPickI
      - typings.semanticUiDropdown.anon.PickImplescapePartialPick
      - typings.semanticUiDropdown.anon.PickImplpageUpPartialPick
      - typings.semanticUiDropdown.anon.PickImplpageDownPartialPi
      - typings.semanticUiDropdown.anon.PickImplleftArrowPartialP
      - typings.semanticUiDropdown.anon.PickImplupArrowPartialPic
      - typings.semanticUiDropdown.anon.PickImplrightArrowPartial
      - typings.semanticUiDropdown.anon.PickImpldownArrowPartialP
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbackspacePartialP(backspace: Double): typings.semanticUiDropdown.anon.PickImplbackspacePartialP = {
        val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplbackspacePartialP]
      }
      
      inline def PickImpldeleteKeyPartialP(deleteKey: Double): typings.semanticUiDropdown.anon.PickImpldeleteKeyPartialP = {
        val __obj = js.Dynamic.literal(deleteKey = deleteKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldeleteKeyPartialP]
      }
      
      inline def PickImpldelimiterPartialP(delimiter: Double | `false`): typings.semanticUiDropdown.anon.PickImpldelimiterPartialP = {
        val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldelimiterPartialP]
      }
      
      inline def PickImpldownArrowPartialP(downArrow: Double): typings.semanticUiDropdown.anon.PickImpldownArrowPartialP = {
        val __obj = js.Dynamic.literal(downArrow = downArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldownArrowPartialP]
      }
      
      inline def PickImplenterPartialPickI(enter: Double): typings.semanticUiDropdown.anon.PickImplenterPartialPickI = {
        val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplenterPartialPickI]
      }
      
      inline def PickImplescapePartialPick(escape: Double): typings.semanticUiDropdown.anon.PickImplescapePartialPick = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplescapePartialPick]
      }
      
      inline def PickImplleftArrowPartialP(leftArrow: Double): typings.semanticUiDropdown.anon.PickImplleftArrowPartialP = {
        val __obj = js.Dynamic.literal(leftArrow = leftArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplleftArrowPartialP]
      }
      
      inline def PickImplpageDownPartialPi(pageDown: Double): typings.semanticUiDropdown.anon.PickImplpageDownPartialPi = {
        val __obj = js.Dynamic.literal(pageDown = pageDown.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplpageDownPartialPi]
      }
      
      inline def PickImplpageUpPartialPick(pageUp: Double): typings.semanticUiDropdown.anon.PickImplpageUpPartialPick = {
        val __obj = js.Dynamic.literal(pageUp = pageUp.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplpageUpPartialPick]
      }
      
      inline def PickImplrightArrowPartial(rightArrow: Double): typings.semanticUiDropdown.anon.PickImplrightArrowPartial = {
        val __obj = js.Dynamic.literal(rightArrow = rightArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplrightArrowPartial]
      }
      
      inline def PickImplupArrowPartialPic(upArrow: Double): typings.semanticUiDropdown.anon.PickImplupArrowPartialPic = {
        val __obj = js.Dynamic.literal(upArrow = upArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplupArrowPartialPic]
      }
    }
  }
  type KeySettings = typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings.Param
  
  object LabelSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 200
        */
      var duration: Double
      
      /**
        * @default 'horizontal flip'
        */
      var transition: String
      
      /**
        * @default false
        */
      var variation: `false` | String
    }
    object Impl {
      
      inline def apply(duration: Double, transition: String, variation: `false` | String): Impl = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImpltransitionPartialDuration
      - typings.semanticUiDropdown.anon.PickImpldurationPartialPiDuration
      - typings.semanticUiDropdown.anon.PickImplvariationPartialP
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpldurationPartialPiDuration(duration: Double): typings.semanticUiDropdown.anon.PickImpldurationPartialPiDuration = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldurationPartialPiDuration]
      }
      
      inline def PickImpltransitionPartialDuration(transition: String): typings.semanticUiDropdown.anon.PickImpltransitionPartialDuration = {
        val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpltransitionPartialDuration]
      }
      
      inline def PickImplvariationPartialP(variation: `false` | String): typings.semanticUiDropdown.anon.PickImplvariationPartialP = {
        val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvariationPartialP]
      }
    }
  }
  type LabelSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings.Param
  
  object MessageSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'Add <b>{term}</b>'
        */
      var addResult: String
      
      /**
        * @default '{count} selected'
        */
      var count: String
      
      /**
        * @default 'Max {maxCount} selections'
        */
      var maxSelections: String
      
      /**
        * 'No results found.'
        */
      var noResults: String
    }
    object Impl {
      
      inline def apply(addResult: String, count: String, maxSelections: String, noResults: String): Impl = {
        val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setAddResult(value: String): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
        
        inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
        
        inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImpladdResultPartialP
      - typings.semanticUiDropdown.anon.PickImplcountPartialPickI
      - typings.semanticUiDropdown.anon.PickImplmaxSelectionsPartAddResult
      - typings.semanticUiDropdown.anon.PickImplnoResultsPartialP
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpladdResultPartialP(addResult: String): typings.semanticUiDropdown.anon.PickImpladdResultPartialP = {
        val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpladdResultPartialP]
      }
      
      inline def PickImplcountPartialPickI(count: String): typings.semanticUiDropdown.anon.PickImplcountPartialPickI = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplcountPartialPickI]
      }
      
      inline def PickImplmaxSelectionsPartAddResult(maxSelections: String): typings.semanticUiDropdown.anon.PickImplmaxSelectionsPartAddResult = {
        val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmaxSelectionsPartAddResult]
      }
      
      inline def PickImplnoResultsPartialP(noResults: String): typings.semanticUiDropdown.anon.PickImplnoResultsPartialP = {
        val __obj = js.Dynamic.literal(noResults = noResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplnoResultsPartialP]
      }
    }
  }
  type MessageSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings.Param
  
  object MetadataSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'defaultText'
        */
      var defaultText: String
      
      /**
        * @default 'defaultValue'
        */
      var defaultValue: String
      
      /**
        * @default 'placeholderText'
        */
      var placeholderText: String
      
      /**
        * @default 'text'
        */
      var text: String
      
      /**
        * @default 'value'
        */
      var value: String
    }
    object Impl {
      
      inline def apply(defaultText: String, defaultValue: String, placeholderText: String, text: String, value: String): Impl = {
        val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], placeholderText = placeholderText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
        
        inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImpldefaultTextPartia
      - typings.semanticUiDropdown.anon.PickImpldefaultValueParti
      - typings.semanticUiDropdown.anon.PickImplplaceholderTextPa
      - typings.semanticUiDropdown.anon.PickImpltextPartialPickImDefaultText
      - typings.semanticUiDropdown.anon.PickImplvaluePartialPickIDefaultText
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpldefaultTextPartia(defaultText: String): typings.semanticUiDropdown.anon.PickImpldefaultTextPartia = {
        val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldefaultTextPartia]
      }
      
      inline def PickImpldefaultValueParti(defaultValue: String): typings.semanticUiDropdown.anon.PickImpldefaultValueParti = {
        val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldefaultValueParti]
      }
      
      inline def PickImplplaceholderTextPa(placeholderText: String): typings.semanticUiDropdown.anon.PickImplplaceholderTextPa = {
        val __obj = js.Dynamic.literal(placeholderText = placeholderText.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplplaceholderTextPa]
      }
      
      inline def PickImpltextPartialPickImDefaultText(text: String): typings.semanticUiDropdown.anon.PickImpltextPartialPickImDefaultText = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpltextPartialPickImDefaultText]
      }
      
      inline def PickImplvaluePartialPickIDefaultText(value: String): typings.semanticUiDropdown.anon.PickImplvaluePartialPickIDefaultText = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvaluePartialPickIDefaultText]
      }
    }
  }
  type MetadataSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings.Param
  
  /* Inlined semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings.Param */
  trait RegExpSettings extends StObject {
    
    var escape: js.RegExp
  }
  object RegExpSettings {
    
    inline def apply(escape: js.RegExp): RegExpSettings = {
      val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpSettings]
    }
    
    trait Impl extends StObject {
      
      /**
        * @default /[-[\]{}()*+?.,\\^$|#\s]/g
        */
      var escape: js.RegExp
    }
    object Impl {
      
      inline def apply(escape: js.RegExp): Impl = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegExpSettings] (val x: Self) extends AnyVal {
      
      inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    }
    
    /* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, 'escape'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl>> */
    trait Param extends StObject {
      
      var escape: js.RegExp
    }
    object Param {
      
      inline def apply(escape: js.RegExp): typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param] (val x: Self) extends AnyVal {
        
        inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '.addition'
        */
      var addition: String
      
      /**
        * @default '.ui.dropdown'
        */
      var dropdown: String
      
      /**
        * @default '> .dropdown.icon'
        */
      var icon: String
      
      /**
        * @default '> input[type="hidden"], > select'
        */
      var input: String
      
      /**
        * @default '.item'
        */
      var item: String
      
      /**
        * @default '> .label'
        */
      var label: String
      
      /**
        * @default '.menu'
        */
      var menu: String
      
      /**
        * @default '.dropdown.icon'
        */
      var menuIcon: String
      
      /**
        * @default '.message'
        */
      var message: String
      
      /**
        * @default '> .label > .delete.icon'
        */
      var remove: String
      
      /**
        * @default 'input.search, .menu > .search > input'
        */
      var search: String
      
      /**
        * @default '.label'
        */
      var siblingLabel: String
      
      /**
        * @default '> .text:not(.icon)'
        */
      var text: String
    }
    object Impl {
      
      inline def apply(
        addition: String,
        dropdown: String,
        icon: String,
        input: String,
        item: String,
        label: String,
        menu: String,
        menuIcon: String,
        message: String,
        remove: String,
        search: String,
        siblingLabel: String,
        text: String
      ): Impl = {
        val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], siblingLabel = siblingLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
        
        inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSiblingLabel(value: String): Self = StObject.set(x, "siblingLabel", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiDropdown.anon.PickImpladditionPartialPi
      - typings.semanticUiDropdown.anon.PickImpldropdownPartialPi
      - typings.semanticUiDropdown.anon.PickImpliconPartialPickIm
      - typings.semanticUiDropdown.anon.PickImplinputPartialPickI
      - typings.semanticUiDropdown.anon.PickImplitemPartialPickIm
      - typings.semanticUiDropdown.anon.PickImpllabelPartialPickIAddition
      - typings.semanticUiDropdown.anon.PickImplremovePartialPick
      - typings.semanticUiDropdown.anon.PickImplsiblingLabelParti
      - typings.semanticUiDropdown.anon.PickImplmenuPartialPickIm
      - typings.semanticUiDropdown.anon.PickImplmessagePartialPicAddition
      - typings.semanticUiDropdown.anon.PickImplmenuIconPartialPi
      - typings.semanticUiDropdown.anon.PickImplsearchPartialPickAddition
      - typings.semanticUiDropdown.anon.PickImpltextPartialPickIm
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpladditionPartialPi(addition: String): typings.semanticUiDropdown.anon.PickImpladditionPartialPi = {
        val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpladditionPartialPi]
      }
      
      inline def PickImpldropdownPartialPi(dropdown: String): typings.semanticUiDropdown.anon.PickImpldropdownPartialPi = {
        val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldropdownPartialPi]
      }
      
      inline def PickImpliconPartialPickIm(icon: String): typings.semanticUiDropdown.anon.PickImpliconPartialPickIm = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpliconPartialPickIm]
      }
      
      inline def PickImplinputPartialPickI(input: String): typings.semanticUiDropdown.anon.PickImplinputPartialPickI = {
        val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplinputPartialPickI]
      }
      
      inline def PickImplitemPartialPickIm(item: String): typings.semanticUiDropdown.anon.PickImplitemPartialPickIm = {
        val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplitemPartialPickIm]
      }
      
      inline def PickImpllabelPartialPickIAddition(label: String): typings.semanticUiDropdown.anon.PickImpllabelPartialPickIAddition = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpllabelPartialPickIAddition]
      }
      
      inline def PickImplmenuIconPartialPi(menuIcon: String): typings.semanticUiDropdown.anon.PickImplmenuIconPartialPi = {
        val __obj = js.Dynamic.literal(menuIcon = menuIcon.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmenuIconPartialPi]
      }
      
      inline def PickImplmenuPartialPickIm(menu: String): typings.semanticUiDropdown.anon.PickImplmenuPartialPickIm = {
        val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmenuPartialPickIm]
      }
      
      inline def PickImplmessagePartialPicAddition(message: String): typings.semanticUiDropdown.anon.PickImplmessagePartialPicAddition = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmessagePartialPicAddition]
      }
      
      inline def PickImplremovePartialPick(remove: String): typings.semanticUiDropdown.anon.PickImplremovePartialPick = {
        val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplremovePartialPick]
      }
      
      inline def PickImplsearchPartialPickAddition(search: String): typings.semanticUiDropdown.anon.PickImplsearchPartialPickAddition = {
        val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsearchPartialPickAddition]
      }
      
      inline def PickImplsiblingLabelParti(siblingLabel: String): typings.semanticUiDropdown.anon.PickImplsiblingLabelParti = {
        val __obj = js.Dynamic.literal(siblingLabel = siblingLabel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsiblingLabelParti]
      }
      
      inline def PickImpltextPartialPickIm(text: String): typings.semanticUiDropdown.anon.PickImpltextPartialPickIm = {
        val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpltextPartialPickIm]
      }
    }
  }
  type SelectorSettings = typings.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings.Param
}
