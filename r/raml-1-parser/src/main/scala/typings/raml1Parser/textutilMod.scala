package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textutilMod {
  
  @JSImport("raml-1-parser/dist/util/textutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/textutil", "TextRange")
  @js.native
  open class TextRange protected () extends StObject {
    def this(contents: String, start: Double, end: Double) = this()
    
    /* private */ var contents: Any = js.native
    
    /* private */ var end: Any = js.native
    
    def endpos(): Double = js.native
    
    def extendAnyUntilNewLines(): TextRange = js.native
    
    def extendCharIfAny(ch: String): TextRange = js.native
    
    def extendCharIfAnyBack(ch: String): TextRange = js.native
    
    def extendSpaces(): TextRange = js.native
    
    def extendSpacesBack(): TextRange = js.native
    
    def extendSpacesUntilNewLines(): TextRange = js.native
    
    def extendToNewlines(): TextRange = js.native
    
    def extendToStartOfLine(): TextRange = js.native
    
    def extendUntilNewlinesBack(): TextRange = js.native
    
    def len(): Double = js.native
    
    def reduceNewlinesEnd(): TextRange = js.native
    
    def reduceSpaces(): TextRange = js.native
    
    def remove(): String = js.native
    
    def replace(text: String): String = js.native
    
    /* private */ var start: Any = js.native
    
    def startpos(): Double = js.native
    
    def sub(start: Double, end: Double): String = js.native
    
    def text(): String = js.native
    
    def trimEnd(): TextRange = js.native
    
    def trimStart(): TextRange = js.native
    
    def unitText(): String = js.native
    
    def withEnd(end: Double): TextRange = js.native
    
    def withStart(start: Double): TextRange = js.native
  }
  
  inline def capitalize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def endsWith(s: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(s.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromMutiLine(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMutiLine")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def indent(lev: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("indent")(lev.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def indent(lev: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indent")(lev.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isMultiLine(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiLine")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiLineValue(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiLineValue")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeMutiLine(s: String, lev: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMutiLine")(s.asInstanceOf[js.Any], lev.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def print(lev: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(lev.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def print(lev: Double, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(lev.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceNewlines(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceNewlines")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def replaceNewlines(s: String, rep: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNewlines")(s.asInstanceOf[js.Any], rep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitOnLines(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnLines")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def startsWith(s: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(s.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def trim(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimEnd(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimStart(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
