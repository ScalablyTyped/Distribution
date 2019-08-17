package typings.remarkable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.remarkable.remarkableStrings.BACKSLASHn
  import typings.remarkable.remarkableStrings.Empty

  // ---------------
  // Specific Core Tokens
  // ---------------
  type AbbrToken = TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type BlockParsingRule = js.Function4[
    /* state */ StateBlock, 
    /* startLine */ Double, 
    /* endLine */ Double, 
    /* silent */ Boolean, 
    Boolean
  ]
  // ---------------
  // Specific Block Tokens
  // ---------------
  type BlockquoteToken = TagToken
  type BulletListToken = TagToken
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type CoreParsingRule = js.Function1[/* state */ StateInline, Boolean]
  type DelToken = TagToken
  type EmToken = TagToken
  type Env = StringDictionary[js.Any]
  type FootnoteBlockToken = TagToken
  type FootnoteReferenceToken = FootnoteGenericToken
  type FootnoteToken = FootnoteGenericToken
  type GetBreak = Rule[ContentToken, Empty | BACKSLASHn]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type InlineParsingRule = js.Function2[/* state */ StateInline, /* silent */ Boolean, Boolean]
  type InsToken = TagToken
  type LHeadingCloseToken = HeadingCloseToken
  type LHeadingOpenToken = HeadingOpenToken
  // ---------------
  // Specific Block Tokens
  // ---------------
  type LinkToken = TagToken
  type ListItemToken = TagToken
  type MarkToken = TagToken
  type OrderedListToken = TagToken
  type Plugin = js.Function2[/* md */ Remarkable, /* options */ js.UndefOr[js.Any], Unit]
  type Rule[T /* <: TagToken */, R /* <: String */] = js.Function5[
    /* tokens */ js.Array[T], 
    /* idx */ Double, 
    /* options */ js.UndefOr[Options], 
    /* env */ js.UndefOr[Env], 
    /* instance */ js.UndefOr[Remarkable], 
    R
  ]
  type StrongToken = TagToken
  type TBodyToken = TagToken
  type TDToken = TagToken
  type THToken = TagToken
  type THeadToken = TagToken
  type TRToken = TagToken
  type TableToken = TagToken
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
  type Token = _Token | BlockquoteToken | FootnoteReferenceToken | LHeadingOpenToken | LHeadingCloseToken | OrderedListToken | BulletListToken | ListItemToken | StrongToken | TableToken | THeadToken | TBodyToken | TRToken | THToken | TDToken | LinkToken | DelToken | EmToken | InsToken | MarkToken | AbbrToken | FootnoteToken | FootnoteBlockToken
}
