package typings.reactMentions

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactMentions.anon.PartialCSSProperties
import typings.reactMentions.anon.PartialConfig
import typings.reactMentions.anon.Results
import typings.reactMentions.libUtilsApplyChangeToValueMod.Config
import typings.reactMentions.libUtilsApplyChangeToValueMod.Options
import typings.reactMentions.libUtilsGetMentionsMod.Mention
import typings.reactMentions.libUtilsIterateMentionsMarkupMod.MarkupIterateeFunction
import typings.reactMentions.libUtilsIterateMentionsMarkupMod.TextIterateeFunction
import typings.reactMentions.reactMentionsInts.`0`
import typings.reactMentions.reactMentionsInts.`1`
import typings.reactMentions.reactMentionsStrings.END
import typings.reactMentions.reactMentionsStrings.NULL
import typings.reactMentions.reactMentionsStrings.START
import typings.reactMentions.reactMentionsStrings.display
import typings.reactMentions.reactMentionsStrings.id
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("react-mentions/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-mentions/lib/utils", "PLACEHOLDERS")
  @js.native
  object PLACEHOLDERS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactMentions.libUtilsPlaceholdersMod.PLACEHOLDERS & String] = js.native
    
    /* "__display__" */ val display: typings.reactMentions.libUtilsPlaceholdersMod.PLACEHOLDERS.display & String = js.native
    
    /* "__id__" */ val id: typings.reactMentions.libUtilsPlaceholdersMod.PLACEHOLDERS.id & String = js.native
  }
  
  inline def applyChangeToValue(value: String, plainTextValue: String, options: Options, config: js.Array[PartialConfig]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChangeToValue")(value.asInstanceOf[js.Any], plainTextValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def combineRegExps(regExps: js.Array[js.RegExp]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("combineRegExps")(regExps.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def countPlaceholders(markup: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countPlaceholders")(markup.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def countSuggestions(suggestions: Record[String, Results]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countSuggestions")(suggestions.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def createDefaultStyle(defaultStyle: PartialCSSProperties): Component[js.Object, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(defaultStyle.asInstanceOf[js.Any]).asInstanceOf[Component[js.Object, js.Object, Any]]
  inline def createDefaultStyle(defaultStyle: PartialCSSProperties, getModifiers: Record[String, Any]): Component[js.Object, js.Object, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(defaultStyle.asInstanceOf[js.Any], getModifiers.asInstanceOf[js.Any])).asInstanceOf[Component[js.Object, js.Object, Any]]
  
  inline def escapeRegex(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findPositionOfCapturingGroup(markup: String, parameterName: id | display): `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("findPositionOfCapturingGroup")(markup.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any])).asInstanceOf[`0` | `1`]
  
  inline def findStartOfMentionInPlainText(value: String, config: js.Array[PartialConfig], indexInPlainText: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findStartOfMentionInPlainText")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getEndOfLastMention(value: String, config: PartialConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndOfLastMention")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getMentions(value: String, config: PartialConfig): js.Array[Mention] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Mention]]
  
  inline def getPlainText(value: String, config: PartialConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlainText")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSubstringIndex(str: String, substr: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubstringIndex")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getSubstringIndex(str: String, substr: String, ignoreAccents: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubstringIndex")(str.asInstanceOf[js.Any], substr.asInstanceOf[js.Any], ignoreAccents.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSuggestionHtmlId(prefix: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionHtmlId")(prefix.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSuggestionHtmlId(prefix: String, id: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestionHtmlId")(prefix.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isNumber[T](`val`: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? true : false */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends number ? true : false */ js.Any]
  
  inline def isPlainObject[T](obj: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? false : T extends object ? true : false */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? false : T extends object ? true : false */ js.Any]
  
  inline def iterateMentionsMarkup(value: String, config: js.Array[Config], markupIteratee: MarkupIterateeFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateMentionsMarkup")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], markupIteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def iterateMentionsMarkup(
    value: String,
    config: js.Array[Config],
    markupIteratee: MarkupIterateeFunction,
    textIteratee: TextIterateeFunction
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateMentionsMarkup")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any], markupIteratee.asInstanceOf[js.Any], textIteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def keys[T](obj: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  inline def makeMentionsMarkup(markup: String, id: String, display: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMentionsMarkup")(markup.asInstanceOf[js.Any], id.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def makeMentionsMarkup(markup: String, id: Double, display: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMentionsMarkup")(markup.asInstanceOf[js.Any], id.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mapPlainTextIndex(value: String, markup: String, indexInPlainText: Double, inMarkupCorrection: START | END | NULL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPlainTextIndex")(value.asInstanceOf[js.Any], markup.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any], inMarkupCorrection.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def markupToRegex(markup: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("markupToRegex")(markup.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def merge(target: js.Object, sources: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def mergeDeep[T, S](target: T, source: S): T & S = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S]
  
  inline def normalizeString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def omit(
    obj: js.Object,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type Array<string> | Array<Array<string>> is not an array type */ rest: js.Array[js.Array[String] | String]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def readConfigFromChildren(children: ReactNode): js.Array[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Config]]
  
  inline def spliceString(str: String, start: Double, end: Double, insert: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("spliceString")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], insert.asInstanceOf[js.Any])).asInstanceOf[String]
}
