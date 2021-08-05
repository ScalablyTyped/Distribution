package typings.prompts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.prompts.promptsBooleans.`false`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: String */](questions: js.Array[PromptObject[T]]): js.Promise[Answers[T]] = ^.asInstanceOf[js.Dynamic].apply(questions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Answers[T]]]
  inline def apply[T /* <: String */](questions: js.Array[PromptObject[T]], options: Options): js.Promise[Answers[T]] = (^.asInstanceOf[js.Dynamic].apply(questions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Answers[T]]]
  inline def apply[T /* <: String */](questions: PromptObject[T]): js.Promise[Answers[T]] = ^.asInstanceOf[js.Dynamic].apply(questions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Answers[T]]]
  inline def apply[T /* <: String */](questions: PromptObject[T], options: Options): js.Promise[Answers[T]] = (^.asInstanceOf[js.Dynamic].apply(questions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Answers[T]]]
  
  @JSImport("prompts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject(arr: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def `override`(obj: StringDictionary[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // Circular reference from prompts
  @JSImport("prompts", "prompt")
  @js.native
  val prompt: js.Any = js.native
  
  object prompts {
    
    @JSImport("prompts", "prompts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def autocomplete(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("autocomplete")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def confirm(args: PromptObject[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def date(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def invisible(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("invisible")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def list(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def multiselect(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multiselect")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def number(args: PromptObject[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def password(args: PromptObject[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def select(args: PromptObject[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def text(args: PromptObject[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def toggle(args: PromptObject[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type Answers[T /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ typings.prompts.promptsStrings.Answers & TopLevel[js.Any]
  
  // Based upon: https://github.com/terkelg/prompts/blob/d7d2c37a0009e3235b2e88a7d5cdbb114ac271b2/lib/elements/select.js#L29
  trait Choice extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var title: String
    
    var value: js.Any
  }
  object Choice {
    
    inline def apply(title: String, value: js.Any): Choice = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    extension [Self <: Choice](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Falsy = js.UndefOr[`false` | Null]
  
  trait Options extends StObject {
    
    var onCancel: js.UndefOr[js.Function2[/* prompt */ PromptObject[String], /* answers */ js.Any, Unit]] = js.undefined
    
    var onSubmit: js.UndefOr[
        js.Function3[
          /* prompt */ PromptObject[String], 
          /* answer */ js.Any, 
          /* answers */ js.Array[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnCancel(value: (/* prompt */ PromptObject[String], /* answers */ js.Any) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnSubmit(
        value: (/* prompt */ PromptObject[String], /* answer */ js.Any, /* answers */ js.Array[js.Any]) => Unit
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    }
  }
  
  type PrevCaller[T /* <: String */, R] = js.Function3[/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String], R]
  
  trait PromptObject[T /* <: String */] extends StObject {
    
    var active: js.UndefOr[String] = js.undefined
    
    var choices: js.UndefOr[js.Array[Choice]] = js.undefined
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[PrevCaller[T, Unit]] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var inactive: js.UndefOr[String] = js.undefined
    
    var increment: js.UndefOr[Double] = js.undefined
    
    var initial: js.UndefOr[String | Double | Boolean | Date] = js.undefined
    
    var instructions: js.UndefOr[String | Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[ValueOrFunc[String]] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: ValueOrFunc[T]
    
    var onState: js.UndefOr[PrevCaller[T, Unit]] = js.undefined
    
    var round: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var stdin: js.UndefOr[Readable] = js.undefined
    
    var stdout: js.UndefOr[Writable] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var suggest: js.UndefOr[
        js.Function2[/* input */ js.Any, /* choices */ js.Array[Choice], js.Promise[js.Any]]
      ] = js.undefined
    
    var `type`: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])
    
    var validate: js.UndefOr[PrevCaller[T, Boolean | String | (js.Promise[Boolean | String])]] = js.undefined
  }
  object PromptObject {
    
    inline def apply[T /* <: String */](name: ValueOrFunc[T]): PromptObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptObject[T]]
    }
    
    extension [Self <: PromptObject[?], T /* <: String */](x: Self & PromptObject[T]) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChoices(value: js.Array[Choice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFormat(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setInactive(value: String): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setInitial(value: String | Double | Boolean | Date): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setInstructions(value: String | Boolean): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
      
      inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessage(value: ValueOrFunc[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction3(
        value: (/* prev */ js.Any, /* values */ Answers[String], /* prompt */ PromptObject[String]) => String
      ): Self = StObject.set(x, "message", js.Any.fromFunction3(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: ValueOrFunc[T]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction3(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => T): Self = StObject.set(x, "name", js.Any.fromFunction3(value))
      
      inline def setOnState(value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Unit): Self = StObject.set(x, "onState", js.Any.fromFunction3(value))
      
      inline def setOnStateUndefined: Self = StObject.set(x, "onState", js.undefined)
      
      inline def setRound(value: Double): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStdin(value: Readable): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Writable): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuggest(value: (/* input */ js.Any, /* choices */ js.Array[Choice]) => js.Promise[js.Any]): Self = StObject.set(x, "suggest", js.Any.fromFunction2(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setType(value: PromptType | Falsy | (PrevCaller[T, PromptType | Falsy])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction3(
        value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => PromptType | Falsy
      ): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(
        value: (/* prev */ js.Any, /* values */ Answers[T], /* prompt */ PromptObject[String]) => Boolean | String | (js.Promise[Boolean | String])
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
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
    
    inline def autocomplete: typings.prompts.promptsStrings.autocomplete = "autocomplete".asInstanceOf[typings.prompts.promptsStrings.autocomplete]
    
    inline def autocompleteMultiselect: typings.prompts.promptsStrings.autocompleteMultiselect = "autocompleteMultiselect".asInstanceOf[typings.prompts.promptsStrings.autocompleteMultiselect]
    
    inline def confirm: typings.prompts.promptsStrings.confirm = "confirm".asInstanceOf[typings.prompts.promptsStrings.confirm]
    
    inline def date: typings.prompts.promptsStrings.date = "date".asInstanceOf[typings.prompts.promptsStrings.date]
    
    inline def invisible: typings.prompts.promptsStrings.invisible = "invisible".asInstanceOf[typings.prompts.promptsStrings.invisible]
    
    inline def list: typings.prompts.promptsStrings.list = "list".asInstanceOf[typings.prompts.promptsStrings.list]
    
    inline def multiselect: typings.prompts.promptsStrings.multiselect = "multiselect".asInstanceOf[typings.prompts.promptsStrings.multiselect]
    
    inline def number: typings.prompts.promptsStrings.number = "number".asInstanceOf[typings.prompts.promptsStrings.number]
    
    inline def password: typings.prompts.promptsStrings.password = "password".asInstanceOf[typings.prompts.promptsStrings.password]
    
    inline def select: typings.prompts.promptsStrings.select = "select".asInstanceOf[typings.prompts.promptsStrings.select]
    
    inline def text: typings.prompts.promptsStrings.text = "text".asInstanceOf[typings.prompts.promptsStrings.text]
    
    inline def toggle: typings.prompts.promptsStrings.toggle = "toggle".asInstanceOf[typings.prompts.promptsStrings.toggle]
  }
  
  type ValueOrFunc[T /* <: String */] = T | (PrevCaller[T, T])
}
