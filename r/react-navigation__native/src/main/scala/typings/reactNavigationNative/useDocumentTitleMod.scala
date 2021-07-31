package typings.reactNavigationNative

import typings.react.mod.RefObject
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.typesMod.DocumentTitleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDocumentTitleMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useDocumentTitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(ref: RefObject[NavigationContainerRef]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def default(ref: RefObject[NavigationContainerRef], hasEnabledFormatter: DocumentTitleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], hasEnabledFormatter.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
