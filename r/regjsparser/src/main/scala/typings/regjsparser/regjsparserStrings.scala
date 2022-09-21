package typings.regjsparser

import typings.regjsparser.mod.AstNodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regjsparserStrings {
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait Plussign extends StObject
  inline def Plussign: Plussign = "+".asInstanceOf[Plussign]
  
  @js.native
  sealed trait Questionmark extends StObject
  inline def Questionmark: Questionmark = "?".asInstanceOf[Questionmark]
  
  @js.native
  sealed trait alternative
    extends StObject
       with AstNodeType
  inline def alternative: alternative = "alternative".asInstanceOf[alternative]
  
  @js.native
  sealed trait anchor
    extends StObject
       with AstNodeType
  inline def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait boundary extends StObject
  inline def boundary: boundary = "boundary".asInstanceOf[boundary]
  
  @js.native
  sealed trait characterClass
    extends StObject
       with AstNodeType
  inline def characterClass: characterClass = "characterClass".asInstanceOf[characterClass]
  
  @js.native
  sealed trait characterClassEscape
    extends StObject
       with AstNodeType
  inline def characterClassEscape: characterClassEscape = "characterClassEscape".asInstanceOf[characterClassEscape]
  
  @js.native
  sealed trait characterClassRange
    extends StObject
       with AstNodeType
  inline def characterClassRange: characterClassRange = "characterClassRange".asInstanceOf[characterClassRange]
  
  @js.native
  sealed trait controlLetter extends StObject
  inline def controlLetter: controlLetter = "controlLetter".asInstanceOf[controlLetter]
  
  @js.native
  sealed trait disjunction
    extends StObject
       with AstNodeType
  inline def disjunction: disjunction = "disjunction".asInstanceOf[disjunction]
  
  @js.native
  sealed trait dot
    extends StObject
       with AstNodeType
  inline def dot: dot = "dot".asInstanceOf[dot]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait group
    extends StObject
       with AstNodeType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait hexadecimalEscape extends StObject
  inline def hexadecimalEscape: hexadecimalEscape = "hexadecimalEscape".asInstanceOf[hexadecimalEscape]
  
  @js.native
  sealed trait identifier extends StObject
  inline def identifier: identifier = "identifier".asInstanceOf[identifier]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait intersection extends StObject
  inline def intersection: intersection = "intersection".asInstanceOf[intersection]
  
  @js.native
  sealed trait lookahead extends StObject
  inline def lookahead: lookahead = "lookahead".asInstanceOf[lookahead]
  
  @js.native
  sealed trait lookbehind extends StObject
  inline def lookbehind: lookbehind = "lookbehind".asInstanceOf[lookbehind]
  
  @js.native
  sealed trait negativeLookahead extends StObject
  inline def negativeLookahead: negativeLookahead = "negativeLookahead".asInstanceOf[negativeLookahead]
  
  @js.native
  sealed trait negativeLookbehind extends StObject
  inline def negativeLookbehind: negativeLookbehind = "negativeLookbehind".asInstanceOf[negativeLookbehind]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-boundary` extends StObject
  inline def `not-boundary`: `not-boundary` = "not-boundary".asInstanceOf[`not-boundary`]
  
  @js.native
  sealed trait `null` extends StObject
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait octal extends StObject
  inline def octal: octal = "octal".asInstanceOf[octal]
  
  @js.native
  sealed trait quantifier
    extends StObject
       with AstNodeType
  inline def quantifier: quantifier = "quantifier".asInstanceOf[quantifier]
  
  @js.native
  sealed trait reference
    extends StObject
       with AstNodeType
  inline def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait singleEscape extends StObject
  inline def singleEscape: singleEscape = "singleEscape".asInstanceOf[singleEscape]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait subtraction extends StObject
  inline def subtraction: subtraction = "subtraction".asInstanceOf[subtraction]
  
  @js.native
  sealed trait symbol extends StObject
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait unicodeCodePointEscape extends StObject
  inline def unicodeCodePointEscape: unicodeCodePointEscape = "unicodeCodePointEscape".asInstanceOf[unicodeCodePointEscape]
  
  @js.native
  sealed trait unicodeEscape extends StObject
  inline def unicodeEscape: unicodeEscape = "unicodeEscape".asInstanceOf[unicodeEscape]
  
  @js.native
  sealed trait unicodePropertyEscape
    extends StObject
       with AstNodeType
  inline def unicodePropertyEscape: unicodePropertyEscape = "unicodePropertyEscape".asInstanceOf[unicodePropertyEscape]
  
  @js.native
  sealed trait union extends StObject
  inline def union: union = "union".asInstanceOf[union]
  
  @js.native
  sealed trait value
    extends StObject
       with AstNodeType
  inline def value: value = "value".asInstanceOf[value]
}
