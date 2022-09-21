package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
open class Font protected ()
  extends StObject
     with typings.scriptableIos.Font {
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
object Font {
  
  @JSGlobal("Font")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Creates a monospaced system font with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blackmonospacedsystemfont
    */
  /* static member */
  inline def blackMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("blackMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a rounded system font with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blackroundedsystemfont
    */
  /* static member */
  inline def blackRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("blackRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a font with the system appearance with the black weight._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#blacksystemfont
    */
  /* static member */
  inline def blackSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("blackSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for body texts._
    * @see https://docs.scriptable.app/font/#body
    */
  /* static member */
  inline def body(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("body")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a bold monospaced system font.._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldmonospacedsystemfont
    */
  /* static member */
  inline def boldMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("boldMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a bold and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldroundedsystemfont
    */
  /* static member */
  inline def boldRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("boldRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a bold system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#boldsystemfont
    */
  /* static member */
  inline def boldSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("boldSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for callouts._
    * @see https://docs.scriptable.app/font/#callout
    */
  /* static member */
  inline def callout(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("callout")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for standard captions._
    * @see https://docs.scriptable.app/font/#caption1
    */
  /* static member */
  inline def caption1(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("caption1")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for alternate captions._
    * @see https://docs.scriptable.app/font/#caption2
    */
  /* static member */
  inline def caption2(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("caption2")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for footnotes._
    * @see https://docs.scriptable.app/font/#footnote
    */
  /* static member */
  inline def footnote(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("footnote")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for headings._
    * @see https://docs.scriptable.app/font/#headline
    */
  /* static member */
  inline def headline(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("headline")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a heavy monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavymonospacedsystemfont
    */
  /* static member */
  inline def heavyMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("heavyMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a heavy and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavyroundedsystemfont
    */
  /* static member */
  inline def heavyRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("heavyRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a heavy system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#heavysystemfont
    */
  /* static member */
  inline def heavySystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("heavySystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates an italic system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#italicsystemfont
    */
  /* static member */
  inline def italicSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("italicSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for large titles._
    * @see https://docs.scriptable.app/font/#largetitle
    */
  /* static member */
  inline def largeTitle(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("largeTitle")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a light monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightmonospacedsystemfont
    */
  /* static member */
  inline def lightMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("lightMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a light and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightroundedsystemfont
    */
  /* static member */
  inline def lightRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("lightRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a light system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#lightsystemfont
    */
  /* static member */
  inline def lightSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("lightSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a medium monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediummonospacedsystemfont
    */
  /* static member */
  inline def mediumMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("mediumMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a medium and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediumroundedsystemfont
    */
  /* static member */
  inline def mediumRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("mediumRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a medium system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#mediumsystemfont
    */
  /* static member */
  inline def mediumSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("mediumSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a regular monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularmonospacedsystemfont
    */
  /* static member */
  inline def regularMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("regularMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a regular and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularroundedsystemfont
    */
  /* static member */
  inline def regularRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("regularRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a regular system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#regularsystemfont
    */
  /* static member */
  inline def regularSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("regularSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a semibold monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldmonospacedsystemfont
    */
  /* static member */
  inline def semiboldMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("semiboldMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a semibold and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldroundedsystemfont
    */
  /* static member */
  inline def semiboldRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("semiboldRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a semibold system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#semiboldsystemfont
    */
  /* static member */
  inline def semiboldSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("semiboldSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for subheadings._
    * @see https://docs.scriptable.app/font/#subheadline
    */
  /* static member */
  inline def subheadline(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("subheadline")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#systemfont
    */
  /* static member */
  inline def systemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("systemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a thin monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinmonospacedsystemfont
    */
  /* static member */
  inline def thinMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("thinMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a thin and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinroundedsystemfont
    */
  /* static member */
  inline def thinRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("thinRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates a thin system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#thinsystemfont
    */
  /* static member */
  inline def thinSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("thinSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for first level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title1
    */
  /* static member */
  inline def title1(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("title1")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for second level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title2
    */
  /* static member */
  inline def title2(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("title2")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Preferred font for third level hierarchical headings._
    * @see https://docs.scriptable.app/font/#title3
    */
  /* static member */
  inline def title3(): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("title3")().asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates an ultra light monospaced system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightmonospacedsystemfont
    */
  /* static member */
  inline def ultraLightMonospacedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("ultraLightMonospacedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates an ultra light and rounded system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightroundedsystemfont
    */
  /* static member */
  inline def ultraLightRoundedSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("ultraLightRoundedSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
  
  /**
    * _Creates an ultra light system font._
    * @param size - Size of the text.
    * @see https://docs.scriptable.app/font/#ultralightsystemfont
    */
  /* static member */
  inline def ultraLightSystemFont(size: Double): typings.scriptableIos.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("ultraLightSystemFont")(size.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.Font]
}
