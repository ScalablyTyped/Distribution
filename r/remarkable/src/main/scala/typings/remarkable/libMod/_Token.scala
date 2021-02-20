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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  @scala.inline
  def AbbrCloseToken(level: Double, `type`: abbr_close): typings.remarkable.libMod.AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.AbbrCloseToken]
  }
  
  @scala.inline
  def AbbrOpenToken(level: Double, title: String, `type`: abbr_open): typings.remarkable.libMod.AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.AbbrOpenToken]
  }
  
  @scala.inline
  def BlockContentToken(level: Double, `type`: String): typings.remarkable.libMod.BlockContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BlockContentToken]
  }
  
  @scala.inline
  def BlockquoteCloseToken(level: Double, `type`: blockquote_close): typings.remarkable.libMod.BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BlockquoteCloseToken]
  }
  
  @scala.inline
  def BlockquoteOpenToken(level: Double, `type`: blockquote_open): typings.remarkable.libMod.BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BlockquoteOpenToken]
  }
  
  @scala.inline
  def BulletListCloseToken(level: Double, `type`: bullet_list_close): typings.remarkable.libMod.BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BulletListCloseToken]
  }
  
  @scala.inline
  def BulletListOpenToken(level: Double, `type`: bullet_list_open): typings.remarkable.libMod.BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BulletListOpenToken]
  }
  
  @scala.inline
  def CodeToken(block: Boolean, level: Double, `type`: code): typings.remarkable.libMod.CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.CodeToken]
  }
  
  @scala.inline
  def ContentToken(level: Double, `type`: String): typings.remarkable.libMod.ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ContentToken]
  }
  
  @scala.inline
  def DdCloseToken(level: Double, `type`: dd_close): typings.remarkable.libMod.DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DdCloseToken]
  }
  
  @scala.inline
  def DdOpenToken(level: Double, `type`: dd_open): typings.remarkable.libMod.DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DdOpenToken]
  }
  
  @scala.inline
  def DelCloseToken(level: Double, `type`: del_open): typings.remarkable.libMod.DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DelCloseToken]
  }
  
  @scala.inline
  def DelOpenToken(level: Double, `type`: del_open): typings.remarkable.libMod.DelOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DelOpenToken]
  }
  
  @scala.inline
  def DlCloseToken(level: Double, `type`: dl_close): typings.remarkable.libMod.DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DlCloseToken]
  }
  
  @scala.inline
  def DlOpenToken(level: Double, `type`: dl_open): typings.remarkable.libMod.DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DlOpenToken]
  }
  
  @scala.inline
  def DtCloseToken(level: Double, `type`: dt_close): typings.remarkable.libMod.DtCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DtCloseToken]
  }
  
  @scala.inline
  def DtOpenToken(level: Double, `type`: dt_open): typings.remarkable.libMod.DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.DtOpenToken]
  }
  
  @scala.inline
  def EmCloseToken(level: Double, `type`: em_close): typings.remarkable.libMod.EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.EmCloseToken]
  }
  
  @scala.inline
  def EmOpenToken(level: Double, `type`: em_open): typings.remarkable.libMod.EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.EmOpenToken]
  }
  
  @scala.inline
  def FenceToken(content: String, level: Double, params: String, `type`: fence): typings.remarkable.libMod.FenceToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FenceToken]
  }
  
  @scala.inline
  def FootnoteAnchorToken(id: Double, level: Double, `type`: footnote_anchor): typings.remarkable.libMod.FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteAnchorToken]
  }
  
  @scala.inline
  def FootnoteBlockCloseToken(level: Double, `type`: footnote_block_close): typings.remarkable.libMod.FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteBlockCloseToken]
  }
  
  @scala.inline
  def FootnoteBlockOpenToken(level: Double, `type`: footnote_block_open): typings.remarkable.libMod.FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteBlockOpenToken]
  }
  
  @scala.inline
  def FootnoteCloseToken(id: Double, level: Double, `type`: footnote_close): typings.remarkable.libMod.FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteCloseToken]
  }
  
  @scala.inline
  def FootnoteGenericToken(id: Double, level: Double, `type`: String): typings.remarkable.libMod.FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteGenericToken]
  }
  
  @scala.inline
  def FootnoteInlineToken(id: Double, level: Double, `type`: footnote_ref): typings.remarkable.libMod.FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteInlineToken]
  }
  
  @scala.inline
  def FootnoteOpenToken(id: Double, level: Double, `type`: footnote_open): typings.remarkable.libMod.FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteOpenToken]
  }
  
  @scala.inline
  def FootnoteReferenceCloseToken(id: Double, level: Double, `type`: footnote_reference_close): typings.remarkable.libMod.FootnoteReferenceCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteReferenceCloseToken]
  }
  
  @scala.inline
  def FootnoteReferenceOpenToken(id: Double, label: String, level: Double, `type`: footnote_reference_open): typings.remarkable.libMod.FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteReferenceOpenToken]
  }
  
  @scala.inline
  def HardbreakToken(level: Double, `type`: hardbreak): typings.remarkable.libMod.HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HardbreakToken]
  }
  
  @scala.inline
  def HeadingCloseToken(hLevel: HeadingValue, level: Double, `type`: heading_close): typings.remarkable.libMod.HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingCloseToken]
  }
  
  @scala.inline
  def HeadingOpenToken(hLevel: HeadingValue, level: Double, `type`: heading_open): typings.remarkable.libMod.HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingOpenToken]
  }
  
  @scala.inline
  def HeadingToken(hLevel: HeadingValue, level: Double, `type`: String): typings.remarkable.libMod.HeadingToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingToken]
  }
  
  @scala.inline
  def HrToken(level: Double, `type`: hr): typings.remarkable.libMod.HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HrToken]
  }
  
  @scala.inline
  def HtmlBlockToken(block: `false`, content: String, level: Double, `type`: htmlblock): typings.remarkable.libMod.HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HtmlBlockToken]
  }
  
  @scala.inline
  def HtmlTagToken(content: String, level: Double, `type`: htmltag): typings.remarkable.libMod.HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HtmlTagToken]
  }
  
  @scala.inline
  def ImageToken(alt: String, level: Double, src: String, title: String, `type`: image): typings.remarkable.libMod.ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ImageToken]
  }
  
  @scala.inline
  def InsCloseToken(level: Double, `type`: ins_close): typings.remarkable.libMod.InsCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.InsCloseToken]
  }
  
  @scala.inline
  def InsOpenToken(level: Double, `type`: ins_open): typings.remarkable.libMod.InsOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.InsOpenToken]
  }
  
  @scala.inline
  def LinkCloseToken(level: Double, `type`: link_close): typings.remarkable.libMod.LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.LinkCloseToken]
  }
  
  @scala.inline
  def LinkOpenToken(href: String, level: Double, `type`: link_open): typings.remarkable.libMod.LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.LinkOpenToken]
  }
  
  @scala.inline
  def ListItemCloseToken(level: Double, `type`: list_item_close): typings.remarkable.libMod.ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ListItemCloseToken]
  }
  
  @scala.inline
  def ListItemOpenToken(level: Double, `type`: list_item_open): typings.remarkable.libMod.ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ListItemOpenToken]
  }
  
  @scala.inline
  def MarkCloseToken(level: Double, `type`: mark_close): typings.remarkable.libMod.MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.MarkCloseToken]
  }
  
  @scala.inline
  def MarkOpenToken(level: Double, `type`: mark_open): typings.remarkable.libMod.MarkOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.MarkOpenToken]
  }
  
  @scala.inline
  def OrderedListCloseToken(level: Double, `type`: ordered_list_close): typings.remarkable.libMod.OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.OrderedListCloseToken]
  }
  
  @scala.inline
  def OrderedListOpenToken(level: Double, order: Double, `type`: ordered_list_open): typings.remarkable.libMod.OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.OrderedListOpenToken]
  }
  
  @scala.inline
  def ParagraphCloseToken(level: Double, tight: Boolean, `type`: paragraph_close): typings.remarkable.libMod.ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphCloseToken]
  }
  
  @scala.inline
  def ParagraphOpenToken(level: Double, tight: Boolean, `type`: paragraph_open): typings.remarkable.libMod.ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphOpenToken]
  }
  
  @scala.inline
  def ParagraphToken(level: Double, tight: Boolean, `type`: String): typings.remarkable.libMod.ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphToken]
  }
  
  @scala.inline
  def SoftbreakToken(level: Double, `type`: softbreak): typings.remarkable.libMod.SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.SoftbreakToken]
  }
  
  @scala.inline
  def StrongCloseToken(level: Double, `type`: strong_close): typings.remarkable.libMod.StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.StrongCloseToken]
  }
  
  @scala.inline
  def StrongOpenToken(level: Double, `type`: strong_open): typings.remarkable.libMod.StrongOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.StrongOpenToken]
  }
  
  @scala.inline
  def SubToken(content: String, level: Double, `type`: sub): typings.remarkable.libMod.SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.SubToken]
  }
  
  @scala.inline
  def SupToken(content: String, level: Double, `type`: sup): typings.remarkable.libMod.SupToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.SupToken]
  }
  
  @scala.inline
  def TBodyCloseToken(level: Double, `type`: tbody_close): typings.remarkable.libMod.TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TBodyCloseToken]
  }
  
  @scala.inline
  def TBodyOpenToken(level: Double, `type`: tbody_open): typings.remarkable.libMod.TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TBodyOpenToken]
  }
  
  @scala.inline
  def TDCloseToken(level: Double, `type`: td_close): typings.remarkable.libMod.TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TDCloseToken]
  }
  
  @scala.inline
  def TDOpenToken(level: Double, `type`: td_open): typings.remarkable.libMod.TDOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TDOpenToken]
  }
  
  @scala.inline
  def THCloseToken(level: Double, `type`: th_close): typings.remarkable.libMod.THCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.THCloseToken]
  }
  
  @scala.inline
  def THOpenToken(level: Double, `type`: th_open): typings.remarkable.libMod.THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.THOpenToken]
  }
  
  @scala.inline
  def THeadCloseToken(level: Double, `type`: thead_close): typings.remarkable.libMod.THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.THeadCloseToken]
  }
  
  @scala.inline
  def THeadOpenToken(level: Double, `type`: thead_open): typings.remarkable.libMod.THeadOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.THeadOpenToken]
  }
  
  @scala.inline
  def TRCloseToken(level: Double, `type`: tr_close): typings.remarkable.libMod.TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TRCloseToken]
  }
  
  @scala.inline
  def TROpenToken(level: Double, `type`: tr_open): typings.remarkable.libMod.TROpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TROpenToken]
  }
  
  @scala.inline
  def TableCloseToken(level: Double, `type`: table_close): typings.remarkable.libMod.TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TableCloseToken]
  }
  
  @scala.inline
  def TableOpenToken(level: Double, `type`: table_open): typings.remarkable.libMod.TableOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TableOpenToken]
  }
  
  @scala.inline
  def TagToken(level: Double, `type`: String): typings.remarkable.libMod.TagToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TagToken]
  }
  
  @scala.inline
  def TextToken(level: Double, `type`: text): typings.remarkable.libMod.TextToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TextToken]
  }
}
