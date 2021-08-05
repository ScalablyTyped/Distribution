package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarDefault
  extends StObject
     with SearchBarBase {
  
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.undefined
}
object SearchBarDefault {
  
  inline def apply(): SearchBarDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarDefault]
  }
  
  extension [Self <: SearchBarDefault](x: Self) {
    
    inline def setLightTheme(value: Boolean): Self = StObject.set(x, "lightTheme", value.asInstanceOf[js.Any])
    
    inline def setLightThemeUndefined: Self = StObject.set(x, "lightTheme", js.undefined)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
