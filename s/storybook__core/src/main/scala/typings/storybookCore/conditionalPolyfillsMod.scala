package typings.storybookCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalPolyfillsMod {
  
  @JSImport("@storybook/core/dist/client/manager/conditional-polyfills", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def importPolyfills(): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("importPolyfills")().asInstanceOf[js.Promise[js.Array[Unit]]]
}
