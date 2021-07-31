package typings.slimerjs

import typings.slimerjs.slimerjsStrings.fs
import typings.slimerjs.slimerjsStrings.system
import typings.slimerjs.slimerjsStrings.webpage
import typings.slimerjs.slimerjsStrings.webserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("phantom")
  @js.native
  def phantom: Phantom = js.native
  @scala.inline
  def phantom_=(x: Phantom): Unit = js.Dynamic.global.updateDynamic("phantom")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def require(module: js.Any): js.Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def require_fs(module: fs): FsModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[FsModule]
  
  @scala.inline
  def require_system(module: system): SystemModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[SystemModule]
  
  @scala.inline
  def require_webpage(module: webpage): WebPageModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[WebPageModule]
  
  @scala.inline
  def require_webserver(module: webserver): WebServerModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[WebServerModule]
  
  @JSGlobal("slimer")
  @js.native
  def slimer: Slimer = js.native
  @scala.inline
  def slimer_=(x: Slimer): Unit = js.Dynamic.global.updateDynamic("slimer")(x.asInstanceOf[js.Any])
}
