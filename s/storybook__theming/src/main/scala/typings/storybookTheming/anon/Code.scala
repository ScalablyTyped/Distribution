package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  var l1: Double
  
  var l2: Double
  
  var l3: Double
  
  var m1: Double
  
  var m2: Double
  
  var m3: Double
  
  var s1: Double
  
  var s2: Double
  
  var s3: Double
}
object Code {
  
  inline def apply(
    code: Double,
    l1: Double,
    l2: Double,
    l3: Double,
    m1: Double,
    m2: Double,
    m3: Double,
    s1: Double,
    s2: Double,
    s3: Double
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any], m1 = m1.asInstanceOf[js.Any], m2 = m2.asInstanceOf[js.Any], m3 = m3.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
    
    inline def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
    
    inline def setL3(value: Double): Self = StObject.set(x, "l3", value.asInstanceOf[js.Any])
    
    inline def setM1(value: Double): Self = StObject.set(x, "m1", value.asInstanceOf[js.Any])
    
    inline def setM2(value: Double): Self = StObject.set(x, "m2", value.asInstanceOf[js.Any])
    
    inline def setM3(value: Double): Self = StObject.set(x, "m3", value.asInstanceOf[js.Any])
    
    inline def setS1(value: Double): Self = StObject.set(x, "s1", value.asInstanceOf[js.Any])
    
    inline def setS2(value: Double): Self = StObject.set(x, "s2", value.asInstanceOf[js.Any])
    
    inline def setS3(value: Double): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
  }
}
