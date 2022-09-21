package typings.reactMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object omitMod {
  
  @JSImport("react-mentions/lib/utils/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omit(
    obj: js.Object,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type Array<string> | Array<Array<string>> is not an array type */ rest: js.Array[js.Array[String] | String]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
