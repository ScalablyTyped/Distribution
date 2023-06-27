package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem)
  */
trait ClipboardItem extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType) */
  /* standard dom */
  def getType(`type`: java.lang.String): js.Promise[Blob]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle) */
  /* standard dom */
  val presentationStyle: PresentationStyle
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types) */
  /* standard dom */
  val types: js.Array[java.lang.String]
}
object ClipboardItem {
  
  inline def apply(
    getType: java.lang.String => js.Promise[Blob],
    presentationStyle: PresentationStyle,
    types: js.Array[java.lang.String]
  ): ClipboardItem = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), presentationStyle = presentationStyle.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipboardItem] (val x: Self) extends AnyVal {
    
    inline def setGetType(value: java.lang.String => js.Promise[Blob]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setPresentationStyle(value: PresentationStyle): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
