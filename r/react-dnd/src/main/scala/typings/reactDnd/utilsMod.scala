package typings.reactDnd

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-dnd/lib/decorators/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkDecoratorArguments(functionName: String, signature: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDecoratorArguments")(functionName.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getDecoratedComponent(instanceRef: RefObject[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoratedComponent")(instanceRef.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isClassComponent(Component: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRefForwardingComponent(C: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefForwardingComponent")(C.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRefable(C: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefable")(C.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
