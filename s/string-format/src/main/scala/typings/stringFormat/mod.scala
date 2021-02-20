package typings.stringFormat

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-format", JSImport.Namespace)
  @js.native
  def apply(template: String, args: (StringDictionary[js.Any] | String)*): String = js.native
  
  /**
    * create a format function with given transformers
    * @param transformers functions which convert a string, indexed by a name
    */
  @JSImport("string-format", "create")
  @js.native
  def create(transformers: Transformers): js.Any = js.native
  
  /**
    * @param prototype prototype which should be extended by format (usually String.prototype)
    * @param transformers functions which convert a string, indexed by a name
    */
  @JSImport("string-format", "extend")
  @js.native
  def extend(prototype: js.Any, transformers: Transformers): Unit = js.native
  
  type Transformers = StringDictionary[js.Function1[/* s */ js.Any, String]]
}
