package typings.pugLexer.mod

import typings.pugLexer.pugLexerStrings.append
import typings.pugLexer.pugLexerStrings.prepend
import typings.pugLexer.pugLexerStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Token extends StObject
object _Token {
  
  inline def AndAttributesToken(loc: Loc, `val`: String): typings.pugLexer.mod.AndAttributesToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("&attributes")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.AndAttributesToken]
  }
  
  inline def AttributeToken(loc: Loc, mustEscape: Boolean, name: String, `val`: String | Boolean): typings.pugLexer.mod.AttributeToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], mustEscape = mustEscape.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.AttributeToken]
  }
  
  inline def BlockToken(loc: Loc, mode: replace | prepend | append, `val`: String): typings.pugLexer.mod.BlockToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("block")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.BlockToken]
  }
  
  inline def CallToken(args: String, loc: Loc, `val`: String): typings.pugLexer.mod.CallToken = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("call")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.CallToken]
  }
  
  inline def CaseToken(loc: Loc, `val`: String): typings.pugLexer.mod.CaseToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.CaseToken]
  }
  
  inline def ClassToken(loc: Loc, `val`: String): typings.pugLexer.mod.ClassToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.ClassToken]
  }
  
  inline def CodeToken(buffer: Boolean, loc: Loc, mustEscape: Boolean, `val`: String): typings.pugLexer.mod.CodeToken = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mustEscape = mustEscape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.CodeToken]
  }
  
  inline def CommentToken(buffer: Boolean, loc: Loc, `val`: String): typings.pugLexer.mod.CommentToken = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.CommentToken]
  }
  
  inline def DoctypeToken(loc: Loc, `val`: String): typings.pugLexer.mod.DoctypeToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("doctype")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.DoctypeToken]
  }
  
  inline def EachOfToken(code: String, loc: Loc, `val`: String, value: String): typings.pugLexer.mod.EachOfToken = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("eachOf")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.EachOfToken]
  }
  
  inline def EachToken(code: String, loc: Loc, `val`: String): typings.pugLexer.mod.EachToken = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")("each")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.EachToken]
  }
  
  inline def ElseIfToken(loc: Loc, `val`: String): typings.pugLexer.mod.ElseIfToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("else-if")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.ElseIfToken]
  }
  
  inline def ElseToken(loc: Loc, `val`: String): typings.pugLexer.mod.ElseToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("else")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.ElseToken]
  }
  
  inline def FilterToken(loc: Loc, `val`: String): typings.pugLexer.mod.FilterToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.FilterToken]
  }
  
  inline def IdToken(loc: Loc, `val`: String): typings.pugLexer.mod.IdToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.IdToken]
  }
  
  inline def IfToken(loc: Loc, `val`: String): typings.pugLexer.mod.IfToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("if")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.IfToken]
  }
  
  inline def IndentToken(loc: Loc, `val`: Double): typings.pugLexer.mod.IndentToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("indent")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.IndentToken]
  }
  
  inline def InterpolatedCodeToken(buffer: Boolean, loc: Loc, mustEscape: Boolean, `val`: String): typings.pugLexer.mod.InterpolatedCodeToken = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mustEscape = mustEscape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interpolated-code")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.InterpolatedCodeToken]
  }
  
  inline def InterpolationToken(loc: Loc, `val`: String): typings.pugLexer.mod.InterpolationToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interpolation")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.InterpolationToken]
  }
  
  inline def MixinToken(loc: Loc, `val`: String): typings.pugLexer.mod.MixinToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("type")("mixin")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.MixinToken]
  }
  
  inline def PathToken(loc: Loc, `val`: String): typings.pugLexer.mod.PathToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.PathToken]
  }
  
  inline def TagToken(loc: Loc, `val`: String): typings.pugLexer.mod.TagToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tag")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.TagToken]
  }
  
  inline def TextHtmlToken(loc: Loc, `val`: String): typings.pugLexer.mod.TextHtmlToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text-html")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.TextHtmlToken]
  }
  
  inline def TextToken(loc: Loc, `val`: String): typings.pugLexer.mod.TextToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.TextToken]
  }
  
  inline def WhenToken(loc: Loc, `val`: String): typings.pugLexer.mod.WhenToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.WhenToken]
  }
  
  inline def WhileToken(loc: Loc, `val`: String): typings.pugLexer.mod.WhileToken = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("while")
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pugLexer.mod.WhileToken]
  }
}
