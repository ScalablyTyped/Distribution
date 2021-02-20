package typings.readlineSync

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readline-sync", "getRawInput")
  @js.native
  def getRawInput(): String = js.native
  
  @JSImport("readline-sync", "keyIn")
  @js.native
  def keyIn(): String = js.native
  @JSImport("readline-sync", "keyIn")
  @js.native
  def keyIn(query: js.UndefOr[scala.Nothing], options: BasicOptions): String = js.native
  @JSImport("readline-sync", "keyIn")
  @js.native
  def keyIn(query: js.Any): String = js.native
  @JSImport("readline-sync", "keyIn")
  @js.native
  def keyIn(query: js.Any, options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "keyInPause")
  @js.native
  def keyInPause(): Unit = js.native
  @JSImport("readline-sync", "keyInPause")
  @js.native
  def keyInPause(query: js.UndefOr[scala.Nothing], options: BasicOptions): Unit = js.native
  @JSImport("readline-sync", "keyInPause")
  @js.native
  def keyInPause(query: js.Any): Unit = js.native
  @JSImport("readline-sync", "keyInPause")
  @js.native
  def keyInPause(query: js.Any, options: BasicOptions): Unit = js.native
  
  @JSImport("readline-sync", "keyInSelect")
  @js.native
  def keyInSelect(items: js.Array[String]): Double = js.native
  @JSImport("readline-sync", "keyInSelect")
  @js.native
  def keyInSelect(items: js.Array[String], query: js.UndefOr[scala.Nothing], options: BasicOptions): Double = js.native
  @JSImport("readline-sync", "keyInSelect")
  @js.native
  def keyInSelect(items: js.Array[String], query: js.Any): Double = js.native
  @JSImport("readline-sync", "keyInSelect")
  @js.native
  def keyInSelect(items: js.Array[String], query: js.Any, options: BasicOptions): Double = js.native
  
  @JSImport("readline-sync", "keyInYN")
  @js.native
  def keyInYN(): Boolean | String = js.native
  @JSImport("readline-sync", "keyInYN")
  @js.native
  def keyInYN(query: js.UndefOr[scala.Nothing], options: BasicOptions): Boolean | String = js.native
  @JSImport("readline-sync", "keyInYN")
  @js.native
  def keyInYN(query: js.Any): Boolean | String = js.native
  @JSImport("readline-sync", "keyInYN")
  @js.native
  def keyInYN(query: js.Any, options: BasicOptions): Boolean | String = js.native
  
  @JSImport("readline-sync", "keyInYNStrict")
  @js.native
  def keyInYNStrict(): Boolean = js.native
  @JSImport("readline-sync", "keyInYNStrict")
  @js.native
  def keyInYNStrict(query: js.UndefOr[scala.Nothing], options: BasicOptions): Boolean = js.native
  @JSImport("readline-sync", "keyInYNStrict")
  @js.native
  def keyInYNStrict(query: js.Any): Boolean = js.native
  @JSImport("readline-sync", "keyInYNStrict")
  @js.native
  def keyInYNStrict(query: js.Any, options: BasicOptions): Boolean = js.native
  
  @JSImport("readline-sync", "prompt")
  @js.native
  def prompt(): String = js.native
  @JSImport("readline-sync", "prompt")
  @js.native
  def prompt(options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(): js.Array[String] = js.native
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(commandHandler: js.UndefOr[scala.Nothing], options: BasicOptions): js.Array[String] = js.native
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit]): js.Array[String] = js.native
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit],
    options: BasicOptions
  ): js.Array[String] = js.native
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]]): js.Array[String] = js.native
  @JSImport("readline-sync", "promptCL")
  @js.native
  def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]], options: BasicOptions): js.Array[String] = js.native
  
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(): Unit = js.native
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(commandHandler: js.UndefOr[scala.Nothing], options: BasicOptions): Unit = js.native
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit]): Unit = js.native
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit],
    options: BasicOptions
  ): Unit = js.native
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]]): Unit = js.native
  @JSImport("readline-sync", "promptCLLoop")
  @js.native
  def promptCLLoop(
    commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]],
    options: BasicOptions
  ): Unit = js.native
  
  @JSImport("readline-sync", "promptLoop")
  @js.native
  def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean]): Unit = js.native
  @JSImport("readline-sync", "promptLoop")
  @js.native
  def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean], options: BasicOptions): Unit = js.native
  
  @JSImport("readline-sync", "promptSimShell")
  @js.native
  def promptSimShell(): String = js.native
  @JSImport("readline-sync", "promptSimShell")
  @js.native
  def promptSimShell(options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "question")
  @js.native
  def question(): String = js.native
  @JSImport("readline-sync", "question")
  @js.native
  def question(query: js.UndefOr[scala.Nothing], options: BasicOptions): String = js.native
  @JSImport("readline-sync", "question")
  @js.native
  def question(query: js.Any): String = js.native
  @JSImport("readline-sync", "question")
  @js.native
  def question(query: js.Any, options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "questionEMail")
  @js.native
  def questionEMail(): String = js.native
  @JSImport("readline-sync", "questionEMail")
  @js.native
  def questionEMail(query: js.UndefOr[scala.Nothing], options: BasicOptions): String = js.native
  @JSImport("readline-sync", "questionEMail")
  @js.native
  def questionEMail(query: js.Any): String = js.native
  @JSImport("readline-sync", "questionEMail")
  @js.native
  def questionEMail(query: js.Any, options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "questionFloat")
  @js.native
  def questionFloat(): Double = js.native
  @JSImport("readline-sync", "questionFloat")
  @js.native
  def questionFloat(query: js.UndefOr[scala.Nothing], options: BasicOptions): Double = js.native
  @JSImport("readline-sync", "questionFloat")
  @js.native
  def questionFloat(query: js.Any): Double = js.native
  @JSImport("readline-sync", "questionFloat")
  @js.native
  def questionFloat(query: js.Any, options: BasicOptions): Double = js.native
  
  @JSImport("readline-sync", "questionInt")
  @js.native
  def questionInt(): Double = js.native
  @JSImport("readline-sync", "questionInt")
  @js.native
  def questionInt(query: js.UndefOr[scala.Nothing], options: BasicOptions): Double = js.native
  @JSImport("readline-sync", "questionInt")
  @js.native
  def questionInt(query: js.Any): Double = js.native
  @JSImport("readline-sync", "questionInt")
  @js.native
  def questionInt(query: js.Any, options: BasicOptions): Double = js.native
  
  @JSImport("readline-sync", "questionNewPassword")
  @js.native
  def questionNewPassword(): String = js.native
  @JSImport("readline-sync", "questionNewPassword")
  @js.native
  def questionNewPassword(query: js.UndefOr[scala.Nothing], options: BasicOptions): String = js.native
  @JSImport("readline-sync", "questionNewPassword")
  @js.native
  def questionNewPassword(query: js.Any): String = js.native
  @JSImport("readline-sync", "questionNewPassword")
  @js.native
  def questionNewPassword(query: js.Any, options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "questionPath")
  @js.native
  def questionPath(): String = js.native
  @JSImport("readline-sync", "questionPath")
  @js.native
  def questionPath(query: js.UndefOr[scala.Nothing], options: BasicOptions): String = js.native
  @JSImport("readline-sync", "questionPath")
  @js.native
  def questionPath(query: js.Any): String = js.native
  @JSImport("readline-sync", "questionPath")
  @js.native
  def questionPath(query: js.Any, options: BasicOptions): String = js.native
  
  @JSImport("readline-sync", "setBufferSize")
  @js.native
  def setBufferSize(value: Double): Unit = js.native
  
  @JSImport("readline-sync", "setDefaultOptions")
  @js.native
  def setDefaultOptions(): BasicOptions = js.native
  @JSImport("readline-sync", "setDefaultOptions")
  @js.native
  def setDefaultOptions(options: BasicOptions): BasicOptions = js.native
  
  @JSImport("readline-sync", "setEncoding")
  @js.native
  def setEncoding(value: String): Unit = js.native
  
  @JSImport("readline-sync", "setMask")
  @js.native
  def setMask(value: String): Unit = js.native
  
  @JSImport("readline-sync", "setPrint")
  @js.native
  def setPrint(value: js.Function2[/* display */ String, /* encoding */ String, Unit]): Unit = js.native
  
  @JSImport("readline-sync", "setPrompt")
  @js.native
  def setPrompt(value: js.Any): Unit = js.native
  
  @js.native
  trait BasicOptions extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.native
    
    var cancel: js.UndefOr[js.Any] = js.native
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var cd: js.UndefOr[Boolean] = js.native
    
    var charlist: js.UndefOr[String] = js.native
    
    var confirmMessage: js.UndefOr[js.Any] = js.native
    
    var create: js.UndefOr[Boolean] = js.native
    
    var defaultInput: js.UndefOr[String] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
    var exists: js.UndefOr[js.Any] = js.native
    
    var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
    
    var guide: js.UndefOr[Boolean] = js.native
    
    var hideEchoBack: js.UndefOr[Boolean] = js.native
    
    var history: js.UndefOr[Boolean] = js.native
    
    var isDirectory: js.UndefOr[Boolean] = js.native
    
    var isFile: js.UndefOr[Boolean] = js.native
    
    var keepWhitespace: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
    
    var limitMessage: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[js.Any] = js.native
    
    var min: js.UndefOr[js.Any] = js.native
    
    var print: js.UndefOr[js.Function2[/* display */ String, /* encoding */ String, Unit]] = js.native
    
    var prompt: js.UndefOr[js.Any] = js.native
    
    var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
    
    var unmatchMessage: js.UndefOr[js.Any] = js.native
    
    var validate: js.UndefOr[js.Function1[/* path */ String, Boolean | String]] = js.native
  }
  object BasicOptions {
    
    @scala.inline
    def apply(): BasicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicOptions]
    }
    
    @scala.inline
    implicit class BasicOptionsMutableBuilder[Self <: BasicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setCancel(value: js.Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setCd(value: Boolean): Self = StObject.set(x, "cd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdUndefined: Self = StObject.set(x, "cd", js.undefined)
      
      @scala.inline
      def setCharlist(value: String): Self = StObject.set(x, "charlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharlistUndefined: Self = StObject.set(x, "charlist", js.undefined)
      
      @scala.inline
      def setConfirmMessage(value: js.Any): Self = StObject.set(x, "confirmMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmMessageUndefined: Self = StObject.set(x, "confirmMessage", js.undefined)
      
      @scala.inline
      def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDefaultInput(value: String): Self = StObject.set(x, "defaultInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInputUndefined: Self = StObject.set(x, "defaultInput", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExists(value: js.Any): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      @scala.inline
      def setFalseValue(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "falseValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFalseValueFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "falseValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFalseValueUndefined: Self = StObject.set(x, "falseValue", js.undefined)
      
      @scala.inline
      def setFalseValueVarargs(value: OptionType*): Self = StObject.set(x, "falseValue", js.Array(value :_*))
      
      @scala.inline
      def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      @scala.inline
      def setHideEchoBack(value: Boolean): Self = StObject.set(x, "hideEchoBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideEchoBackUndefined: Self = StObject.set(x, "hideEchoBack", js.undefined)
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      @scala.inline
      def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      @scala.inline
      def setKeepWhitespace(value: Boolean): Self = StObject.set(x, "keepWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepWhitespaceUndefined: Self = StObject.set(x, "keepWhitespace", js.undefined)
      
      @scala.inline
      def setLimit(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLimitMessage(value: String): Self = StObject.set(x, "limitMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitMessageUndefined: Self = StObject.set(x, "limitMessage", js.undefined)
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLimitVarargs(value: OptionType*): Self = StObject.set(x, "limit", js.Array(value :_*))
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPrint(value: (/* display */ String, /* encoding */ String) => Unit): Self = StObject.set(x, "print", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setPrompt(value: js.Any): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setTrueValue(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "trueValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrueValueFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "trueValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrueValueUndefined: Self = StObject.set(x, "trueValue", js.undefined)
      
      @scala.inline
      def setTrueValueVarargs(value: OptionType*): Self = StObject.set(x, "trueValue", js.Array(value :_*))
      
      @scala.inline
      def setUnmatchMessage(value: js.Any): Self = StObject.set(x, "unmatchMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmatchMessageUndefined: Self = StObject.set(x, "unmatchMessage", js.undefined)
      
      @scala.inline
      def setValidate(value: /* path */ String => Boolean | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type OptionType = String | Double | RegExp | (js.Function1[/* input */ String, Boolean])
}
