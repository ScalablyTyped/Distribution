package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/routers.@react-navigation/routers.PartialState<std.Readonly<any>> | undefined} */
trait Readonlykeystringnamestri extends StObject {
  
  val key: String
  
  val name: String
  
  val params: js.UndefOr[js.Object] = js.undefined
  
  var state: js.UndefOr[js.Any | PartialState[js.Any]] = js.undefined
}
object Readonlykeystringnamestri {
  
  @scala.inline
  def apply(key: String, name: String): Readonlykeystringnamestri = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlykeystringnamestri]
  }
  
  @scala.inline
  implicit class ReadonlykeystringnamestriMutableBuilder[Self <: Readonlykeystringnamestri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setState(value: js.Any | PartialState[js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
