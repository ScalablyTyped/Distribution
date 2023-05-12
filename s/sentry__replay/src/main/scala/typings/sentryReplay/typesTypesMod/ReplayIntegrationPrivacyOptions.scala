package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.anon.PickRecordingOptionsmaskT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayIntegrationPrivacyOptions extends StObject {
  
  /**
    * Block elements that match the CSS selectors in the list. Blocking replaces
    * the element with an empty placeholder with the same dimensions.
    */
  var block: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Ignore input events for elements that match the CSS selectors in the list.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Mask text content for elements that match the CSS selectors in the list.
    */
  var mask: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A callback function to customize how your text is masked.
    */
  var maskFn: js.UndefOr[PickRecordingOptionsmaskT] = js.undefined
  
  /**
    * Unblock elements that match the CSS selectors in the list. This is useful when using `blockAllMedia`.
    */
  var unblock: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Unmask text content for elements that match the CSS selectors in the list.
    */
  var unmask: js.UndefOr[js.Array[String]] = js.undefined
}
object ReplayIntegrationPrivacyOptions {
  
  inline def apply(): ReplayIntegrationPrivacyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplayIntegrationPrivacyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayIntegrationPrivacyOptions] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: js.Array[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setBlockVarargs(value: String*): Self = StObject.set(x, "block", js.Array(value*))
    
    inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setMask(value: js.Array[String]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskFn(value: PickRecordingOptionsmaskT): Self = StObject.set(x, "maskFn", value.asInstanceOf[js.Any])
    
    inline def setMaskFnUndefined: Self = StObject.set(x, "maskFn", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaskVarargs(value: String*): Self = StObject.set(x, "mask", js.Array(value*))
    
    inline def setUnblock(value: js.Array[String]): Self = StObject.set(x, "unblock", value.asInstanceOf[js.Any])
    
    inline def setUnblockUndefined: Self = StObject.set(x, "unblock", js.undefined)
    
    inline def setUnblockVarargs(value: String*): Self = StObject.set(x, "unblock", js.Array(value*))
    
    inline def setUnmask(value: js.Array[String]): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
    
    inline def setUnmaskVarargs(value: String*): Self = StObject.set(x, "unmask", js.Array(value*))
  }
}
