package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import typings.remarkable.remarkableStrings.Linefeed
import typings.remarkable.remarkableStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renderer rules.
  */
trait Rules
  extends StObject
     with /* name */ StringDictionary[(Rule[TagToken, String]) | (StringDictionary[Rule[ContentToken, String]])] {
  
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def abbr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("abbr_close")
  var abbr_close_Original: Rule[AbbrCloseToken, String]
  
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[AbbrOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def abbr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("abbr_open")
  var abbr_open_Original: Rule[AbbrOpenToken, String]
  
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def blockquote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("blockquote_close")
  var blockquote_close_Original: Rule[BlockquoteCloseToken, String]
  
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BlockquoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def blockquote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("blockquote_open")
  var blockquote_open_Original: Rule[BlockquoteOpenToken, String]
  
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def bullet_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("bullet_list_close")
  var bullet_list_close_Original: Rule[BulletListCloseToken, String]
  
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[BulletListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def bullet_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("bullet_list_open")
  var bullet_list_open_Original: Rule[BulletListOpenToken, String]
  
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[CodeToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def code(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("code")
  var code_Original: Rule[CodeToken, String]
  
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dd_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dd_close")
  var dd_close_Original: Rule[DdCloseToken, String]
  
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DdOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dd_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dd_open")
  var dd_open_Original: Rule[DdOpenToken, String]
  
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def del_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("del_close")
  var del_close_Original: Rule[DelCloseToken, String]
  
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DelOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def del_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("del_open")
  var del_open_Original: Rule[DelOpenToken, String]
  
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dl_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dl_close")
  var dl_close_Original: Rule[DlCloseToken, String]
  
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DlOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dl_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dl_open")
  var dl_open_Original: Rule[DlOpenToken, String]
  
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dt_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dt_close")
  var dt_close_Original: Rule[DtCloseToken, String]
  
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[DtOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def dt_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("dt_open")
  var dt_open_Original: Rule[DtOpenToken, String]
  
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def em_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("em_close")
  var em_close_Original: Rule[EmCloseToken, String]
  
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[EmOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def em_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("em_open")
  var em_open_Original: Rule[EmOpenToken, String]
  
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FenceToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def fence(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("fence")
  var fence_Original: Rule[FenceToken, String]
  
  var fence_custom: StringDictionary[Rule[FenceToken, String]]
  
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteAnchorToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_anchor(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_anchor")
  var footnote_anchor_Original: Rule[FootnoteAnchorToken, String]
  
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_block_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_block_close")
  var footnote_block_close_Original: Rule[FootnoteBlockCloseToken, String]
  
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteBlockOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_block_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_block_open")
  var footnote_block_open_Original: Rule[FootnoteBlockOpenToken, String]
  
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_close")
  var footnote_close_Original: Rule[FootnoteCloseToken, String]
  
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_open")
  var footnote_open_Original: Rule[FootnoteOpenToken, String]
  
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[FootnoteInlineToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def footnote_ref(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("footnote_ref")
  var footnote_ref_Original: Rule[FootnoteInlineToken, String]
  
  /**
    * Check to see if `\n` is needed before the next token.
    */
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ContentToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): _empty | Linefeed
  def getBreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): _empty | Linefeed
  /**
    * Check to see if `\n` is needed before the next token.
    */
  @JSName("getBreak")
  var getBreak_Original: GetBreak
  
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HardbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def hardbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("hardbreak")
  var hardbreak_Original: Rule[HardbreakToken, String]
  
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def heading_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("heading_close")
  var heading_close_Original: Rule[HeadingCloseToken, String]
  
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HeadingOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def heading_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("heading_open")
  var heading_open_Original: Rule[HeadingOpenToken, String]
  
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HrToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def hr(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("hr")
  var hr_Original: Rule[HrToken, String]
  
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlBlockToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def htmlblock(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("htmlblock")
  var htmlblock_Original: Rule[HtmlBlockToken, String]
  
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[HtmlTagToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def htmltag(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("htmltag")
  var htmltag_Original: Rule[HtmlTagToken, String]
  
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ImageToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def image(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("image")
  var image_Original: Rule[ImageToken, String]
  
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def ins_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("ins_close")
  var ins_close_Original: Rule[InsCloseToken, String]
  
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[InsOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def ins_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("ins_open")
  var ins_open_Original: Rule[InsOpenToken, String]
  
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def link_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("link_close")
  var link_close_Original: Rule[LinkCloseToken, String]
  
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[LinkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def link_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("link_open")
  var link_open_Original: Rule[LinkOpenToken, String]
  
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def list_item_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("list_item_close")
  var list_item_close_Original: Rule[ListItemCloseToken, String]
  
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ListItemOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def list_item_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("list_item_open")
  var list_item_open_Original: Rule[ListItemOpenToken, String]
  
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def mark_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("mark_close")
  var mark_close_Original: Rule[MarkCloseToken, String]
  
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[MarkOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def mark_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("mark_open")
  var mark_open_Original: Rule[MarkOpenToken, String]
  
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def ordered_list_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("ordered_list_close")
  var ordered_list_close_Original: Rule[OrderedListCloseToken, String]
  
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[OrderedListOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def ordered_list_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("ordered_list_open")
  var ordered_list_open_Original: Rule[OrderedListOpenToken, String]
  
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def paragraph_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("paragraph_close")
  var paragraph_close_Original: Rule[ParagraphCloseToken, String]
  
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[ParagraphOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def paragraph_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("paragraph_open")
  var paragraph_open_Original: Rule[ParagraphOpenToken, String]
  
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SoftbreakToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def softbreak(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("softbreak")
  var softbreak_Original: Rule[SoftbreakToken, String]
  
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def strong_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("strong_close")
  var strong_close_Original: Rule[StrongCloseToken, String]
  
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[StrongOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def strong_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("strong_open")
  var strong_open_Original: Rule[StrongOpenToken, String]
  
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SubToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def sub(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("sub")
  var sub_Original: Rule[SubToken, String]
  
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[SupToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def sup(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("sup")
  var sup_Original: Rule[SupToken, String]
  
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def table_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("table_close")
  var table_close_Original: Rule[TableCloseToken, String]
  
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TableOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def table_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("table_open")
  var table_open_Original: Rule[TableOpenToken, String]
  
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def tbody_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("tbody_close")
  var tbody_close_Original: Rule[TBodyCloseToken, String]
  
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TBodyOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def tbody_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("tbody_open")
  var tbody_open_Original: Rule[TBodyOpenToken, String]
  
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def td_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("td_close")
  var td_close_Original: Rule[TDCloseToken, String]
  
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TDOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def td_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("td_open")
  var td_open_Original: Rule[TDOpenToken, String]
  
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TextToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def text(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("text")
  var text_Original: Rule[TextToken, String]
  
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def th_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("th_close")
  var th_close_Original: Rule[THCloseToken, String]
  
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def th_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("th_open")
  var th_open_Original: Rule[THOpenToken, String]
  
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def thead_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("thead_close")
  var thead_close_Original: Rule[THeadCloseToken, String]
  
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[THeadOpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def thead_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("thead_open")
  var thead_open_Original: Rule[THeadOpenToken, String]
  
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TRCloseToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def tr_close(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("tr_close")
  var tr_close_Original: Rule[TRCloseToken, String]
  
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Unit,
    /**
    * The key-value store created by the parsing rules.
    */
  env: Env,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
  tokens: js.Array[TROpenToken],
    /**
    * The index of the token currently being processed.
    */
  idx: Double,
    /**
    * The options given to remarkable.
    */
  options: Options
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  env: Unit,
    /**
    * The possible instance of Remarkable. See `fence` renderer function.
    */
  instance: Remarkable
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  def tr_open(
    /**
    * The list of tokens currently being processed.
    */
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
  ): String
  @JSName("tr_open")
  var tr_open_Original: Rule[TROpenToken, String]
}
object Rules {
  
  inline def apply(
    abbr_close: (/* tokens */ js.Array[AbbrCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    abbr_open: (/* tokens */ js.Array[AbbrOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    blockquote_close: (/* tokens */ js.Array[BlockquoteCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    blockquote_open: (/* tokens */ js.Array[BlockquoteOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    bullet_list_close: (/* tokens */ js.Array[BulletListCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    bullet_list_open: (/* tokens */ js.Array[BulletListOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    code: (/* tokens */ js.Array[CodeToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dd_close: (/* tokens */ js.Array[DdCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dd_open: (/* tokens */ js.Array[DdOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    del_close: (/* tokens */ js.Array[DelCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    del_open: (/* tokens */ js.Array[DelOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dl_close: (/* tokens */ js.Array[DlCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dl_open: (/* tokens */ js.Array[DlOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dt_close: (/* tokens */ js.Array[DtCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    dt_open: (/* tokens */ js.Array[DtOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    em_close: (/* tokens */ js.Array[EmCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    em_open: (/* tokens */ js.Array[EmOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    fence: (/* tokens */ js.Array[FenceToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    fence_custom: StringDictionary[Rule[FenceToken, String]],
    footnote_anchor: (/* tokens */ js.Array[FootnoteAnchorToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    footnote_block_close: (/* tokens */ js.Array[FootnoteBlockCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    footnote_block_open: (/* tokens */ js.Array[FootnoteBlockOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    footnote_close: (/* tokens */ js.Array[FootnoteCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    footnote_open: (/* tokens */ js.Array[FootnoteOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    footnote_ref: (/* tokens */ js.Array[FootnoteInlineToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    getBreak: (/* tokens */ js.Array[ContentToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => _empty | Linefeed,
    hardbreak: (/* tokens */ js.Array[HardbreakToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    heading_close: (/* tokens */ js.Array[HeadingCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    heading_open: (/* tokens */ js.Array[HeadingOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    hr: (/* tokens */ js.Array[HrToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    htmlblock: (/* tokens */ js.Array[HtmlBlockToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    htmltag: (/* tokens */ js.Array[HtmlTagToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    image: (/* tokens */ js.Array[ImageToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    ins_close: (/* tokens */ js.Array[InsCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    ins_open: (/* tokens */ js.Array[InsOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    link_close: (/* tokens */ js.Array[LinkCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    link_open: (/* tokens */ js.Array[LinkOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    list_item_close: (/* tokens */ js.Array[ListItemCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    list_item_open: (/* tokens */ js.Array[ListItemOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    mark_close: (/* tokens */ js.Array[MarkCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    mark_open: (/* tokens */ js.Array[MarkOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    ordered_list_close: (/* tokens */ js.Array[OrderedListCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    ordered_list_open: (/* tokens */ js.Array[OrderedListOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    paragraph_close: (/* tokens */ js.Array[ParagraphCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    paragraph_open: (/* tokens */ js.Array[ParagraphOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    softbreak: (/* tokens */ js.Array[SoftbreakToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    strong_close: (/* tokens */ js.Array[StrongCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    strong_open: (/* tokens */ js.Array[StrongOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    sub: (/* tokens */ js.Array[SubToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    sup: (/* tokens */ js.Array[SupToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    table_close: (/* tokens */ js.Array[TableCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    table_open: (/* tokens */ js.Array[TableOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    tbody_close: (/* tokens */ js.Array[TBodyCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    tbody_open: (/* tokens */ js.Array[TBodyOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    td_close: (/* tokens */ js.Array[TDCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    td_open: (/* tokens */ js.Array[TDOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    text: (/* tokens */ js.Array[TextToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    th_close: (/* tokens */ js.Array[THCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    th_open: (/* tokens */ js.Array[THOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    thead_close: (/* tokens */ js.Array[THeadCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    thead_open: (/* tokens */ js.Array[THeadOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    tr_close: (/* tokens */ js.Array[TRCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String,
    tr_open: (/* tokens */ js.Array[TROpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
  ): Rules = {
    val __obj = js.Dynamic.literal(abbr_close = js.Any.fromFunction5(abbr_close), abbr_open = js.Any.fromFunction5(abbr_open), blockquote_close = js.Any.fromFunction5(blockquote_close), blockquote_open = js.Any.fromFunction5(blockquote_open), bullet_list_close = js.Any.fromFunction5(bullet_list_close), bullet_list_open = js.Any.fromFunction5(bullet_list_open), code = js.Any.fromFunction5(code), dd_close = js.Any.fromFunction5(dd_close), dd_open = js.Any.fromFunction5(dd_open), del_close = js.Any.fromFunction5(del_close), del_open = js.Any.fromFunction5(del_open), dl_close = js.Any.fromFunction5(dl_close), dl_open = js.Any.fromFunction5(dl_open), dt_close = js.Any.fromFunction5(dt_close), dt_open = js.Any.fromFunction5(dt_open), em_close = js.Any.fromFunction5(em_close), em_open = js.Any.fromFunction5(em_open), fence = js.Any.fromFunction5(fence), fence_custom = fence_custom.asInstanceOf[js.Any], footnote_anchor = js.Any.fromFunction5(footnote_anchor), footnote_block_close = js.Any.fromFunction5(footnote_block_close), footnote_block_open = js.Any.fromFunction5(footnote_block_open), footnote_close = js.Any.fromFunction5(footnote_close), footnote_open = js.Any.fromFunction5(footnote_open), footnote_ref = js.Any.fromFunction5(footnote_ref), getBreak = js.Any.fromFunction5(getBreak), hardbreak = js.Any.fromFunction5(hardbreak), heading_close = js.Any.fromFunction5(heading_close), heading_open = js.Any.fromFunction5(heading_open), hr = js.Any.fromFunction5(hr), htmlblock = js.Any.fromFunction5(htmlblock), htmltag = js.Any.fromFunction5(htmltag), image = js.Any.fromFunction5(image), ins_close = js.Any.fromFunction5(ins_close), ins_open = js.Any.fromFunction5(ins_open), link_close = js.Any.fromFunction5(link_close), link_open = js.Any.fromFunction5(link_open), list_item_close = js.Any.fromFunction5(list_item_close), list_item_open = js.Any.fromFunction5(list_item_open), mark_close = js.Any.fromFunction5(mark_close), mark_open = js.Any.fromFunction5(mark_open), ordered_list_close = js.Any.fromFunction5(ordered_list_close), ordered_list_open = js.Any.fromFunction5(ordered_list_open), paragraph_close = js.Any.fromFunction5(paragraph_close), paragraph_open = js.Any.fromFunction5(paragraph_open), softbreak = js.Any.fromFunction5(softbreak), strong_close = js.Any.fromFunction5(strong_close), strong_open = js.Any.fromFunction5(strong_open), sub = js.Any.fromFunction5(sub), sup = js.Any.fromFunction5(sup), table_close = js.Any.fromFunction5(table_close), table_open = js.Any.fromFunction5(table_open), tbody_close = js.Any.fromFunction5(tbody_close), tbody_open = js.Any.fromFunction5(tbody_open), td_close = js.Any.fromFunction5(td_close), td_open = js.Any.fromFunction5(td_open), text = js.Any.fromFunction5(text), th_close = js.Any.fromFunction5(th_close), th_open = js.Any.fromFunction5(th_open), thead_close = js.Any.fromFunction5(thead_close), thead_open = js.Any.fromFunction5(thead_open), tr_close = js.Any.fromFunction5(tr_close), tr_open = js.Any.fromFunction5(tr_open))
    __obj.asInstanceOf[Rules]
  }
  
  extension [Self <: Rules](x: Self) {
    
    inline def setAbbr_close(
      value: (/* tokens */ js.Array[AbbrCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "abbr_close", js.Any.fromFunction5(value))
    
    inline def setAbbr_open(
      value: (/* tokens */ js.Array[AbbrOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "abbr_open", js.Any.fromFunction5(value))
    
    inline def setBlockquote_close(
      value: (/* tokens */ js.Array[BlockquoteCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "blockquote_close", js.Any.fromFunction5(value))
    
    inline def setBlockquote_open(
      value: (/* tokens */ js.Array[BlockquoteOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "blockquote_open", js.Any.fromFunction5(value))
    
    inline def setBullet_list_close(
      value: (/* tokens */ js.Array[BulletListCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "bullet_list_close", js.Any.fromFunction5(value))
    
    inline def setBullet_list_open(
      value: (/* tokens */ js.Array[BulletListOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "bullet_list_open", js.Any.fromFunction5(value))
    
    inline def setCode(
      value: (/* tokens */ js.Array[CodeToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "code", js.Any.fromFunction5(value))
    
    inline def setDd_close(
      value: (/* tokens */ js.Array[DdCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dd_close", js.Any.fromFunction5(value))
    
    inline def setDd_open(
      value: (/* tokens */ js.Array[DdOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dd_open", js.Any.fromFunction5(value))
    
    inline def setDel_close(
      value: (/* tokens */ js.Array[DelCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "del_close", js.Any.fromFunction5(value))
    
    inline def setDel_open(
      value: (/* tokens */ js.Array[DelOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "del_open", js.Any.fromFunction5(value))
    
    inline def setDl_close(
      value: (/* tokens */ js.Array[DlCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dl_close", js.Any.fromFunction5(value))
    
    inline def setDl_open(
      value: (/* tokens */ js.Array[DlOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dl_open", js.Any.fromFunction5(value))
    
    inline def setDt_close(
      value: (/* tokens */ js.Array[DtCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dt_close", js.Any.fromFunction5(value))
    
    inline def setDt_open(
      value: (/* tokens */ js.Array[DtOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "dt_open", js.Any.fromFunction5(value))
    
    inline def setEm_close(
      value: (/* tokens */ js.Array[EmCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "em_close", js.Any.fromFunction5(value))
    
    inline def setEm_open(
      value: (/* tokens */ js.Array[EmOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "em_open", js.Any.fromFunction5(value))
    
    inline def setFence(
      value: (/* tokens */ js.Array[FenceToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "fence", js.Any.fromFunction5(value))
    
    inline def setFence_custom(value: StringDictionary[Rule[FenceToken, String]]): Self = StObject.set(x, "fence_custom", value.asInstanceOf[js.Any])
    
    inline def setFootnote_anchor(
      value: (/* tokens */ js.Array[FootnoteAnchorToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_anchor", js.Any.fromFunction5(value))
    
    inline def setFootnote_block_close(
      value: (/* tokens */ js.Array[FootnoteBlockCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_block_close", js.Any.fromFunction5(value))
    
    inline def setFootnote_block_open(
      value: (/* tokens */ js.Array[FootnoteBlockOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_block_open", js.Any.fromFunction5(value))
    
    inline def setFootnote_close(
      value: (/* tokens */ js.Array[FootnoteCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_close", js.Any.fromFunction5(value))
    
    inline def setFootnote_open(
      value: (/* tokens */ js.Array[FootnoteOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_open", js.Any.fromFunction5(value))
    
    inline def setFootnote_ref(
      value: (/* tokens */ js.Array[FootnoteInlineToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "footnote_ref", js.Any.fromFunction5(value))
    
    inline def setGetBreak(
      value: (/* tokens */ js.Array[ContentToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => _empty | Linefeed
    ): Self = StObject.set(x, "getBreak", js.Any.fromFunction5(value))
    
    inline def setHardbreak(
      value: (/* tokens */ js.Array[HardbreakToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "hardbreak", js.Any.fromFunction5(value))
    
    inline def setHeading_close(
      value: (/* tokens */ js.Array[HeadingCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "heading_close", js.Any.fromFunction5(value))
    
    inline def setHeading_open(
      value: (/* tokens */ js.Array[HeadingOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "heading_open", js.Any.fromFunction5(value))
    
    inline def setHr(
      value: (/* tokens */ js.Array[HrToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "hr", js.Any.fromFunction5(value))
    
    inline def setHtmlblock(
      value: (/* tokens */ js.Array[HtmlBlockToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "htmlblock", js.Any.fromFunction5(value))
    
    inline def setHtmltag(
      value: (/* tokens */ js.Array[HtmlTagToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "htmltag", js.Any.fromFunction5(value))
    
    inline def setImage(
      value: (/* tokens */ js.Array[ImageToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "image", js.Any.fromFunction5(value))
    
    inline def setIns_close(
      value: (/* tokens */ js.Array[InsCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "ins_close", js.Any.fromFunction5(value))
    
    inline def setIns_open(
      value: (/* tokens */ js.Array[InsOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "ins_open", js.Any.fromFunction5(value))
    
    inline def setLink_close(
      value: (/* tokens */ js.Array[LinkCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "link_close", js.Any.fromFunction5(value))
    
    inline def setLink_open(
      value: (/* tokens */ js.Array[LinkOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "link_open", js.Any.fromFunction5(value))
    
    inline def setList_item_close(
      value: (/* tokens */ js.Array[ListItemCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "list_item_close", js.Any.fromFunction5(value))
    
    inline def setList_item_open(
      value: (/* tokens */ js.Array[ListItemOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "list_item_open", js.Any.fromFunction5(value))
    
    inline def setMark_close(
      value: (/* tokens */ js.Array[MarkCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "mark_close", js.Any.fromFunction5(value))
    
    inline def setMark_open(
      value: (/* tokens */ js.Array[MarkOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "mark_open", js.Any.fromFunction5(value))
    
    inline def setOrdered_list_close(
      value: (/* tokens */ js.Array[OrderedListCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "ordered_list_close", js.Any.fromFunction5(value))
    
    inline def setOrdered_list_open(
      value: (/* tokens */ js.Array[OrderedListOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "ordered_list_open", js.Any.fromFunction5(value))
    
    inline def setParagraph_close(
      value: (/* tokens */ js.Array[ParagraphCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "paragraph_close", js.Any.fromFunction5(value))
    
    inline def setParagraph_open(
      value: (/* tokens */ js.Array[ParagraphOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "paragraph_open", js.Any.fromFunction5(value))
    
    inline def setSoftbreak(
      value: (/* tokens */ js.Array[SoftbreakToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "softbreak", js.Any.fromFunction5(value))
    
    inline def setStrong_close(
      value: (/* tokens */ js.Array[StrongCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "strong_close", js.Any.fromFunction5(value))
    
    inline def setStrong_open(
      value: (/* tokens */ js.Array[StrongOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "strong_open", js.Any.fromFunction5(value))
    
    inline def setSub(
      value: (/* tokens */ js.Array[SubToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "sub", js.Any.fromFunction5(value))
    
    inline def setSup(
      value: (/* tokens */ js.Array[SupToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "sup", js.Any.fromFunction5(value))
    
    inline def setTable_close(
      value: (/* tokens */ js.Array[TableCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "table_close", js.Any.fromFunction5(value))
    
    inline def setTable_open(
      value: (/* tokens */ js.Array[TableOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "table_open", js.Any.fromFunction5(value))
    
    inline def setTbody_close(
      value: (/* tokens */ js.Array[TBodyCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "tbody_close", js.Any.fromFunction5(value))
    
    inline def setTbody_open(
      value: (/* tokens */ js.Array[TBodyOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "tbody_open", js.Any.fromFunction5(value))
    
    inline def setTd_close(
      value: (/* tokens */ js.Array[TDCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "td_close", js.Any.fromFunction5(value))
    
    inline def setTd_open(
      value: (/* tokens */ js.Array[TDOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "td_open", js.Any.fromFunction5(value))
    
    inline def setText(
      value: (/* tokens */ js.Array[TextToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "text", js.Any.fromFunction5(value))
    
    inline def setTh_close(
      value: (/* tokens */ js.Array[THCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "th_close", js.Any.fromFunction5(value))
    
    inline def setTh_open(
      value: (/* tokens */ js.Array[THOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "th_open", js.Any.fromFunction5(value))
    
    inline def setThead_close(
      value: (/* tokens */ js.Array[THeadCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "thead_close", js.Any.fromFunction5(value))
    
    inline def setThead_open(
      value: (/* tokens */ js.Array[THeadOpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "thead_open", js.Any.fromFunction5(value))
    
    inline def setTr_close(
      value: (/* tokens */ js.Array[TRCloseToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "tr_close", js.Any.fromFunction5(value))
    
    inline def setTr_open(
      value: (/* tokens */ js.Array[TROpenToken], /* idx */ Double, /* options */ js.UndefOr[Options], /* env */ js.UndefOr[Env], /* instance */ js.UndefOr[Remarkable]) => String
    ): Self = StObject.set(x, "tr_open", js.Any.fromFunction5(value))
  }
}
