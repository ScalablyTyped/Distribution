package typings.skinTone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("skin-tone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(emoji: String, `type`: SkinToneType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(emoji.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.skinTone.skinToneStrings.none
    - typings.skinTone.skinToneStrings.white
    - typings.skinTone.skinToneStrings.creamWhite
    - typings.skinTone.skinToneStrings.lightBrown
    - typings.skinTone.skinToneStrings.brown
    - typings.skinTone.skinToneStrings.darkBrown
  */
  trait SkinToneType extends StObject
  object SkinToneType {
    
    inline def brown: typings.skinTone.skinToneStrings.brown = "brown".asInstanceOf[typings.skinTone.skinToneStrings.brown]
    
    inline def creamWhite: typings.skinTone.skinToneStrings.creamWhite = "creamWhite".asInstanceOf[typings.skinTone.skinToneStrings.creamWhite]
    
    inline def darkBrown: typings.skinTone.skinToneStrings.darkBrown = "darkBrown".asInstanceOf[typings.skinTone.skinToneStrings.darkBrown]
    
    inline def lightBrown: typings.skinTone.skinToneStrings.lightBrown = "lightBrown".asInstanceOf[typings.skinTone.skinToneStrings.lightBrown]
    
    inline def none: typings.skinTone.skinToneStrings.none = "none".asInstanceOf[typings.skinTone.skinToneStrings.none]
    
    inline def white: typings.skinTone.skinToneStrings.white = "white".asInstanceOf[typings.skinTone.skinToneStrings.white]
  }
}
