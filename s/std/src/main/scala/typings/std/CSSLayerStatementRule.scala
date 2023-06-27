package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSLayerStatementRule) */
trait CSSLayerStatementRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSLayerStatementRule/nameList) */
  /* standard dom */
  val nameList: js.Array[java.lang.String]
}
object CSSLayerStatementRule {
  
  inline def apply(cssText: java.lang.String, nameList: js.Array[java.lang.String], `type`: Double): CSSLayerStatementRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = 2, FONT_FACE_RULE = 5, IMPORT_RULE = 3, KEYFRAMES_RULE = 7, KEYFRAME_RULE = 8, MEDIA_RULE = 4, NAMESPACE_RULE = 10, PAGE_RULE = 6, STYLE_RULE = 1, SUPPORTS_RULE = 12, cssText = cssText.asInstanceOf[js.Any], nameList = nameList.asInstanceOf[js.Any], parentRule = null, parentStyleSheet = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSLayerStatementRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSLayerStatementRule] (val x: Self) extends AnyVal {
    
    inline def setNameList(value: js.Array[java.lang.String]): Self = StObject.set(x, "nameList", value.asInstanceOf[js.Any])
    
    inline def setNameListVarargs(value: java.lang.String*): Self = StObject.set(x, "nameList", js.Array(value*))
  }
}
