package typings.reactMdUtils

import typings.std.OrientationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOrientationMod {
  
  @JSImport("@react-md/utils/types/sizing/useOrientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getOrientationType(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientationType")().asInstanceOf[OrientationType]
  
  @scala.inline
  def useOrientation(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[OrientationType]
  @scala.inline
  def useOrientation(defaultValue: OrientationType): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
}
