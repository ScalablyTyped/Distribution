package typings.serverless.anon

import typings.serverless.pluginsAwsProviderAwsProviderMod.Filter
import typings.serverless.pluginsAwsProviderAwsProviderMod._Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anythingbut
  extends StObject
     with _Filter {
  
  var `anything-but`: js.Array[Filter]
}
object Anythingbut {
  
  inline def apply(`anything-but`: js.Array[Filter]): Anythingbut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anything-but")(`anything-but`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anythingbut]
  }
  
  extension [Self <: Anythingbut](x: Self) {
    
    inline def `setAnything-but`(value: js.Array[Filter]): Self = StObject.set(x, "anything-but", value.asInstanceOf[js.Any])
    
    inline def `setAnything-butVarargs`(value: Filter*): Self = StObject.set(x, "anything-but", js.Array(value*))
  }
}
