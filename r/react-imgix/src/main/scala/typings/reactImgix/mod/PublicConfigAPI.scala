package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PublicConfigAPI {
  
  @JSImport("react-imgix", "PublicConfigAPI")
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableWarning(name: Warnings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableWarning")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableWarning(name: Warnings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableWarning")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
