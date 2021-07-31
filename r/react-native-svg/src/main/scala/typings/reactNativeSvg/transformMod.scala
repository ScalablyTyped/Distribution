package typings.reactNativeSvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("react-native-svg/src/lib/extract/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(transform: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(transform.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def parse(transform: String, options: js.Object): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(transform.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
