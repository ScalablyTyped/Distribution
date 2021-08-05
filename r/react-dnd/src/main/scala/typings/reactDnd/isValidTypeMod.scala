package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidTypeMod {
  
  @JSImport("react-dnd/lib/utils/isValidType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidType(`type`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidType(`type`: js.Any, allowArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidType")(`type`.asInstanceOf[js.Any], allowArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
