package typings.reactMdBadge

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmptyMod {
  
  @JSImport("@react-md/badge/types/isEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty(children: ReactNode, disableNullOnZero: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(children.asInstanceOf[js.Any], disableNullOnZero.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
