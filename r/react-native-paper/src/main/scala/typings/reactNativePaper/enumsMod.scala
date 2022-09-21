package typings.reactNativePaper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsMod {
  
  @js.native
  sealed trait AdornmentSide extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "AdornmentSide")
  @js.native
  object AdornmentSide extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdornmentSide & String] = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with AdornmentSide
    /* "left" */ val Left: typings.reactNativePaper.enumsMod.AdornmentSide.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with AdornmentSide
    /* "right" */ val Right: typings.reactNativePaper.enumsMod.AdornmentSide.Right & String = js.native
  }
  
  @js.native
  sealed trait AdornmentType extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "AdornmentType")
  @js.native
  object AdornmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdornmentType & String] = js.native
    
    @js.native
    sealed trait Affix
      extends StObject
         with AdornmentType
    /* "affix" */ val Affix: typings.reactNativePaper.enumsMod.AdornmentType.Affix & String = js.native
    
    @js.native
    sealed trait Icon
      extends StObject
         with AdornmentType
    /* "icon" */ val Icon: typings.reactNativePaper.enumsMod.AdornmentType.Icon & String = js.native
  }
  
  @js.native
  sealed trait InputMode extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "InputMode")
  @js.native
  object InputMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InputMode & String] = js.native
    
    @js.native
    sealed trait Flat
      extends StObject
         with InputMode
    /* "flat" */ val Flat: typings.reactNativePaper.enumsMod.InputMode.Flat & String = js.native
    
    @js.native
    sealed trait Outlined
      extends StObject
         with InputMode
    /* "outlined" */ val Outlined: typings.reactNativePaper.enumsMod.InputMode.Outlined & String = js.native
  }
}
