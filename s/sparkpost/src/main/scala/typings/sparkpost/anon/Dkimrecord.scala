package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dkimrecord extends StObject {
  
  var dkim_record: String
  
  var spf_record: String
}
object Dkimrecord {
  
  inline def apply(dkim_record: String, spf_record: String): Dkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record.asInstanceOf[js.Any], spf_record = spf_record.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dkimrecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dkimrecord] (val x: Self) extends AnyVal {
    
    inline def setDkim_record(value: String): Self = StObject.set(x, "dkim_record", value.asInstanceOf[js.Any])
    
    inline def setSpf_record(value: String): Self = StObject.set(x, "spf_record", value.asInstanceOf[js.Any])
  }
}
