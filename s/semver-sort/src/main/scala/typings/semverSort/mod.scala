package typings.semverSort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asc(versions: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("asc")(versions.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def desc(versions: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("desc")(versions.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
