package typings.readlineSync

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("readline-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRawInput(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawInput")().asInstanceOf[String]
  
  inline def keyIn(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyIn")().asInstanceOf[String]
  inline def keyIn(query: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyIn")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def keyIn(query: js.Any, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keyIn")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def keyIn(query: Unit, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keyIn")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def keyInPause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInPause")().asInstanceOf[Unit]
  inline def keyInPause(query: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInPause")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keyInPause(query: js.Any, options: BasicOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInPause")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def keyInPause(query: Unit, options: BasicOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInPause")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def keyInSelect(items: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInSelect")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def keyInSelect(items: js.Array[String], query: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInSelect")(items.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def keyInSelect(items: js.Array[String], query: js.Any, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInSelect")(items.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def keyInSelect(items: js.Array[String], query: Unit, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInSelect")(items.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def keyInYN(): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInYN")().asInstanceOf[Boolean | String]
  inline def keyInYN(query: js.Any): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInYN")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
  inline def keyInYN(query: js.Any, options: BasicOptions): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInYN")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def keyInYN(query: Unit, options: BasicOptions): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInYN")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  inline def keyInYNStrict(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInYNStrict")().asInstanceOf[Boolean]
  inline def keyInYNStrict(query: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("keyInYNStrict")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def keyInYNStrict(query: js.Any, options: BasicOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInYNStrict")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def keyInYNStrict(query: Unit, options: BasicOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("keyInYNStrict")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def prompt(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")().asInstanceOf[String]
  inline def prompt(options: BasicOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def promptCL(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")().asInstanceOf[js.Array[String]]
  inline def promptCL(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")(commandHandler.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def promptCL(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Unit],
    options: BasicOptions
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")(commandHandler.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def promptCL(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Unit]], options: BasicOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def promptCL(commandHandler: Unit, options: BasicOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCL")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def promptCLLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")().asInstanceOf[Unit]
  inline def promptCLLoop(commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")(commandHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def promptCLLoop(
    commandHandler: js.Function2[/* command */ String, /* repeated */ String, Boolean | Unit],
    options: BasicOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def promptCLLoop(commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")(commandHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def promptCLLoop(
    commandHandler: StringDictionary[js.Function1[/* repeated */ String, Boolean | Unit]],
    options: BasicOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def promptCLLoop(commandHandler: Unit, options: BasicOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promptCLLoop")(commandHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("promptLoop")(inputHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def promptLoop(inputHandler: js.Function1[/* value */ String, Boolean], options: BasicOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("promptLoop")(inputHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promptSimShell(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("promptSimShell")().asInstanceOf[String]
  inline def promptSimShell(options: BasicOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("promptSimShell")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def question(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("question")().asInstanceOf[String]
  inline def question(query: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("question")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def question(query: js.Any, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("question")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def question(query: Unit, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("question")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def questionEMail(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionEMail")().asInstanceOf[String]
  inline def questionEMail(query: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionEMail")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def questionEMail(query: js.Any, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionEMail")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def questionEMail(query: Unit, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionEMail")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def questionFloat(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("questionFloat")().asInstanceOf[Double]
  inline def questionFloat(query: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("questionFloat")(query.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def questionFloat(query: js.Any, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("questionFloat")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def questionFloat(query: Unit, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("questionFloat")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def questionInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("questionInt")().asInstanceOf[Double]
  inline def questionInt(query: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("questionInt")(query.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def questionInt(query: js.Any, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("questionInt")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def questionInt(query: Unit, options: BasicOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("questionInt")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def questionNewPassword(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionNewPassword")().asInstanceOf[String]
  inline def questionNewPassword(query: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionNewPassword")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def questionNewPassword(query: js.Any, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionNewPassword")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def questionNewPassword(query: Unit, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionNewPassword")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def questionPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionPath")().asInstanceOf[String]
  inline def questionPath(query: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("questionPath")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def questionPath(query: js.Any, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionPath")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def questionPath(query: Unit, options: BasicOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("questionPath")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setBufferSize(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBufferSize")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultOptions(): BasicOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")().asInstanceOf[BasicOptions]
  inline def setDefaultOptions(options: BasicOptions): BasicOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[BasicOptions]
  
  inline def setEncoding(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEncoding")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setMask(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMask")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPrint(value: js.Function2[/* display */ String, /* encoding */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrint")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPrompt(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrompt")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BasicOptions extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var cancel: js.UndefOr[js.Any] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var cd: js.UndefOr[Boolean] = js.undefined
    
    var charlist: js.UndefOr[String] = js.undefined
    
    var confirmMessage: js.UndefOr[js.Any] = js.undefined
    
    var create: js.UndefOr[Boolean] = js.undefined
    
    var defaultInput: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var exists: js.UndefOr[js.Any] = js.undefined
    
    var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
    
    var guide: js.UndefOr[Boolean] = js.undefined
    
    var hideEchoBack: js.UndefOr[Boolean] = js.undefined
    
    var history: js.UndefOr[Boolean] = js.undefined
    
    var isDirectory: js.UndefOr[Boolean] = js.undefined
    
    var isFile: js.UndefOr[Boolean] = js.undefined
    
    var keepWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
    
    var limitMessage: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[js.Any] = js.undefined
    
    var min: js.UndefOr[js.Any] = js.undefined
    
    var print: js.UndefOr[js.Function2[/* display */ String, /* encoding */ String, Unit]] = js.undefined
    
    var prompt: js.UndefOr[js.Any] = js.undefined
    
    var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.undefined
    
    var unmatchMessage: js.UndefOr[js.Any] = js.undefined
    
    var validate: js.UndefOr[js.Function1[/* path */ String, Boolean | String]] = js.undefined
  }
  object BasicOptions {
    
    inline def apply(): BasicOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicOptions]
    }
    
    extension [Self <: BasicOptions](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setCancel(value: js.Any): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setCd(value: Boolean): Self = StObject.set(x, "cd", value.asInstanceOf[js.Any])
      
      inline def setCdUndefined: Self = StObject.set(x, "cd", js.undefined)
      
      inline def setCharlist(value: String): Self = StObject.set(x, "charlist", value.asInstanceOf[js.Any])
      
      inline def setCharlistUndefined: Self = StObject.set(x, "charlist", js.undefined)
      
      inline def setConfirmMessage(value: js.Any): Self = StObject.set(x, "confirmMessage", value.asInstanceOf[js.Any])
      
      inline def setConfirmMessageUndefined: Self = StObject.set(x, "confirmMessage", js.undefined)
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDefaultInput(value: String): Self = StObject.set(x, "defaultInput", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputUndefined: Self = StObject.set(x, "defaultInput", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExists(value: js.Any): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
      
      inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
      
      inline def setFalseValue(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "falseValue", value.asInstanceOf[js.Any])
      
      inline def setFalseValueFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "falseValue", js.Any.fromFunction1(value))
      
      inline def setFalseValueUndefined: Self = StObject.set(x, "falseValue", js.undefined)
      
      inline def setFalseValueVarargs(value: OptionType*): Self = StObject.set(x, "falseValue", js.Array(value :_*))
      
      inline def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setHideEchoBack(value: Boolean): Self = StObject.set(x, "hideEchoBack", value.asInstanceOf[js.Any])
      
      inline def setHideEchoBackUndefined: Self = StObject.set(x, "hideEchoBack", js.undefined)
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      inline def setKeepWhitespace(value: Boolean): Self = StObject.set(x, "keepWhitespace", value.asInstanceOf[js.Any])
      
      inline def setKeepWhitespaceUndefined: Self = StObject.set(x, "keepWhitespace", js.undefined)
      
      inline def setLimit(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      inline def setLimitMessage(value: String): Self = StObject.set(x, "limitMessage", value.asInstanceOf[js.Any])
      
      inline def setLimitMessageUndefined: Self = StObject.set(x, "limitMessage", js.undefined)
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLimitVarargs(value: OptionType*): Self = StObject.set(x, "limit", js.Array(value :_*))
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPrint(value: (/* display */ String, /* encoding */ String) => Unit): Self = StObject.set(x, "print", js.Any.fromFunction2(value))
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setPrompt(value: js.Any): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setTrueValue(value: OptionType | js.Array[OptionType]): Self = StObject.set(x, "trueValue", value.asInstanceOf[js.Any])
      
      inline def setTrueValueFunction1(value: /* input */ String => Boolean): Self = StObject.set(x, "trueValue", js.Any.fromFunction1(value))
      
      inline def setTrueValueUndefined: Self = StObject.set(x, "trueValue", js.undefined)
      
      inline def setTrueValueVarargs(value: OptionType*): Self = StObject.set(x, "trueValue", js.Array(value :_*))
      
      inline def setUnmatchMessage(value: js.Any): Self = StObject.set(x, "unmatchMessage", value.asInstanceOf[js.Any])
      
      inline def setUnmatchMessageUndefined: Self = StObject.set(x, "unmatchMessage", js.undefined)
      
      inline def setValidate(value: /* path */ String => Boolean | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type OptionType = String | Double | RegExp | (js.Function1[/* input */ String, Boolean])
}
