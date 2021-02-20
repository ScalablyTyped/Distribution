package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Representation of an SF symbol._
  * @see https://docs.scriptable.app/sfsymbol
  */
@js.native
trait SFSymbol extends StObject {
  
  /**
    * _Configures the symbol to use a black weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyblackweight
    */
  def applyBlackWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a bold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyboldweight
    */
  def applyBoldWeight(): Unit = js.native
  
  /**
    * _Configures the symbol with the specified font information._
    * @see https://docs.scriptable.app/sfsymbol/#-applyfont
    */
  def applyFont(font: Font): Unit = js.native
  
  /**
    * _Configures the symbol to use a heavy weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyheavyweight
    */
  def applyHeavyWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applylightweight
    */
  def applyLightWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a medium weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applymediumweight
    */
  def applyMediumWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a regular weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyregularweight
    */
  def applyRegularWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a semibold weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applysemiboldweight
    */
  def applySemiboldWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use a thin weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applythinweight
    */
  def applyThinWeight(): Unit = js.native
  
  /**
    * _Configures the symbol to use an ultra light weight._
    * @see https://docs.scriptable.app/sfsymbol/#-applyultralightweight
    */
  def applyUltraLightWeight(): Unit = js.native
  
  /**
    * _Convert the symbol to an image._
    * @see https://docs.scriptable.app/sfsymbol/#image
    */
  var image: Image = js.native
}
object SFSymbol {
  
  @scala.inline
  def apply(
    applyBlackWeight: () => Unit,
    applyBoldWeight: () => Unit,
    applyFont: Font => Unit,
    applyHeavyWeight: () => Unit,
    applyLightWeight: () => Unit,
    applyMediumWeight: () => Unit,
    applyRegularWeight: () => Unit,
    applySemiboldWeight: () => Unit,
    applyThinWeight: () => Unit,
    applyUltraLightWeight: () => Unit,
    image: Image
  ): SFSymbol = {
    val __obj = js.Dynamic.literal(applyBlackWeight = js.Any.fromFunction0(applyBlackWeight), applyBoldWeight = js.Any.fromFunction0(applyBoldWeight), applyFont = js.Any.fromFunction1(applyFont), applyHeavyWeight = js.Any.fromFunction0(applyHeavyWeight), applyLightWeight = js.Any.fromFunction0(applyLightWeight), applyMediumWeight = js.Any.fromFunction0(applyMediumWeight), applyRegularWeight = js.Any.fromFunction0(applyRegularWeight), applySemiboldWeight = js.Any.fromFunction0(applySemiboldWeight), applyThinWeight = js.Any.fromFunction0(applyThinWeight), applyUltraLightWeight = js.Any.fromFunction0(applyUltraLightWeight), image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSymbol]
  }
  
  @scala.inline
  implicit class SFSymbolMutableBuilder[Self <: SFSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyBlackWeight(value: () => Unit): Self = StObject.set(x, "applyBlackWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyBoldWeight(value: () => Unit): Self = StObject.set(x, "applyBoldWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyFont(value: Font => Unit): Self = StObject.set(x, "applyFont", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyHeavyWeight(value: () => Unit): Self = StObject.set(x, "applyHeavyWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyLightWeight(value: () => Unit): Self = StObject.set(x, "applyLightWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyMediumWeight(value: () => Unit): Self = StObject.set(x, "applyMediumWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyRegularWeight(value: () => Unit): Self = StObject.set(x, "applyRegularWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplySemiboldWeight(value: () => Unit): Self = StObject.set(x, "applySemiboldWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyThinWeight(value: () => Unit): Self = StObject.set(x, "applyThinWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyUltraLightWeight(value: () => Unit): Self = StObject.set(x, "applyUltraLightWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
