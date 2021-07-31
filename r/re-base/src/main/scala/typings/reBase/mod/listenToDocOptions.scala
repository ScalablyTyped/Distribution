package typings.reBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait listenToDocOptions extends StObject {
  
  /**
    * The context of your component.
    */
  var context: js.Object
  
  /**
    * A callback that will be called with any errors such as permissions
    * errors.
    */
  var onFailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A callback that will be called when the listener is set, use for
    * loading indicators.
    */
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object listenToDocOptions {
  
  @scala.inline
  def apply(context: js.Object): listenToDocOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[listenToDocOptions]
  }
  
  @scala.inline
  implicit class listenToDocOptionsMutableBuilder[Self <: listenToDocOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailure(value: () => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setThen(value: () => Unit): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
