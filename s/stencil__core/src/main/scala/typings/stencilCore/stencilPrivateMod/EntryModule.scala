package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryModule extends StObject {
  
  var cmps: js.Array[ComponentCompilerMeta]
  
  var entryKey: String
}
object EntryModule {
  
  inline def apply(cmps: js.Array[ComponentCompilerMeta], entryKey: String): EntryModule = {
    val __obj = js.Dynamic.literal(cmps = cmps.asInstanceOf[js.Any], entryKey = entryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryModule]
  }
  
  extension [Self <: EntryModule](x: Self) {
    
    inline def setCmps(value: js.Array[ComponentCompilerMeta]): Self = StObject.set(x, "cmps", value.asInstanceOf[js.Any])
    
    inline def setCmpsVarargs(value: ComponentCompilerMeta*): Self = StObject.set(x, "cmps", js.Array(value*))
    
    inline def setEntryKey(value: String): Self = StObject.set(x, "entryKey", value.asInstanceOf[js.Any])
  }
}
