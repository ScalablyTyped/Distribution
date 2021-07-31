package typings.promptSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * create -- sync function for reading user input from stdin
    * @param   {Object} config {
    *   sigint: {Boolean} exit on ^C
    *   autocomplete: {StringArray} function({String})
    *   history: {String} a history control object (see `prompt-sync-history`)
    * }
    * @returns {Function} prompt function
    */
  @scala.inline
  def apply(): Prompt = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Prompt]
  @scala.inline
  def apply(config: Config): Prompt = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Prompt]
  
  @JSImport("prompt-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AutoCompleteFunction = js.Function1[/* input */ String, js.Array[String]]
  
  trait Config extends StObject {
    
    var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
    
    var sigint: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: /* input */ String => js.Array[String]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setSigint(value: Boolean): Self = StObject.set(x, "sigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigintUndefined: Self = StObject.set(x, "sigint", js.undefined)
    }
  }
  
  trait History extends StObject {
    
    def atEnd(): Boolean
    
    def atPenultimate(): Boolean
    
    def atStart(): Boolean
    
    def next(): String
    
    def pastEnd(): Boolean
    
    def prev(): String
    
    def push(str: String): Unit
    
    def reset(): Unit
    
    def save(): Unit
  }
  object History {
    
    @scala.inline
    def apply(
      atEnd: () => Boolean,
      atPenultimate: () => Boolean,
      atStart: () => Boolean,
      next: () => String,
      pastEnd: () => Boolean,
      prev: () => String,
      push: String => Unit,
      reset: () => Unit,
      save: () => Unit
    ): History = {
      val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), atPenultimate = js.Any.fromFunction0(atPenultimate), atStart = js.Any.fromFunction0(atStart), next = js.Any.fromFunction0(next), pastEnd = js.Any.fromFunction0(pastEnd), prev = js.Any.fromFunction0(prev), push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), save = js.Any.fromFunction0(save))
      __obj.asInstanceOf[History]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtEnd(value: () => Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAtPenultimate(value: () => Boolean): Self = StObject.set(x, "atPenultimate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAtStart(value: () => Boolean): Self = StObject.set(x, "atStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => String): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPastEnd(value: () => Boolean): Self = StObject.set(x, "pastEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrev(value: () => String): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: String => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    }
  }
  
  trait Option extends StObject {
    
    var ask: js.UndefOr[String] = js.undefined
    
    var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
    
    var echo: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsk(value: String): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAskUndefined: Self = StObject.set(x, "ask", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: /* input */ String => js.Array[String]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setEcho(value: String): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Prompt extends StObject {
    
    def apply(ask: String): String = js.native
    def apply(ask: String, opts: Option): String = js.native
    def apply(ask: String, value: String): String = js.native
    /**
      * prompt -- sync function for reading user input from stdin
      *  @param {String} ask opening question/statement to prompt for
      *  @param {String} value initial value for the prompt
      *  @param   {Object} opts {
      *   echo: set to a character to be echoed, default is '*'. Use '' for no echo
      *   value: {String} initial value for the prompt
      *   ask: {String} opening question/statement to prompt for, does not override ask param
      *   autocomplete: {StringArray} function({String})
      * }
      *
      * @returns {string} Returns the string input or (if sigint === false)
      *                   null if user terminates with a ^C
      */
    def apply(ask: String, value: String, opts: Option): String = js.native
    def apply(opts: Option): String = js.native
    
    def hide(ask: String): String = js.native
  }
}
