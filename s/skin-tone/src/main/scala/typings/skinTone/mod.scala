package typings.skinTone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Change the skin tone of an emoji 👌👌🏻👌🏼👌🏽👌🏾👌🏿.
  @param emoji - Emoji to modify.
  @param tone - Skin tone to use for `emoji`.
  - `'none'`       :      *(Removes skin tone)*
  - `'white'`      : 🏻   *(Fitzpatrick Type-1–2)*
  - `'creamWhite'` : 🏼   *(Fitzpatrick Type-3)*
  - `'lightBrown'` : 🏽   *(Fitzpatrick Type-4)*
  - `'brown'`      : 🏾   *(Fitzpatrick Type-5)*
  - `'darkBrown'`  : 🏿   *(Fitzpatrick Type-6)*
  @example
  ```
  import skinTone = require('skin-tone');
  skinTone('👍', 'brown');
  //=> '👍🏾'
  skinTone('👍', 'white');
  //=> '👍🏻'
  // can also remove skin tone
  skinTone('👍🏾', 'none');
  //=> '👍'
  // just passes it through when not supported
  skinTone('🦄', 'darkBrown');
  //=> '🦄'
  ```
  */
  @scala.inline
  def apply(emoji: String, tone: Tone): String = (^.asInstanceOf[js.Dynamic].apply(emoji.asInstanceOf[js.Any], tone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("skin-tone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.skinTone.skinToneStrings.none
    - typings.skinTone.skinToneStrings.white
    - typings.skinTone.skinToneStrings.creamWhite
    - typings.skinTone.skinToneStrings.lightBrown
    - typings.skinTone.skinToneStrings.brown
    - typings.skinTone.skinToneStrings.darkBrown
  */
  trait Tone extends StObject
  object Tone {
    
    @scala.inline
    def brown: typings.skinTone.skinToneStrings.brown = "brown".asInstanceOf[typings.skinTone.skinToneStrings.brown]
    
    @scala.inline
    def creamWhite: typings.skinTone.skinToneStrings.creamWhite = "creamWhite".asInstanceOf[typings.skinTone.skinToneStrings.creamWhite]
    
    @scala.inline
    def darkBrown: typings.skinTone.skinToneStrings.darkBrown = "darkBrown".asInstanceOf[typings.skinTone.skinToneStrings.darkBrown]
    
    @scala.inline
    def lightBrown: typings.skinTone.skinToneStrings.lightBrown = "lightBrown".asInstanceOf[typings.skinTone.skinToneStrings.lightBrown]
    
    @scala.inline
    def none: typings.skinTone.skinToneStrings.none = "none".asInstanceOf[typings.skinTone.skinToneStrings.none]
    
    @scala.inline
    def white: typings.skinTone.skinToneStrings.white = "white".asInstanceOf[typings.skinTone.skinToneStrings.white]
  }
}
