package typings.pulumiPulumi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("@pulumi/pulumi/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
  
  inline def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
}
