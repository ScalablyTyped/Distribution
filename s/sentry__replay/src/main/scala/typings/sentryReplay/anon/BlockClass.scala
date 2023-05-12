package typings.sentryReplay.anon

import typings.sentryReplay.typesTypesRrwebMod.blockClass
import typings.sentryReplay.typesTypesRrwebMod.maskTextClass
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockClass extends StObject {
  
  var blockClass: js.UndefOr[typings.sentryReplay.typesTypesRrwebMod.blockClass] = js.undefined
  
  var blockSelector: js.UndefOr[String] = js.undefined
  
  var ignoreClass: js.UndefOr[String] = js.undefined
  
  var maskAllInputs: js.UndefOr[Boolean] = js.undefined
  
  var maskAllText: js.UndefOr[Boolean] = js.undefined
  
  var maskInputOptions: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  var maskTextClass: js.UndefOr[typings.sentryReplay.typesTypesRrwebMod.maskTextClass] = js.undefined
  
  var maskTextSelector: js.UndefOr[String] = js.undefined
}
object BlockClass {
  
  inline def apply(): BlockClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockClass] (val x: Self) extends AnyVal {
    
    inline def setBlockClass(value: blockClass): Self = StObject.set(x, "blockClass", value.asInstanceOf[js.Any])
    
    inline def setBlockClassUndefined: Self = StObject.set(x, "blockClass", js.undefined)
    
    inline def setBlockSelector(value: String): Self = StObject.set(x, "blockSelector", value.asInstanceOf[js.Any])
    
    inline def setBlockSelectorUndefined: Self = StObject.set(x, "blockSelector", js.undefined)
    
    inline def setIgnoreClass(value: String): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
    
    inline def setMaskAllInputs(value: Boolean): Self = StObject.set(x, "maskAllInputs", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputsUndefined: Self = StObject.set(x, "maskAllInputs", js.undefined)
    
    inline def setMaskAllText(value: Boolean): Self = StObject.set(x, "maskAllText", value.asInstanceOf[js.Any])
    
    inline def setMaskAllTextUndefined: Self = StObject.set(x, "maskAllText", js.undefined)
    
    inline def setMaskInputOptions(value: Record[String, Boolean]): Self = StObject.set(x, "maskInputOptions", value.asInstanceOf[js.Any])
    
    inline def setMaskInputOptionsUndefined: Self = StObject.set(x, "maskInputOptions", js.undefined)
    
    inline def setMaskTextClass(value: maskTextClass): Self = StObject.set(x, "maskTextClass", value.asInstanceOf[js.Any])
    
    inline def setMaskTextClassUndefined: Self = StObject.set(x, "maskTextClass", js.undefined)
    
    inline def setMaskTextSelector(value: String): Self = StObject.set(x, "maskTextSelector", value.asInstanceOf[js.Any])
    
    inline def setMaskTextSelectorUndefined: Self = StObject.set(x, "maskTextSelector", js.undefined)
  }
}
