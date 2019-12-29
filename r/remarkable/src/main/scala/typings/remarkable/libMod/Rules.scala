package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import typings.remarkable.remarkableStrings.Linefeed
import typings.remarkable.remarkableStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renderer rules.
  */
@js.native
trait Rules extends /* name */ StringDictionary[(Rule[TagToken, String]) | (StringDictionary[Rule[ContentToken, String]])] {
  @JSName("abbr_close")
  var abbr_close_Original: Rule[AbbrCloseToken, String] = js.native
  @JSName("abbr_open")
  var abbr_open_Original: Rule[AbbrOpenToken, String] = js.native
  @JSName("blockquote_close")
  var blockquote_close_Original: Rule[BlockquoteCloseToken, String] = js.native
  @JSName("blockquote_open")
  var blockquote_open_Original: Rule[BlockquoteOpenToken, String] = js.native
  @JSName("bullet_list_close")
  var bullet_list_close_Original: Rule[BulletListCloseToken, String] = js.native
  @JSName("bullet_list_open")
  var bullet_list_open_Original: Rule[BulletListOpenToken, String] = js.native
  @JSName("code")
  var code_Original: Rule[CodeToken, String] = js.native
  @JSName("dd_close")
  var dd_close_Original: Rule[DdCloseToken, String] = js.native
  @JSName("dd_open")
  var dd_open_Original: Rule[DdOpenToken, String] = js.native
  @JSName("del_close")
  var del_close_Original: Rule[DelCloseToken, String] = js.native
  @JSName("del_open")
  var del_open_Original: Rule[DelOpenToken, String] = js.native
  @JSName("dl_close")
  var dl_close_Original: Rule[DlCloseToken, String] = js.native
  @JSName("dl_open")
  var dl_open_Original: Rule[DlOpenToken, String] = js.native
  @JSName("dt_close")
  var dt_close_Original: Rule[DtCloseToken, String] = js.native
  @JSName("dt_open")
  var dt_open_Original: Rule[DtOpenToken, String] = js.native
  @JSName("em_close")
  var em_close_Original: Rule[EmCloseToken, String] = js.native
  @JSName("em_open")
  var em_open_Original: Rule[EmOpenToken, String] = js.native
  @JSName("fence")
  var fence_Original: Rule[FenceToken, String] = js.native
  var fence_custom: StringDictionary[Rule[FenceToken, String]] = js.native
  @JSName("footnote_anchor")
  var footnote_anchor_Original: Rule[FootnoteAnchorToken, String] = js.native
  @JSName("footnote_block_close")
  var footnote_block_close_Original: Rule[FootnoteBlockCloseToken, String] = js.native
  @JSName("footnote_block_open")
  var footnote_block_open_Original: Rule[FootnoteBlockOpenToken, String] = js.native
  @JSName("footnote_close")
  var footnote_close_Original: Rule[FootnoteCloseToken, String] = js.native
  @JSName("footnote_open")
  var footnote_open_Original: Rule[FootnoteOpenToken, String] = js.native
  @JSName("footnote_ref")
  var footnote_ref_Original: Rule[FootnoteInlineToken, String] = js.native
  /**
    * Check to see if `\n` is needed before the next token.
    */
  @JSName("getBreak")
  var getBreak_Original: GetBreak = js.native
  @JSName("hardbreak")
  var hardbreak_Original: Rule[HardbreakToken, String] = js.native
  @JSName("heading_close")
  var heading_close_Original: Rule[HeadingCloseToken, String] = js.native
  @JSName("heading_open")
  var heading_open_Original: Rule[HeadingOpenToken, String] = js.native
  @JSName("hr")
  var hr_Original: Rule[HrToken, String] = js.native
  @JSName("htmlblock")
  var htmlblock_Original: Rule[HtmlBlockToken, String] = js.native
  @JSName("htmltag")
  var htmltag_Original: Rule[HtmlTagToken, String] = js.native
  @JSName("image")
  var image_Original: Rule[ImageToken, String] = js.native
  @JSName("ins_close")
  var ins_close_Original: Rule[InsCloseToken, String] = js.native
  @JSName("ins_open")
  var ins_open_Original: Rule[InsOpenToken, String] = js.native
  @JSName("link_close")
  var link_close_Original: Rule[LinkCloseToken, String] = js.native
  @JSName("link_open")
  var link_open_Original: Rule[LinkOpenToken, String] = js.native
  @JSName("list_item_close")
  var list_item_close_Original: Rule[ListItemCloseToken, String] = js.native
  @JSName("list_item_open")
  var list_item_open_Original: Rule[ListItemOpenToken, String] = js.native
  @JSName("mark_close")
  var mark_close_Original: Rule[MarkCloseToken, String] = js.native
  @JSName("mark_open")
  var mark_open_Original: Rule[MarkOpenToken, String] = js.native
  @JSName("ordered_list_close")
  var ordered_list_close_Original: Rule[OrderedListCloseToken, String] = js.native
  @JSName("ordered_list_open")
  var ordered_list_open_Original: Rule[OrderedListOpenToken, String] = js.native
  @JSName("paragraph_close")
  var paragraph_close_Original: Rule[ParagraphCloseToken, String] = js.native
  @JSName("paragraph_open")
  var paragraph_open_Original: Rule[ParagraphOpenToken, String] = js.native
  @JSName("softbreak")
  var softbreak_Original: Rule[SoftbreakToken, String] = js.native
  @JSName("strong_close")
  var strong_close_Original: Rule[StrongCloseToken, String] = js.native
  @JSName("strong_open")
  var strong_open_Original: Rule[StrongOpenToken, String] = js.native
  @JSName("sub")
  var sub_Original: Rule[SubToken, String] = js.native
  @JSName("sup")
  var sup_Original: Rule[SupToken, String] = js.native
  @JSName("table_close")
  var table_close_Original: Rule[TableCloseToken, String] = js.native
  @JSName("table_open")
  var table_open_Original: Rule[TableOpenToken, String] = js.native
  @JSName("tbody_close")
  var tbody_close_Original: Rule[TBodyCloseToken, String] = js.native
  @JSName("tbody_open")
  var tbody_open_Original: Rule[TBodyOpenToken, String] = js.native
  @JSName("td_close")
  var td_close_Original: Rule[TDCloseToken, String] = js.native
  @JSName("td_open")
  var td_open_Original: Rule[TDOpenToken, String] = js.native
  @JSName("text")
  var text_Original: Rule[TextToken, String] = js.native
  @JSName("th_close")
  var th_close_Original: Rule[THCloseToken, String] = js.native
  @JSName("th_open")
  var th_open_Original: Rule[THOpenToken, String] = js.native
  @JSName("thead_close")
  var thead_close_Original: Rule[THeadCloseToken, String] = js.native
  @JSName("thead_open")
  var thead_open_Original: Rule[THeadOpenToken, String] = js.native
  @JSName("tr_close")
  var tr_close_Original: Rule[TRCloseToken, String] = js.native
  @JSName("tr_open")
  var tr_open_Original: Rule[TROpenToken, String] = js.native
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def code(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def code(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def code(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def code(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  /**
    * Check to see if `\n` is needed before the next token.
    */
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): _empty | Linefeed = js.native
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed = js.native
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def image(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def image(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def image(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def image(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def text(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def text(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def text(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def text(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String = js.native
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String = js.native
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String = js.native
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String = js.native
}

