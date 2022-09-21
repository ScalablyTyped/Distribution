package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidApi extends StObject {
  
  /**
    * When sending an ACTION_VIEW intent with given file path and MIME type, system will try to open an
    * App to handle the file. For example, open Gallery app to view an image, or install APK.
    * @param path Path of the file to be opened.
    * @param mime Basically system will open an app according to this MIME type.
    */
  def actionViewIntent(path: String, mime: String): js.Promise[Any]
}
object AndroidApi {
  
  inline def apply(actionViewIntent: (String, String) => js.Promise[Any]): AndroidApi = {
    val __obj = js.Dynamic.literal(actionViewIntent = js.Any.fromFunction2(actionViewIntent))
    __obj.asInstanceOf[AndroidApi]
  }
  
  extension [Self <: AndroidApi](x: Self) {
    
    inline def setActionViewIntent(value: (String, String) => js.Promise[Any]): Self = StObject.set(x, "actionViewIntent", js.Any.fromFunction2(value))
  }
}
