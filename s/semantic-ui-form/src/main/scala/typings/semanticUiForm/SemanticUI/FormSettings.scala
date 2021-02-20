package typings.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typings.semanticUiForm.SemanticUI.Form.ErrorSettings
import typings.semanticUiForm.SemanticUI.Form.Field
import typings.semanticUiForm.SemanticUI.Form.MetadataSettings
import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import typings.semanticUiForm.SemanticUI.Form.SelectorSettings
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typings.semanticUiForm.SemanticUI.Form.TextSettings
import typings.semanticUiForm.anon.PartialPickImplkeyofImpl
import typings.semanticUiForm.anon.PickImplclassName
import typings.semanticUiForm.anon.PickImpldebug
import typings.semanticUiForm.anon.PickImpldelay
import typings.semanticUiForm.anon.PickImplduration
import typings.semanticUiForm.anon.PickImplerror
import typings.semanticUiForm.anon.PickImplfields
import typings.semanticUiForm.anon.PickImplinline
import typings.semanticUiForm.anon.PickImplkeyboardShortcuts
import typings.semanticUiForm.anon.PickImplmetadata
import typings.semanticUiForm.anon.PickImplname
import typings.semanticUiForm.anon.PickImplnamespace
import typings.semanticUiForm.anon.PickImplon
import typings.semanticUiForm.anon.PickImplonFailure
import typings.semanticUiForm.anon.PickImplonInvalid
import typings.semanticUiForm.anon.PickImplonSuccess
import typings.semanticUiForm.anon.PickImplonValid
import typings.semanticUiForm.anon.PickImplperformance
import typings.semanticUiForm.anon.PickImplprompt
import typings.semanticUiForm.anon.PickImplrevalidate
import typings.semanticUiForm.anon.PickImplrules
import typings.semanticUiForm.anon.PickImplselector
import typings.semanticUiForm.anon.PickImplsilent
import typings.semanticUiForm.anon.PickImpltemplates
import typings.semanticUiForm.anon.PickImpltext
import typings.semanticUiForm.anon.PickImpltransition
import typings.semanticUiForm.anon.PickImplverbose
import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.submit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSettings {
  
  @js.native
  trait Impl extends StObject {
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings = js.native
    
    /**
      * Debug output to console
      */
    var debug: Boolean = js.native
    
    var defaults: StringDictionary[Field] = js.native
    
    /**
      * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
      *
      * @default true
      */
    var delay: Boolean = js.native
    
    /**
      * Animation speed for inline prompt
      *
      * @default 150
      */
    var duration: Double = js.native
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings = js.native
    
    var fields: StringDictionary[String | js.Array[String] | Field] = js.native
    
    /**
      * Adds inline error on field validation error
      *
      * @default false
      */
    var `inline`: Boolean = js.native
    
    // region Form Settings
    /**
      * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
      *
      * @default true
      */
    var keyboardShortcuts: Boolean = js.native
    
    /**
      * HTML5 metadata attributes
      */
    var metadata: MetadataSettings = js.native
    
    // endregion
    // region Debug Settings
    /**
      * Name used in log statements
      */
    var name: String = js.native
    
    // endregion
    // region Component Settings
    // region DOM Settings
    /**
      * Event namespace. Makes sure module teardown does not effect other events attached to an element.
      */
    var namespace: String = js.native
    
    /**
      * Event used to trigger validation. Can be either submit, blur or change.
      *
      * @default 'submit'
      */
    var on: submit | blur | change = js.native
    
    /**
      * Callback if any form field is invalid
      */
    def onFailure(formErrors: js.Array[String], fields: js.Any): Unit = js.native
    
    /**
      * Callback on each invalid field
      */
    def onInvalid(): Unit = js.native
    
    /**
      * Callback if a form is all valid
      */
    def onSuccess(event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit = js.native
    
    // endregion
    // region Callbacks
    /**
      * Callback on each valid field
      */
    def onValid(): Unit = js.native
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean = js.native
    
    var prompt: PromptSettings = js.native
    
    /**
      * If set to true will revalidate fields with errors on input change
      *
      * @default true
      */
    var revalidate: Boolean = js.native
    
    // endregion
    // region Rules
    var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
    
    // endregion
    // region DOM Settings
    /**
      * Selectors used to match functionality to DOM
      */
    var selector: SelectorSettings = js.native
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean = js.native
    
    // endregion
    // region Templates
    var templates: TemplatesSettings = js.native
    
    // endregion
    // region Form Prompts
    var text: TextSettings = js.native
    
    /**
      * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
      *
      * @default 'scale'
      * @see {@link http://semantic-ui.com/modules/transition.html}
      */
    var transition: String = js.native
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean = js.native
  }
  object Impl {
    
    @scala.inline
    def apply(
      className: ClassNameSettings,
      debug: Boolean,
      defaults: StringDictionary[Field],
      delay: Boolean,
      duration: Double,
      error: ErrorSettings,
      fields: StringDictionary[String | js.Array[String] | Field],
      `inline`: Boolean,
      keyboardShortcuts: Boolean,
      metadata: MetadataSettings,
      name: String,
      namespace: String,
      on: submit | blur | change,
      onFailure: (js.Array[String], js.Any) => Unit,
      onInvalid: () => Unit,
      onSuccess: (TriggeredEvent[HTMLElement, _, _, _], js.Any) => Unit,
      onValid: () => Unit,
      performance: Boolean,
      prompt: PromptSettings,
      revalidate: Boolean,
      rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]],
      selector: SelectorSettings,
      silent: Boolean,
      templates: TemplatesSettings,
      text: TextSettings,
      transition: String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onFailure = js.Any.fromFunction2(onFailure), onInvalid = js.Any.fromFunction0(onInvalid), onSuccess = js.Any.fromFunction2(onSuccess), onValid = js.Any.fromFunction0(onValid), performance = performance.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    @scala.inline
    implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults(value: StringDictionary[Field]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: submit | blur | change): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFailure(value: (js.Array[String], js.Any) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInvalid(value: () => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuccess(value: (TriggeredEvent[HTMLElement, _, _, _], js.Any) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnValid(value: () => Unit): Self = StObject.set(x, "onValid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: PromptSettings): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  type Param = (PickImplkeyboardShortcuts | PickImplon | PickImplrevalidate | PickImpldelay | PickImplinline | PickImpltransition | PickImplduration | PickImplfields | PickImpltext | PickImplprompt | PickImplonValid | PickImplonInvalid | PickImplonSuccess | PickImplonFailure | PickImpltemplates | PickImplrules | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
}
