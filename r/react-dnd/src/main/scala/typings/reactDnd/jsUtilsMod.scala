package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUtilsMod {
  
  @JSImport("react-dnd/lib/utils/js_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isFunction(input: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPlainObject(input: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
