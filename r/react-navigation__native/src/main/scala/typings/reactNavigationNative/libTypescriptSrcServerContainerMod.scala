package typings.reactNavigationNative

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactNavigationNative.anon.ServerContextTypechildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcServerContainerMod extends Shortcut {
  
  /**
    * Container component for server rendering.
    *
    * @param props.location Location object to base the initial URL for SSR.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which contains helper methods.
    */
  @JSImport("@react-navigation/native/lib/typescript/src/ServerContainer", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  type _To = ForwardRefExoticComponent[ServerContextTypechildren]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcServerContainerMod.foo` */
  override def _to: ForwardRefExoticComponent[ServerContextTypechildren] = default
}
