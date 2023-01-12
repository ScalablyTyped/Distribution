package typings.qiniuJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  var backup: js.Array[String]
  
  var main: js.Array[String]
}
object Backup {
  
  inline def apply(backup: js.Array[String], main: js.Array[String]): Backup = {
    val __obj = js.Dynamic.literal(backup = backup.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    inline def setBackup(value: js.Array[String]): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupVarargs(value: String*): Self = StObject.set(x, "backup", js.Array(value*))
    
    inline def setMain(value: js.Array[String]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainVarargs(value: String*): Self = StObject.set(x, "main", js.Array(value*))
  }
}
