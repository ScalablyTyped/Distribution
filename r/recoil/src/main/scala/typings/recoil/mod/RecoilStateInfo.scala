package typings.recoil.mod

import typings.recoil.anon.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoilStateInfo[T] extends StObject {
  
  var deps: js.Iterable[RecoilValue[T]]
  
  var isActive: Boolean
  
  var isModified: Boolean
  
  var isSet: Boolean
  
  var loadable: js.UndefOr[Loadable[T]] = js.undefined
  
  var subscribers: Components[T]
  
  // TODO report modified selectors
  var `type`: typings.recoil.recoilStrings.atom | typings.recoil.recoilStrings.selector
}
object RecoilStateInfo {
  
  inline def apply[T](
    deps: js.Iterable[RecoilValue[T]],
    isActive: Boolean,
    isModified: Boolean,
    isSet: Boolean,
    subscribers: Components[T],
    `type`: typings.recoil.recoilStrings.atom | typings.recoil.recoilStrings.selector
  ): RecoilStateInfo[T] = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], subscribers = subscribers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoilStateInfo[T]]
  }
  
  extension [Self <: RecoilStateInfo[?], T](x: Self & RecoilStateInfo[T]) {
    
    inline def setDeps(value: js.Iterable[RecoilValue[T]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setIsSet(value: Boolean): Self = StObject.set(x, "isSet", value.asInstanceOf[js.Any])
    
    inline def setLoadable(value: Loadable[T]): Self = StObject.set(x, "loadable", value.asInstanceOf[js.Any])
    
    inline def setLoadableUndefined: Self = StObject.set(x, "loadable", js.undefined)
    
    inline def setSubscribers(value: Components[T]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.recoil.recoilStrings.atom | typings.recoil.recoilStrings.selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
