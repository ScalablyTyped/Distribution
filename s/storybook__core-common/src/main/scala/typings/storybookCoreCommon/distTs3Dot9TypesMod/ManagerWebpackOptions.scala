package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagerWebpackOptions extends StObject {
  
  var entries: js.Array[String]
  
  var refs: Record[String, Ref]
}
object ManagerWebpackOptions {
  
  inline def apply(entries: js.Array[String], refs: Record[String, Ref]): ManagerWebpackOptions = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerWebpackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagerWebpackOptions] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setRefs(value: Record[String, Ref]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
  }
}
