package typings.randomcolor

import typings.randomcolor.mod.RandomColorOptionsMultiple
import typings.randomcolor.mod.RandomColorOptionsSingle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def randomColor(): String = js.Dynamic.global.applyDynamic("randomColor")().asInstanceOf[String]
  inline def randomColor(options: RandomColorOptionsMultiple): js.Array[String] = js.Dynamic.global.applyDynamic("randomColor")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def randomColor(options: RandomColorOptionsSingle): String = js.Dynamic.global.applyDynamic("randomColor")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def randomColor_Array(): js.Array[String] = js.Dynamic.global.applyDynamic("randomColor")().asInstanceOf[js.Array[String]]
}
