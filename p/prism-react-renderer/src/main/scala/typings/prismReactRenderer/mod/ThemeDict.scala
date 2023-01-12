package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeDict
  extends StObject
     with /* type */ StringDictionary[StyleObj] {
  
  var plain: StyleObj
  
  var root: StyleObj
}
object ThemeDict {
  
  inline def apply(plain: StyleObj, root: StyleObj): ThemeDict = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeDict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeDict] (val x: Self) extends AnyVal {
    
    inline def setPlain(value: StyleObj): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: StyleObj): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
