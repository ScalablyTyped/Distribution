package typings.reactNativeElements.anon

import typings.reactNativeElements.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string},   android :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}}> */
trait RecursivePartialiosprimarAndroid extends StObject {
  
  var android: js.UndefOr[RecursivePartial[Error]] = js.undefined
  
  var ios: js.UndefOr[RecursivePartial[Error]] = js.undefined
}
object RecursivePartialiosprimarAndroid {
  
  @scala.inline
  def apply(): RecursivePartialiosprimarAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosprimarAndroid]
  }
  
  @scala.inline
  implicit class RecursivePartialiosprimarAndroidMutableBuilder[Self <: RecursivePartialiosprimarAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: RecursivePartial[Error]): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: RecursivePartial[Error]): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
