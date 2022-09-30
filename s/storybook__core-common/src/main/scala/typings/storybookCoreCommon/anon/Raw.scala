package typings.storybookCoreCommon.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raw extends StObject {
  
  var raw: Record[String, String]
  
  var stringified: Record[String, String]
}
object Raw {
  
  inline def apply(raw: Record[String, String], stringified: Record[String, String]): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], stringified = stringified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  extension [Self <: Raw](x: Self) {
    
    inline def setRaw(value: Record[String, String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setStringified(value: Record[String, String]): Self = StObject.set(x, "stringified", value.asInstanceOf[js.Any])
  }
}
