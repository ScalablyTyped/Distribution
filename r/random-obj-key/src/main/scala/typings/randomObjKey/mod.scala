package typings.randomObjKey

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-obj-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ObjectType /* <: Record[String, Any] */](`object`: ObjectType): /* keyof ObjectType */ String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* keyof ObjectType */ String]
}
