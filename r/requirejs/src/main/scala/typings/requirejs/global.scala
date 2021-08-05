package typings.requirejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("define")
  @js.native
  def define: RequireDefine = js.native
  inline def define_=(x: RequireDefine): Unit = js.Dynamic.global.updateDynamic("define")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: Require = js.native
  inline def require_=(x: Require): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  // Ambient declarations for 'require' and 'define'
  @JSGlobal("requirejs")
  @js.native
  def requirejs: Require = js.native
  inline def requirejs_=(x: Require): Unit = js.Dynamic.global.updateDynamic("requirejs")(x.asInstanceOf[js.Any])
}
