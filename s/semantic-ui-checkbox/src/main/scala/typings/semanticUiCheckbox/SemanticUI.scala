package typings.semanticUiCheckbox

import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typings.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`attach events`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`can change`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`can uncheck`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is checked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is radio`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`is unchecked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set checked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set determinate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set disabled`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set enabled`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set indeterminate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`set unchecked`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow check`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow determinate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow indeterminate`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow uncheck`
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typings.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Checkbox extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Attach checkbox events to another element
      */
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Returns whether element is able to be changed
      */
    def apply(behavior: `can change`): Boolean = js.native
    /**
      * Returns whether element is able to be unchecked
      */
    def apply(behavior: `can uncheck`): Boolean = js.native
    /**
      * Returns whether element is currently checked
      */
    def apply(behavior: `is checked`): Boolean = js.native
    /**
      * Returns whether element is radio selection
      */
    def apply(behavior: `is radio`): Boolean = js.native
    /**
      * Returns whether element is not checked
      */
    def apply(behavior: `is unchecked`): Boolean = js.native
    /**
      * Set a checkbox state to checked without callbacks
      */
    def apply(behavior: `set checked`): JQuery = js.native
    /**
      * Set as determinate checkbox without callbacks
      */
    def apply(behavior: `set determinate`): JQuery = js.native
    /**
      * Disable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set disabled`): JQuery = js.native
    /**
      * Enable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set enabled`): JQuery = js.native
    /**
      * Set as indeterminate checkbox without callbacks
      */
    def apply(behavior: `set indeterminate`): JQuery = js.native
    /**
      * Set a checkbox state to unchecked without callbacks
      */
    def apply(behavior: `set unchecked`): JQuery = js.native
    /**
      * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
      */
    def apply(behavior: `should allow check`): Boolean = js.native
    /**
      * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
      */
    def apply(behavior: `should allow determinate`): Boolean = js.native
    /**
      * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
      */
    def apply(behavior: `should allow indeterminate`): Boolean = js.native
    /**
      * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
      */
    def apply(behavior: `should allow uncheck`): Boolean = js.native
    /**
      * Set a checkbox state to checked
      */
    def apply(behavior: check): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Set as determinate checkbox
      */
    def apply(behavior: determinate): JQuery = js.native
    /**
      * Enable interaction with a checkbox
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Set as indeterminate checkbox
      */
    def apply(behavior: indeterminate): JQuery = js.native
    def apply(behavior: setting, value: CheckboxSettings): JQuery = js.native
    /**
      * Switches a checkbox from current state
      */
    def apply(behavior: toggle): JQuery = js.native
    /**
      * Set a checkbox state to unchecked
      */
    def apply(behavior: uncheck): JQuery = js.native
    def apply(settings: CheckboxSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any = js.native
    
    var settings: CheckboxSettings = js.native
  }
  object Checkbox {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'checked'
          */
        var checked: String
        
        /**
          * @default 'disabled'
          */
        var disabled: String
        
        /**
          * @default 'radio'
          */
        var radio: String
        
        /**
          * @default 'read-only'
          */
        var readOnly: String
      }
      object Impl {
        
        inline def apply(checked: String, disabled: String, radio: String, readOnly: String): Impl = {
          val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
          
          inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiCheckbox.anon.PickImplcheckedPartialPic
        - typings.semanticUiCheckbox.anon.PickImpldisabledPartialPi
        - typings.semanticUiCheckbox.anon.PickImplradioPartialPickI
        - typings.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplcheckedPartialPic(checked: String): typings.semanticUiCheckbox.anon.PickImplcheckedPartialPic = {
          val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplcheckedPartialPic]
        }
        
        inline def PickImpldisabledPartialPi(disabled: String): typings.semanticUiCheckbox.anon.PickImpldisabledPartialPi = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImpldisabledPartialPi]
        }
        
        inline def PickImplradioPartialPickI(radio: String): typings.semanticUiCheckbox.anon.PickImplradioPartialPickI = {
          val __obj = js.Dynamic.literal(radio = radio.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplradioPartialPickI]
        }
        
        inline def PickImplreadOnlyPartialPi(readOnly: String): typings.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi = {
          val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi]
        }
      }
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings.Param */
    trait ErrorSettings extends StObject {
      
      var method: String
    }
    object ErrorSettings {
      
      inline def apply(method: String): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String
      }
      object Impl {
        
        inline def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ErrorSettings] (val x: Self) extends AnyVal {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      /* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var method: String
      }
      object Param {
        
        inline def apply(method: String): typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param] (val x: Self) extends AnyVal {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'input[type=checkbox], input[type=radio]'
          */
        var input: String
        
        /**
          * @default 'label'
          */
        var label: String
      }
      object Impl {
        
        inline def apply(input: String, label: String): Impl = {
          val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.semanticUiCheckbox.anon.PickImplinputPartialPickI
        - typings.semanticUiCheckbox.anon.PickImpllabelPartialPickI
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplinputPartialPickI(input: String): typings.semanticUiCheckbox.anon.PickImplinputPartialPickI = {
          val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplinputPartialPickI]
        }
        
        inline def PickImpllabelPartialPickI(label: String): typings.semanticUiCheckbox.anon.PickImpllabelPartialPickI = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImpllabelPartialPickI]
        }
      }
    }
    type SelectorSettings = typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings.Param
  }
  
  object CheckboxSettings {
    
    trait Impl extends StObject {
      
      /**
        * Callback before a checkbox is checked. Can cancel change by returning false
        */
      def beforeChecked(): Unit | `false`
      
      /**
        * Callback before a checkbox is set to determinate. Can cancel change by returning false
        */
      def beforeDeterminate(): Unit | `false`
      
      /**
        * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
        */
      def beforeIndeterminate(): Unit | `false`
      
      /**
        * Callback before a checkbox is unchecked. Can cancel change by returning false
        */
      def beforeUnchecked(): Unit | `false`
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether callbacks for checked status should be fired on init as well as change
        *
        * @default false
        */
      var fireOnInit: Boolean
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      // endregion
      // region Callbacks
      /**
        * Callback after a checkbox is either checked or unchecked.
        */
      def onChange(): Unit
      
      /**
        * Callback after a checkbox is checked.
        */
      def onChecked(): Unit
      
      /**
        * Callback after a checkbox is set to determinate.
        */
      def onDeterminate(): Unit
      
      /**
        * Callback after a checkbox is disabled.
        */
      def onDisable(): Unit
      
      /**
        * Callback after a checkbox is disabled.
        *
        * @deprecated
        */
      def onDisabled(): Unit
      
      /**
        * Callback after a checkbox is enabled.
        */
      def onEnable(): Unit
      
      /**
        * Callback after a checkbox is enabled.
        *
        * @deprecated
        */
      def onEnabled(): Unit
      
      /**
        * Callback after a checkbox is set to undeterminate.
        */
      def onIndeterminate(): Unit
      
      /**
        * Callback after a checkbox is unchecked.
        */
      def onUnchecked(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      // region Behavior
      /**
        * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
        *
        * @default 'auto'
        */
      var uncheckable: auto | Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        beforeChecked: () => Unit | `false`,
        beforeDeterminate: () => Unit | `false`,
        beforeIndeterminate: () => Unit | `false`,
        beforeUnchecked: () => Unit | `false`,
        className: ClassNameSettings,
        debug: Boolean,
        error: ErrorSettings,
        fireOnInit: Boolean,
        name: String,
        namespace: String,
        onChange: () => Unit,
        onChecked: () => Unit,
        onDeterminate: () => Unit,
        onDisable: () => Unit,
        onDisabled: () => Unit,
        onEnable: () => Unit,
        onEnabled: () => Unit,
        onIndeterminate: () => Unit,
        onUnchecked: () => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        uncheckable: auto | Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChecked = js.Any.fromFunction0(beforeChecked), beforeDeterminate = js.Any.fromFunction0(beforeDeterminate), beforeIndeterminate = js.Any.fromFunction0(beforeIndeterminate), beforeUnchecked = js.Any.fromFunction0(beforeUnchecked), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onChecked = js.Any.fromFunction0(onChecked), onDeterminate = js.Any.fromFunction0(onDeterminate), onDisable = js.Any.fromFunction0(onDisable), onDisabled = js.Any.fromFunction0(onDisabled), onEnable = js.Any.fromFunction0(onEnable), onEnabled = js.Any.fromFunction0(onEnabled), onIndeterminate = js.Any.fromFunction0(onIndeterminate), onUnchecked = js.Any.fromFunction0(onUnchecked), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        inline def setBeforeChecked(value: () => Unit | `false`): Self = StObject.set(x, "beforeChecked", js.Any.fromFunction0(value))
        
        inline def setBeforeDeterminate(value: () => Unit | `false`): Self = StObject.set(x, "beforeDeterminate", js.Any.fromFunction0(value))
        
        inline def setBeforeIndeterminate(value: () => Unit | `false`): Self = StObject.set(x, "beforeIndeterminate", js.Any.fromFunction0(value))
        
        inline def setBeforeUnchecked(value: () => Unit | `false`): Self = StObject.set(x, "beforeUnchecked", js.Any.fromFunction0(value))
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        inline def setOnChecked(value: () => Unit): Self = StObject.set(x, "onChecked", js.Any.fromFunction0(value))
        
        inline def setOnDeterminate(value: () => Unit): Self = StObject.set(x, "onDeterminate", js.Any.fromFunction0(value))
        
        inline def setOnDisable(value: () => Unit): Self = StObject.set(x, "onDisable", js.Any.fromFunction0(value))
        
        inline def setOnDisabled(value: () => Unit): Self = StObject.set(x, "onDisabled", js.Any.fromFunction0(value))
        
        inline def setOnEnable(value: () => Unit): Self = StObject.set(x, "onEnable", js.Any.fromFunction0(value))
        
        inline def setOnEnabled(value: () => Unit): Self = StObject.set(x, "onEnabled", js.Any.fromFunction0(value))
        
        inline def setOnIndeterminate(value: () => Unit): Self = StObject.set(x, "onIndeterminate", js.Any.fromFunction0(value))
        
        inline def setOnUnchecked(value: () => Unit): Self = StObject.set(x, "onUnchecked", js.Any.fromFunction0(value))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setUncheckable(value: auto | Boolean): Self = StObject.set(x, "uncheckable", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.semanticUiCheckbox.anon.PickImpluncheckablePartia
      - typings.semanticUiCheckbox.anon.PickImplfireOnInitPartial
      - typings.semanticUiCheckbox.anon.PickImplonChangePartialPi
      - typings.semanticUiCheckbox.anon.PickImplonCheckedPartialP
      - typings.semanticUiCheckbox.anon.PickImplonIndeterminatePa
      - typings.semanticUiCheckbox.anon.PickImplonDeterminatePart
      - typings.semanticUiCheckbox.anon.PickImplonUncheckedPartia
      - typings.semanticUiCheckbox.anon.PickImplbeforeCheckedPart
      - typings.semanticUiCheckbox.anon.PickImplbeforeIndetermina
      - typings.semanticUiCheckbox.anon.PickImplbeforeDeterminate
      - typings.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa
      - typings.semanticUiCheckbox.anon.PickImplonEnablePartialPi
      - typings.semanticUiCheckbox.anon.PickImplonDisablePartialP
      - typings.semanticUiCheckbox.anon.PickImplonEnabledPartialP
      - typings.semanticUiCheckbox.anon.PickImplonDisabledPartial
      - typings.semanticUiCheckbox.anon.PickImplselectorPartialPi
      - typings.semanticUiCheckbox.anon.PickImplclassNamePartialP
      - typings.semanticUiCheckbox.anon.PickImplerrorPartialPickI
      - typings.semanticUiCheckbox.anon.PickImplnamespacePartialP
      - typings.semanticUiCheckbox.anon.PickImplnamePartialPickIm
      - typings.semanticUiCheckbox.anon.PickImplsilentPartialPick
      - typings.semanticUiCheckbox.anon.PickImpldebugPartialPickI
      - typings.semanticUiCheckbox.anon.PickImplperformancePartia
      - typings.semanticUiCheckbox.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbeforeCheckedPart(beforeChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): typings.semanticUiCheckbox.anon.PickImplbeforeCheckedPart = {
        val __obj = js.Dynamic.literal(beforeChecked = beforeChecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplbeforeCheckedPart]
      }
      
      inline def PickImplbeforeDeterminate(beforeDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): typings.semanticUiCheckbox.anon.PickImplbeforeDeterminate = {
        val __obj = js.Dynamic.literal(beforeDeterminate = beforeDeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplbeforeDeterminate]
      }
      
      inline def PickImplbeforeIndetermina(beforeIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): typings.semanticUiCheckbox.anon.PickImplbeforeIndetermina = {
        val __obj = js.Dynamic.literal(beforeIndeterminate = beforeIndeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplbeforeIndetermina]
      }
      
      inline def PickImplbeforeUncheckedPa(beforeUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]): typings.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa = {
        val __obj = js.Dynamic.literal(beforeUnchecked = beforeUnchecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings): typings.semanticUiCheckbox.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean): typings.semanticUiCheckbox.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings): typings.semanticUiCheckbox.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplfireOnInitPartial(fireOnInit: Boolean): typings.semanticUiCheckbox.anon.PickImplfireOnInitPartial = {
        val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplfireOnInitPartial]
      }
      
      inline def PickImplnamePartialPickIm(name: String): typings.semanticUiCheckbox.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String): typings.semanticUiCheckbox.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonChangePartialPi(onChange: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonChangePartialPi = {
        val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonChangePartialPi]
      }
      
      inline def PickImplonCheckedPartialP(onChecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonCheckedPartialP = {
        val __obj = js.Dynamic.literal(onChecked = onChecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonCheckedPartialP]
      }
      
      inline def PickImplonDeterminatePart(onDeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonDeterminatePart = {
        val __obj = js.Dynamic.literal(onDeterminate = onDeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonDeterminatePart]
      }
      
      inline def PickImplonDisablePartialP(onDisable: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonDisablePartialP = {
        val __obj = js.Dynamic.literal(onDisable = onDisable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonDisablePartialP]
      }
      
      inline def PickImplonDisabledPartial(onDisabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonDisabledPartial = {
        val __obj = js.Dynamic.literal(onDisabled = onDisabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonDisabledPartial]
      }
      
      inline def PickImplonEnablePartialPi(onEnable: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonEnablePartialPi = {
        val __obj = js.Dynamic.literal(onEnable = onEnable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonEnablePartialPi]
      }
      
      inline def PickImplonEnabledPartialP(onEnabled: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonEnabledPartialP = {
        val __obj = js.Dynamic.literal(onEnabled = onEnabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonEnabledPartialP]
      }
      
      inline def PickImplonIndeterminatePa(onIndeterminate: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonIndeterminatePa = {
        val __obj = js.Dynamic.literal(onIndeterminate = onIndeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonIndeterminatePa]
      }
      
      inline def PickImplonUncheckedPartia(onUnchecked: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): typings.semanticUiCheckbox.anon.PickImplonUncheckedPartia = {
        val __obj = js.Dynamic.literal(onUnchecked = onUnchecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplonUncheckedPartia]
      }
      
      inline def PickImplperformancePartia(performance: Boolean): typings.semanticUiCheckbox.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings): typings.semanticUiCheckbox.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean): typings.semanticUiCheckbox.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImpluncheckablePartia(uncheckable: auto | Boolean): typings.semanticUiCheckbox.anon.PickImpluncheckablePartia = {
        val __obj = js.Dynamic.literal(uncheckable = uncheckable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImpluncheckablePartia]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean): typings.semanticUiCheckbox.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.semanticUiCheckbox.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/checkbox.html#/settings}
    */
  type CheckboxSettings = typings.semanticUiCheckbox.SemanticUI.CheckboxSettings.Param
}
