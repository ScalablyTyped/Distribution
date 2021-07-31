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
  
  @scala.inline
  def apply(plain: StyleObj, root: StyleObj): ThemeDict = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeDict]
  }
  
  @scala.inline
  implicit class ThemeDictMutableBuilder[Self <: ThemeDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlain(value: StyleObj): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: StyleObj): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
