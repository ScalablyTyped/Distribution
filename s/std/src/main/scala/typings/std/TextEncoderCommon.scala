package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEncoderCommon extends StObject {
  
  /** Returns "utf-8". */
  /* standard dom */
  val encoding: java.lang.String
}
object TextEncoderCommon {
  
  inline def apply(encoding: java.lang.String): TextEncoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEncoderCommon] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: java.lang.String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
