package typings.reactMdUtils

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFuzzyRegExpMod {
  
  @JSImport("@react-md/utils/types/search/getFuzzyRegExp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFuzzyRegExp(query: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFuzzyRegExp")(query.asInstanceOf[js.Any]).asInstanceOf[RegExp]
}
