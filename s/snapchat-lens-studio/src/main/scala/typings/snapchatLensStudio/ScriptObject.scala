package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for objects representing Script data. */
trait ScriptObject extends StObject {
  
  /** Returns the name of this object’s type. */
  def getTypeName(): String
  
  /** Returns true if the object matches or derives from the passed in type. */
  def isOfType(`type`: String): Boolean
}
object ScriptObject {
  
  inline def apply(getTypeName: () => String, isOfType: String => Boolean): ScriptObject = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[ScriptObject]
  }
  
  extension [Self <: ScriptObject](x: Self) {
    
    inline def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
    
    inline def setIsOfType(value: String => Boolean): Self = StObject.set(x, "isOfType", js.Any.fromFunction1(value))
  }
}
