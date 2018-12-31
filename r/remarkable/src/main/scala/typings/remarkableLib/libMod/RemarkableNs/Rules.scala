package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules
  extends /* name */ org.scalablytyped.runtime.StringDictionary[Rule] {
  @JSName("abbr_close")
  var abbr_close_Original: Rule = js.native
  @JSName("abbr_open")
  var abbr_open_Original: Rule = js.native
  @JSName("blockquote_close")
  var blockquote_close_Original: Rule = js.native
  @JSName("blockquote_open")
  var blockquote_open_Original: Rule = js.native
  @JSName("bullet_list_close")
  var bullet_list_close_Original: Rule = js.native
  @JSName("bullet_list_open")
  var bullet_list_open_Original: Rule = js.native
  @JSName("code")
  var code_Original: Rule = js.native
  @JSName("dd_close")
  var dd_close_Original: Rule = js.native
  @JSName("dd_open")
  var dd_open_Original: Rule = js.native
  @JSName("del_close")
  var del_close_Original: Rule = js.native
  @JSName("del_open")
  var del_open_Original: Rule = js.native
  @JSName("dl_close")
  var dl_close_Original: Rule = js.native
  @JSName("dl_open")
  var dl_open_Original: Rule = js.native
  @JSName("dt_close")
  var dt_close_Original: Rule = js.native
  @JSName("dt_open")
  var dt_open_Original: Rule = js.native
  @JSName("em_close")
  var em_close_Original: Rule = js.native
  @JSName("em_open")
  var em_open_Original: Rule = js.native
  @JSName("fence")
  var fence_Original: Rule = js.native
  @JSName("fence_custom")
  var fence_custom_Original: Rule = js.native
  @JSName("footnote_anchor")
  var footnote_anchor_Original: Rule = js.native
  @JSName("footnote_block_close")
  var footnote_block_close_Original: Rule = js.native
  @JSName("footnote_block_open")
  var footnote_block_open_Original: Rule = js.native
  @JSName("footnote_close")
  var footnote_close_Original: Rule = js.native
  @JSName("footnote_open")
  var footnote_open_Original: Rule = js.native
  @JSName("footnote_ref")
  var footnote_ref_Original: Rule = js.native
  /**
    * Check to see if `\n` is needed before the next token.
    */
  @JSName("getBreak")
  var getBreak_Original: GetBreak = js.native
  @JSName("hardbreak")
  var hardbreak_Original: Rule = js.native
  @JSName("heading_close")
  var heading_close_Original: Rule = js.native
  @JSName("heading_open")
  var heading_open_Original: Rule = js.native
  @JSName("hr")
  var hr_Original: Rule = js.native
  @JSName("htmlblock")
  var htmlblock_Original: Rule = js.native
  @JSName("htmltag")
  var htmltag_Original: Rule = js.native
  @JSName("image")
  var image_Original: Rule = js.native
  @JSName("ins_close")
  var ins_close_Original: Rule = js.native
  @JSName("ins_open")
  var ins_open_Original: Rule = js.native
  @JSName("link_close")
  var link_close_Original: Rule = js.native
  @JSName("link_open")
  var link_open_Original: Rule = js.native
  @JSName("list_item_close")
  var list_item_close_Original: Rule = js.native
  @JSName("list_item_open")
  var list_item_open_Original: Rule = js.native
  @JSName("mark_close")
  var mark_close_Original: Rule = js.native
  @JSName("mark_open")
  var mark_open_Original: Rule = js.native
  @JSName("ordered_list_close")
  var ordered_list_close_Original: Rule = js.native
  @JSName("ordered_list_open")
  var ordered_list_open_Original: Rule = js.native
  @JSName("paragraph_close")
  var paragraph_close_Original: Rule = js.native
  @JSName("paragraph_open")
  var paragraph_open_Original: Rule = js.native
  @JSName("softbreak")
  var softbreak_Original: Rule = js.native
  @JSName("strong_close")
  var strong_close_Original: Rule = js.native
  @JSName("strong_open")
  var strong_open_Original: Rule = js.native
  @JSName("sub")
  var sub_Original: Rule = js.native
  @JSName("sup")
  var sup_Original: Rule = js.native
  @JSName("table_close")
  var table_close_Original: Rule = js.native
  @JSName("table_open")
  var table_open_Original: Rule = js.native
  @JSName("tbody_close")
  var tbody_close_Original: Rule = js.native
  @JSName("tbody_open")
  var tbody_open_Original: Rule = js.native
  @JSName("td_close")
  var td_close_Original: Rule = js.native
  @JSName("td_open")
  var td_open_Original: Rule = js.native
  @JSName("text")
  var text_Original: Rule = js.native
  @JSName("th_close")
  var th_close_Original: Rule = js.native
  @JSName("th_open")
  var th_open_Original: Rule = js.native
  @JSName("thead_close")
  var thead_close_Original: Rule = js.native
  @JSName("thead_open")
  var thead_open_Original: Rule = js.native
  @JSName("tr_close")
  var tr_close_Original: Rule = js.native
  @JSName("tr_open")
  var tr_open_Original: Rule = js.native
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def fence_custom(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  /**
    * Check to see if `\n` is needed before the next token.
    */
  def getBreak(tokens: js.Array[ContentToken], idx: scala.Double): remarkableLib.remarkableLibStrings.Empty | remarkableLib.remarkableLibStrings.BACKSLASHn = js.native
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: scala.Double,
    /**
    * The options given to remarkable.
    */
  options: Options,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): java.lang.String = js.native
}

