package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passiveEventsMod {
  
  @JSImport("@react-md/utils/types/events/passiveEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/events/passiveEvents", "isSupported")
  @js.native
  def isSupported: Boolean = js.native
  @scala.inline
  def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
}
