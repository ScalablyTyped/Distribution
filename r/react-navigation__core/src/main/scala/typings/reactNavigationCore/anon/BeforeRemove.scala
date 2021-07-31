package typings.reactNavigationCore.anon

import typings.reactNavigationCore.navigationBuilderContextMod.ChildBeforeRemoveListener
import typings.reactNavigationCore.navigationBuilderContextMod.GetStateListener
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeRemove extends StObject {
  
  var beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]]
  
  var getState: Record[String, js.UndefOr[GetStateListener]]
}
object BeforeRemove {
  
  @scala.inline
  def apply(
    beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    getState: Record[String, js.UndefOr[GetStateListener]]
  ): BeforeRemove = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeRemove]
  }
  
  @scala.inline
  implicit class BeforeRemoveMutableBuilder[Self <: BeforeRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeRemove(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: Record[String, js.UndefOr[GetStateListener]]): Self = StObject.set(x, "getState", value.asInstanceOf[js.Any])
  }
}
