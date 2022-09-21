package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Representation of an SF symbol._
  * @see https://docs.scriptable.app/sfsymbol
  */
@JSGlobal("SFSymbol")
@js.native
/* private */ open class SFSymbol ()
  extends StObject
     with typings.scriptableIos.SFSymbol {
  
  /**
    * _Configures the symbol to use a black weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyblackweight
    */
  /* CompleteClass */
  override def applyBlackWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a bold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyboldweight
    */
  /* CompleteClass */
  override def applyBoldWeight(): Unit = js.native
  
  /**
    * _Configures the symbol with the specified font information._
    * @see https://docs.scriptable.app/sfsymbol/#-applyfont
    */
  /* CompleteClass */
  override def applyFont(font: typings.scriptableIos.Font): Unit = js.native
  
  /**
    * _Configures the symbol to use a heavy weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyheavyweight
    */
  /* CompleteClass */
  override def applyHeavyWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applylightweight
    */
  /* CompleteClass */
  override def applyLightWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a medium weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applymediumweight
    */
  /* CompleteClass */
  override def applyMediumWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a regular weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyregularweight
    */
  /* CompleteClass */
  override def applyRegularWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a semibold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applysemiboldweight
    */
  /* CompleteClass */
  override def applySemiboldWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a thin weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applythinweight
    */
  /* CompleteClass */
  override def applyThinWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use an ultra light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyultralightweight
    */
  /* CompleteClass */
  override def applyUltraLightWeight(): Unit = js.native
  
  /**
    * _Convert the symbol to an image._
    * @see https://docs.scriptable.app/sfsymbol/#image
    */
  /* CompleteClass */
  var image: typings.scriptableIos.Image = js.native
}
object SFSymbol {
  
  @JSGlobal("SFSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Constructs an SF symbol._
    *
    * SF symbols are Apple's configurable icons that are designed to look great with the San Francisco font.
    *
    * Symbols are referenced by their name. You can find the symbol names in [Apple's SF Symbols app for macOS](https://developer.apple.com/sf-symbols/). You can also browse symbol names
    * in the [SF Symbols Browser](https://apps.apple.com/us/app/sf-symbols-browser/id1491161336) and [San Fransymbols](https://apps.apple.com/us/app/san-fransymbols/id1504761986) apps
    * for iOS.
    * @param symbolName - Name of the symbol.
    * @see https://docs.scriptable.app/sfsymbol/#named
    */
  /* static member */
  inline def named(symbolName: String): typings.scriptableIos.SFSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("named")(symbolName.asInstanceOf[js.Any]).asInstanceOf[typings.scriptableIos.SFSymbol]
}
