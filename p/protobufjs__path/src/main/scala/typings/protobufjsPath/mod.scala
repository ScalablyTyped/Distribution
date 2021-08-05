package typings.protobufjsPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolve(originPath: String, includePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(originPath.asInstanceOf[js.Any], includePath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(originPath.asInstanceOf[js.Any], includePath.asInstanceOf[js.Any], alreadyNormalized.asInstanceOf[js.Any])).asInstanceOf[String]
}
