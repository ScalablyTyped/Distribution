package typings.stringFormat

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(template: String, args: (StringDictionary[js.Any] | String)*): String = (^.asInstanceOf[js.Dynamic].apply(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("string-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  inline def create(transformers: Transformers): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(transformers.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  inline def extend(prototype: js.Any, transformers: Transformers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any], transformers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Transformers = StringDictionary[js.Function1[/* s */ js.Any, String]]
}
