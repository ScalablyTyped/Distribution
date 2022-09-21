package typings.pugLexer.mod

import typings.pugLexer.mod.^
import typings.pugLexer.pugLexerStrings.Colon
import typings.pugLexer.pugLexerStrings.`end-attributes`
import typings.pugLexer.pugLexerStrings.`end-pipeless-text`
import typings.pugLexer.pugLexerStrings.`end-pug-interpolation`
import typings.pugLexer.pugLexerStrings.`extends`
import typings.pugLexer.pugLexerStrings.`mixin-block`
import typings.pugLexer.pugLexerStrings.`start-attributes`
import typings.pugLexer.pugLexerStrings.`start-pipeless-text`
import typings.pugLexer.pugLexerStrings.`start-pug-interpolation`
import typings.pugLexer.pugLexerStrings.`yield`
import typings.pugLexer.pugLexerStrings.blockcode
import typings.pugLexer.pugLexerStrings.default
import typings.pugLexer.pugLexerStrings.dot
import typings.pugLexer.pugLexerStrings.eos
import typings.pugLexer.pugLexerStrings.include
import typings.pugLexer.pugLexerStrings.newline
import typings.pugLexer.pugLexerStrings.outdent
import typings.pugLexer.pugLexerStrings.slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(str: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
inline def apply(str: String, options: LexerOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]

type BlockcodeToken = LexToken[blockcode]

type ColonToken = LexToken[Colon]

type DefaultToken = LexToken[default]

type DotToken = LexToken[dot]

type EndAttributesToken = LexToken[`end-attributes`]

type EndPipelessTextToken = LexToken[`end-pipeless-text`]

type EndPugInterpolationToken = LexToken[`end-pug-interpolation`]

type EosToken = LexToken[eos]

type ExtendsToken = LexToken[`extends`]

type IncludeToken = LexToken[include]

type LexerFunction = js.Function2[/* type */ String, /* exp */ js.UndefOr[Any], Boolean]

type MixinBlockToken = LexToken[`mixin-block`]

type NewlineToken = LexToken[newline]

type OutdentToken = LexToken[outdent]

type SlashToken = LexToken[slash]

type StartAttributesToken = LexToken[`start-attributes`]

type StartPipelessTextToken = LexToken[`start-pipeless-text`]

type StartPugInterpolationToken = LexToken[`start-pug-interpolation`]

/* Rewritten from type alias, can be one of: 
  - typings.pugLexer.mod.AndAttributesToken
  - typings.pugLexer.mod.AttributeToken
  - typings.pugLexer.mod.BlockcodeToken
  - typings.pugLexer.mod.BlockToken
  - typings.pugLexer.mod.CallToken
  - typings.pugLexer.mod.CaseToken
  - typings.pugLexer.mod.ClassToken
  - typings.pugLexer.mod.CodeToken
  - typings.pugLexer.mod.ColonToken
  - typings.pugLexer.mod.CommentToken
  - typings.pugLexer.mod.DefaultToken
  - typings.pugLexer.mod.DoctypeToken
  - typings.pugLexer.mod.DotToken
  - typings.pugLexer.mod.EachToken
  - typings.pugLexer.mod.EachOfToken
  - typings.pugLexer.mod.ElseIfToken
  - typings.pugLexer.mod.ElseToken
  - typings.pugLexer.mod.EndAttributesToken
  - typings.pugLexer.mod.EndPipelessTextToken
  - typings.pugLexer.mod.EndPugInterpolationToken
  - typings.pugLexer.mod.EosToken
  - typings.pugLexer.mod.ExtendsToken
  - typings.pugLexer.mod.FilterToken
  - typings.pugLexer.mod.IdToken
  - typings.pugLexer.mod.IfToken
  - typings.pugLexer.mod.IncludeToken
  - typings.pugLexer.mod.IndentToken
  - typings.pugLexer.mod.InterpolatedCodeToken
  - typings.pugLexer.mod.InterpolationToken
  - typings.pugLexer.mod.MixinBlockToken
  - typings.pugLexer.mod.MixinToken
  - typings.pugLexer.mod.NewlineToken
  - typings.pugLexer.mod.OutdentToken
  - typings.pugLexer.mod.PathToken
  - typings.pugLexer.mod.SlashToken
  - typings.pugLexer.mod.StartAttributesToken
  - typings.pugLexer.mod.StartPipelessTextToken
  - typings.pugLexer.mod.StartPugInterpolationToken
  - typings.pugLexer.mod.TagToken
  - typings.pugLexer.mod.TextHtmlToken
  - typings.pugLexer.mod.TextToken
  - typings.pugLexer.mod.WhenToken
  - typings.pugLexer.mod.WhileToken
  - typings.pugLexer.mod.YieldToken
*/
type Token = _Token | BlockcodeToken | ColonToken | DefaultToken | DotToken | EndAttributesToken | EndPipelessTextToken | EndPugInterpolationToken | EosToken | ExtendsToken | IncludeToken | MixinBlockToken | NewlineToken | OutdentToken | SlashToken | StartAttributesToken | StartPipelessTextToken | StartPugInterpolationToken | YieldToken

type YieldToken = LexToken[`yield`]
