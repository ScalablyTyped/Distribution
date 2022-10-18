package typings.snyk

import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCheckPathsMod {
  
  @JSImport("snyk/dist/lib/check-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkOSSPaths(paths: js.Array[String], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOSSPaths")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
