package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string},   android :{  primary :string,   secondary :string,   success :string,   error :string,   warning :string}}> */
@js.native
trait RecursivePartialiosprimar extends StObject {
  
  var android: js.UndefOr[RecursivePartialprimaryst] = js.native
  
  var ios: js.UndefOr[RecursivePartialprimaryst] = js.native
}
object RecursivePartialiosprimar {
  
  @scala.inline
  def apply(): RecursivePartialiosprimar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialiosprimar]
  }
  
  @scala.inline
  implicit class RecursivePartialiosprimarMutableBuilder[Self <: RecursivePartialiosprimar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: RecursivePartialprimaryst): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
    
    @scala.inline
    def setIos(value: RecursivePartialprimaryst): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
