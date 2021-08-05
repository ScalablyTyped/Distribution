package typings.pulumiAws

import typings.pulumiAws.enumsMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requireMod {
  
  @JSImport("@pulumi/aws/config/require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requireRegion(): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("requireRegion")().asInstanceOf[Region]
}
