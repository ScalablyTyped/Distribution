package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// ---------------
// Specific Core Tokens
// ---------------
type AbbrToken = typings.remarkable.libMod.TagToken

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type BlockParsingRule = js.Function4[
/* state */ typings.remarkable.libMod.StateBlock, 
/* startLine */ scala.Double, 
/* endLine */ scala.Double, 
/* silent */ scala.Boolean, 
scala.Boolean]

// ---------------
// Specific Block Tokens
// ---------------
type BlockquoteToken = typings.remarkable.libMod.TagToken

type BulletListToken = typings.remarkable.libMod.TagToken

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type CoreParsingRule = js.Function1[/* state */ typings.remarkable.libMod.StateInline, scala.Boolean]

type DelToken = typings.remarkable.libMod.TagToken

type EmToken = typings.remarkable.libMod.TagToken

type Env = org.scalablytyped.runtime.StringDictionary[js.Any]

type FootnoteBlockToken = typings.remarkable.libMod.TagToken

type FootnoteReferenceToken = typings.remarkable.libMod.FootnoteGenericToken

type FootnoteToken = typings.remarkable.libMod.FootnoteGenericToken

type GetBreak = typings.remarkable.libMod.Rule[
typings.remarkable.libMod.ContentToken, 
typings.remarkable.remarkableStrings._empty | typings.remarkable.remarkableStrings.Linefeed]

/**
  * Return `true` if the parsing function has recognized the current position
  * in the input as one if its tokens.
  */
type InlineParsingRule = js.Function2[
/* state */ typings.remarkable.libMod.StateInline, 
/* silent */ scala.Boolean, 
scala.Boolean]

type InsToken = typings.remarkable.libMod.TagToken

type LHeadingCloseToken = typings.remarkable.libMod.HeadingCloseToken

type LHeadingOpenToken = typings.remarkable.libMod.HeadingOpenToken

// ---------------
// Specific Block Tokens
// ---------------
type LinkToken = typings.remarkable.libMod.TagToken

type ListItemToken = typings.remarkable.libMod.TagToken

type MarkToken = typings.remarkable.libMod.TagToken

type OrderedListToken = typings.remarkable.libMod.TagToken

type Plugin = js.Function2[
/* md */ typings.remarkable.libMod.Remarkable, 
/* options */ js.UndefOr[js.Any], 
scala.Unit]

type Rule[T /* <: typings.remarkable.libMod.TagToken */, R /* <: java.lang.String */] = js.Function5[
/* tokens */ js.Array[T], 
/* idx */ scala.Double, 
/* options */ js.UndefOr[typings.remarkable.libMod.Options], 
/* env */ js.UndefOr[typings.remarkable.libMod.Env], 
/* instance */ js.UndefOr[typings.remarkable.libMod.Remarkable], 
R]

type StrongToken = typings.remarkable.libMod.TagToken

type TBodyToken = typings.remarkable.libMod.TagToken

type TDToken = typings.remarkable.libMod.TagToken

type THToken = typings.remarkable.libMod.TagToken

type THeadToken = typings.remarkable.libMod.TagToken

type TRToken = typings.remarkable.libMod.TagToken

type TableToken = typings.remarkable.libMod.TagToken

/* Rewritten from type alias, can be one of: 
  - typings.remarkable.libMod.BlockContentToken
  - typings.remarkable.libMod.ContentToken
  - typings.remarkable.libMod.TagToken
  - typings.remarkable.libMod.BlockquoteToken
  - typings.remarkable.libMod.BlockquoteOpenToken
  - typings.remarkable.libMod.BlockquoteCloseToken
  - typings.remarkable.libMod.CodeToken
  - typings.remarkable.libMod.DlOpenToken
  - typings.remarkable.libMod.DlCloseToken
  - typings.remarkable.libMod.DtOpenToken
  - typings.remarkable.libMod.DtCloseToken
  - typings.remarkable.libMod.DdOpenToken
  - typings.remarkable.libMod.DdCloseToken
  - typings.remarkable.libMod.FenceToken
  - typings.remarkable.libMod.FootnoteGenericToken
  - typings.remarkable.libMod.FootnoteReferenceToken
  - typings.remarkable.libMod.FootnoteReferenceOpenToken
  - typings.remarkable.libMod.FootnoteReferenceCloseToken
  - typings.remarkable.libMod.HeadingToken
  - typings.remarkable.libMod.HeadingOpenToken
  - typings.remarkable.libMod.HeadingCloseToken
  - typings.remarkable.libMod.HrToken
  - typings.remarkable.libMod.HtmlBlockToken
  - typings.remarkable.libMod.LHeadingOpenToken
  - typings.remarkable.libMod.LHeadingCloseToken
  - typings.remarkable.libMod.OrderedListToken
  - typings.remarkable.libMod.OrderedListOpenToken
  - typings.remarkable.libMod.OrderedListCloseToken
  - typings.remarkable.libMod.BulletListToken
  - typings.remarkable.libMod.BulletListOpenToken
  - typings.remarkable.libMod.BulletListCloseToken
  - typings.remarkable.libMod.ListItemToken
  - typings.remarkable.libMod.ListItemOpenToken
  - typings.remarkable.libMod.ListItemCloseToken
  - typings.remarkable.libMod.ParagraphToken
  - typings.remarkable.libMod.ParagraphOpenToken
  - typings.remarkable.libMod.ParagraphCloseToken
  - typings.remarkable.libMod.TextToken
  - typings.remarkable.libMod.StrongToken
  - typings.remarkable.libMod.StrongOpenToken
  - typings.remarkable.libMod.StrongCloseToken
  - typings.remarkable.libMod.TableToken
  - typings.remarkable.libMod.TableOpenToken
  - typings.remarkable.libMod.TableCloseToken
  - typings.remarkable.libMod.THeadToken
  - typings.remarkable.libMod.THeadOpenToken
  - typings.remarkable.libMod.THeadCloseToken
  - typings.remarkable.libMod.TBodyToken
  - typings.remarkable.libMod.TBodyOpenToken
  - typings.remarkable.libMod.TBodyCloseToken
  - typings.remarkable.libMod.TRToken
  - typings.remarkable.libMod.TROpenToken
  - typings.remarkable.libMod.TRCloseToken
  - typings.remarkable.libMod.THToken
  - typings.remarkable.libMod.THOpenToken
  - typings.remarkable.libMod.THCloseToken
  - typings.remarkable.libMod.TDToken
  - typings.remarkable.libMod.TDOpenToken
  - typings.remarkable.libMod.TDCloseToken
  - typings.remarkable.libMod.LinkToken
  - typings.remarkable.libMod.LinkOpenToken
  - typings.remarkable.libMod.LinkCloseToken
  - typings.remarkable.libMod.DelToken
  - typings.remarkable.libMod.DelOpenToken
  - typings.remarkable.libMod.DelCloseToken
  - typings.remarkable.libMod.EmToken
  - typings.remarkable.libMod.EmOpenToken
  - typings.remarkable.libMod.EmCloseToken
  - typings.remarkable.libMod.HardbreakToken
  - typings.remarkable.libMod.SoftbreakToken
  - typings.remarkable.libMod.FootnoteInlineToken
  - typings.remarkable.libMod.HtmlTagToken
  - typings.remarkable.libMod.InsToken
  - typings.remarkable.libMod.InsOpenToken
  - typings.remarkable.libMod.InsCloseToken
  - typings.remarkable.libMod.ImageToken
  - typings.remarkable.libMod.MarkToken
  - typings.remarkable.libMod.MarkOpenToken
  - typings.remarkable.libMod.MarkCloseToken
  - typings.remarkable.libMod.SubToken
  - typings.remarkable.libMod.SupToken
  - typings.remarkable.libMod.AbbrToken
  - typings.remarkable.libMod.AbbrOpenToken
  - typings.remarkable.libMod.AbbrCloseToken
  - typings.remarkable.libMod.FootnoteToken
  - typings.remarkable.libMod.FootnoteOpenToken
  - typings.remarkable.libMod.FootnoteCloseToken
  - typings.remarkable.libMod.FootnoteBlockToken
  - typings.remarkable.libMod.FootnoteBlockOpenToken
  - typings.remarkable.libMod.FootnoteBlockCloseToken
  - typings.remarkable.libMod.FootnoteAnchorToken
*/
type Token = typings.remarkable.libMod._Token | typings.remarkable.libMod.BlockquoteToken | typings.remarkable.libMod.FootnoteReferenceToken | typings.remarkable.libMod.LHeadingOpenToken | typings.remarkable.libMod.LHeadingCloseToken | typings.remarkable.libMod.OrderedListToken | typings.remarkable.libMod.BulletListToken | typings.remarkable.libMod.ListItemToken | typings.remarkable.libMod.StrongToken | typings.remarkable.libMod.TableToken | typings.remarkable.libMod.THeadToken | typings.remarkable.libMod.TBodyToken | typings.remarkable.libMod.TRToken | typings.remarkable.libMod.THToken | typings.remarkable.libMod.TDToken | typings.remarkable.libMod.LinkToken | typings.remarkable.libMod.DelToken | typings.remarkable.libMod.EmToken | typings.remarkable.libMod.InsToken | typings.remarkable.libMod.MarkToken | typings.remarkable.libMod.AbbrToken | typings.remarkable.libMod.FootnoteToken | typings.remarkable.libMod.FootnoteBlockToken
