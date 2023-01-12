package typings.qiniuJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acc extends StObject {
  
  var acc: Backup
}
object Acc {
  
  inline def apply(acc: Backup): Acc = {
    val __obj = js.Dynamic.literal(acc = acc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acc] (val x: Self) extends AnyVal {
    
    inline def setAcc(value: Backup): Self = StObject.set(x, "acc", value.asInstanceOf[js.Any])
  }
}
