package typings.reactRouter.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryRouterProps extends StObject {
  
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.undefined
  
  var initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.undefined
  
  var initialIndex: js.UndefOr[Double] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
}
object MemoryRouterProps {
  
  @scala.inline
  def apply(): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryRouterProps]
  }
  
  @scala.inline
  implicit class MemoryRouterPropsMutableBuilder[Self <: MemoryRouterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
    
    @scala.inline
    def setInitialEntries(value: js.Array[LocationDescriptor[LocationState]]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
    
    @scala.inline
    def setInitialEntriesVarargs(value: LocationDescriptor[LocationState]*): Self = StObject.set(x, "initialEntries", js.Array(value :_*))
    
    @scala.inline
    def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
  }
}
