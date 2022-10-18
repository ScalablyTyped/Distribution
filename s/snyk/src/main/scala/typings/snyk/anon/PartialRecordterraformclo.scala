package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<'terraform' | 'cloudformation' | 'arm' | 'kubernetes', string>> */
trait PartialRecordterraformclo extends StObject {
  
  var arm: js.UndefOr[String] = js.undefined
  
  var cloudformation: js.UndefOr[String] = js.undefined
  
  var kubernetes: js.UndefOr[String] = js.undefined
  
  var terraform: js.UndefOr[String] = js.undefined
}
object PartialRecordterraformclo {
  
  inline def apply(): PartialRecordterraformclo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordterraformclo]
  }
  
  extension [Self <: PartialRecordterraformclo](x: Self) {
    
    inline def setArm(value: String): Self = StObject.set(x, "arm", value.asInstanceOf[js.Any])
    
    inline def setArmUndefined: Self = StObject.set(x, "arm", js.undefined)
    
    inline def setCloudformation(value: String): Self = StObject.set(x, "cloudformation", value.asInstanceOf[js.Any])
    
    inline def setCloudformationUndefined: Self = StObject.set(x, "cloudformation", js.undefined)
    
    inline def setKubernetes(value: String): Self = StObject.set(x, "kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "kubernetes", js.undefined)
    
    inline def setTerraform(value: String): Self = StObject.set(x, "terraform", value.asInstanceOf[js.Any])
    
    inline def setTerraformUndefined: Self = StObject.set(x, "terraform", js.undefined)
  }
}
