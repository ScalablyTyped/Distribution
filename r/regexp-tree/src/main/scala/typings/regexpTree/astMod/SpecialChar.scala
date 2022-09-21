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

trait SpecialChar
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Char]
     with Char {
  
  var codePoint: Double
  
  var kind: meta | control | hex | decimal | oct | unicode
  
  var value: String
}
object SpecialChar {
  
  inline def apply(codePoint: Double, kind: meta | control | hex | decimal | oct | unicode, value: String): SpecialChar = {
    val __obj = js.Dynamic.literal(codePoint = codePoint.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Char")
    __obj.asInstanceOf[SpecialChar]
  }
  
  extension [Self <: SpecialChar](x: Self) {
    
    inline def setCodePoint(value: Double): Self = StObject.set(x, "codePoint", value.asInstanceOf[js.Any])
    
    inline def setKind(value: meta | control | hex | decimal | oct | unicode): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
