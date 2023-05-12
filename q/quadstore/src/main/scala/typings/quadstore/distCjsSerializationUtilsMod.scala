package typings.quadstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSerializationUtilsMod {
  
  @JSImport("quadstore/dist/cjs/serialization/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def padNumStart(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padNumStart")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sliceString(source: String, offset: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceString")(source.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
}
