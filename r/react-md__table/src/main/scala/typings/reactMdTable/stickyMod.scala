package typings.reactMdTable

import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyMod {
  
  @JSImport("@react-md/table/types/sticky", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/table/types/sticky", "StickyTableProvider")
  @js.native
  val StickyTableProvider: Provider[Boolean] = js.native
  
  @scala.inline
  def useSticky(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useSticky")().asInstanceOf[Boolean]
  @scala.inline
  def useSticky(sticky: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useSticky")(sticky.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def useSticky(sticky: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useSticky")(sticky.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
