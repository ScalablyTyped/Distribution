package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  @scala.inline
  def AbbrCloseToken(level: Double): typings.remarkable.libMod.AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("abbr_close")
    __obj.asInstanceOf[typings.remarkable.libMod.AbbrCloseToken]
  }
  
  @scala.inline
  def AbbrOpenToken(level: Double, title: String): typings.remarkable.libMod.AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("abbr_open")
    __obj.asInstanceOf[typings.remarkable.libMod.AbbrOpenToken]
  }
  
  @scala.inline
  def BlockContentToken(level: Double, `type`: String): typings.remarkable.libMod.BlockContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.BlockContentToken]
  }
  
  @scala.inline
  def BlockquoteCloseToken(level: Double): typings.remarkable.libMod.BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_close")
    __obj.asInstanceOf[typings.remarkable.libMod.BlockquoteCloseToken]
  }
  
  @scala.inline
  def BlockquoteOpenToken(level: Double): typings.remarkable.libMod.BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_open")
    __obj.asInstanceOf[typings.remarkable.libMod.BlockquoteOpenToken]
  }
  
  @scala.inline
  def BulletListCloseToken(level: Double): typings.remarkable.libMod.BulletListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bullet_list_close")
    __obj.asInstanceOf[typings.remarkable.libMod.BulletListCloseToken]
  }
  
  @scala.inline
  def BulletListOpenToken(level: Double): typings.remarkable.libMod.BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bullet_list_open")
    __obj.asInstanceOf[typings.remarkable.libMod.BulletListOpenToken]
  }
  
  @scala.inline
  def CodeToken(block: Boolean, level: Double): typings.remarkable.libMod.CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[typings.remarkable.libMod.CodeToken]
  }
  
  @scala.inline
  def ContentToken(level: Double, `type`: String): typings.remarkable.libMod.ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ContentToken]
  }
  
  @scala.inline
  def DdCloseToken(level: Double): typings.remarkable.libMod.DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dd_close")
    __obj.asInstanceOf[typings.remarkable.libMod.DdCloseToken]
  }
  
  @scala.inline
  def DdOpenToken(level: Double): typings.remarkable.libMod.DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dd_open")
    __obj.asInstanceOf[typings.remarkable.libMod.DdOpenToken]
  }
  
  @scala.inline
  def DelCloseToken(level: Double): typings.remarkable.libMod.DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del_open")
    __obj.asInstanceOf[typings.remarkable.libMod.DelCloseToken]
  }
  
  @scala.inline
  def DelOpenToken(level: Double): typings.remarkable.libMod.DelOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del_open")
    __obj.asInstanceOf[typings.remarkable.libMod.DelOpenToken]
  }
  
  @scala.inline
  def DlCloseToken(level: Double): typings.remarkable.libMod.DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dl_close")
    __obj.asInstanceOf[typings.remarkable.libMod.DlCloseToken]
  }
  
  @scala.inline
  def DlOpenToken(level: Double): typings.remarkable.libMod.DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dl_open")
    __obj.asInstanceOf[typings.remarkable.libMod.DlOpenToken]
  }
  
  @scala.inline
  def DtCloseToken(level: Double): typings.remarkable.libMod.DtCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dt_close")
    __obj.asInstanceOf[typings.remarkable.libMod.DtCloseToken]
  }
  
  @scala.inline
  def DtOpenToken(level: Double): typings.remarkable.libMod.DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dt_open")
    __obj.asInstanceOf[typings.remarkable.libMod.DtOpenToken]
  }
  
  @scala.inline
  def EmCloseToken(level: Double): typings.remarkable.libMod.EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em_close")
    __obj.asInstanceOf[typings.remarkable.libMod.EmCloseToken]
  }
  
  @scala.inline
  def EmOpenToken(level: Double): typings.remarkable.libMod.EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em_open")
    __obj.asInstanceOf[typings.remarkable.libMod.EmOpenToken]
  }
  
  @scala.inline
  def FenceToken(content: String, level: Double, params: String): typings.remarkable.libMod.FenceToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fence")
    __obj.asInstanceOf[typings.remarkable.libMod.FenceToken]
  }
  
  @scala.inline
  def FootnoteAnchorToken(id: Double, level: Double): typings.remarkable.libMod.FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_anchor")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteAnchorToken]
  }
  
  @scala.inline
  def FootnoteBlockCloseToken(level: Double): typings.remarkable.libMod.FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_block_close")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteBlockCloseToken]
  }
  
  @scala.inline
  def FootnoteBlockOpenToken(level: Double): typings.remarkable.libMod.FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_block_open")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteBlockOpenToken]
  }
  
  @scala.inline
  def FootnoteCloseToken(id: Double, level: Double): typings.remarkable.libMod.FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_close")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteCloseToken]
  }
  
  @scala.inline
  def FootnoteGenericToken(id: Double, level: Double, `type`: String): typings.remarkable.libMod.FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteGenericToken]
  }
  
  @scala.inline
  def FootnoteInlineToken(id: Double, level: Double): typings.remarkable.libMod.FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_ref")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteInlineToken]
  }
  
  @scala.inline
  def FootnoteOpenToken(id: Double, level: Double): typings.remarkable.libMod.FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_open")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteOpenToken]
  }
  
  @scala.inline
  def FootnoteReferenceCloseToken(id: Double, level: Double): typings.remarkable.libMod.FootnoteReferenceCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_reference_close")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteReferenceCloseToken]
  }
  
  @scala.inline
  def FootnoteReferenceOpenToken(id: Double, label: String, level: Double): typings.remarkable.libMod.FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote_reference_open")
    __obj.asInstanceOf[typings.remarkable.libMod.FootnoteReferenceOpenToken]
  }
  
  @scala.inline
  def HardbreakToken(level: Double): typings.remarkable.libMod.HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hardbreak")
    __obj.asInstanceOf[typings.remarkable.libMod.HardbreakToken]
  }
  
  @scala.inline
  def HeadingCloseToken(hLevel: HeadingValue, level: Double): typings.remarkable.libMod.HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading_close")
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingCloseToken]
  }
  
  @scala.inline
  def HeadingOpenToken(hLevel: HeadingValue, level: Double): typings.remarkable.libMod.HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading_open")
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingOpenToken]
  }
  
  @scala.inline
  def HeadingToken(hLevel: HeadingValue, level: Double, `type`: String): typings.remarkable.libMod.HeadingToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.HeadingToken]
  }
  
  @scala.inline
  def HrToken(level: Double): typings.remarkable.libMod.HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[typings.remarkable.libMod.HrToken]
  }
  
  @scala.inline
  def HtmlBlockToken(content: String, level: Double): typings.remarkable.libMod.HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = false, content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("htmlblock")
    __obj.asInstanceOf[typings.remarkable.libMod.HtmlBlockToken]
  }
  
  @scala.inline
  def HtmlTagToken(content: String, level: Double): typings.remarkable.libMod.HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("htmltag")
    __obj.asInstanceOf[typings.remarkable.libMod.HtmlTagToken]
  }
  
  @scala.inline
  def ImageToken(alt: String, level: Double, src: String, title: String): typings.remarkable.libMod.ImageToken = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.remarkable.libMod.ImageToken]
  }
  
  @scala.inline
  def InsCloseToken(level: Double): typings.remarkable.libMod.InsCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ins_close")
    __obj.asInstanceOf[typings.remarkable.libMod.InsCloseToken]
  }
  
  @scala.inline
  def InsOpenToken(level: Double): typings.remarkable.libMod.InsOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ins_open")
    __obj.asInstanceOf[typings.remarkable.libMod.InsOpenToken]
  }
  
  @scala.inline
  def LinkCloseToken(level: Double): typings.remarkable.libMod.LinkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link_close")
    __obj.asInstanceOf[typings.remarkable.libMod.LinkCloseToken]
  }
  
  @scala.inline
  def LinkOpenToken(href: String, level: Double): typings.remarkable.libMod.LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link_open")
    __obj.asInstanceOf[typings.remarkable.libMod.LinkOpenToken]
  }
  
  @scala.inline
  def ListItemCloseToken(level: Double): typings.remarkable.libMod.ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item_close")
    __obj.asInstanceOf[typings.remarkable.libMod.ListItemCloseToken]
  }
  
  @scala.inline
  def ListItemOpenToken(level: Double): typings.remarkable.libMod.ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item_open")
    __obj.asInstanceOf[typings.remarkable.libMod.ListItemOpenToken]
  }
  
  @scala.inline
  def MarkCloseToken(level: Double): typings.remarkable.libMod.MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mark_close")
    __obj.asInstanceOf[typings.remarkable.libMod.MarkCloseToken]
  }
  
  @scala.inline
  def MarkOpenToken(level: Double): typings.remarkable.libMod.MarkOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mark_open")
    __obj.asInstanceOf[typings.remarkable.libMod.MarkOpenToken]
  }
  
  @scala.inline
  def OrderedListCloseToken(level: Double): typings.remarkable.libMod.OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordered_list_close")
    __obj.asInstanceOf[typings.remarkable.libMod.OrderedListCloseToken]
  }
  
  @scala.inline
  def OrderedListOpenToken(level: Double, order: Double): typings.remarkable.libMod.OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordered_list_open")
    __obj.asInstanceOf[typings.remarkable.libMod.OrderedListOpenToken]
  }
  
  @scala.inline
  def ParagraphCloseToken(level: Double, tight: Boolean): typings.remarkable.libMod.ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph_close")
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphCloseToken]
  }
  
  @scala.inline
  def ParagraphOpenToken(level: Double, tight: Boolean): typings.remarkable.libMod.ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph_open")
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphOpenToken]
  }
  
  @scala.inline
  def ParagraphToken(level: Double, tight: Boolean, `type`: String): typings.remarkable.libMod.ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.ParagraphToken]
  }
  
  @scala.inline
  def SoftbreakToken(level: Double): typings.remarkable.libMod.SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("softbreak")
    __obj.asInstanceOf[typings.remarkable.libMod.SoftbreakToken]
  }
  
  @scala.inline
  def StrongCloseToken(level: Double): typings.remarkable.libMod.StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong_close")
    __obj.asInstanceOf[typings.remarkable.libMod.StrongCloseToken]
  }
  
  @scala.inline
  def StrongOpenToken(level: Double): typings.remarkable.libMod.StrongOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong_open")
    __obj.asInstanceOf[typings.remarkable.libMod.StrongOpenToken]
  }
  
  @scala.inline
  def SubToken(content: String, level: Double): typings.remarkable.libMod.SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sub")
    __obj.asInstanceOf[typings.remarkable.libMod.SubToken]
  }
  
  @scala.inline
  def SupToken(content: String, level: Double): typings.remarkable.libMod.SupToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sup")
    __obj.asInstanceOf[typings.remarkable.libMod.SupToken]
  }
  
  @scala.inline
  def TBodyCloseToken(level: Double): typings.remarkable.libMod.TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tbody_close")
    __obj.asInstanceOf[typings.remarkable.libMod.TBodyCloseToken]
  }
  
  @scala.inline
  def TBodyOpenToken(level: Double): typings.remarkable.libMod.TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tbody_open")
    __obj.asInstanceOf[typings.remarkable.libMod.TBodyOpenToken]
  }
  
  @scala.inline
  def TDCloseToken(level: Double): typings.remarkable.libMod.TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("td_close")
    __obj.asInstanceOf[typings.remarkable.libMod.TDCloseToken]
  }
  
  @scala.inline
  def TDOpenToken(level: Double): typings.remarkable.libMod.TDOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("td_open")
    __obj.asInstanceOf[typings.remarkable.libMod.TDOpenToken]
  }
  
  @scala.inline
  def THCloseToken(level: Double): typings.remarkable.libMod.THCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("th_close")
    __obj.asInstanceOf[typings.remarkable.libMod.THCloseToken]
  }
  
  @scala.inline
  def THOpenToken(level: Double): typings.remarkable.libMod.THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("th_open")
    __obj.asInstanceOf[typings.remarkable.libMod.THOpenToken]
  }
  
  @scala.inline
  def THeadCloseToken(level: Double): typings.remarkable.libMod.THeadCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thead_close")
    __obj.asInstanceOf[typings.remarkable.libMod.THeadCloseToken]
  }
  
  @scala.inline
  def THeadOpenToken(level: Double): typings.remarkable.libMod.THeadOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("thead_open")
    __obj.asInstanceOf[typings.remarkable.libMod.THeadOpenToken]
  }
  
  @scala.inline
  def TRCloseToken(level: Double): typings.remarkable.libMod.TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tr_close")
    __obj.asInstanceOf[typings.remarkable.libMod.TRCloseToken]
  }
  
  @scala.inline
  def TROpenToken(level: Double): typings.remarkable.libMod.TROpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tr_open")
    __obj.asInstanceOf[typings.remarkable.libMod.TROpenToken]
  }
  
  @scala.inline
  def TableCloseToken(level: Double): typings.remarkable.libMod.TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table_close")
    __obj.asInstanceOf[typings.remarkable.libMod.TableCloseToken]
  }
  
  @scala.inline
  def TableOpenToken(level: Double): typings.remarkable.libMod.TableOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table_open")
    __obj.asInstanceOf[typings.remarkable.libMod.TableOpenToken]
  }
  
  @scala.inline
  def TagToken(level: Double, `type`: String): typings.remarkable.libMod.TagToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.remarkable.libMod.TagToken]
  }
  
  @scala.inline
  def TextToken(level: Double): typings.remarkable.libMod.TextToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.remarkable.libMod.TextToken]
  }
}
