package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Represents a font and text size._
  *
  * Refer to [iosfonts.com](http://iosfonts.com) for a list of the fonts that are available in iOS and iPadOS.
  * @see https://docs.scriptable.app/font/#-new-font
  */
// tslint:disable-next-line no-unnecessary-class
@JSGlobal("Font")
@js.native
class Font protected ()
  extends typings.scriptableIos.Font {
  /**
    * _Represents a font and text size._
    *
    * Refer to [iosfonts.com](http://iosfonts.com) for a list of the fonts that are available in iOS and iPadOS.
    * @param name - Name of the font.
    * @param size - Size of the font.
    * @see https://docs.scriptable.app/font/#-new-font
    */
  def this(name: String, size: Double) = this()
}
/* static members */
@JSGlobal("Font")
@js.native
object Font extends js.Object {
  
  /**
    * _Creates a monospaced system font with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blackmonospacedsystemfont
    */
  def blackMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a rounded system font with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blackroundedsystemfont
    */
  def blackRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a font with the system appearance with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blacksystemfont
    */
  def blackSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for body texts._
    * @see https://docs.scriptable.app/font/#body
    */
  def body(): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a bold monospaced system font.._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldmonospacedsystemfont
    */
  def boldMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a bold and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldroundedsystemfont
    */
  def boldRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a bold system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldsystemfont
    */
  def boldSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for callouts._
    * @see https://docs.scriptable.app/font/#callout
    */
  def callout(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for standard captions._
    * @see https://docs.scriptable.app/font/#caption1
    */
  def caption1(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for alternate captions._
    * @see https://docs.scriptable.app/font/#caption2
    */
  def caption2(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for footnotes._
    * @see https://docs.scriptable.app/font/#footnote
    */
  def footnote(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for headings._
    * @see https://docs.scriptable.app/font/#headline
    */
  def headline(): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a heavy monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavymonospacedsystemfont
    */
  def heavyMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a heavy and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavyroundedsystemfont
    */
  def heavyRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a heavy system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavysystemfont
    */
  def heavySystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates an italic system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#italicsystemfont
    */
  def italicSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for large titles._
    * @see https://docs.scriptable.app/font/#largetitle
    */
  def largeTitle(): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a light monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightmonospacedsystemfont
    */
  def lightMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a light and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightroundedsystemfont
    */
  def lightRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a light system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightsystemfont
    */
  def lightSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a medium monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediummonospacedsystemfont
    */
  def mediumMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a medium and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediumroundedsystemfont
    */
  def mediumRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a medium system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediumsystemfont
    */
  def mediumSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a regular monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularmonospacedsystemfont
    */
  def regularMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a regular and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularroundedsystemfont
    */
  def regularRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a regular system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularsystemfont
    */
  def regularSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a semibold monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldmonospacedsystemfont
    */
  def semiboldMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a semibold and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldroundedsystemfont
    */
  def semiboldRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a semibold system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldsystemfont
    */
  def semiboldSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for subheadings._
    * @see https://docs.scriptable.app/font/#subheadline
    */
  def subheadline(): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#systemfont
    */
  def systemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a thin monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinmonospacedsystemfont
    */
  def thinMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a thin and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinroundedsystemfont
    */
  def thinRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates a thin system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinsystemfont
    */
  def thinSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for first level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title1
    */
  def title1(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for second level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title2
    */
  def title2(): typings.scriptableIos.Font = js.native
  
  /**
    * _Preferred font for third level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title3
    */
  def title3(): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates an ultra light monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightmonospacedsystemfont
    */
  def ultraLightMonospacedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates an ultra light and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightroundedsystemfont
    */
  def ultraLightRoundedSystemFont(size: Double): typings.scriptableIos.Font = js.native
  
  /**
    * _Creates an ultra light system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightsystemfont
    */
  def ultraLightSystemFont(size: Double): typings.scriptableIos.Font = js.native
}
