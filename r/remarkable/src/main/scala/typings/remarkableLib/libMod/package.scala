package typings
package remarkableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
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
    /* startLine */ scala.Double, 
    /* endLine */ scala.Double, 
    /* silent */ scala.Boolean, 
    scala.Boolean
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
  type CoreParsingRule = js.Function1[/* state */ StateInline, scala.Boolean]
  type DelToken = TagToken
  type EmToken = TagToken
  type Env = org.scalablytyped.runtime.StringDictionary[js.Any]
  type FootnoteBlockToken = TagToken
  type FootnoteReferenceToken = FootnoteGenericToken
  type FootnoteToken = FootnoteGenericToken
  type GetBreak = Rule[
    ContentToken, 
    remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn
  ]
  /**
    * Return `true` if the parsing function has recognized the current position
    * in the input as one if its tokens.
    */
  type InlineParsingRule = js.Function2[/* state */ StateInline, /* silent */ scala.Boolean, scala.Boolean]
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
  type Plugin = js.Function2[/* md */ Remarkable, /* options */ js.UndefOr[js.Any], scala.Unit]
  type Rule[T /* <: TagToken */, R /* <: java.lang.String */] = js.Function5[
    /* tokens */ js.Array[T], 
    /* idx */ scala.Double, 
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
    - BlockContentToken
    - ContentToken
    - TagToken
    - BlockquoteToken
    - BlockquoteOpenToken
    - BlockquoteCloseToken
    - CodeToken
    - DlOpenToken
    - DlCloseToken
    - DtOpenToken
    - DtCloseToken
    - DdOpenToken
    - DdCloseToken
    - FenceToken
    - FootnoteGenericToken
    - FootnoteReferenceToken
    - FootnoteReferenceOpenToken
    - FootnoteReferenceCloseToken
    - HeadingToken
    - HeadingOpenToken
    - HeadingCloseToken
    - HrToken
    - HtmlBlockToken
    - LHeadingOpenToken
    - LHeadingCloseToken
    - OrderedListToken
    - OrderedListOpenToken
    - OrderedListCloseToken
    - BulletListToken
    - BulletListOpenToken
    - BulletListCloseToken
    - ListItemToken
    - ListItemOpenToken
    - ListItemCloseToken
    - ParagraphToken
    - ParagraphOpenToken
    - ParagraphCloseToken
    - TextToken
    - StrongToken
    - StrongOpenToken
    - StrongCloseToken
    - TableToken
    - TableOpenToken
    - TableCloseToken
    - THeadToken
    - THeadOpenToken
    - THeadCloseToken
    - TBodyToken
    - TBodyOpenToken
    - TBodyCloseToken
    - TRToken
    - TROpenToken
    - TRCloseToken
    - THToken
    - THOpenToken
    - THCloseToken
    - TDToken
    - TDOpenToken
    - TDCloseToken
    - LinkToken
    - LinkOpenToken
    - LinkCloseToken
    - DelToken
    - DelOpenToken
    - DelCloseToken
    - EmToken
    - EmOpenToken
    - EmCloseToken
    - HardbreakToken
    - SoftbreakToken
    - FootnoteInlineToken
    - HtmlTagToken
    - InsToken
    - InsOpenToken
    - InsCloseToken
    - ImageToken
    - MarkToken
    - MarkOpenToken
    - MarkCloseToken
    - SubToken
    - SupToken
    - AbbrToken
    - AbbrOpenToken
    - AbbrCloseToken
    - FootnoteToken
    - FootnoteOpenToken
    - FootnoteCloseToken
    - FootnoteBlockToken
    - FootnoteBlockOpenToken
    - FootnoteBlockCloseToken
    - FootnoteAnchorToken
  */
  type Token = _Token | BlockquoteToken | FootnoteReferenceToken | LHeadingOpenToken | LHeadingCloseToken | OrderedListToken | BulletListToken | ListItemToken | StrongToken | TableToken | THeadToken | TBodyToken | TRToken | THToken | TDToken | LinkToken | DelToken | EmToken | InsToken | MarkToken | AbbrToken | FootnoteToken | FootnoteBlockToken
}
