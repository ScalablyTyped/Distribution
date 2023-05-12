package typings.storybookTheming.mod

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var container: js.UndefOr[Node] = js.undefined
  
  var insertionPoint: js.UndefOr[HTMLElement] = js.undefined
  
  var key: String
  
  var nonce: js.UndefOr[String] = js.undefined
  
  /** @deprecate use `insertionPoint` instead */
  var prepend: js.UndefOr[Boolean] = js.undefined
  
  var speedy: js.UndefOr[Boolean] = js.undefined
  
  var stylisPlugins: js.UndefOr[js.Array[StylisPlugin]] = js.undefined
}
object Options {
  
  inline def apply(key: String): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Node): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setInsertionPoint(value: HTMLElement): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
    
    inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    
    inline def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
    
    inline def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
    
    inline def setStylisPlugins(value: js.Array[StylisPlugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
    
    inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
    
    inline def setStylisPluginsVarargs(value: StylisPlugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value*))
  }
}
