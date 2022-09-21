package typings.pugLexer.mod

import typings.pugLexer.anon.MustEscape
import typings.pugLexer.pugLexerBooleans.`true`
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pug-lexer", "Lexer")
@js.native
open class Lexer protected () extends StObject {
  def this(str: String) = this()
  def this(str: String, options: LexerOptions) = this()
  
  def default(): js.UndefOr[`true`] = js.native
  
  def addText(`type`: LexTokenType, value: String): Unit = js.native
  def addText(`type`: LexTokenType, value: String, prefix: String): Unit = js.native
  def addText(`type`: LexTokenType, value: String, prefix: String, escaped: Double): Unit = js.native
  def addText(`type`: LexTokenType, value: String, prefix: Unit, escaped: Double): Unit = js.native
  
  /* private */ def advance(): Boolean = js.native
  
  def append(): js.UndefOr[`true`] = js.native
  
  def assert(value: Any, message: String): Unit = js.native
  
  def assertExpression(exp: String): Boolean = js.native
  def assertExpression(exp: String, noThrow: Boolean): Boolean = js.native
  
  def assertNestingCorrect(exp: String): Unit = js.native
  
  def attribute(): String = js.native
  
  def attributeValue(str: String): MustEscape = js.native
  
  def attributesBlock(): js.UndefOr[`true`] = js.native
  
  def attrs(): js.UndefOr[`true`] = js.native
  
  def blank(): js.UndefOr[`true`] = js.native
  
  def block(): js.UndefOr[`true`] = js.native
  
  def blockCode(): js.UndefOr[`true`] = js.native
  
  /* private */ def bracketExpression(): Double = js.native
  /* private */ def bracketExpression(skip: Double): Double = js.native
  
  def call(): js.UndefOr[`true`] = js.native
  
  def callLexerFunction(func: String): Boolean = js.native
  
  def `case`(): js.UndefOr[`true`] = js.native
  
  def className(): js.UndefOr[`true`] = js.native
  
  def code(): js.UndefOr[`true`] = js.native
  
  var colno: Double = js.native
  
  def colon(): js.UndefOr[`true`] = js.native
  
  def comment(): js.UndefOr[`true`] = js.native
  
  def conditional(): js.UndefOr[`true`] = js.native
  
  /* private */ def consume(len: Double): Unit = js.native
  
  def doctype(): js.UndefOr[`true`] = js.native
  
  def dot(): js.UndefOr[`true`] = js.native
  
  def each(): js.UndefOr[`true`] = js.native
  
  def eachOf(): js.UndefOr[`true`] = js.native
  
  def endInterpolation(): js.UndefOr[`true`] = js.native
  
  var ended: Boolean = js.native
  
  def eos(): js.UndefOr[`true`] = js.native
  
  def error(code: String, message: String): scala.Nothing = js.native
  
  def `extends`(): js.UndefOr[`true`] = js.native
  
  def fail(): scala.Nothing = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  def filter(): js.UndefOr[`true`] = js.native
  
  def getTokens(): js.Array[Token] = js.native
  
  def id(): js.UndefOr[`true`] = js.native
  
  def include(): js.UndefOr[`true`] = js.native
  
  /* private */ def incrementColumn(increment: Double): Unit = js.native
  
  /* private */ def incrementLine(increment: Double): Unit = js.native
  
  def indent(): js.UndefOr[`true` | NewlineToken] = js.native
  
  var indentRe: js.RegExp | Null = js.native
  
  var indentStack: js.Array[Double] = js.native
  
  var input: String = js.native
  
  var interpolated: Boolean = js.native
  
  def interpolation(): js.UndefOr[`true`] = js.native
  
  var interpolationAllowed: Boolean = js.native
  
  def isExpression(exp: String): Boolean = js.native
  
  var lineno: Double = js.native
  
  def mixin(): js.UndefOr[`true`] = js.native
  
  def mixinBlock(): js.UndefOr[`true`] = js.native
  
  var originalInput: String = js.native
  
  def path(): js.UndefOr[`true`] = js.native
  
  def pipelessText(): js.UndefOr[Boolean] = js.native
  def pipelessText(indents: Double): js.UndefOr[Boolean] = js.native
  
  var plugins: js.Array[LexerFunction] = js.native
  
  def prepend(): js.UndefOr[`true`] = js.native
  
  /* private */ def scan[Type /* <: LexTokenType */](regexp: js.RegExp, `type`: Type): js.UndefOr[LexToken[Type]] = js.native
  
  /* private */ def scanEndOfLine[Type /* <: LexTokenType */](regexp: js.RegExp, `type`: Type): js.UndefOr[LexToken[Type]] = js.native
  
  def scanIndentation(): RegExpExecArray | Null = js.native
  
  def slash(): js.UndefOr[`true`] = js.native
  
  def tag(): js.UndefOr[`true`] = js.native
  
  def text(): js.UndefOr[`true`] = js.native
  
  def textHtml(): js.UndefOr[`true`] = js.native
  
  /* private */ def tok[Type /* <: LexTokenType */](`type`: Type): LexToken[Type] = js.native
  /* private */ def tok[Type /* <: LexTokenType */](`type`: Type, `val`: Any): LexToken[Type] = js.native
  
  /* private */ def tokEnd[Type /* <: LexTokenType */](tok: LexToken[Type]): LexToken[Type] = js.native
  
  var tokens: js.Array[Token] = js.native
  
  def when(): js.UndefOr[`true`] = js.native
  
  def `while`(): js.UndefOr[`true`] = js.native
  
  var whitespaceRe: js.RegExp = js.native
  
  def `yield`(): js.UndefOr[`true`] = js.native
}
