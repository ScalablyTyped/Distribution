package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.abbr_close
import typings.remarkable.remarkableStrings.abbr_open
import typings.remarkable.remarkableStrings.blockquote_close
import typings.remarkable.remarkableStrings.blockquote_open
import typings.remarkable.remarkableStrings.bullet_list_close
import typings.remarkable.remarkableStrings.bullet_list_open
import typings.remarkable.remarkableStrings.code
import typings.remarkable.remarkableStrings.dd_close
import typings.remarkable.remarkableStrings.dd_open
import typings.remarkable.remarkableStrings.del_open
import typings.remarkable.remarkableStrings.dl_close
import typings.remarkable.remarkableStrings.dl_open
import typings.remarkable.remarkableStrings.dt_close
import typings.remarkable.remarkableStrings.dt_open
import typings.remarkable.remarkableStrings.em_close
import typings.remarkable.remarkableStrings.em_open
import typings.remarkable.remarkableStrings.fence
import typings.remarkable.remarkableStrings.footnote_anchor
import typings.remarkable.remarkableStrings.footnote_block_close
import typings.remarkable.remarkableStrings.footnote_block_open
import typings.remarkable.remarkableStrings.footnote_close
import typings.remarkable.remarkableStrings.footnote_open
import typings.remarkable.remarkableStrings.footnote_ref
import typings.remarkable.remarkableStrings.footnote_reference_close
import typings.remarkable.remarkableStrings.footnote_reference_open
import typings.remarkable.remarkableStrings.hardbreak
import typings.remarkable.remarkableStrings.heading_close
import typings.remarkable.remarkableStrings.heading_open
import typings.remarkable.remarkableStrings.hr
import typings.remarkable.remarkableStrings.htmlblock
import typings.remarkable.remarkableStrings.htmltag
import typings.remarkable.remarkableStrings.image
import typings.remarkable.remarkableStrings.ins_close
import typings.remarkable.remarkableStrings.ins_open
import typings.remarkable.remarkableStrings.link_close
import typings.remarkable.remarkableStrings.link_open
import typings.remarkable.remarkableStrings.list_item_close
import typings.remarkable.remarkableStrings.list_item_open
import typings.remarkable.remarkableStrings.mark_close
import typings.remarkable.remarkableStrings.mark_open
import typings.remarkable.remarkableStrings.ordered_list_close
import typings.remarkable.remarkableStrings.ordered_list_open
import typings.remarkable.remarkableStrings.paragraph_close
import typings.remarkable.remarkableStrings.paragraph_open
import typings.remarkable.remarkableStrings.softbreak
import typings.remarkable.remarkableStrings.strong_close
import typings.remarkable.remarkableStrings.strong_open
import typings.remarkable.remarkableStrings.sub
import typings.remarkable.remarkableStrings.sup
import typings.remarkable.remarkableStrings.table_close
import typings.remarkable.remarkableStrings.table_open
import typings.remarkable.remarkableStrings.tbody_close
import typings.remarkable.remarkableStrings.tbody_open
import typings.remarkable.remarkableStrings.td_close
import typings.remarkable.remarkableStrings.td_open
import typings.remarkable.remarkableStrings.text
import typings.remarkable.remarkableStrings.th_close
import typings.remarkable.remarkableStrings.th_open
import typings.remarkable.remarkableStrings.thead_close
import typings.remarkable.remarkableStrings.thead_open
import typings.remarkable.remarkableStrings.tr_close
import typings.remarkable.remarkableStrings.tr_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Token extends js.Object

object _Token {
  @scala.inline
  def FootnoteAnchorToken(
    id: Double,
    level: Double,
    `type`: footnote_anchor,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteGenericToken(
    id: Double,
    level: Double,
    `type`: String,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ParagraphOpenToken(level: Double, tight: Boolean, `type`: paragraph_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteReferenceCloseToken(
    id: Double,
    level: Double,
    `type`: footnote_reference_close,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ListItemCloseToken(level: Double, `type`: list_item_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def MarkOpenToken(level: Double, `type`: mark_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TableCloseToken(level: Double, `type`: table_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def LinkCloseToken(level: Double, `type`: link_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def BlockContentToken(
    level: Double,
    `type`: String,
    children: js.Array[Token] = null,
    content: String = null,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TROpenToken(level: Double, `type`: tr_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def OrderedListCloseToken(level: Double, `type`: ordered_list_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TextToken(level: Double, `type`: text, content: String = null, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def CodeToken(
    block: Boolean,
    level: Double,
    `type`: code,
    children: js.Array[Token] = null,
    content: String = null,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ParagraphCloseToken(level: Double, tight: Boolean, `type`: paragraph_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def InsOpenToken(level: Double, `type`: ins_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HtmlBlockToken(
    block: `false`,
    content: String,
    level: Double,
    `type`: htmlblock,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def THeadCloseToken(level: Double, `type`: thead_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HeadingOpenToken(hLevel: HeadingValue, level: Double, `type`: heading_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HardbreakToken(level: Double, `type`: hardbreak, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def BulletListCloseToken(level: Double, `type`: bullet_list_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def SubToken(
    content: String,
    level: Double,
    `type`: sub,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DdOpenToken(level: Double, `type`: dd_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def OrderedListOpenToken(level: Double, order: Double, `type`: ordered_list_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TDOpenToken(level: Double, `type`: td_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HeadingToken(hLevel: HeadingValue, level: Double, `type`: String, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FenceToken(
    content: String,
    level: Double,
    params: String,
    `type`: fence,
    block: `false` = null,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TRCloseToken(level: Double, `type`: tr_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def LinkOpenToken(
    href: String,
    level: Double,
    `type`: link_open,
    lines: js.Tuple2[Double, Double] = null,
    title: String = null
  ): _Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteReferenceOpenToken(
    id: Double,
    label: String,
    level: Double,
    `type`: footnote_reference_open,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def BlockquoteOpenToken(level: Double, `type`: blockquote_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ListItemOpenToken(level: Double, `type`: list_item_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def THCloseToken(level: Double, `type`: th_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteOpenToken(
    id: Double,
    level: Double,
    `type`: footnote_open,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def StrongOpenToken(level: Double, `type`: strong_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def EmOpenToken(level: Double, `type`: em_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ContentToken(
    level: Double,
    `type`: String,
    block: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DlCloseToken(level: Double, `type`: dl_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TableOpenToken(level: Double, `type`: table_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteInlineToken(
    id: Double,
    level: Double,
    `type`: footnote_ref,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteBlockOpenToken(level: Double, `type`: footnote_block_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TBodyOpenToken(level: Double, `type`: tbody_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteBlockCloseToken(level: Double, `type`: footnote_block_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DelOpenToken(level: Double, `type`: del_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TBodyCloseToken(level: Double, `type`: tbody_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def BlockquoteCloseToken(level: Double, `type`: blockquote_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HeadingCloseToken(
    hLevel: HeadingValue,
    level: Double,
    `type`: heading_close,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ParagraphToken(level: Double, tight: Boolean, `type`: String, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def THeadOpenToken(level: Double, `type`: thead_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def InsCloseToken(level: Double, `type`: ins_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TDCloseToken(level: Double, `type`: td_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HrToken(level: Double, `type`: hr, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def MarkCloseToken(level: Double, `type`: mark_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DtCloseToken(level: Double, `type`: dt_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def StrongCloseToken(level: Double, `type`: strong_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DlOpenToken(level: Double, `type`: dl_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def AbbrCloseToken(level: Double, `type`: abbr_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def AbbrOpenToken(level: Double, title: String, `type`: abbr_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def THOpenToken(level: Double, `type`: th_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def FootnoteCloseToken(
    id: Double,
    level: Double,
    `type`: footnote_close,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): _Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def SoftbreakToken(level: Double, `type`: softbreak, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def BulletListOpenToken(level: Double, `type`: bullet_list_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DdCloseToken(level: Double, `type`: dd_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def HtmlTagToken(
    content: String,
    level: Double,
    `type`: htmltag,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def ImageToken(
    alt: String,
    level: Double,
    src: String,
    title: String,
    `type`: image,
    block: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def EmCloseToken(level: Double, `type`: em_close, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def SupToken(
    content: String,
    level: Double,
    `type`: sup,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): _Token = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DtOpenToken(level: Double, `type`: dt_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def TagToken(level: Double, `type`: String, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
  @scala.inline
  def DelCloseToken(level: Double, `type`: del_open, lines: js.Tuple2[Double, Double] = null): _Token = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Token]
  }
}

