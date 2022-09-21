package typings.regexpTree.astMod

import typings.regexpTree.regexpTreeStrings.control
import typings.regexpTree.regexpTreeStrings.decimal
import typings.regexpTree.regexpTreeStrings.hex
import typings.regexpTree.regexpTreeStrings.meta
import typings.regexpTree.regexpTreeStrings.oct
import typings.regexpTree.regexpTreeStrings.unicode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.regexpTree.astMod.SimpleChar
  - typings.regexpTree.astMod.SpecialChar
*/
trait Char
  extends StObject
     with Expression
object Char {
  
  inline def SimpleChar(codePoint: Double, value: String): typings.regexpTree.astMod.SimpleChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = "simple", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTree.astMod.SimpleChar]
  }
  
  inline def SpecialChar(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): typings.regexpTree.astMod.SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[typings.regexpTree.astMod.SpecialChar]
  }
}
