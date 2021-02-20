package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Representation of an SF symbol._
  * @see https://docs.scriptable.app/sfsymbol
  */
@JSGlobal("SFSymbol")
@js.native
class SFSymbol protected ()
  extends typings.scriptableIos.SFSymbol
object SFSymbol {
  
  /**
    * _Constructs an SF symbol._
    *
    * SF symbols are Apple's configurable icons that are designed to look great with the San Francisco font.
    *
    * Symbols are referenced by their name. You can find the symbol names in [Apples SF Symbols app for macOS](https://developer.apple.com/sf-symbols/). You can also browse symbol names
    * in the [SF Symbols Browser](https://apps.apple.com/us/app/sf-symbols-browser/id1491161336) and [San Fransymbols](https://apps.apple.com/us/app/san-fransymbols/id1504761986) apps
    * for iOS.
    * @param symbolName - Name of the symbol.
    * @see https://docs.scriptable.app/sfsymbol/#named
    */
  /* static member */
  @JSGlobal("SFSymbol.named")
  @js.native
  def named(symbolName: String): typings.scriptableIos.SFSymbol = js.native
}
