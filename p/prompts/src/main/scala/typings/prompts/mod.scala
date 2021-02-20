package typings.prompts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.prompts.promptsBooleans.`false`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prompts", JSImport.Namespace)
  @js.native
  def apply[T /* <: String */](questions: js.Array[PromptObject[T]]): js.Promise[Answers[T]] = js.native
  @JSImport("prompts", JSImport.Namespace)
  @js.native
  def apply[T /* <: String */](questions: js.Array[PromptObject[T]], options: Options): js.Promise[Answers[T]] = js.native
  @JSImport("prompts", JSImport.Namespace)
  @js.native
  def apply[T /* <: String */](questions: PromptObject[T]): js.Promise[Answers[T]] = js.native
  @JSImport("prompts", JSImport.Namespace)
  @js.native
  def apply[T /* <: String */](questions: PromptObject[T], options: Options): js.Promise[Answers[T]] = js.native
  
  @JSImport("prompts", "inject")
  @js.native
  def inject(arr: js.Array[_]): Unit = js.native
  
  // Circular reference from prompts
  @JSImport("prompts", "prompt")
  @js.native
  val prompt: js.Any = js.native
  
  object prompts {
    
    @JSImport("prompts", "prompts.autocomplete")
    @js.native
    def autocomplete(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.confirm")
    @js.native
    def confirm(args: PromptObject[String]): Unit = js.native
    
    @JSImport("prompts", "prompts.date")
    @js.native
    def date(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.invisible")
    @js.native
    def invisible(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.list")
    @js.native
    def list(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.multiselect")
    @js.native
    def multiselect(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.number")
    @js.native
    def number(args: PromptObject[String]): Unit = js.native
    
    @JSImport("prompts", "prompts.password")
    @js.native
    def password(args: PromptObject[String]): js.Any = js.native
    
    @JSImport("prompts", "prompts.select")
    @js.native
    def select(args: PromptObject[String]): Unit = js.native
    
    @JSImport("prompts", "prompts.text")
    @js.native
    def text(args: PromptObject[String]): Unit = js.native
    
    @JSImport("prompts", "prompts.toggle")
    @js.native
    def toggle(args: PromptObject[String]): Unit = js.native
  }
  
  type Answers[T /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ typings.prompts.promptsStrings.Answers with TopLevel[js.Any]
  
  // Based upon: https://github.com/terkelg/prompts/blob/d7d2c37a0009e3235b2e88a7d5cdbb114ac271b2/lib/elements/select.js#L29
  @js.native
  trait Choice extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var title: String = js.native
    
    var value: js.Any = js.native
  }
  object Choice {
    
    @scala.inline
    def apply(title: String, value: js.Any): Choice = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Falsy = js.UndefOr[`false` | Null]
  
  @js.native
  trait Options extends StObject {
    
    var onCancel: js.UndefOr[js.Function2[/* prompt */ PromptObject[String], /* answers */ js.Any, Unit]] = js.native
    
    var onSubmit: js.UndefOr[
        js.Function3[
          /* prompt */ PromptObject[String], 
          /* answer */ js.Any, 
          /* answers */ js.Array[_], 
          Unit
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCancel(value: (/* prompt */ PromptObject[String], /* answers */ js.Any) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: (/* prompt */ PromptObject[String], /* answer */ js.Any, /* answers */ js.Array[_]) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    }
  }
  
  type PrevCaller[T /* <: String */, R] = js.Function3[/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String], R]
  
  @js.native
  trait PromptObject[T /* <: String */] extends StObject {
    
    var active: js.UndefOr[String] = js.native
    
    var choices: js.UndefOr[js.Array[Choice]] = js.native
    
    var float: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[PrevCaller[T, Unit]] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var inactive: js.UndefOr[String] = js.native
    
    var increment: js.UndefOr[Double] = js.native
    
    var initial: js.UndefOr[String | Double | Boolean | Date] = js.native
    
    var instructions: js.UndefOr[String | Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var message: js.UndefOr[ValueOrFunc[String]] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: ValueOrFunc[T] = js.native
    
    var onState: js.UndefOr[PrevCaller[T, Unit]] = js.native
    
    var round: js.UndefOr[Double] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var stdin: js.UndefOr[Readable] = js.native
    
    var stdout: js.UndefOr[Writable] = js.native
    
    var style: js.UndefOr[String] = js.native
    
    var suggest: js.UndefOr[js.Function2[/* input */ js.Any, /* choices */ js.Array[Choice], js.Promise[_]]] = js.native
    
    var `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy]) = js.native
    
    var validate: js.UndefOr[PrevCaller[T, Boolean | String | (js.Promise[Boolean | String])]] = js.native
  }
  object PromptObject {
    
    @scala.inline
    def apply[T /* <: String */](name: ValueOrFunc[T]): PromptObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptObject[T]]
    }
    
    @scala.inline
    implicit class PromptObjectMutableBuilder[Self <: PromptObject[_], T /* <: String */] (val x: Self with PromptObject[T]) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setInactive(value: String): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setInitial(value: String | Double | Boolean | Date): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setInstructions(value: String | Boolean): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessage(value: ValueOrFunc[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction3(
        value: (/* prev */ js.Any, /* values */ Answers[String], /* prompt */ PromptObject[String]) => String
      ): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: ValueOrFunc[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFunction3(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => T): Self = StObject.set(x, "name", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnState(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = StObject.set(x, "onState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnStateUndefined: Self = StObject.set(x, "onState", js.undefined)
      
      @scala.inline
      def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStdin(value: Readable): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Writable): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuggest(value: (/* input */ js.Any, /* choices */ js.Array[Choice]) => js.Promise[_]): Self = StObject.set(x, "suggest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      @scala.inline
      def setType(value: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction3(
        value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => PromptType | Falsy
      ): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(
        value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Boolean | String | (js.Promise[Boolean | String])
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prompts.promptsStrings.text
    - typings.prompts.promptsStrings.password
    - typings.prompts.promptsStrings.invisible
    - typings.prompts.promptsStrings.number
    - typings.prompts.promptsStrings.confirm
    - typings.prompts.promptsStrings.list
    - typings.prompts.promptsStrings.toggle
    - typings.prompts.promptsStrings.select
    - typings.prompts.promptsStrings.multiselect
    - typings.prompts.promptsStrings.autocomplete
    - typings.prompts.promptsStrings.date
    - typings.prompts.promptsStrings.autocompleteMultiselect
  */
  trait PromptType extends StObject
  object PromptType {
    
    @scala.inline
    def autocomplete: typings.prompts.promptsStrings.autocomplete = "autocomplete".asInstanceOf[typings.prompts.promptsStrings.autocomplete]
    
    @scala.inline
    def autocompleteMultiselect: typings.prompts.promptsStrings.autocompleteMultiselect = "autocompleteMultiselect".asInstanceOf[typings.prompts.promptsStrings.autocompleteMultiselect]
    
    @scala.inline
    def confirm: typings.prompts.promptsStrings.confirm = "confirm".asInstanceOf[typings.prompts.promptsStrings.confirm]
    
    @scala.inline
    def date: typings.prompts.promptsStrings.date = "date".asInstanceOf[typings.prompts.promptsStrings.date]
    
    @scala.inline
    def invisible: typings.prompts.promptsStrings.invisible = "invisible".asInstanceOf[typings.prompts.promptsStrings.invisible]
    
    @scala.inline
    def list: typings.prompts.promptsStrings.list = "list".asInstanceOf[typings.prompts.promptsStrings.list]
    
    @scala.inline
    def multiselect: typings.prompts.promptsStrings.multiselect = "multiselect".asInstanceOf[typings.prompts.promptsStrings.multiselect]
    
    @scala.inline
    def number: typings.prompts.promptsStrings.number = "number".asInstanceOf[typings.prompts.promptsStrings.number]
    
    @scala.inline
    def password: typings.prompts.promptsStrings.password = "password".asInstanceOf[typings.prompts.promptsStrings.password]
    
    @scala.inline
    def select: typings.prompts.promptsStrings.select = "select".asInstanceOf[typings.prompts.promptsStrings.select]
    
    @scala.inline
    def text: typings.prompts.promptsStrings.text = "text".asInstanceOf[typings.prompts.promptsStrings.text]
    
    @scala.inline
    def toggle: typings.prompts.promptsStrings.toggle = "toggle".asInstanceOf[typings.prompts.promptsStrings.toggle]
  }
  
  type ValueOrFunc[T /* <: String */] = T | (PrevCaller[T, T])
  
  @JSImport("prompts", "override")
  @js.native
  def `override`(obj: StringDictionary[js.Any]): Unit = js.native
}
