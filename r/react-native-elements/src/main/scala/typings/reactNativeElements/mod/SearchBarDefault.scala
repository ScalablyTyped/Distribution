package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarDefault extends SearchBarBase {
  
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[Boolean] = js.native
  
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.native
}
object SearchBarDefault {
  
  @scala.inline
  def apply(): SearchBarDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarDefault]
  }
  
  @scala.inline
  implicit class SearchBarDefaultMutableBuilder[Self <: SearchBarDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLightTheme(value: Boolean): Self = StObject.set(x, "lightTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightThemeUndefined: Self = StObject.set(x, "lightTheme", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
