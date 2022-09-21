package typings.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import typings.semanticUiForm.JQuery
import typings.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typings.semanticUiForm.SemanticUI.Form.ErrorSettings
import typings.semanticUiForm.SemanticUI.Form.Field
import typings.semanticUiForm.SemanticUI.Form.MetadataSettings
import typings.semanticUiForm.SemanticUI.Form.PromptSettings
import typings.semanticUiForm.SemanticUI.Form.SelectorSettings
import typings.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typings.semanticUiForm.SemanticUI.Form.TextSettings
import typings.semanticUiForm.semanticUiFormStrings.blur
import typings.semanticUiForm.semanticUiFormStrings.change
import typings.semanticUiForm.semanticUiFormStrings.submit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSettings {
  
  trait Impl extends StObject {
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    var defaults: StringDictionary[Field]
    
    /**
      * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
      *
      * @default true
      */
    var delay: Boolean
    
    /**
      * Animation speed for inline prompt
      *
      * @default 150
      */
    var duration: Double
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    var fields: StringDictionary[String | js.Array[String] | Field]
    
    /**
      * Adds inline error on field validation error
      *
      * @default false
      */
    var `inline`: Boolean
    
    // region Form Settings
    /**
      * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
      *
      * @default true
      */
    var keyboardShortcuts: Boolean
    
    /**
      * HTML5 metadata attributes
      */
    var metadata: MetadataSettings
    
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
    
    /**
      * Event used to trigger validation. Can be either submit, blur or change.
      *
      * @default 'submit'
      */
    var on: submit | blur | change
    
    /**
      * Callback if any form field is invalid
      */
    def onFailure(formErrors: js.Array[String], fields: Any): Unit
    
    /**
      * Callback on each invalid field
      */
    def onInvalid(): Unit
    
    /**
      * Callback if a form is all valid
      */
    def onSuccess(event: TriggeredEvent[HTMLElement, Any, Any, Any], fields: Any): Unit
    
    // endregion
    // region Callbacks
    /**
      * Callback on each valid field
      */
    def onValid(): Unit
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    var prompt: PromptSettings
    
    /**
      * If set to true will revalidate fields with errors on input change
      *
      * @default true
      */
    var revalidate: Boolean
    
    // endregion
    // region Rules
    var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]
    
    // endregion
    // region DOM Settings
    /**
      * Selectors used to match functionality to DOM
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region Templates
    var templates: TemplatesSettings
    
    // endregion
    // region Form Prompts
    var text: TextSettings
    
    /**
      * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
      *
      * @default 'scale'
      * @see {@link http://semantic-ui.com/modules/transition.html}
      */
    var transition: String
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
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
      onFailure: (js.Array[String], Any) => Unit,
      onInvalid: () => Unit,
      onSuccess: (TriggeredEvent[HTMLElement, Any, Any, Any], Any) => Unit,
      onValid: () => Unit,
      performance: Boolean,
      prompt: PromptSettings,
      revalidate: Boolean,
      rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]],
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
    
    extension [Self <: Impl](x: Self) {
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: StringDictionary[Field]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOn(value: submit | blur | change): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnFailure(value: (js.Array[String], Any) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
      
      inline def setOnInvalid(value: () => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction0(value))
      
      inline def setOnSuccess(value: (TriggeredEvent[HTMLElement, Any, Any, Any], Any) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      inline def setOnValid(value: () => Unit): Self = StObject.set(x, "onValid", js.Any.fromFunction0(value))
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptSettings): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiForm.anon.PickImplkeyboardShortcuts
    - typings.semanticUiForm.anon.PickImplonPartialPickImpl
    - typings.semanticUiForm.anon.PickImplrevalidatePartial
    - typings.semanticUiForm.anon.PickImpldelayPartialPickI
    - typings.semanticUiForm.anon.PickImplinlinePartialPick
    - typings.semanticUiForm.anon.PickImpltransitionPartial
    - typings.semanticUiForm.anon.PickImpldurationPartialPi
    - typings.semanticUiForm.anon.PickImplfieldsPartialPick
    - typings.semanticUiForm.anon.PickImpltextPartialPickIm
    - typings.semanticUiForm.anon.PickImplpromptPartialPick
    - typings.semanticUiForm.anon.PickImplonValidPartialPic
    - typings.semanticUiForm.anon.PickImplonInvalidPartialP
    - typings.semanticUiForm.anon.PickImplonSuccessPartialP
    - typings.semanticUiForm.anon.PickImplonFailurePartialP
    - typings.semanticUiForm.anon.PickImpltemplatesPartialP
    - typings.semanticUiForm.anon.PickImplrulesPartialPickI
    - typings.semanticUiForm.anon.PickImplselectorPartialPi
    - typings.semanticUiForm.anon.PickImplmetadataPartialPi
    - typings.semanticUiForm.anon.PickImplclassNamePartialP
    - typings.semanticUiForm.anon.PickImplerrorPartialPickI
    - typings.semanticUiForm.anon.PickImplnamespacePartialP
    - typings.semanticUiForm.anon.PickImplnamePartialPickIm
    - typings.semanticUiForm.anon.PickImplsilentPartialPick
    - typings.semanticUiForm.anon.PickImpldebugPartialPickI
    - typings.semanticUiForm.anon.PickImplperformancePartia
    - typings.semanticUiForm.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typings.semanticUiForm.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldelayPartialPickI(delay: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImpldelayPartialPickI = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpldelayPartialPickI]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typings.semanticUiForm.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typings.semanticUiForm.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplfieldsPartialPick(
      fields: (StringDictionary[String | js.Array[String] | Field]) & (js.UndefOr[StringDictionary[String | js.Array[String] | Field]])
    ): typings.semanticUiForm.anon.PickImplfieldsPartialPick = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplfieldsPartialPick]
    }
    
    inline def PickImplinlinePartialPick(`inline`: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplinlinePartialPick = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplinlinePartialPick]
    }
    
    inline def PickImplkeyboardShortcuts(keyboardShortcuts: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplkeyboardShortcuts = {
      val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplkeyboardShortcuts]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typings.semanticUiForm.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typings.semanticUiForm.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typings.semanticUiForm.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonFailurePartialP(
      onFailure: (js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ Any, Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ Any, Unit]
        ])
    ): typings.semanticUiForm.anon.PickImplonFailurePartialP = {
      val __obj = js.Dynamic.literal(onFailure = onFailure.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplonFailurePartialP]
    }
    
    inline def PickImplonInvalidPartialP(
      onInvalid: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typings.semanticUiForm.anon.PickImplonInvalidPartialP = {
      val __obj = js.Dynamic.literal(onInvalid = onInvalid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplonInvalidPartialP]
    }
    
    inline def PickImplonPartialPickImpl(on: (submit | blur | change) & (js.UndefOr[submit | blur | change])): typings.semanticUiForm.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonSuccessPartialP(
      onSuccess: (js.ThisFunction2[
          /* this */ JQuery, 
          /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
          /* fields */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ JQuery, 
            /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
            /* fields */ Any, 
            Unit
          ]
        ])
    ): typings.semanticUiForm.anon.PickImplonSuccessPartialP = {
      val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplonSuccessPartialP]
    }
    
    inline def PickImplonValidPartialPic(
      onValid: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typings.semanticUiForm.anon.PickImplonValidPartialPic = {
      val __obj = js.Dynamic.literal(onValid = onValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplonValidPartialPic]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplperformancePartia]
    }
    
    inline def PickImplpromptPartialPick(prompt: PromptSettings & js.UndefOr[PromptSettings]): typings.semanticUiForm.anon.PickImplpromptPartialPick = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplpromptPartialPick]
    }
    
    inline def PickImplrevalidatePartial(revalidate: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplrevalidatePartial = {
      val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplrevalidatePartial]
    }
    
    inline def PickImplrulesPartialPickI(
      rules: (StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]) & (js.UndefOr[
          StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]
        ])
    ): typings.semanticUiForm.anon.PickImplrulesPartialPickI = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplrulesPartialPickI]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typings.semanticUiForm.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typings.semanticUiForm.anon.PickImpltemplatesPartialP = {
      val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpltemplatesPartialP]
    }
    
    inline def PickImpltextPartialPickIm(text: TextSettings & js.UndefOr[TextSettings]): typings.semanticUiForm.anon.PickImpltextPartialPickIm = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpltextPartialPickIm]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typings.semanticUiForm.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImpltransitionPartial]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typings.semanticUiForm.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiForm.anon.PickImplverbosePartialPic]
    }
  }
}
