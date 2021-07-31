package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOneOfMod {
  
  @JSImport("smooth-scrollbar/utils/is-one-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isOneOf(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isOneOf(a: js.Any, b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
